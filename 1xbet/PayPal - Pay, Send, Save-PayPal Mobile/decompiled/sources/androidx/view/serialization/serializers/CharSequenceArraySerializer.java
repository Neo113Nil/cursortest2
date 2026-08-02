package androidx.view.serialization.serializers;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/savedstate/serialization/serializers/CharSequenceArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;[Ljava/lang/CharSequence;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)[Ljava/lang/CharSequence;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharSequenceArraySerializer implements kotlinx.serialization.KSerializer<java.lang.CharSequence[]> {
    public static final androidx.view.serialization.serializers.CharSequenceArraySerializer INSTANCE = new androidx.view.serialization.serializers.CharSequenceArraySerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor$default("kotlin.Array<kotlin.CharSequence>", new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 4, null);

    private CharSequenceArraySerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.CharSequence[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (!(encoder instanceof androidx.view.serialization.SavedStateEncoder)) {
            throw new java.lang.IllegalArgumentException(androidx.view.serialization.serializers.BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getGetHighSpeedVideoSizes(), encoder).toString());
        }
        androidx.view.serialization.SavedStateEncoder savedStateEncoder = (androidx.view.serialization.SavedStateEncoder) encoder;
        androidx.view.SavedStateWriter.m9393putCharSequenceArrayimpl(androidx.view.SavedStateWriter.m9382constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final java.lang.CharSequence[] deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        if (!(decoder instanceof androidx.view.serialization.SavedStateDecoder)) {
            throw new java.lang.IllegalArgumentException(androidx.view.serialization.serializers.BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getGetHighSpeedVideoSizes(), decoder).toString());
        }
        androidx.view.serialization.SavedStateDecoder savedStateDecoder = (androidx.view.serialization.SavedStateDecoder) decoder;
        return androidx.view.SavedStateReader.m9314getCharSequenceArrayimpl(androidx.view.SavedStateReader.m9296constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }
}
