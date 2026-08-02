package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.M0 f5848a;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N0> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.N0.a f5849a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.N0.a aVar = new com.plaid.internal.N0.a();
            f5849a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedSessionLinkTokenConfiguration", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("link_token_configuration", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{com.plaid.internal.M0.a.f5840a};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            com.plaid.internal.M0 m0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i = 1;
            com.plaid.internal.M0 m02 = null;
            if (beginStructure.decodeSequentially()) {
                m0 = (com.plaid.internal.M0) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, com.plaid.internal.M0.a.f5840a, null);
            } else {
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        m02 = (com.plaid.internal.M0) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, com.plaid.internal.M0.a.f5840a, m02);
                        i2 = 1;
                    }
                }
                m0 = m02;
                i = i2;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.N0(i, m0);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.N0 n0 = (com.plaid.internal.N0) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, com.plaid.internal.M0.a.f5840a, n0.f5848a);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b {
        public static void a() {
            com.plaid.internal.N0.a aVar = com.plaid.internal.N0.a.f5849a;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public N0(int i, @kotlinx.serialization.SerialName("link_token_configuration") com.plaid.internal.M0 m0) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.N0.a.b);
        }
        this.f5848a = m0;
    }

    public final com.plaid.internal.M0 a() {
        return this.f5848a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.plaid.internal.N0) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5848a, ((com.plaid.internal.N0) obj).f5848a);
    }

    public final int hashCode() {
        return this.f5848a.hashCode();
    }

    public final java.lang.String toString() {
        com.plaid.internal.M0 m0 = this.f5848a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddedSessionLinkTokenConfiguration(embeddedSessionInfo=");
        sb.append(m0);
        sb.append(")");
        return sb.toString();
    }
}
