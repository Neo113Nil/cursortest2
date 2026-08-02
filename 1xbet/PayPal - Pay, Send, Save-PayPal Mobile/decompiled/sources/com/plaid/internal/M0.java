package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class M0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.M0> CREATOR = new com.plaid.internal.M0.b();
    public static final kotlinx.serialization.KSerializer<java.lang.Object>[] j = {null, null, null, null, null, null, null, null, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5839a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final java.lang.String g;
    public final com.plaid.internal.L0 h;
    public final java.util.List<java.lang.String> i;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.M0> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.M0.a f5840a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.M0.a aVar = new com.plaid.internal.M0.a();
            f5840a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedSessionInfo", aVar, 9);
            pluginGeneratedSerialDescriptor.addElement("link_token", false);
            pluginGeneratedSerialDescriptor.addElement("link_open_id", false);
            pluginGeneratedSerialDescriptor.addElement("link_persistent_id", false);
            pluginGeneratedSerialDescriptor.addElement("institution_id", true);
            pluginGeneratedSerialDescriptor.addElement("webview_fallback_id", true);
            pluginGeneratedSerialDescriptor.addElement("enable_account_select", true);
            pluginGeneratedSerialDescriptor.addElement("embedded_workflow_session_id", true);
            pluginGeneratedSerialDescriptor.addElement("embedded_open_link_configuration", true);
            pluginGeneratedSerialDescriptor.addElement("web3_valid_chains", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.KSerializer<?>[] kSerializerArr = com.plaid.internal.M0.j;
            kotlinx.serialization.KSerializer<?> nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.L0.a.f5830a);
            kotlinx.serialization.KSerializer<?> kSerializer = kSerializerArr[8];
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, stringSerializer, nullable, kSerializer};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.String str;
            java.lang.String str2;
            int i;
            java.lang.String str3;
            java.lang.String str4;
            java.lang.String str5;
            boolean z;
            com.plaid.internal.L0 l0;
            java.util.List list;
            java.lang.String str6;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            kotlinx.serialization.KSerializer<java.lang.Object>[] kSerializerArr = com.plaid.internal.M0.j;
            int i2 = 7;
            if (beginStructure.decodeSequentially()) {
                java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                com.plaid.internal.L0 l02 = (com.plaid.internal.L0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, com.plaid.internal.L0.a.f5830a, null);
                i = 511;
                list = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], null);
                str6 = decodeStringElement;
                l0 = l02;
                str2 = decodeStringElement6;
                z = decodeBooleanElement;
                str = decodeStringElement4;
                str4 = decodeStringElement5;
                str5 = decodeStringElement3;
                str3 = decodeStringElement2;
            } else {
                boolean z2 = true;
                boolean z3 = false;
                com.plaid.internal.L0 l03 = null;
                java.lang.String str7 = null;
                str = null;
                java.lang.String str8 = null;
                str2 = null;
                java.lang.String str9 = null;
                java.lang.String str10 = null;
                java.util.List list2 = null;
                int i3 = 0;
                while (z2) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z2 = false;
                            i2 = 7;
                        case 0:
                            str10 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i3 |= 1;
                            i2 = 7;
                        case 1:
                            i3 |= 2;
                            str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        case 2:
                            str9 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i3 |= 4;
                        case 3:
                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i3 |= 8;
                        case 4:
                            str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                            i3 |= 16;
                        case 5:
                            z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 5);
                            i3 |= 32;
                        case 6:
                            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                            i3 |= 64;
                        case 7:
                            l03 = (com.plaid.internal.L0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, com.plaid.internal.L0.a.f5830a, l03);
                            i3 |= 128;
                        case 8:
                            list2 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list2);
                            i3 |= 256;
                        default:
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                str3 = str7;
                str4 = str8;
                str5 = str9;
                z = z3;
                l0 = l03;
                java.lang.String str11 = str10;
                list = list2;
                str6 = str11;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.M0(i, str6, str3, str5, str, str4, z, str2, l0, list);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.M0 m0 = (com.plaid.internal.M0) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m0, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            kotlinx.serialization.KSerializer<java.lang.Object>[] kSerializerArr = com.plaid.internal.M0.j;
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, m0.f5839a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, m0.b);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, m0.c);
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(m0.d, "")) {
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, m0.d);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(m0.e, "")) {
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, m0.e);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || m0.f) {
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 5, m0.f);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !kotlin.jvm.internal.Intrinsics.areEqual(m0.g, "")) {
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, m0.g);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || m0.h != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, com.plaid.internal.L0.a.f5830a, m0.h);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !kotlin.jvm.internal.Intrinsics.areEqual(m0.i, kotlin.collections.CollectionsKt.emptyList())) {
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], m0.i);
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.M0> {
        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.M0 createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.internal.M0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : com.plaid.internal.L0.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.M0[] newArray(int i) {
            return new com.plaid.internal.M0[i];
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public M0(int i, @kotlinx.serialization.SerialName("link_token") java.lang.String str, @kotlinx.serialization.SerialName("link_open_id") java.lang.String str2, @kotlinx.serialization.SerialName("link_persistent_id") java.lang.String str3, @kotlinx.serialization.SerialName("institution_id") java.lang.String str4, @kotlinx.serialization.SerialName("webview_fallback_id") java.lang.String str5, @kotlinx.serialization.SerialName("enable_account_select") boolean z, @kotlinx.serialization.SerialName("embedded_workflow_session_id") java.lang.String str6, @kotlinx.serialization.SerialName("embedded_open_link_configuration") com.plaid.internal.L0 l0, @kotlinx.serialization.SerialName("web3_valid_chains") java.util.List list) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.plaid.internal.M0.a.b);
        }
        this.f5839a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l0;
        }
        if ((i & 256) == 0) {
            this.i = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.i = list;
        }
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final java.lang.String b() {
        return this.f5839a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.M0)) {
            return false;
        }
        com.plaid.internal.M0 m0 = (com.plaid.internal.M0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5839a, m0.f5839a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, m0.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, m0.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, m0.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, m0.e) && this.f == m0.f && kotlin.jvm.internal.Intrinsics.areEqual(this.g, m0.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, m0.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, m0.i);
    }

    public final int hashCode() {
        int a2 = com.plaid.internal.C0679x.a(this.g, (java.lang.Boolean.hashCode(this.f) + com.plaid.internal.C0679x.a(this.e, com.plaid.internal.C0679x.a(this.d, com.plaid.internal.C0679x.a(this.c, com.plaid.internal.C0679x.a(this.b, this.f5839a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        com.plaid.internal.L0 l0 = this.h;
        return this.i.hashCode() + ((a2 + (l0 == null ? 0 : l0.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5839a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        java.lang.String str4 = this.d;
        java.lang.String str5 = this.e;
        boolean z = this.f;
        java.lang.String str6 = this.g;
        com.plaid.internal.L0 l0 = this.h;
        java.util.List<java.lang.String> list = this.i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddedSessionInfo(linkToken=");
        sb.append(str);
        sb.append(", linkOpenId=");
        sb.append(str2);
        sb.append(", linkPersistentId=");
        sb.append(str3);
        sb.append(", institutionId=");
        sb.append(str4);
        sb.append(", webviewFallbackId=");
        sb.append(str5);
        sb.append(", enableAccountSelect=");
        sb.append(z);
        sb.append(", embeddedWorkflowSessionId=");
        sb.append(str6);
        sb.append(", embeddedOpenLinkConfiguration=");
        sb.append(l0);
        sb.append(", web3ValidChains=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f5839a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        com.plaid.internal.L0 l0 = this.h;
        if (l0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.i);
    }

    public M0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, com.plaid.internal.L0 l0, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        this.f5839a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
        this.h = l0;
        this.i = arrayList;
    }
}
