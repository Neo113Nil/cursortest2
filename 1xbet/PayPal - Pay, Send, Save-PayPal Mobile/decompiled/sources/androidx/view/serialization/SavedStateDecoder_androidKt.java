package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/savedstate/serialization/SavedStateDecoder;", "Lkotlinx/serialization/DeserializationStrategy;", "strategy", "decodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T decodeFormatSpecificTypesOnPlatform(androidx.view.serialization.SavedStateDecoder savedStateDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateDecoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = deserializationStrategy.getDescriptor();
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            return (T) androidx.view.serialization.serializers.CharSequenceSerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            return (T) androidx.view.serialization.serializers.DefaultParcelableSerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            return (T) androidx.view.serialization.serializers.DefaultJavaSerializableSerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            return (T) androidx.view.serialization.serializers.IBinderSerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            return (T) androidx.view.serialization.serializers.CharSequenceArraySerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            return (T) androidx.view.serialization.serializers.CharSequenceListSerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor())) {
            android.os.Parcelable[] deserialize = androidx.view.serialization.serializers.ParcelableArraySerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
            T deserialize2 = deserializationStrategy.deserialize(androidx.view.serialization.EmptyArrayDecoder.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(deserialize2);
            return (T) java.util.Arrays.copyOf(deserialize, deserialize.length, kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(deserialize2.getClass())));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            return (T) androidx.view.serialization.serializers.ParcelableArraySerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            return (T) androidx.view.serialization.serializers.ParcelableListSerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return (T) androidx.view.serialization.serializers.SparseParcelableArraySerializer.INSTANCE.deserialize((kotlinx.serialization.encoding.Decoder) savedStateDecoder);
        }
        return null;
    }
}
