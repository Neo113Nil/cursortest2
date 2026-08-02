package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class K0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.K0> CREATOR = new com.plaid.internal.K0.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5822a;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.K0> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.K0.a f5823a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.K0.a aVar = new com.plaid.internal.K0.a();
            f5823a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkActionWithInstitutionId", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("institution_id", false);
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
            return new com.plaid.internal.K0(i, str);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.K0 k0 = (com.plaid.internal.K0) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k0, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, k0.f5822a);
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.K0> {
        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.K0 createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.internal.K0(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.K0[] newArray(int i) {
            return new com.plaid.internal.K0[i];
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public K0(int i, @kotlinx.serialization.SerialName("institution_id") java.lang.String str) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.K0.a.b);
        }
        this.f5822a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.plaid.internal.K0) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5822a, ((com.plaid.internal.K0) obj).f5822a);
    }

    public final int hashCode() {
        return this.f5822a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5822a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddedOpenLinkActionWithInstitutionId(institutionId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f5822a);
    }

    public K0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f5822a = str;
    }
}
