package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class LegacyProtoKey extends com.google.crypto.tink.Key {
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.internal.ProtoKeySerialization serialization;

    @com.google.errorprone.annotations.Immutable
    static class LegacyProtoParametersNotForCreation extends com.google.crypto.tink.Parameters {
        private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
        private final java.lang.String typeUrl;

        /* synthetic */ LegacyProtoParametersNotForCreation(java.lang.String str, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1 anonymousClass1) {
            this(str, outputPrefixType);
        }

        @Override // com.google.crypto.tink.Parameters
        public boolean hasIdRequirement() {
            return this.outputPrefixType != com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }

        private static java.lang.String outputPrefixToString(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
            int i = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
            if (i == 1) {
                return "TINK";
            }
            if (i == 2) {
                return "LEGACY";
            }
            if (i == 3) {
                return "RAW";
            }
            if (i == 4) {
                return "CRUNCHY";
            }
            return "UNKNOWN";
        }

        public java.lang.String toString() {
            return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", this.typeUrl, outputPrefixToString(this.outputPrefixType));
        }

        private LegacyProtoParametersNotForCreation(java.lang.String str, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
            this.typeUrl = str;
            this.outputPrefixType = outputPrefixType;
        }
    }

    /* renamed from: com.google.crypto.tink.internal.LegacyProtoKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.KeyData.KeyMaterialType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private static void throwIfMissingAccess(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[protoKeySerialization.getKeyMaterialType().ordinal()];
        if (i == 1 || i == 2) {
            com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
        }
    }

    private static com.google.crypto.tink.util.Bytes computeOutputPrefix(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization) throws java.security.GeneralSecurityException {
        if (protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
            return com.google.crypto.tink.util.Bytes.copyFrom(new byte[0]);
        }
        if (protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.TINK)) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(protoKeySerialization.getIdRequirementOrNull().intValue());
        }
        if (protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.LEGACY) || protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY)) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(protoKeySerialization.getIdRequirementOrNull().intValue());
        }
        throw new java.security.GeneralSecurityException("Unknown output prefix type");
    }

    public LegacyProtoKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        throwIfMissingAccess(protoKeySerialization, secretKeyAccess);
        this.serialization = protoKeySerialization;
        this.outputPrefix = computeOutputPrefix(protoKeySerialization);
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.internal.LegacyProtoKey)) {
            return false;
        }
        com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization = ((com.google.crypto.tink.internal.LegacyProtoKey) key).serialization;
        if (protoKeySerialization.getOutputPrefixType().equals(this.serialization.getOutputPrefixType()) && protoKeySerialization.getKeyMaterialType().equals(this.serialization.getKeyMaterialType()) && protoKeySerialization.getTypeUrl().equals(this.serialization.getTypeUrl()) && java.util.Objects.equals(protoKeySerialization.getIdRequirementOrNull(), this.serialization.getIdRequirementOrNull())) {
            return com.google.crypto.tink.subtle.Bytes.equal(this.serialization.getValue().toByteArray(), protoKeySerialization.getValue().toByteArray());
        }
        return false;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.serialization.getIdRequirementOrNull();
    }

    public final com.google.crypto.tink.internal.ProtoKeySerialization getSerialization(@javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        throwIfMissingAccess(this.serialization, secretKeyAccess);
        return this.serialization;
    }

    @Override // com.google.crypto.tink.Key
    public final com.google.crypto.tink.Parameters getParameters() {
        return new com.google.crypto.tink.internal.LegacyProtoKey.LegacyProtoParametersNotForCreation(this.serialization.getTypeUrl(), this.serialization.getOutputPrefixType(), null);
    }

    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }
}
