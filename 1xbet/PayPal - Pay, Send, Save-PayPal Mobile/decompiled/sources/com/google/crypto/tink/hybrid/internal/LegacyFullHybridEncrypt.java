package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class LegacyFullHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.HybridEncrypt rawHybridEncrypt;

    public static com.google.crypto.tink.HybridEncrypt create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        byte[] byteArray;
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        com.google.crypto.tink.HybridEncrypt hybridEncrypt = (com.google.crypto.tink.HybridEncrypt) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.HybridEncrypt.class).getPrimitive(serialization.getValue());
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = serialization.getOutputPrefixType();
        int i = com.google.crypto.tink.hybrid.internal.LegacyFullHybridEncrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
        } else if (i == 2 || i == 3) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else if (i == 4) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else {
            throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(java.lang.String.valueOf(outputPrefixType)));
        }
        return new com.google.crypto.tink.hybrid.internal.LegacyFullHybridEncrypt(hybridEncrypt, byteArray);
    }

    /* renamed from: com.google.crypto.tink.hybrid.internal.LegacyFullHybridEncrypt$1, reason: invalid class name */
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

    private LegacyFullHybridEncrypt(com.google.crypto.tink.HybridEncrypt hybridEncrypt, byte[] bArr) {
        this.rawHybridEncrypt = hybridEncrypt;
        this.outputPrefix = bArr;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length == 0) {
            return this.rawHybridEncrypt.encrypt(bArr, bArr2);
        }
        return com.google.crypto.tink.subtle.Bytes.concat(bArr3, this.rawHybridEncrypt.encrypt(bArr, bArr2));
    }
}
