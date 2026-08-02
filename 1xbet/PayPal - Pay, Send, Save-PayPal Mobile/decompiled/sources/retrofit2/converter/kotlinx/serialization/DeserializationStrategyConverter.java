package retrofit2.converter.kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/DeserializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "serializer", "<init>", "(Lkotlinx/serialization/DeserializationStrategy;Lretrofit2/converter/kotlinx/serialization/Serializer;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "convert", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/DeserializationStrategy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeserializationStrategyConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final retrofit2.converter.kotlinx.serialization.Serializer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.DeserializationStrategy<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationStrategyConverter(kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, retrofit2.converter.kotlinx.serialization.Serializer serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deserializationStrategy;
        this.getHighSpeedVideoFpsRanges = serializer;
    }

    @Override // retrofit2.Converter
    public final T convert(okhttp3.ResponseBody value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (T) this.getHighSpeedVideoFpsRanges.fromResponseBody(this.getHighResolutionOutputSizeshNQ4ISI, value);
    }
}
