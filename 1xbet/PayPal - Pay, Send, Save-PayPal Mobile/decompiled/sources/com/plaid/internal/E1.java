package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.gson.annotations.SerializedName(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY)
    private final java.lang.Double f5776a;

    @com.google.gson.annotations.SerializedName("current")
    private final java.lang.Double b;

    @com.google.gson.annotations.SerializedName("currency")
    private final java.lang.String c;

    @com.google.gson.annotations.SerializedName("localized")
    private final com.plaid.internal.U3 d;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.E1> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.E1.a f5777a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.E1.a aVar = new com.plaid.internal.E1.a();
            f5777a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseBalance", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, true);
            pluginGeneratedSerialDescriptor.addElement("current", true);
            pluginGeneratedSerialDescriptor.addElement("currency", true);
            pluginGeneratedSerialDescriptor.addElement("localized", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.internal.DoubleSerializer doubleSerializer = kotlinx.serialization.internal.DoubleSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(doubleSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(doubleSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.U3.a.f5937a)};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            int i;
            java.lang.String str;
            java.lang.Double d;
            com.plaid.internal.U3 u3;
            java.lang.Double d2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            java.lang.String str2 = null;
            if (beginStructure.decodeSequentially()) {
                kotlinx.serialization.internal.DoubleSerializer doubleSerializer = kotlinx.serialization.internal.DoubleSerializer.INSTANCE;
                java.lang.Double d3 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, doubleSerializer, null);
                java.lang.Double d4 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, doubleSerializer, null);
                java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
                d = d4;
                u3 = (com.plaid.internal.U3) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.U3.a.f5937a, null);
                str = str3;
                d2 = d3;
                i = 15;
            } else {
                int i2 = 0;
                boolean z = true;
                java.lang.Double d5 = null;
                com.plaid.internal.U3 u32 = null;
                java.lang.Double d6 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        d6 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, d6);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        d5 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, d5);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str2);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        u32 = (com.plaid.internal.U3) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.U3.a.f5937a, u32);
                        i2 |= 8;
                    }
                }
                i = i2;
                str = str2;
                d = d5;
                u3 = u32;
                d2 = d6;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.E1(i, d2, d, str, u3);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.E1 e1 = (com.plaid.internal.E1) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e1, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            com.plaid.internal.E1.a(e1, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public E1() {
        this.f5776a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.plaid.internal.E1 e1, kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || e1.f5776a != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, e1.f5776a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || e1.b != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, e1.b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || e1.c != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, e1.c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || e1.d != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.U3.a.f5937a, e1.d);
        }
    }

    public final java.lang.String b() {
        return this.c;
    }

    public final java.lang.Double c() {
        return this.b;
    }

    public final com.plaid.internal.U3 d() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.E1)) {
            return false;
        }
        com.plaid.internal.E1 e1 = (com.plaid.internal.E1) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.f5776a, (java.lang.Object) e1.f5776a) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.b, (java.lang.Object) e1.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, e1.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, e1.d);
    }

    public final int hashCode() {
        java.lang.Double d = this.f5776a;
        int hashCode = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.b;
        int hashCode2 = d2 == null ? 0 : d2.hashCode();
        java.lang.String str = this.c;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.plaid.internal.U3 u3 = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (u3 != null ? u3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.Double d = this.f5776a;
        java.lang.Double d2 = this.b;
        java.lang.String str = this.c;
        com.plaid.internal.U3 u3 = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAccountResponseBalance(available=");
        sb.append(d);
        sb.append(", current=");
        sb.append(d2);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", localized=");
        sb.append(u3);
        sb.append(")");
        return sb.toString();
    }

    public final java.lang.Double a() {
        return this.f5776a;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public E1(int i, java.lang.Double d, java.lang.Double d2, java.lang.String str, com.plaid.internal.U3 u3) {
        if ((i & 1) == 0) {
            this.f5776a = null;
        } else {
            this.f5776a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = u3;
        }
    }
}
