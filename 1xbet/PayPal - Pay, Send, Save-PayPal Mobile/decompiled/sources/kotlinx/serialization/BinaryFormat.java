package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/BinaryFormat;", "Lkotlinx/serialization/SerialFormat;", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeToByteArray", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "decodeFromByteArray", "(Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface BinaryFormat extends kotlinx.serialization.SerialFormat {
    <T> T decodeFromByteArray(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, byte[] bytes);

    <T> byte[] encodeToByteArray(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value);
}
