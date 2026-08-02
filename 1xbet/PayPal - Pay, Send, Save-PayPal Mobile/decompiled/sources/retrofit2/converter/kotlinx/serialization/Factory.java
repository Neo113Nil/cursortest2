package retrofit2.converter.kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0016\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Factory;", "Lretrofit2/Converter$Factory;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lretrofit2/converter/kotlinx/serialization/Serializer;", "serializer", "<init>", "(Lokhttp3/MediaType;Lretrofit2/converter/kotlinx/serialization/Serializer;)V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "responseBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "requestBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/MediaType;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Factory extends retrofit2.Converter.Factory {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okhttp3.MediaType getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final retrofit2.converter.kotlinx.serialization.Serializer getHighSpeedVideoFpsRanges;

    public Factory(okhttp3.MediaType mediaType, retrofit2.converter.kotlinx.serialization.Serializer serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mediaType;
        this.getHighSpeedVideoFpsRanges = serializer;
    }

    @Override // retrofit2.Converter.Factory
    public final retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotations, retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        return new retrofit2.converter.kotlinx.serialization.DeserializationStrategyConverter(this.getHighSpeedVideoFpsRanges.serializer(type), this.getHighSpeedVideoFpsRanges);
    }

    @Override // retrofit2.Converter.Factory
    public final retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] parameterAnnotations, java.lang.annotation.Annotation[] methodAnnotations, retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterAnnotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodAnnotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        return new retrofit2.converter.kotlinx.serialization.SerializationStrategyConverter(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.serializer(type), this.getHighSpeedVideoFpsRanges);
    }
}
