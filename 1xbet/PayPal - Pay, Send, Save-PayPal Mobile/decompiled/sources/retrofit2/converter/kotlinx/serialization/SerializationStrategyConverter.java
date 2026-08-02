package retrofit2.converter.kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/SerializationStrategyConverter;", "T", "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlinx/serialization/SerializationStrategy;", "saver", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "serializer", "<init>", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Lretrofit2/converter/kotlinx/serialization/Serializer;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "convert", "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "getHighSpeedVideoFpsRanges", "Lokhttp3/MediaType;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/SerializationStrategy;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lretrofit2/converter/kotlinx/serialization/Serializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerializationStrategyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    private final retrofit2.converter.kotlinx.serialization.Serializer getHighResolutionOutputSizeshNQ4ISI;
    private final okhttp3.MediaType getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.SerializationStrategy<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public SerializationStrategyConverter(okhttp3.MediaType mediaType, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, retrofit2.converter.kotlinx.serialization.Serializer serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        this.getHighSpeedVideoFpsRanges = mediaType;
        this.getHighSpeedVideoFpsRangesFor = serializationStrategy;
        this.getHighResolutionOutputSizeshNQ4ISI = serializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public final /* bridge */ /* synthetic */ okhttp3.RequestBody convert(java.lang.Object obj) {
        return convert2((retrofit2.converter.kotlinx.serialization.SerializationStrategyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    /* renamed from: convert, reason: avoid collision after fix types in other method */
    public final okhttp3.RequestBody convert2(T value) {
        return this.getHighResolutionOutputSizeshNQ4ISI.toRequestBody(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, value);
    }
}
