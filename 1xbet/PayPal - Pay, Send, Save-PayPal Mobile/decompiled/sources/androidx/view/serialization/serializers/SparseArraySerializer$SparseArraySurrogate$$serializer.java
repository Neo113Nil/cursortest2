package androidx.view.serialization.serializers;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\t¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$$serializer;", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements kotlinx.serialization.internal.GeneratedSerializer<androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<T>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;
    private final /* synthetic */ kotlinx.serialization.KSerializer<?> getHighSpeedVideoSizes;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        pluginGeneratedSerialDescriptor.addElement(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("values", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.getHighSpeedVideoSizes = kSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), new kotlinx.serialization.internal.ArrayListSerializer(this.getHighSpeedVideoSizes)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        int i;
        java.util.List list2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        java.util.List list3 = null;
        if (beginStructure.decodeSequentially()) {
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, new kotlinx.serialization.internal.ArrayListSerializer(this.getHighSpeedVideoSizes), null);
            i = 3;
        } else {
            java.util.List list4 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), list4);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, new kotlinx.serialization.internal.ArrayListSerializer(this.getHighSpeedVideoSizes), list3);
                    i2 |= 2;
                }
            }
            list = list4;
            java.util.List list5 = list3;
            i = i2;
            list2 = list5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<>(i, list, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.Camera2StreamConfigurationMap(value, beginStructure, serialDescriptor, this.getHighSpeedVideoSizes);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return new kotlinx.serialization.KSerializer[]{this.getHighSpeedVideoSizes};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
}
