package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class LegacyFullHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.HybridDecrypt rawHybridDecrypt;

    public static com.google.crypto.tink.HybridDecrypt create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        byte[] byteArray;
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        com.google.crypto.tink.HybridDecrypt hybridDecrypt = (com.google.crypto.tink.HybridDecrypt) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.HybridDecrypt.class).getPrimitive(serialization.getValue());
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = serialization.getOutputPrefixType();
        int i = com.google.crypto.tink.hybrid.internal.LegacyFullHybridDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
        } else if (i == 2 || i == 3) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else if (i == 4) {
            byteArray = com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(legacyProtoKey.getIdRequirementOrNull().intValue()).toByteArray();
        } else {
            throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(java.lang.String.valueOf(outputPrefixType)));
        }
        return new com.google.crypto.tink.hybrid.internal.LegacyFullHybridDecrypt(hybridDecrypt, byteArray);
    }

    /* renamed from: com.google.crypto.tink.hybrid.internal.LegacyFullHybridDecrypt$1, reason: invalid class name */
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

    private LegacyFullHybridDecrypt(com.google.crypto.tink.HybridDecrypt hybridDecrypt, byte[] bArr) {
        this.rawHybridDecrypt = hybridDecrypt;
        this.outputPrefix = bArr;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length == 0) {
            return this.rawHybridDecrypt.decrypt(bArr, bArr2);
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        return this.rawHybridDecrypt.decrypt(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length), bArr2);
    }
}
