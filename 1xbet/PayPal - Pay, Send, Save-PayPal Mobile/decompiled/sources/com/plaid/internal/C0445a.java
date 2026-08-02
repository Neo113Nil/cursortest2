package com.plaid.internal;

@kotlinx.serialization.Serializable
/* renamed from: com.plaid.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0445a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5990a;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    /* renamed from: com.plaid.internal.a$a, reason: collision with other inner class name */
    public static final class C0158a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.C0445a> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.C0445a.C0158a f5991a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.C0445a.C0158a c0158a = new com.plaid.internal.C0445a.C0158a();
            f5991a = c0158a;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.core.webview.ActionMessage", c0158a, 1);
            pluginGeneratedSerialDescriptor.addElement("action", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i = 1;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            } else {
                str = null;
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
                        str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.C0445a(i, str);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.C0445a c0445a = (com.plaid.internal.C0445a) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0445a, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, c0445a.f5990a);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* renamed from: com.plaid.internal.a$b */
    public static final class b {
        public static void a() {
            com.plaid.internal.C0445a.C0158a c0158a = com.plaid.internal.C0445a.C0158a.f5991a;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public C0445a(int i, @kotlinx.serialization.SerialName("action") java.lang.String str) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.C0445a.C0158a.b);
        }
        this.f5990a = str;
    }

    public final java.lang.String a() {
        return this.f5990a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.plaid.internal.C0445a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5990a, ((com.plaid.internal.C0445a) obj).f5990a);
    }

    public final int hashCode() {
        return this.f5990a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5990a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionMessage(action=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
