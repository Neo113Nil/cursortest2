package io.ktor.util.converters;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001bBY\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012!\u0010\t\u001a\u001d\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004\u0012!\u0010\n\u001a\u001d\u0012\u000b\u0012\t\u0018\u00010\b¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u0004\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R/\u0010\u0018\u001a\u001d\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R/\u0010\u0015\u001a\u001d\u0012\u000b\u0012\t\u0018\u00010\b¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService;", "Lio/ktor/util/converters/ConversionService;", "Lkotlin/reflect/KClass;", "klass", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "", "decoder", "encoder", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "values", "Lio/ktor/util/reflect/TypeInfo;", "type", "fromValues", "(Ljava/util/List;Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toValues", "(Ljava/lang/Object;)Ljava/util/List;", "getHighSpeedVideoSizes", "Lkotlin/reflect/KClass;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DelegatingConversionService implements io.ktor.util.converters.ConversionService {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Object, java.util.List<java.lang.String>> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.reflect.KClass<?> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatingConversionService(kotlin.reflect.KClass<?> kClass, kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.util.List<java.lang.String>> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        this.getHighSpeedVideoFpsRangesFor = kClass;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = function12;
    }

    @Override // io.ktor.util.converters.ConversionService
    public final java.lang.Object fromValues(java.util.List<java.lang.String> values, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, java.lang.Object> function1 = this.getHighSpeedVideoFpsRanges;
        if (function1 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Decoder was not specified for type '");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append('\'');
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return function1.invoke(values);
    }

    @Override // io.ktor.util.converters.ConversionService
    public final java.util.List<java.lang.String> toValues(java.lang.Object value) {
        kotlin.jvm.functions.Function1<java.lang.Object, java.util.List<java.lang.String>> function1 = this.getHighSpeedVideoSizes;
        if (function1 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Encoder was not specified for type '");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append('\'');
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return function1.invoke(value);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u00020\f2\u001d\u0010\u000b\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\u00020\f2\u001d\u0010\u000b\u001a\u0019\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000f\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R;\u0010\u0013\u001a\u001b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000eR;\u0010\u0018\u001a\u001b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u000e"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService$Configuration;", "", "T", "Lkotlin/reflect/KClass;", "klass", "<init>", "(Lkotlin/reflect/KClass;)V", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "converter", "", "decode", "(Lkotlin/jvm/functions/Function1;)V", "encode", "Lkotlin/reflect/KClass;", "getKlass$ktor_utils", "()Lkotlin/reflect/KClass;", "decoder", "Lkotlin/jvm/functions/Function1;", "getDecoder$ktor_utils", "()Lkotlin/jvm/functions/Function1;", "setDecoder$ktor_utils", "encoder", "getEncoder$ktor_utils", "setEncoder$ktor_utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration<T> {
        private kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends T> decoder;
        private kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.String>> encoder;
        private final kotlin.reflect.KClass<T> klass;

        public Configuration(kotlin.reflect.KClass<T> kClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            this.klass = kClass;
        }

        public final kotlin.reflect.KClass<T> getKlass$ktor_utils() {
            return this.klass;
        }

        public final kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, T> getDecoder$ktor_utils() {
            return this.decoder;
        }

        public final void setDecoder$ktor_utils(kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends T> function1) {
            this.decoder = function1;
        }

        public final kotlin.jvm.functions.Function1<T, java.util.List<java.lang.String>> getEncoder$ktor_utils() {
            return this.encoder;
        }

        public final void setEncoder$ktor_utils(kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.String>> function1) {
            this.encoder = function1;
        }

        public final void decode(kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends T> converter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "");
            if (this.decoder != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Decoder has already been set for type '");
                sb.append(this.klass);
                sb.append('\'');
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.decoder = converter;
        }

        public final void encode(kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.String>> converter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(converter, "");
            if (this.encoder != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Encoder has already been set for type '");
                sb.append(this.klass);
                sb.append('\'');
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.encoder = converter;
        }
    }
}
