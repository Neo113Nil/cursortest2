package androidx.view.serialization.serializers;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/savedstate/serialization/serializers/JavaSerializableSerializer;", "Ljava/io/Serializable;", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/io/Serializable;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/io/Serializable;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JavaSerializableSerializer<T extends java.io.Serializable> implements kotlinx.serialization.KSerializer<T> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor$default("java.io.Serializable", new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 4, null);

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (!(encoder instanceof androidx.view.serialization.SavedStateEncoder)) {
            throw new java.lang.IllegalArgumentException(androidx.view.serialization.serializers.BuiltInSerializerKt.encoderErrorMessage(this.descriptor.getSerialName(), encoder).toString());
        }
        androidx.view.serialization.SavedStateEncoder savedStateEncoder = (androidx.view.serialization.SavedStateEncoder) encoder;
        androidx.view.SavedStateWriter.m9402putJavaSerializableimpl(androidx.view.SavedStateWriter.m9382constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        if (!(decoder instanceof androidx.view.serialization.SavedStateDecoder)) {
            throw new java.lang.IllegalArgumentException(androidx.view.serialization.serializers.BuiltInSerializerKt.decoderErrorMessage(this.descriptor.getSerialName(), decoder).toString());
        }
        androidx.view.serialization.SavedStateDecoder savedStateDecoder = (androidx.view.serialization.SavedStateDecoder) decoder;
        T t = (T) androidx.view.SavedStateReader.m9334getJavaSerializableimpl(androidx.view.SavedStateReader.m9296constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.io.Serializable.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        return t;
    }
}
