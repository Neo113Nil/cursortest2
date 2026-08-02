package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class F1 {
    public static final com.plaid.internal.F1.b c = new com.plaid.internal.F1.b();

    /* renamed from: a, reason: collision with root package name */
    @com.google.gson.annotations.SerializedName("name")
    private final java.lang.String f5783a;

    @com.google.gson.annotations.SerializedName("number")
    private final java.lang.String b;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.F1> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.F1.a f5784a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.F1.a aVar = new com.plaid.internal.F1.a();
            f5784a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseMeta", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("name", true);
            pluginGeneratedSerialDescriptor.addElement("number", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer)};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            int i;
            java.lang.String str;
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            java.lang.String str3 = null;
            if (beginStructure.decodeSequentially()) {
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
                str = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
                i = 3;
            } else {
                int i2 = 0;
                boolean z = true;
                java.lang.String str4 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                        i2 |= 2;
                    }
                }
                i = i2;
                str = str3;
                str2 = str4;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.F1(i, str2, str);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.F1 f1 = (com.plaid.internal.F1) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f1, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            com.plaid.internal.F1.a(f1, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b {
    }

    public F1() {
        this.f5783a = null;
        this.b = null;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.plaid.internal.F1 f1, kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || f1.f5783a != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, f1.f5783a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || f1.b != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, f1.b);
        }
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.F1)) {
            return false;
        }
        com.plaid.internal.F1 f1 = (com.plaid.internal.F1) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5783a, f1.f5783a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, f1.b);
    }

    public final int hashCode() {
        java.lang.String str = this.f5783a;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5783a;
        java.lang.String str2 = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAccountResponseMeta(name=");
        sb.append(str);
        sb.append(", number=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final java.lang.String a() {
        return this.f5783a;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public F1(int i, java.lang.String str, java.lang.String str2) {
        if ((i & 1) == 0) {
            this.f5783a = null;
        } else {
            this.f5783a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
