package com.google.crypto.tink;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class KeyTemplate {

    @javax.annotation.Nullable
    private final com.google.crypto.tink.proto.KeyTemplate kt;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.Parameters parameters;

    /* loaded from: classes9.dex */
    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    static com.google.crypto.tink.KeyTemplate.OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        int i = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK;
        }
        if (i == 2) {
            return com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY;
        }
        if (i == 3) {
            return com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW;
        }
        if (i == 4) {
            return com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY;
        }
        throw new java.lang.IllegalArgumentException("Unknown output prefix type");
    }

    /* renamed from: com.google.crypto.tink.KeyTemplate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.KeyTemplate.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    static com.google.crypto.tink.proto.OutputPrefixType toProto(com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType) {
        int i = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (i == 2) {
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        if (i == 3) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (i == 4) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        throw new java.lang.IllegalArgumentException("Unknown output prefix type");
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeyTemplate create(java.lang.String str, byte[] bArr, com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType) {
        return new com.google.crypto.tink.KeyTemplate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(str).setValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(bArr)).setOutputPrefixType(toProto(outputPrefixType)).build());
    }

    public static com.google.crypto.tink.KeyTemplate createFrom(com.google.crypto.tink.Parameters parameters) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.KeyTemplate(parameters);
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        this.kt = keyTemplate;
        this.parameters = null;
    }

    private KeyTemplate(com.google.crypto.tink.Parameters parameters) {
        this.kt = null;
        this.parameters = parameters;
    }

    final com.google.crypto.tink.proto.KeyTemplate getProto() {
        try {
            return getProtoMaybeThrow();
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ");
            sb.append(this.parameters);
            throw new com.google.crypto.tink.internal.TinkBugException(sb.toString(), e);
        }
    }

    final com.google.crypto.tink.proto.KeyTemplate getProtoMaybeThrow() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.KeyTemplate keyTemplate = this.kt;
        if (keyTemplate != null) {
            return keyTemplate;
        }
        com.google.crypto.tink.Parameters parameters = this.parameters;
        if (parameters instanceof com.google.crypto.tink.internal.LegacyProtoParameters) {
            return ((com.google.crypto.tink.internal.LegacyProtoParameters) parameters).getSerialization().getKeyTemplate();
        }
        return ((com.google.crypto.tink.internal.ProtoParametersSerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeParameters(this.parameters, com.google.crypto.tink.internal.ProtoParametersSerialization.class)).getKeyTemplate();
    }

    @java.lang.Deprecated
    public final java.lang.String getTypeUrl() {
        return getProto().getTypeUrl();
    }

    @java.lang.Deprecated
    public final byte[] getValue() {
        return getProto().getValue().toByteArray();
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.KeyTemplate.OutputPrefixType getOutputPrefixType() {
        return fromProto(getProto().getOutputPrefixType());
    }

    public final com.google.crypto.tink.Parameters toParameters() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Parameters parameters = this.parameters;
        return parameters != null ? parameters : com.google.crypto.tink.TinkProtoParametersFormat.parse(getProto().toByteArray());
    }
}
