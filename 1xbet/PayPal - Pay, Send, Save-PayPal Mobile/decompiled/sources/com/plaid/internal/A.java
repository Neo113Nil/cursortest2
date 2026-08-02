package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class A implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.A> CREATOR = new com.plaid.internal.A.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5744a;
    public final java.lang.String b;
    public final long c;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.A> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.A.a f5745a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.A.a aVar = new com.plaid.internal.A.a();
            f5745a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.workflow.model.ChannelInfo", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("secret", false);
            pluginGeneratedSerialDescriptor.addElement("polling_interval_ms", false);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, kotlinx.serialization.internal.LongSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.String str;
            int i;
            java.lang.String str2;
            long j;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                i = 7;
                str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                j = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
            } else {
                java.lang.String str3 = null;
                boolean z = true;
                long j2 = 0;
                java.lang.String str4 = null;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        j2 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                        i2 |= 4;
                    }
                }
                str = str3;
                i = i2;
                str2 = str4;
                j = j2;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.A(i, str, str2, j);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.A a2 = (com.plaid.internal.A) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, a2.f5744a);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, a2.b);
            beginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 2, a2.c);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.A> {
        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.A createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.internal.A(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.A[] newArray(int i) {
            return new com.plaid.internal.A[i];
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public A(int i, @kotlinx.serialization.SerialName("id") java.lang.String str, @kotlinx.serialization.SerialName("secret") java.lang.String str2, @kotlinx.serialization.SerialName("polling_interval_ms") long j) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.plaid.internal.A.a.b);
        }
        this.f5744a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.A)) {
            return false;
        }
        com.plaid.internal.A a2 = (com.plaid.internal.A) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5744a, a2.f5744a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, a2.b) && this.c == a2.c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.c) + com.plaid.internal.C0679x.a(this.b, this.f5744a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5744a;
        java.lang.String str2 = this.b;
        long j = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChannelInfo(channelId=");
        sb.append(str);
        sb.append(", channelSecret=");
        sb.append(str2);
        sb.append(", pollingInterval=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f5744a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    public A(long j, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.f5744a = str;
        this.b = str2;
        this.c = j;
    }
}
