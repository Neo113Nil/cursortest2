package com.google.crypto.tink.mac.internal;

/* loaded from: classes4.dex */
public final class LegacyFullMac implements com.google.crypto.tink.Mac {
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private static final byte[] formatVersion = {0};
    private final byte[] identifier;
    private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
    private final com.google.crypto.tink.Mac rawMac;

    public static com.google.crypto.tink.Mac create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        byte[] byteArray;
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        com.google.crypto.tink.Mac mac = (com.google.crypto.tink.Mac) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.Mac.class).getPrimitive(serialization.getValue());
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = serialization.getOutputPrefixType();
        int i = com.google.crypto.tink.mac.internal.LegacyFullMac.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
        } else if (i == 2 || i == 3) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else if (i == 4) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else {
            throw new java.security.GeneralSecurityException("unknown output prefix type");
        }
        return new com.google.crypto.tink.mac.internal.LegacyFullMac(mac, outputPrefixType, byteArray);
    }

    /* renamed from: com.google.crypto.tink.mac.internal.LegacyFullMac$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private LegacyFullMac(com.google.crypto.tink.Mac mac, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, byte[] bArr) {
        this.rawMac = mac;
        this.outputPrefixType = outputPrefixType;
        this.identifier = bArr;
    }

    @Override // com.google.crypto.tink.Mac
    public final byte[] computeMac(byte[] bArr) throws java.security.GeneralSecurityException {
        if (this.outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.LEGACY)) {
            bArr = com.google.crypto.tink.subtle.Bytes.concat(bArr, formatVersion);
        }
        return com.google.crypto.tink.subtle.Bytes.concat(this.identifier, this.rawMac.computeMac(bArr));
    }

    @Override // com.google.crypto.tink.Mac
    public final void verifyMac(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length < 10) {
            throw new java.security.GeneralSecurityException("tag too short");
        }
        if (this.outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.LEGACY)) {
            bArr2 = com.google.crypto.tink.subtle.Bytes.concat(bArr2, formatVersion);
        }
        byte[] bArr3 = new byte[0];
        if (!this.outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
            byte[] copyOf = java.util.Arrays.copyOf(bArr, 5);
            bArr = java.util.Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!java.util.Arrays.equals(this.identifier, bArr3)) {
            throw new java.security.GeneralSecurityException("wrong prefix");
        }
        this.rawMac.verifyMac(bArr, bArr2);
    }
}
