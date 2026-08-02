package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class LegacyProtoParameters extends com.google.crypto.tink.Parameters {
    private final com.google.crypto.tink.internal.ProtoParametersSerialization serialization;

    public LegacyProtoParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) {
        this.serialization = protoParametersSerialization;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.serialization.getKeyTemplate().getOutputPrefixType() != com.google.crypto.tink.proto.OutputPrefixType.RAW;
    }

    public final com.google.crypto.tink.internal.ProtoParametersSerialization getSerialization() {
        return this.serialization;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.internal.LegacyProtoParameters)) {
            return false;
        }
        com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization = ((com.google.crypto.tink.internal.LegacyProtoParameters) obj).serialization;
        return this.serialization.getKeyTemplate().getOutputPrefixType().equals(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()) && this.serialization.getKeyTemplate().getTypeUrl().equals(protoParametersSerialization.getKeyTemplate().getTypeUrl()) && this.serialization.getKeyTemplate().getValue().equals(protoParametersSerialization.getKeyTemplate().getValue());
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.serialization.getKeyTemplate(), this.serialization.getObjectIdentifier());
    }

    /* renamed from: com.google.crypto.tink.internal.LegacyProtoParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private static java.lang.String outputPrefixToString(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        int i = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
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

    public final java.lang.String toString() {
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", this.serialization.getKeyTemplate().getTypeUrl(), outputPrefixToString(this.serialization.getKeyTemplate().getOutputPrefixType()));
    }
}
