package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class I0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.I0> CREATOR = new com.plaid.internal.I0.b();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.I0> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.I0.a f5806a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.I0.a aVar = new com.plaid.internal.I0.a();
            f5806a = aVar;
            b = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkActionDefault", aVar, 0);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[0];
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            int decodeElementIndex;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (!beginStructure.decodeSequentially() && (decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor)) != -1) {
                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.I0(0);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((com.plaid.internal.I0) obj, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            encoder.beginStructure(pluginGeneratedSerialDescriptor).endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.I0> {
        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.I0 createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new com.plaid.internal.I0();
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.I0[] newArray(int i) {
            return new com.plaid.internal.I0[i];
        }
    }

    public I0() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public I0(int i) {
    }
}
