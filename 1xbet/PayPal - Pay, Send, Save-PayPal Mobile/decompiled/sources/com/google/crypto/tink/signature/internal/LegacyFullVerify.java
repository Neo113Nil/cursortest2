package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class LegacyFullVerify implements com.google.crypto.tink.PublicKeyVerify {
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.PublicKeyVerify rawVerifier;

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        return new com.google.crypto.tink.signature.internal.LegacyFullVerify((com.google.crypto.tink.PublicKeyVerify) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.PublicKeyVerify.class).getPrimitive(serialization.getValue()), getOutputPrefix(serialization), getMessageSuffix(serialization));
    }

    /* renamed from: com.google.crypto.tink.signature.internal.LegacyFullVerify$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    static byte[] getOutputPrefix(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.LegacyFullVerify.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[protoKeySerialization.getOutputPrefixType().ordinal()];
        if (i == 1 || i == 2) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(protoKeySerialization.getIdRequirementOrNull().intValue()).toByteArray();
        }
        if (i == 3) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(protoKeySerialization.getIdRequirementOrNull().intValue()).toByteArray();
        }
        if (i == 4) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
        }
        throw new java.security.GeneralSecurityException("unknown output prefix type");
    }

    static byte[] getMessageSuffix(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization) {
        if (protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.LEGACY)) {
            return new byte[]{0};
        }
        return new byte[0];
    }

    private LegacyFullVerify(com.google.crypto.tink.PublicKeyVerify publicKeyVerify, byte[] bArr, byte[] bArr2) {
        this.rawVerifier = publicKeyVerify;
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length == 0 && this.messageSuffix.length == 0) {
            this.rawVerifier.verify(bArr, bArr2);
            return;
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.messageSuffix;
        if (bArr4.length != 0) {
            bArr2 = com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr4);
        }
        this.rawVerifier.verify(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length), bArr2);
    }
}
