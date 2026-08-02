package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public final class KeyTemplateProtoConverter {

    /* renamed from: com.google.crypto.tink.internal.KeyTemplateProtoConverter$1, reason: invalid class name */
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

    public static com.google.crypto.tink.KeyTemplate.OutputPrefixType prefixFromProto(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
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
        throw new java.security.GeneralSecurityException("Unknown output prefix type");
    }

    public static com.google.crypto.tink.proto.KeyTemplate toProto(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Parameters parameters = keyTemplate.toParameters();
        if (parameters instanceof com.google.crypto.tink.internal.LegacyProtoParameters) {
            return ((com.google.crypto.tink.internal.LegacyProtoParameters) parameters).getSerialization().getKeyTemplate();
        }
        return ((com.google.crypto.tink.internal.ProtoParametersSerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeParameters(parameters, com.google.crypto.tink.internal.ProtoParametersSerialization.class)).getKeyTemplate();
    }

    public static byte[] toByteArray(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return toProto(keyTemplate).toByteArray();
    }

    public static com.google.crypto.tink.KeyTemplate.OutputPrefixType getOutputPrefixType(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return prefixFromProto(toProto(keyTemplate).getOutputPrefixType());
    }

    private KeyTemplateProtoConverter() {
    }
}
