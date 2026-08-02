package io.ktor.util.converters;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lio/ktor/util/converters/DataConversion;", "Lio/ktor/util/converters/ConversionService;", "Lio/ktor/util/converters/DataConversion$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lio/ktor/util/converters/DataConversion$Configuration;)V", "", "", "values", "Lio/ktor/util/reflect/TypeInfo;", "type", "", "fromValues", "(Ljava/util/List;Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toValues", "(Ljava/lang/Object;)Ljava/util/List;", "", "Lkotlin/reflect/KClass;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DataConversion implements io.ktor.util.converters.ConversionService {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<?>, io.ktor.util.converters.ConversionService> getHighResolutionOutputSizeshNQ4ISI;

    public DataConversion(io.ktor.util.converters.DataConversion.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.toMap(configuration.getConverters$ktor_utils());
    }

    @Override // io.ktor.util.converters.ConversionService
    public final java.lang.Object fromValues(java.util.List<java.lang.String> values, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (values.isEmpty()) {
            return null;
        }
        io.ktor.util.converters.DefaultConversionService defaultConversionService = this.getHighResolutionOutputSizeshNQ4ISI.get(type.getType());
        if (defaultConversionService == null) {
            defaultConversionService = io.ktor.util.converters.DefaultConversionService.INSTANCE;
        }
        return defaultConversionService.fromValues(values, type);
    }

    @Override // io.ktor.util.converters.ConversionService
    public final java.util.List<java.lang.String> toValues(java.lang.Object value) {
        if (value != null) {
            io.ktor.util.converters.DefaultConversionService defaultConversionService = this.getHighResolutionOutputSizeshNQ4ISI.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
            if (defaultConversionService == null) {
                defaultConversionService = io.ktor.util.converters.DefaultConversionService.INSTANCE;
            }
            return defaultConversionService.toValues(value);
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ>\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\f2\u001d\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000f¢\u0006\u0004\b\t\u0010\u0011J@\u0010\t\u001a\u00020\b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00012\u001f\b\b\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0012R*\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lio/ktor/util/converters/DataConversion$Configuration;", "", "<init>", "()V", "Lkotlin/reflect/KClass;", "type", "Lio/ktor/util/converters/ConversionService;", "convertor", "", "convert", "(Lkotlin/reflect/KClass;Lio/ktor/util/converters/ConversionService;)V", "T", "Lkotlin/reflect/KType;", "Lkotlin/Function1;", "Lio/ktor/util/converters/DelegatingConversionService$Configuration;", "Lkotlin/ExtensionFunctionType;", "configure", "(Lkotlin/reflect/KType;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "", "converters", "Ljava/util/Map;", "getConverters$ktor_utils", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration {
        private final java.util.Map<kotlin.reflect.KClass<?>, io.ktor.util.converters.ConversionService> converters = new java.util.LinkedHashMap();

        public final java.util.Map<kotlin.reflect.KClass<?>, io.ktor.util.converters.ConversionService> getConverters$ktor_utils() {
            return this.converters;
        }

        public final void convert(kotlin.reflect.KClass<?> type, io.ktor.util.converters.ConversionService convertor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertor, "");
            this.converters.put(type, convertor);
        }

        public final <T> void convert(kotlin.reflect.KType type, kotlin.jvm.functions.Function1<? super io.ktor.util.converters.DelegatingConversionService.Configuration<T>, kotlin.Unit> configure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configure, "");
            kotlin.reflect.KClassifier classifier = type.getClassifier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(classifier, "");
            kotlin.reflect.KClass<?> kClass = (kotlin.reflect.KClass) classifier;
            io.ktor.util.converters.DelegatingConversionService.Configuration configuration = new io.ktor.util.converters.DelegatingConversionService.Configuration(kClass);
            configure.invoke(configuration);
            convert(kClass, new io.ktor.util.converters.DelegatingConversionService(kClass, configuration.getDecoder$ktor_utils(), (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(configuration.getEncoder$ktor_utils(), 1)));
        }

        public final /* synthetic */ <T> void convert(kotlin.jvm.functions.Function1<? super io.ktor.util.converters.DelegatingConversionService.Configuration<T>, kotlin.Unit> configure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configure, "");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            convert((kotlin.reflect.KType) null, configure);
        }
    }
}
