package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/savedstate/serialization/SavedStateEncoder;", "Lkotlinx/serialization/SerializationStrategy;", "strategy", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeFormatSpecificTypesOnPlatform", "(Landroidx/savedstate/serialization/SavedStateEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(androidx.view.serialization.SavedStateEncoder savedStateEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateEncoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = serializationStrategy.getDescriptor();
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.CharSequenceSerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (java.lang.CharSequence) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.DefaultParcelableSerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (androidx.view.serialization.SavedStateEncoder) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.DefaultJavaSerializableSerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (androidx.view.serialization.SavedStateEncoder) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.IBinderSerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (android.os.IBinder) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.CharSequenceArraySerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (java.lang.CharSequence[]) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.CharSequenceListSerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (java.util.List<? extends java.lang.CharSequence>) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.ParcelableArraySerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (android.os.Parcelable[]) t);
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) || kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor())) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            androidx.view.serialization.serializers.ParcelableListSerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (java.util.List<? extends android.os.Parcelable>) t);
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) && !kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) && !kotlin.jvm.internal.Intrinsics.areEqual(descriptor, androidx.view.serialization.SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor())) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        androidx.view.serialization.serializers.SparseParcelableArraySerializer.INSTANCE.serialize((kotlinx.serialization.encoding.Encoder) savedStateEncoder, (android.util.SparseArray<android.os.Parcelable>) t);
        return true;
    }
}
