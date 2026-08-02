package com.plaid.internal;

@kotlinx.serialization.Polymorphic
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public abstract class N2 implements android.os.Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f5851a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.plaid.internal.N2.c.f5854a);

    public static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.N2.c f5854a = new com.plaid.internal.N2.c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
            return new kotlinx.serialization.SealedClassSerializer("com.plaid.internal.workflow.model.LinkState", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.a.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.b.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.d.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.e.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.i.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.j.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.k.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.N2.l.class)}, new kotlinx.serialization.KSerializer[]{com.plaid.internal.N2.a.C0155a.f5852a, com.plaid.internal.N2.b.a.f5853a, com.plaid.internal.N2.d.a.f5855a, com.plaid.internal.N2.e.a.f5856a, com.plaid.internal.N2.i.a.f5857a, new kotlinx.serialization.internal.ObjectSerializer("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", com.plaid.internal.N2.j.b, new java.lang.annotation.Annotation[0]), com.plaid.internal.N2.k.a.f5859a, com.plaid.internal.N2.l.a.f5860a}, new java.lang.annotation.Annotation[0]);
        }
    }

    public interface f {
        java.lang.String b();

        java.util.List<com.plaid.internal.r8> d();

        com.plaid.internal.r8 e();
    }

    public interface g {
        java.lang.String a();
    }

    public interface h {
        java.lang.String c();
    }

    @kotlinx.serialization.Serializable
    public static final class j extends com.plaid.internal.N2 {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.j> CREATOR;
        public static final com.plaid.internal.N2.j b = new com.plaid.internal.N2.j();
        public static final java.lang.String c = "";
        public static final java.lang.String d = "";

        public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.j.a f5858a = new com.plaid.internal.N2.j.a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", com.plaid.internal.N2.j.b, new java.lang.annotation.Annotation[0]);
            }
        }

        /* loaded from: classes16.dex */
        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.j> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.j createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.internal.N2.j.b;
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.j[] newArray(int i) {
                return new com.plaid.internal.N2.j[i];
            }
        }

        static {
            kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.plaid.internal.N2.j.a.f5858a);
            CREATOR = new com.plaid.internal.N2.j.b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return c;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    public N2() {
    }

    public final com.plaid.internal.r8 f() {
        if (this instanceof com.plaid.internal.N2.a) {
            com.plaid.internal.r8.c cVar = com.plaid.internal.r8.CREATOR;
            return com.plaid.internal.r8.e;
        }
        if (this instanceof com.plaid.internal.N2.b) {
            com.plaid.internal.r8.c cVar2 = com.plaid.internal.r8.CREATOR;
            return com.plaid.internal.r8.e;
        }
        if (this instanceof com.plaid.internal.N2.l) {
            return ((com.plaid.internal.N2.l) this).f;
        }
        if (this instanceof com.plaid.internal.N2.i) {
            return ((com.plaid.internal.N2.i) this).c;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.plaid.internal.N2.j.b)) {
            com.plaid.internal.r8.c cVar3 = com.plaid.internal.r8.CREATOR;
            return com.plaid.internal.r8.e;
        }
        if (this instanceof com.plaid.internal.N2.e) {
            com.plaid.internal.r8.c cVar4 = com.plaid.internal.r8.CREATOR;
            return com.plaid.internal.r8.e;
        }
        if (this instanceof com.plaid.internal.N2.k) {
            com.plaid.internal.r8.c cVar5 = com.plaid.internal.r8.CREATOR;
            return com.plaid.internal.r8.e;
        }
        if (!(this instanceof com.plaid.internal.N2.d)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.plaid.internal.r8.c cVar6 = com.plaid.internal.r8.CREATOR;
        return com.plaid.internal.r8.e;
    }

    public abstract java.lang.String g();

    public abstract java.lang.String h();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ N2(int i2) {
    }

    @kotlinx.serialization.Serializable
    public static final class d extends com.plaid.internal.N2 implements com.plaid.internal.N2.h {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.d> CREATOR = new com.plaid.internal.N2.d.b();
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final boolean e;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.d> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.d.a f5855a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.d.a aVar = new com.plaid.internal.N2.d.a();
                f5855a = aVar;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.CompleteOutOfProcess", aVar, 4);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("userClosedOutOfProcess", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                java.lang.String str;
                boolean z;
                java.lang.String str2;
                java.lang.String str3;
                int i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    str = decodeStringElement;
                    z = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                    str2 = decodeStringElement3;
                    str3 = decodeStringElement2;
                    i = 15;
                } else {
                    java.lang.String str4 = null;
                    java.lang.String str5 = null;
                    java.lang.String str6 = null;
                    boolean z2 = false;
                    int i2 = 0;
                    boolean z3 = true;
                    while (z3) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (decodeElementIndex == -1) {
                            z3 = false;
                        } else if (decodeElementIndex == 0) {
                            str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        } else if (decodeElementIndex == 2) {
                            str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                            }
                            z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                            i2 |= 8;
                        }
                    }
                    str = str4;
                    z = z2;
                    str2 = str5;
                    str3 = str6;
                    i = i2;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new com.plaid.internal.N2.d(i, str, str3, str2, z);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.d dVar = (com.plaid.internal.N2.d) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, dVar.b);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, dVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, dVar.d);
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 3, dVar.e);
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.d> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.d createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.internal.N2.d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.d[] newArray(int i) {
                return new com.plaid.internal.N2.d[i];
            }
        }

        public d(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }

        @Override // com.plaid.internal.N2.h
        public final java.lang.String c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.c;
        }

        public final boolean i() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public d(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
            super(0);
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.plaid.internal.N2.d.a.b);
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }
    }

    @kotlinx.serialization.Serializable
    public static final class a extends com.plaid.internal.N2 {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.a> CREATOR = new com.plaid.internal.N2.a.b();
        public final com.plaid.internal.M0 b;
        public final java.lang.String c;
        public final java.lang.String d;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        /* renamed from: com.plaid.internal.N2$a$a, reason: collision with other inner class name */
        public static final class C0155a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.a> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.a.C0155a f5852a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.a.C0155a c0155a = new com.plaid.internal.N2.a.C0155a();
                f5852a = c0155a;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.BeforeEmbeddedTransition", c0155a, 3);
                pluginGeneratedSerialDescriptor.addElement("embeddedSessionInfo", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", true);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{com.plaid.internal.M0.a.f5840a, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                int i;
                java.lang.String str;
                java.lang.String str2;
                com.plaid.internal.M0 m0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                java.lang.String str3 = null;
                if (beginStructure.decodeSequentially()) {
                    m0 = (com.plaid.internal.M0) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, com.plaid.internal.M0.a.f5840a, null);
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i = 7;
                } else {
                    int i2 = 0;
                    boolean z = true;
                    java.lang.String str4 = null;
                    com.plaid.internal.M0 m02 = null;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (decodeElementIndex == -1) {
                            z = false;
                        } else if (decodeElementIndex == 0) {
                            m02 = (com.plaid.internal.M0) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, com.plaid.internal.M0.a.f5840a, m02);
                            i2 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        } else {
                            if (decodeElementIndex != 2) {
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i2 |= 4;
                        }
                    }
                    i = i2;
                    str = str3;
                    str2 = str4;
                    m0 = m02;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new com.plaid.internal.N2.a(i, m0, str2, str);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.a aVar = (com.plaid.internal.N2.a) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                android.os.Parcelable.Creator<com.plaid.internal.N2.a> creator = com.plaid.internal.N2.a.CREATOR;
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, com.plaid.internal.M0.a.f5840a, aVar.b);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(aVar.c, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, aVar.c);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(aVar.d, aVar.b.b)) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, aVar.d);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.a> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.a createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.internal.N2.a(com.plaid.internal.M0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.a[] newArray(int i) {
                return new com.plaid.internal.N2.a[i];
            }
        }

        public a(com.plaid.internal.M0 m0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m0, "");
            this.b = m0;
            this.c = "";
            this.d = m0.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.N2.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.plaid.internal.N2.a) obj).b);
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.d;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final com.plaid.internal.M0 i() {
            return this.b;
        }

        public final java.lang.String toString() {
            com.plaid.internal.M0 m0 = this.b;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BeforeEmbeddedTransition(embeddedSessionInfo=");
            sb.append(m0);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            this.b.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public a(int i, com.plaid.internal.M0 m0, java.lang.String str, java.lang.String str2) {
            super(0);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.N2.a.C0155a.b);
            }
            this.b = m0;
            this.c = (i & 2) == 0 ? "" : str;
            if ((i & 4) == 0) {
                this.d = m0.b;
            } else {
                this.d = str2;
            }
        }
    }

    @kotlinx.serialization.Serializable
    public static final class b extends com.plaid.internal.N2 implements com.plaid.internal.N2.g {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.b> CREATOR = new com.plaid.internal.N2.b.C0156b();
        public final java.lang.String b;
        public final com.plaid.link.configuration.LinkTokenConfiguration c;
        public final java.lang.String d;
        public final java.lang.String e;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.b> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.b.a f5853a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.b.a aVar = new com.plaid.internal.N2.b.a();
                f5853a = aVar;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.BeforeLinkOpen", aVar, 3);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", true);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", true);
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
                return new com.plaid.internal.N2.b(i, str, str3, str2);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r4) == false) goto L11;
             */
            @Override // kotlinx.serialization.SerializationStrategy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.b bVar = (com.plaid.internal.N2.b) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, bVar.b);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(bVar.d, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bVar.d);
                }
                if (!beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2)) {
                    java.lang.String str = bVar.e;
                    java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                }
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, bVar.e);
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* renamed from: com.plaid.internal.N2$b$b, reason: collision with other inner class name */
        public static final class C0156b implements android.os.Parcelable.Creator<com.plaid.internal.N2.b> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.b createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.internal.N2.b(parcel.readString(), com.plaid.link.configuration.LinkTokenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.b[] newArray(int i) {
                return new com.plaid.internal.N2.b[i];
            }
        }

        public b(java.lang.String str, com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkTokenConfiguration, "");
            this.b = str;
            this.c = linkTokenConfiguration;
            this.d = "";
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.e = obj;
        }

        @Override // com.plaid.internal.N2.g
        public final java.lang.String a() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.plaid.internal.N2.b)) {
                return false;
            }
            com.plaid.internal.N2.b bVar = (com.plaid.internal.N2.b) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, bVar.c);
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final com.plaid.link.configuration.LinkTokenConfiguration i() {
            return this.c;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.b;
            com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration = this.c;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BeforeLinkOpen(linkOpenId=");
            sb.append(str);
            sb.append(", configuration=");
            sb.append(linkTokenConfiguration);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public b(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(0);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.N2.b.a.b);
            }
            this.b = str;
            this.c = new com.plaid.link.configuration.LinkTokenConfiguration.Builder().build();
            if ((i & 2) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
            if ((i & 4) != 0) {
                this.e = str3;
                return;
            }
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.e = obj;
        }
    }

    @kotlinx.serialization.Serializable
    public static final class e extends com.plaid.internal.N2 {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.e> CREATOR = new com.plaid.internal.N2.e.b();
        public final java.lang.String b;
        public final com.plaid.link.result.LinkExit c;
        public final java.lang.String d;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.e> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.e.a f5856a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.e.a aVar = new com.plaid.internal.N2.e.a();
                f5856a = aVar;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.Exit", aVar, 2);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                java.lang.String str;
                java.lang.String str2;
                int i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i = 3;
                } else {
                    str = null;
                    java.lang.String str3 = null;
                    int i2 = 0;
                    boolean z = true;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (decodeElementIndex == -1) {
                            z = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i2 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i2 |= 2;
                        }
                    }
                    str2 = str3;
                    i = i2;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new com.plaid.internal.N2.e(i, str, str2);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.e eVar = (com.plaid.internal.N2.e) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, eVar.b);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(eVar.d, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, eVar.d);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.e> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.e createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.internal.N2.e(parcel.readString(), com.plaid.link.result.LinkExit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.e[] newArray(int i) {
                return new com.plaid.internal.N2.e[i];
            }
        }

        public e(java.lang.String str, com.plaid.link.result.LinkExit linkExit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExit, "");
            this.b = str;
            this.c = linkExit;
            this.d = "";
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.plaid.internal.N2.e)) {
                return false;
            }
            com.plaid.internal.N2.e eVar = (com.plaid.internal.N2.e) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.b, eVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, eVar.c);
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.d;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final com.plaid.link.result.LinkExit i() {
            return this.c;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.b;
            com.plaid.link.result.LinkExit linkExit = this.c;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exit(workflowId=");
            sb.append(str);
            sb.append(", linkExit=");
            sb.append(linkExit);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public e(int i, java.lang.String str, java.lang.String str2) {
            super(0);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.N2.e.a.b);
            }
            this.b = str;
            com.plaid.link.result.LinkExitMetadata a2 = com.plaid.internal.L2.a(31, (java.lang.String) null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
            this.c = new com.plaid.link.result.LinkExit(null, a2);
            if ((i & 2) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
        }
    }

    @kotlinx.serialization.Serializable
    public static final class l extends com.plaid.internal.N2 implements com.plaid.internal.N2.f, com.plaid.internal.N2.h, com.plaid.internal.N2.g {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.l> CREATOR = new com.plaid.internal.N2.l.b();
        public static final kotlinx.serialization.KSerializer<java.lang.Object>[] j;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final com.plaid.internal.r8 f;
        public final java.util.List<com.plaid.internal.r8> g;
        public final java.util.List<com.plaid.internal.r8> h;
        public final java.lang.String i;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.l> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.l.a f5860a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.l.a aVar = new com.plaid.internal.N2.l.a();
                f5860a = aVar;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.Workflow", aVar, 8);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("continuationToken", false);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", false);
                pluginGeneratedSerialDescriptor.addElement("currentPane", false);
                pluginGeneratedSerialDescriptor.addElement("additionalPanes", false);
                pluginGeneratedSerialDescriptor.addElement("backstack", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.KSerializer<?>[] kSerializerArr = com.plaid.internal.N2.l.j;
                kotlinx.serialization.KSerializer<?> kSerializer = kSerializerArr[5];
                kotlinx.serialization.KSerializer<?> kSerializer2 = kSerializerArr[6];
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, com.plaid.internal.r8.a.f6561a, kSerializer, kSerializer2, stringSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                int i;
                java.util.List list;
                com.plaid.internal.r8 r8Var;
                java.lang.String str;
                java.lang.String str2;
                java.util.List list2;
                java.lang.String str3;
                java.lang.String str4;
                java.lang.String str5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                kotlinx.serialization.KSerializer<java.lang.Object>[] kSerializerArr = com.plaid.internal.N2.l.j;
                int i2 = 7;
                com.plaid.internal.r8 r8Var2 = null;
                if (beginStructure.decodeSequentially()) {
                    str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    com.plaid.internal.r8 r8Var3 = (com.plaid.internal.r8) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, com.plaid.internal.r8.a.f6561a, null);
                    java.util.List list3 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], null);
                    list2 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], null);
                    i = 255;
                    list = list3;
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                    str4 = decodeStringElement;
                    str = decodeStringElement3;
                    str3 = decodeStringElement2;
                    r8Var = r8Var3;
                } else {
                    int i3 = 0;
                    boolean z = true;
                    java.util.List list4 = null;
                    java.lang.String str6 = null;
                    java.lang.String str7 = null;
                    java.util.List list5 = null;
                    java.lang.String str8 = null;
                    java.lang.String str9 = null;
                    java.lang.String str10 = null;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (decodeElementIndex) {
                            case -1:
                                z = false;
                                i2 = 7;
                            case 0:
                                str10 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i3 |= 1;
                                i2 = 7;
                            case 1:
                                str9 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i3 |= 2;
                            case 2:
                                str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i3 |= 4;
                            case 3:
                                str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i3 |= 8;
                            case 4:
                                r8Var2 = (com.plaid.internal.r8) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, com.plaid.internal.r8.a.f6561a, r8Var2);
                                i3 |= 16;
                            case 5:
                                list4 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list4);
                                i3 |= 32;
                            case 6:
                                list5 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list5);
                                i3 |= 64;
                            case 7:
                                str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i2);
                                i3 |= 128;
                            default:
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i = i3;
                    list = list4;
                    r8Var = r8Var2;
                    str = str6;
                    str2 = str7;
                    list2 = list5;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new com.plaid.internal.N2.l(i, str5, str4, str3, str, r8Var, list, list2, str2);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.l lVar = (com.plaid.internal.N2.l) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                kotlinx.serialization.KSerializer<java.lang.Object>[] kSerializerArr = com.plaid.internal.N2.l.j;
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, lVar.b);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, lVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, lVar.d);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, lVar.e);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, com.plaid.internal.r8.a.f6561a, lVar.f);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], lVar.g);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], lVar.h);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, lVar.i);
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.l> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.l createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                com.plaid.internal.r8 r8Var = (com.plaid.internal.r8) parcel.readParcelable(com.plaid.internal.N2.l.class.getClassLoader());
                int readInt = parcel.readInt();
                java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(com.plaid.internal.N2.l.class.getClassLoader()));
                }
                int readInt2 = parcel.readInt();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(parcel.readParcelable(com.plaid.internal.N2.l.class.getClassLoader()));
                }
                return new com.plaid.internal.N2.l(readString, readString2, readString3, readString4, r8Var, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.l[] newArray(int i) {
                return new com.plaid.internal.N2.l[i];
            }
        }

        static {
            com.plaid.internal.r8.a aVar = com.plaid.internal.r8.a.f6561a;
            j = new kotlinx.serialization.KSerializer[]{null, null, null, null, null, new kotlinx.serialization.internal.ArrayListSerializer(aVar), new kotlinx.serialization.internal.ArrayListSerializer(aVar), null};
        }

        public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.plaid.internal.r8 r8Var, java.util.List<com.plaid.internal.r8> list, java.util.List<com.plaid.internal.r8> list2, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = r8Var;
            this.g = list;
            this.h = list2;
            this.i = str5;
        }

        @Override // com.plaid.internal.N2.g
        public final java.lang.String a() {
            return this.e;
        }

        @Override // com.plaid.internal.N2.f
        public final java.lang.String b() {
            return this.d;
        }

        @Override // com.plaid.internal.N2.h
        public final java.lang.String c() {
            return this.i;
        }

        @Override // com.plaid.internal.N2.f
        public final java.util.List<com.plaid.internal.r8> d() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        public final com.plaid.internal.r8 e() {
            return this.f;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.plaid.internal.N2.l)) {
                return false;
            }
            com.plaid.internal.N2.l lVar = (com.plaid.internal.N2.l) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.b, lVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, lVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, lVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, lVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, lVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, lVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, lVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, lVar.i);
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.c;
        }

        public final int hashCode() {
            int a2 = com.plaid.internal.C0679x.a(this.e, com.plaid.internal.C0679x.a(this.d, com.plaid.internal.C0679x.a(this.c, this.b.hashCode() * 31, 31), 31), 31);
            int hashCode = this.f.hashCode();
            int hashCode2 = this.g.hashCode();
            return this.i.hashCode() + ((this.h.hashCode() + ((hashCode2 + ((hashCode + a2) * 31)) * 31)) * 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.b;
            java.lang.String str2 = this.c;
            java.lang.String str3 = this.d;
            java.lang.String str4 = this.e;
            com.plaid.internal.r8 r8Var = this.f;
            java.util.List<com.plaid.internal.r8> list = this.g;
            java.util.List<com.plaid.internal.r8> list2 = this.h;
            java.lang.String str5 = this.i;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Workflow(linkOpenId=");
            sb.append(str);
            sb.append(", workflowId=");
            sb.append(str2);
            sb.append(", continuationToken=");
            sb.append(str3);
            sb.append(", oauthNonce=");
            sb.append(str4);
            sb.append(", currentPane=");
            sb.append(r8Var);
            sb.append(", additionalPanes=");
            sb.append(list);
            sb.append(", backstack=");
            sb.append(list2);
            sb.append(", requestId=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            java.util.List<com.plaid.internal.r8> list = this.g;
            parcel.writeInt(list.size());
            java.util.Iterator<com.plaid.internal.r8> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
            java.util.List<com.plaid.internal.r8> list2 = this.h;
            parcel.writeInt(list2.size());
            java.util.Iterator<com.plaid.internal.r8> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
            parcel.writeString(this.i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public l(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.plaid.internal.r8 r8Var, java.util.List list, java.util.List list2, java.lang.String str5) {
            super(0);
            if (255 != (i & 255)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.plaid.internal.N2.l.a.b);
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = r8Var;
            this.g = list;
            this.h = list2;
            this.i = str5;
        }
    }

    @kotlinx.serialization.Serializable
    public static final class k extends com.plaid.internal.N2 implements com.plaid.internal.N2.h, com.plaid.internal.N2.g {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.k> CREATOR = new com.plaid.internal.N2.k.b();
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final java.lang.String f;
        public final java.lang.String g;
        public final com.plaid.internal.A h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final com.plaid.internal.EnumC0508d7 l;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.k> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.k.a f5859a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.k.a aVar = new com.plaid.internal.N2.k.a();
                f5859a = aVar;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.WebviewFallback", aVar, 11);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", false);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", false);
                pluginGeneratedSerialDescriptor.addElement("url", false);
                pluginGeneratedSerialDescriptor.addElement("webviewFallbackId", false);
                pluginGeneratedSerialDescriptor.addElement("channelInfo", true);
                pluginGeneratedSerialDescriptor.addElement("hasTransparentBackground", true);
                pluginGeneratedSerialDescriptor.addElement("isOutOfProcess", true);
                pluginGeneratedSerialDescriptor.addElement("shouldPreloadLink", false);
                pluginGeneratedSerialDescriptor.addElement("smsAutofillType", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.KSerializer<?> nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.A.a.f5745a);
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                kotlinx.serialization.internal.BooleanSerializer booleanSerializer = kotlinx.serialization.internal.BooleanSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, nullable, booleanSerializer, booleanSerializer, booleanSerializer, com.plaid.internal.EnumC0508d7.a.f6396a};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                boolean z;
                int i;
                java.lang.String str;
                com.plaid.internal.EnumC0508d7 enumC0508d7;
                java.lang.String str2;
                boolean z2;
                java.lang.String str3;
                java.lang.String str4;
                boolean z3;
                java.lang.String str5;
                com.plaid.internal.A a2;
                java.lang.String str6;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                int i2 = 10;
                if (beginStructure.decodeSequentially()) {
                    java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    com.plaid.internal.A a3 = (com.plaid.internal.A) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, com.plaid.internal.A.a.f5745a, null);
                    boolean decodeBooleanElement = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 7);
                    boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 8);
                    boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                    enumC0508d7 = (com.plaid.internal.EnumC0508d7) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, com.plaid.internal.EnumC0508d7.a.f6396a, null);
                    z = decodeBooleanElement3;
                    z2 = decodeBooleanElement;
                    a2 = a3;
                    str4 = decodeStringElement5;
                    str6 = decodeStringElement3;
                    z3 = decodeBooleanElement2;
                    str5 = decodeStringElement4;
                    i = 2047;
                    str3 = decodeStringElement2;
                    str2 = decodeStringElement;
                } else {
                    boolean z4 = true;
                    com.plaid.internal.EnumC0508d7 enumC0508d72 = null;
                    java.lang.String str7 = null;
                    java.lang.String str8 = null;
                    java.lang.String str9 = null;
                    java.lang.String str10 = null;
                    java.lang.String str11 = null;
                    java.lang.String str12 = null;
                    boolean z5 = false;
                    int i3 = 0;
                    boolean z6 = false;
                    boolean z7 = false;
                    com.plaid.internal.A a4 = null;
                    while (z4) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (decodeElementIndex) {
                            case -1:
                                z4 = false;
                                i2 = 10;
                            case 0:
                                str12 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i3 |= 1;
                                i2 = 10;
                            case 1:
                                str11 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i3 |= 2;
                                i2 = 10;
                            case 2:
                                str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i3 |= 4;
                                i2 = 10;
                            case 3:
                                str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i3 |= 8;
                            case 4:
                                str9 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i3 |= 16;
                            case 5:
                                str10 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i3 |= 32;
                            case 6:
                                a4 = (com.plaid.internal.A) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, com.plaid.internal.A.a.f5745a, a4);
                                i3 |= 64;
                            case 7:
                                z7 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 7);
                                i3 |= 128;
                            case 8:
                                z6 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 8);
                                i3 |= 256;
                            case 9:
                                z5 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                                i3 |= 512;
                            case 10:
                                enumC0508d72 = (com.plaid.internal.EnumC0508d7) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i2, com.plaid.internal.EnumC0508d7.a.f6396a, enumC0508d72);
                                i3 |= 1024;
                            default:
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                    }
                    z = z5;
                    i = i3;
                    str = str11;
                    enumC0508d7 = enumC0508d72;
                    str2 = str12;
                    java.lang.String str13 = str9;
                    z2 = z7;
                    str3 = str7;
                    str4 = str10;
                    z3 = z6;
                    str5 = str13;
                    java.lang.String str14 = str8;
                    a2 = a4;
                    str6 = str14;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new com.plaid.internal.N2.k(i, str2, str, str3, str6, str5, str4, a2, z2, z3, z, enumC0508d7);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.k kVar = (com.plaid.internal.N2.k) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, kVar.b);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, kVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, kVar.d);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, kVar.e);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, kVar.f);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, kVar.g);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || kVar.h != null) {
                    beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, com.plaid.internal.A.a.f5745a, kVar.h);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || kVar.i) {
                    beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 7, kVar.i);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || kVar.j) {
                    beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 8, kVar.j);
                }
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 9, kVar.k);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || kVar.l != com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL) {
                    beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 10, com.plaid.internal.EnumC0508d7.a.f6396a, kVar.l);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.k> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.k createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.internal.N2.k(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : com.plaid.internal.A.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, com.plaid.internal.EnumC0508d7.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.k[] newArray(int i) {
                return new com.plaid.internal.N2.k[i];
            }
        }

        public k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.plaid.internal.A a2, boolean z, boolean z2, boolean z3, com.plaid.internal.EnumC0508d7 enumC0508d7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC0508d7, "");
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = a2;
            this.i = z;
            this.j = z2;
            this.k = z3;
            this.l = enumC0508d7;
        }

        @Override // com.plaid.internal.N2.g
        public final java.lang.String a() {
            return this.e;
        }

        @Override // com.plaid.internal.N2.h
        public final java.lang.String c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.b;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.c;
        }

        public final com.plaid.internal.A i() {
            return this.h;
        }

        public final com.plaid.internal.EnumC0508d7 j() {
            return this.l;
        }

        public final java.lang.String k() {
            return this.f;
        }

        public final java.lang.String l() {
            return this.g;
        }

        public final boolean m() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            com.plaid.internal.A a2 = this.h;
            if (a2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(a2.f5744a);
                parcel.writeString(a2.b);
                parcel.writeLong(a2.c);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            this.l.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public k(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.plaid.internal.A a2, boolean z, boolean z2, boolean z3, com.plaid.internal.EnumC0508d7 enumC0508d7) {
            super(0);
            if (575 != (i & 575)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 575, com.plaid.internal.N2.k.a.b);
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            if ((i & 64) == 0) {
                this.h = null;
            } else {
                this.h = a2;
            }
            if ((i & 128) == 0) {
                this.i = false;
            } else {
                this.i = z;
            }
            if ((i & 256) == 0) {
                this.j = false;
            } else {
                this.j = z2;
            }
            this.k = z3;
            if ((i & 1024) == 0) {
                this.l = com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL;
            } else {
                this.l = enumC0508d7;
            }
        }

        public /* synthetic */ k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.plaid.internal.A a2, boolean z, com.plaid.internal.EnumC0508d7 enumC0508d7, int i) {
            this(str, str2, str3, str4, str5, str6, a2, false, true, z, (i & 1024) != 0 ? com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL : enumC0508d7);
        }
    }

    @kotlinx.serialization.Serializable
    public static final class i extends com.plaid.internal.N2 implements com.plaid.internal.N2.f, com.plaid.internal.N2.g, com.plaid.internal.N2.h {
        public static final android.os.Parcelable.Creator<com.plaid.internal.N2.i> CREATOR = new com.plaid.internal.N2.i.b();
        public static final kotlinx.serialization.KSerializer<java.lang.Object>[] l = {null, null, null, null, null, new kotlinx.serialization.internal.ArrayListSerializer(com.plaid.internal.r8.a.f6561a), null, new kotlinx.serialization.internal.EnumSerializer("com.plaid.internal.workflow.error.LocalErrorType", com.plaid.internal.H3.values()), null, null};
        public final java.lang.String b;
        public final com.plaid.internal.r8 c;
        public final java.lang.String d;
        public final java.lang.String e;
        public final java.lang.String f;
        public final java.util.List<com.plaid.internal.r8> g;
        public final java.lang.String h;
        public final com.plaid.internal.H3 i;
        public final java.lang.String j;
        public final java.lang.String k;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.N2.i> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.N2.i.a f5857a;
            public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

            static {
                com.plaid.internal.N2.i.a aVar = new com.plaid.internal.N2.i.a();
                f5857a = aVar;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.LinkState.LocalError", aVar, 10);
                pluginGeneratedSerialDescriptor.addElement("workflowId", false);
                pluginGeneratedSerialDescriptor.addElement("currentPane", false);
                pluginGeneratedSerialDescriptor.addElement("continuationToken", false);
                pluginGeneratedSerialDescriptor.addElement("errorMessage", false);
                pluginGeneratedSerialDescriptor.addElement("errorCode", false);
                pluginGeneratedSerialDescriptor.addElement("backstack", false);
                pluginGeneratedSerialDescriptor.addElement("requestId", false);
                pluginGeneratedSerialDescriptor.addElement("errorType", true);
                pluginGeneratedSerialDescriptor.addElement("linkOpenId", true);
                pluginGeneratedSerialDescriptor.addElement("oauthNonce", true);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.KSerializer<?>[] kSerializerArr = com.plaid.internal.N2.i.l;
                kotlinx.serialization.KSerializer<?> kSerializer = kSerializerArr[5];
                kotlinx.serialization.KSerializer<?> kSerializer2 = kSerializerArr[7];
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{stringSerializer, com.plaid.internal.r8.a.f6561a, stringSerializer, stringSerializer, stringSerializer, kSerializer, stringSerializer, kSerializer2, stringSerializer, stringSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                java.lang.String str;
                int i;
                java.util.List list;
                java.lang.String str2;
                java.lang.String str3;
                com.plaid.internal.r8 r8Var;
                java.lang.String str4;
                java.lang.String str5;
                java.lang.String str6;
                com.plaid.internal.H3 h3;
                java.lang.String str7;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                kotlinx.serialization.KSerializer<java.lang.Object>[] kSerializerArr = com.plaid.internal.N2.i.l;
                int i2 = 9;
                int i3 = 6;
                int i4 = 3;
                java.lang.String str8 = null;
                if (beginStructure.decodeSequentially()) {
                    java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    com.plaid.internal.r8 r8Var2 = (com.plaid.internal.r8) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.r8.a.f6561a, null);
                    java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], null);
                    java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                    com.plaid.internal.H3 h32 = (com.plaid.internal.H3) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], null);
                    java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                    h3 = h32;
                    str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                    str4 = decodeStringElement5;
                    str = decodeStringElement3;
                    str2 = decodeStringElement6;
                    str3 = decodeStringElement4;
                    str5 = decodeStringElement2;
                    list = list2;
                    r8Var = r8Var2;
                    str7 = decodeStringElement;
                    i = 1023;
                } else {
                    int i5 = 0;
                    boolean z = true;
                    com.plaid.internal.H3 h33 = null;
                    java.util.List list3 = null;
                    str = null;
                    java.lang.String str9 = null;
                    java.lang.String str10 = null;
                    java.lang.String str11 = null;
                    com.plaid.internal.r8 r8Var3 = null;
                    java.lang.String str12 = null;
                    java.lang.String str13 = null;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (decodeElementIndex) {
                            case -1:
                                z = false;
                                i2 = 9;
                                i3 = 6;
                                i4 = 3;
                            case 0:
                                str13 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i5 |= 1;
                                i2 = 9;
                                i3 = 6;
                                i4 = 3;
                            case 1:
                                r8Var3 = (com.plaid.internal.r8) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.r8.a.f6561a, r8Var3);
                                i5 |= 2;
                                i2 = 9;
                                i3 = 6;
                                i4 = 3;
                            case 2:
                                str12 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i5 |= 4;
                            case 3:
                                str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i4);
                                i5 |= 8;
                            case 4:
                                str10 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i5 |= 16;
                            case 5:
                                list3 = (java.util.List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list3);
                                i5 |= 32;
                            case 6:
                                str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i3);
                                i5 |= 64;
                            case 7:
                                h33 = (com.plaid.internal.H3) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], h33);
                                i5 |= 128;
                            case 8:
                                str9 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                                i5 |= 256;
                            case 9:
                                str11 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i2);
                                i5 |= 512;
                            default:
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                    }
                    com.plaid.internal.r8 r8Var4 = r8Var3;
                    i = i5;
                    list = list3;
                    str2 = str9;
                    str3 = str10;
                    r8Var = r8Var4;
                    str4 = str8;
                    str5 = str12;
                    str6 = str11;
                    h3 = h33;
                    str7 = str13;
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new com.plaid.internal.N2.i(i, str7, r8Var, str5, str, str3, list, str4, h3, str2, str6);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
                com.plaid.internal.N2.i iVar = (com.plaid.internal.N2.i) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "");
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                kotlinx.serialization.KSerializer<java.lang.Object>[] kSerializerArr = com.plaid.internal.N2.i.l;
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, iVar.b);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.r8.a.f6561a, iVar.c);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, iVar.d);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, iVar.e);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, iVar.f);
                beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], iVar.g);
                beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, iVar.h);
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || iVar.i != com.plaid.internal.H3.UNKNOWN_ERROR) {
                    beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], iVar.i);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !kotlin.jvm.internal.Intrinsics.areEqual(iVar.j, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, iVar.j);
                }
                if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !kotlin.jvm.internal.Intrinsics.areEqual(iVar.k, "")) {
                    beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, iVar.k);
                }
                beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.N2.i> {
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.i createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                java.lang.String readString = parcel.readString();
                com.plaid.internal.r8 r8Var = (com.plaid.internal.r8) parcel.readParcelable(com.plaid.internal.N2.i.class.getClassLoader());
                java.lang.String readString2 = parcel.readString();
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(com.plaid.internal.N2.i.class.getClassLoader()));
                }
                return new com.plaid.internal.N2.i(readString, r8Var, readString2, readString3, readString4, arrayList, parcel.readString(), com.plaid.internal.H3.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.N2.i[] newArray(int i) {
                return new com.plaid.internal.N2.i[i];
            }
        }

        public i(java.lang.String str, com.plaid.internal.r8 r8Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<com.plaid.internal.r8> list, java.lang.String str5, com.plaid.internal.H3 h3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h3, "");
            this.b = str;
            this.c = r8Var;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = list;
            this.h = str5;
            this.i = h3;
            this.j = "";
            this.k = "";
        }

        @Override // com.plaid.internal.N2.g
        public final java.lang.String a() {
            return this.k;
        }

        @Override // com.plaid.internal.N2.f
        public final java.lang.String b() {
            return this.d;
        }

        @Override // com.plaid.internal.N2.h
        public final java.lang.String c() {
            return this.h;
        }

        @Override // com.plaid.internal.N2.f
        public final java.util.List<com.plaid.internal.r8> d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        public final com.plaid.internal.r8 e() {
            return this.c;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.plaid.internal.N2.i)) {
                return false;
            }
            com.plaid.internal.N2.i iVar = (com.plaid.internal.N2.i) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.b, iVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, iVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, iVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, iVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, iVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, iVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, iVar.h) && this.i == iVar.i;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String g() {
            return this.j;
        }

        @Override // com.plaid.internal.N2
        public final java.lang.String h() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            int a2 = com.plaid.internal.C0679x.a(this.f, com.plaid.internal.C0679x.a(this.e, com.plaid.internal.C0679x.a(this.d, (this.c.hashCode() + (hashCode * 31)) * 31, 31), 31), 31);
            return this.i.hashCode() + com.plaid.internal.C0679x.a(this.h, (this.g.hashCode() + a2) * 31, 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.b;
            com.plaid.internal.r8 r8Var = this.c;
            java.lang.String str2 = this.d;
            java.lang.String str3 = this.e;
            java.lang.String str4 = this.f;
            java.util.List<com.plaid.internal.r8> list = this.g;
            java.lang.String str5 = this.h;
            com.plaid.internal.H3 h3 = this.i;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalError(workflowId=");
            sb.append(str);
            sb.append(", currentPane=");
            sb.append(r8Var);
            sb.append(", continuationToken=");
            sb.append(str2);
            sb.append(", errorMessage=");
            sb.append(str3);
            sb.append(", errorCode=");
            sb.append(str4);
            sb.append(", backstack=");
            sb.append(list);
            sb.append(", requestId=");
            sb.append(str5);
            sb.append(", errorType=");
            sb.append(h3);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            java.util.List<com.plaid.internal.r8> list = this.g;
            parcel.writeInt(list.size());
            java.util.Iterator<com.plaid.internal.r8> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
            parcel.writeString(this.h);
            this.i.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public i(int i, java.lang.String str, com.plaid.internal.r8 r8Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, com.plaid.internal.H3 h3, java.lang.String str6, java.lang.String str7) {
            super(0);
            if (127 != (i & 127)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.plaid.internal.N2.i.a.b);
            }
            this.b = str;
            this.c = r8Var;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = list;
            this.h = str5;
            if ((i & 128) == 0) {
                this.i = com.plaid.internal.H3.UNKNOWN_ERROR;
            } else {
                this.i = h3;
            }
            if ((i & 256) == 0) {
                this.j = "";
            } else {
                this.j = str6;
            }
            if ((i & 512) == 0) {
                this.k = "";
            } else {
                this.k = str7;
            }
        }
    }
}
