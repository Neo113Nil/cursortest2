package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class r8 implements android.os.Parcelable {
    public static final com.plaid.internal.r8.c CREATOR = new com.plaid.internal.r8.c();
    public static final com.plaid.internal.r8 e = new com.plaid.internal.r8("unknown", "unknown", "unknown");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6560a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final kotlin.Lazy d;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.r8> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.r8.a f6561a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.r8.a aVar = new com.plaid.internal.r8.a();
            f6561a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.WorkflowPaneId", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("workflowId", false);
            pluginGeneratedSerialDescriptor.addElement("paneRenderingId", false);
            pluginGeneratedSerialDescriptor.addElement("paneNodeId", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                i = 7;
            } else {
                str = null;
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i2 |= 4;
                    }
                }
                str2 = str4;
                str3 = str5;
                i = i2;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.r8(i, str, str3, str2);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.r8 r8Var = (com.plaid.internal.r8) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, r8Var.f6560a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, r8Var.b);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, r8Var.c);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            java.lang.String b = com.plaid.internal.r8.this.b();
            java.lang.String a2 = com.plaid.internal.r8.this.a();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(b);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(a2);
            return sb.toString();
        }
    }

    public static final class c implements android.os.Parcelable.Creator<com.plaid.internal.r8> {
        public static com.plaid.internal.r8 a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pane$PaneRendering, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.String id = pane$PaneRendering.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
            java.lang.String paneNodeId = pane$PaneRendering.getPaneNodeId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paneNodeId, "");
            return new com.plaid.internal.r8(str, id, paneNodeId);
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.r8 createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            java.lang.String readString = parcel.readString();
            kotlin.jvm.internal.Intrinsics.checkNotNull(readString, "");
            java.lang.String readString2 = parcel.readString();
            kotlin.jvm.internal.Intrinsics.checkNotNull(readString2, "");
            java.lang.String readString3 = parcel.readString();
            kotlin.jvm.internal.Intrinsics.checkNotNull(readString3, "");
            return new com.plaid.internal.r8(readString, readString2, readString3);
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.r8[] newArray(int i) {
            return new com.plaid.internal.r8[i];
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public r8(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.plaid.internal.r8.a.b);
        }
        this.f6560a = str;
        this.b = str2;
        this.c = str3;
        this.d = kotlin.LazyKt.lazy(new com.plaid.internal.r8.b());
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final java.lang.String b() {
        return this.f6560a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.r8)) {
            return false;
        }
        com.plaid.internal.r8 r8Var = (com.plaid.internal.r8) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6560a, r8Var.f6560a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, r8Var.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, r8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.plaid.internal.C0679x.a(this.b, this.f6560a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f6560a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkflowPaneId(workflowId=");
        sb.append(str);
        sb.append(", paneRenderingId=");
        sb.append(str2);
        sb.append(", paneNodeId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f6560a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public r8(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f6560a = str;
        this.b = str2;
        this.c = str3;
        this.d = kotlin.LazyKt.lazy(new com.plaid.internal.r8.b());
    }
}
