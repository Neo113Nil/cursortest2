package com.plaid.internal;

@kotlinx.serialization.Serializable
/* renamed from: com.plaid.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0666v4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6598a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final com.plaid.internal.A d;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    /* renamed from: com.plaid.internal.v4$a */
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.C0666v4> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.C0666v4.a f6599a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.C0666v4.a aVar = new com.plaid.internal.C0666v4.a();
            f6599a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.url.OutOfProcessWebviewFallbackJson", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("mode", false);
            pluginGeneratedSerialDescriptor.addElement("url", false);
            pluginGeneratedSerialDescriptor.addElement("webview_fallback_id", false);
            pluginGeneratedSerialDescriptor.addElement("channel_from_webview", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.IntSerializer.INSTANCE, stringSerializer, stringSerializer, com.plaid.internal.A.a.f5745a};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            int i;
            java.lang.String str;
            com.plaid.internal.A a2;
            java.lang.String str2;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            java.lang.String str3 = null;
            if (beginStructure.decodeSequentially()) {
                int decodeIntElement = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                i = decodeIntElement;
                a2 = (com.plaid.internal.A) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.A.a.f5745a, null);
                str = decodeStringElement2;
                i2 = 15;
                str2 = decodeStringElement;
            } else {
                com.plaid.internal.A a3 = null;
                java.lang.String str4 = null;
                int i3 = 0;
                int i4 = 0;
                boolean z = true;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        i3 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                        i4 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i4 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i4 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        a3 = (com.plaid.internal.A) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.A.a.f5745a, a3);
                        i4 |= 8;
                    }
                }
                i = i3;
                str = str3;
                a2 = a3;
                str2 = str4;
                i2 = i4;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.C0666v4(i2, i, str2, str, a2);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.C0666v4 c0666v4 = (com.plaid.internal.C0666v4) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0666v4, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 0, c0666v4.f6598a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, c0666v4.b);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, c0666v4.c);
            beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.A.a.f5745a, c0666v4.d);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public C0666v4(int i, @kotlinx.serialization.SerialName("mode") int i2, @kotlinx.serialization.SerialName("url") java.lang.String str, @kotlinx.serialization.SerialName("webview_fallback_id") java.lang.String str2, @kotlinx.serialization.SerialName("channel_from_webview") com.plaid.internal.A a2) {
        if (15 != (i & 15)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.plaid.internal.C0666v4.a.b);
        }
        this.f6598a = i2;
        this.b = str;
        this.c = str2;
        this.d = a2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.C0666v4)) {
            return false;
        }
        com.plaid.internal.C0666v4 c0666v4 = (com.plaid.internal.C0666v4) obj;
        return this.f6598a == c0666v4.f6598a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0666v4.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0666v4.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c0666v4.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.plaid.internal.C0679x.a(this.c, com.plaid.internal.C0679x.a(this.b, java.lang.Integer.hashCode(this.f6598a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        int i = this.f6598a;
        java.lang.String str = this.b;
        java.lang.String str2 = this.c;
        com.plaid.internal.A a2 = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutOfProcessWebviewFallbackJson(mode=");
        sb.append(i);
        sb.append(", url=");
        sb.append(str);
        sb.append(", webviewFallbackId=");
        sb.append(str2);
        sb.append(", channelInfo=");
        sb.append(a2);
        sb.append(")");
        return sb.toString();
    }
}
