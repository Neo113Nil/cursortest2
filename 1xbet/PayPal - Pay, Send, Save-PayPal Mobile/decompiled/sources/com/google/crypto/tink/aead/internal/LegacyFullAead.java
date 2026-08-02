package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public class LegacyFullAead implements com.google.crypto.tink.Aead {
    private final byte[] identifier;
    private final com.google.crypto.tink.Aead rawAead;

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        byte[] byteArray;
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        com.google.crypto.tink.Aead aead = (com.google.crypto.tink.Aead) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.Aead.class).getPrimitive(serialization.getValue());
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = serialization.getOutputPrefixType();
        int i = com.google.crypto.tink.aead.internal.LegacyFullAead.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
        } else if (i == 2 || i == 3) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else if (i == 4) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else {
            throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(java.lang.String.valueOf(outputPrefixType)));
        }
        return new com.google.crypto.tink.aead.internal.LegacyFullAead(aead, byteArray);
    }

    /* renamed from: com.google.crypto.tink.aead.internal.LegacyFullAead$1, reason: invalid class name */
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

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.Aead aead, com.google.crypto.tink.util.Bytes bytes) {
        return new com.google.crypto.tink.aead.internal.LegacyFullAead(aead, bytes.toByteArray());
    }

    private LegacyFullAead(com.google.crypto.tink.Aead aead, byte[] bArr) {
        this.rawAead = aead;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new java.lang.IllegalArgumentException("identifier has an invalid length");
        }
        this.identifier = bArr;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.identifier;
        if (bArr3.length == 0) {
            return this.rawAead.encrypt(bArr, bArr2);
        }
        return com.google.crypto.tink.subtle.Bytes.concat(bArr3, this.rawAead.encrypt(bArr, bArr2));
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.identifier;
        if (bArr3.length == 0) {
            return this.rawAead.decrypt(bArr, bArr2);
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("wrong prefix");
        }
        return this.rawAead.decrypt(java.util.Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }
}
