package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class D1 {
    public static final com.plaid.internal.D1.b g = new com.plaid.internal.D1.b();

    /* renamed from: a, reason: collision with root package name */
    @com.google.gson.annotations.SerializedName("_id")
    private final java.lang.String f5766a;

    @com.google.gson.annotations.SerializedName(com.adjust.sdk.Constants.REFERRER_API_META)
    private final com.plaid.internal.F1 b;

    @com.google.gson.annotations.SerializedName("type")
    private final java.lang.String c;

    @com.google.gson.annotations.SerializedName("subtype")
    private final java.lang.String d;

    @com.google.gson.annotations.SerializedName("verification_status")
    private final java.lang.String e;

    @com.google.gson.annotations.SerializedName("balance")
    private final com.plaid.internal.E1 f;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.D1> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.D1.a f5767a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.D1.a aVar = new com.plaid.internal.D1.a();
            f5767a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.url.LinkAccountResponseAccount", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement("_id", true);
            pluginGeneratedSerialDescriptor.addElement(com.adjust.sdk.Constants.REFERRER_API_META, true);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("subtype", true);
            pluginGeneratedSerialDescriptor.addElement("verification_status", true);
            pluginGeneratedSerialDescriptor.addElement("balance", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{stringSerializer, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.F1.a.f5784a), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.E1.a.f5777a)};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            com.plaid.internal.E1 e1;
            com.plaid.internal.F1 f1;
            int i;
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String str4;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            com.plaid.internal.F1 f12 = null;
            if (beginStructure.decodeSequentially()) {
                java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                com.plaid.internal.F1 f13 = (com.plaid.internal.F1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.F1.a.f5784a, null);
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
                java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
                java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
                str2 = decodeStringElement;
                e1 = (com.plaid.internal.E1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, com.plaid.internal.E1.a.f5777a, null);
                str3 = str6;
                str = str7;
                str4 = str5;
                f1 = f13;
                i = 63;
            } else {
                int i2 = 0;
                boolean z = true;
                java.lang.String str8 = null;
                com.plaid.internal.E1 e12 = null;
                java.lang.String str9 = null;
                java.lang.String str10 = null;
                java.lang.String str11 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            str10 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                            continue;
                        case 1:
                            f12 = (com.plaid.internal.F1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.F1.a.f5784a, f12);
                            i2 |= 2;
                            break;
                        case 2:
                            str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                            i2 |= 4;
                            break;
                        case 3:
                            str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                            i2 |= 8;
                            break;
                        case 4:
                            str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                            i2 |= 16;
                            break;
                        case 5:
                            e12 = (com.plaid.internal.E1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, com.plaid.internal.E1.a.f5777a, e12);
                            i2 |= 32;
                            break;
                        default:
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                }
                e1 = e12;
                f1 = f12;
                i = i2;
                java.lang.String str12 = str11;
                str = str8;
                str2 = str10;
                str3 = str9;
                str4 = str12;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.D1(i, str2, f1, str4, str3, str, e1);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.D1 d1 = (com.plaid.internal.D1) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            com.plaid.internal.D1.a(d1, beginStructure, pluginGeneratedSerialDescriptor);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b {
        public static void a() {
            com.plaid.internal.D1.a aVar = com.plaid.internal.D1.a.f5767a;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public D1(int i, java.lang.String str, com.plaid.internal.F1 f1, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.plaid.internal.E1 e1) {
        this.f5766a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f1;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = e1;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.plaid.internal.D1 d1, kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(d1.f5766a, "")) {
            compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, d1.f5766a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || d1.b != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.F1.a.f5784a, d1.b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || d1.c != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, d1.c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || d1.d != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, d1.d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || d1.e != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, d1.e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || d1.f != null) {
            compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, com.plaid.internal.E1.a.f5777a, d1.f);
        }
    }

    public final com.plaid.internal.F1 b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.d;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final java.lang.String e() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.D1)) {
            return false;
        }
        com.plaid.internal.D1 d1 = (com.plaid.internal.D1) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5766a, d1.f5766a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, d1.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, d1.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, d1.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, d1.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, d1.f);
    }

    public final java.lang.String f() {
        return this.f5766a;
    }

    public final int hashCode() {
        int hashCode = this.f5766a.hashCode();
        com.plaid.internal.F1 f1 = this.b;
        int hashCode2 = f1 == null ? 0 : f1.hashCode();
        java.lang.String str = this.c;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.d;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.e;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        com.plaid.internal.E1 e1 = this.f;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (e1 != null ? e1.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5766a;
        com.plaid.internal.F1 f1 = this.b;
        java.lang.String str2 = this.c;
        java.lang.String str3 = this.d;
        java.lang.String str4 = this.e;
        com.plaid.internal.E1 e1 = this.f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAccountResponseAccount(_id=");
        sb.append(str);
        sb.append(", meta=");
        sb.append(f1);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", subtype=");
        sb.append(str3);
        sb.append(", verification_status=");
        sb.append(str4);
        sb.append(", balance=");
        sb.append(e1);
        sb.append(")");
        return sb.toString();
    }

    public D1() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "");
        this.f5766a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final com.plaid.internal.E1 a() {
        return this.f;
    }
}
