package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/DateTimeRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "networkRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lkotlinx/serialization/json/Json;)V", "Ljava/util/Locale;", "locale", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "Lcom/paypal/oslo/core/i18n/domain/model/DateMetaData;", "getDateMetadata", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.repository.NetworkRepository Camera2StreamConfigurationMap;
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DateTimeRepositoryImpl(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.Camera2StreamConfigurationMap = networkRepository;
        this.getHighSpeedVideoSizes = localeResolverCache;
        this.getHighSpeedVideoFpsRangesFor = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDateMetadata(java.util.Locale locale, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, com.paypal.oslo.core.i18n.domain.model.DateMetaData>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getDateMetadata$1 dateTimeRepositoryImpl$getDateMetadata$1;
        int i;
        java.lang.String language;
        java.lang.String languageTag;
        kotlinx.coroutines.flow.Flow<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, ? extends kotlinx.serialization.json.JsonObject>> flow;
        java.lang.String str;
        arrow.core.Either either;
        arrow.core.Either left;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonObject jsonObject4;
        if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getDateMetadata$1) {
            dateTimeRepositoryImpl$getDateMetadata$1 = (com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getDateMetadata$1) continuation;
            if ((dateTimeRepositoryImpl$getDateMetadata$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                dateTimeRepositoryImpl$getDateMetadata$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = dateTimeRepositoryImpl$getDateMetadata$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dateTimeRepositoryImpl$getDateMetadata$1.Camera2StreamConfigurationMap;
                java.lang.String str2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Locale orNull = this.getHighSpeedVideoSizes.getUserLocale().getOrNull();
                    if (locale == null || (language = locale.getLanguage()) == null) {
                        language = orNull != null ? orNull.getLanguage() : null;
                    }
                    if (locale == null || (languageTag = locale.toLanguageTag()) == null) {
                        languageTag = orNull != null ? orNull.toLanguageTag() : null;
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Fetching DateTime metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("languageTag", languageTag)), null, 4, null);
                    if (languageTag == null) {
                        flow = kotlinx.coroutines.flow.FlowKt.flowOf(arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.PARSE_ERROR));
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/wr-i18n-metadata/1/");
                        sb.append(languageTag);
                        sb.append("/dateInputMask.json");
                        final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, kotlinx.serialization.json.JsonObject>> fetchData = this.Camera2StreamConfigurationMap.fetchData(sb.toString());
                        flow = new kotlinx.coroutines.flow.Flow<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, ? extends kotlinx.serialization.json.JsonObject>>() { // from class: com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, ? extends kotlinx.serialization.json.JsonObject>> flowCollector, kotlin.coroutines.Continuation continuation2) {
                                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            /* renamed from: com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                    com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                    int i;
                                    arrow.core.Either right;
                                    if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                        anonymousClass1 = (com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                                            if (i != 0) {
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                                arrow.core.Either either = (arrow.core.Either) obj;
                                                if (either instanceof arrow.core.Either.Left) {
                                                    right = new arrow.core.Either.Left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.METADATA_FETCH_FAILED);
                                                } else {
                                                    if (!(either instanceof arrow.core.Either.Right)) {
                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                    }
                                                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                                                }
                                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                                if (flowCollector.emit(right, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }
                                    anonymousClass1 = new com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                                    if (i != 0) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1$2", f = "DateTimeRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                                /* renamed from: com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                    java.lang.Object Camera2StreamConfigurationMap;
                                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object getHighSpeedVideoFpsRanges;
                                    int getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object getHighSpeedVideoSizes;
                                    int getHighSpeedVideoSizesFor;
                                    /* synthetic */ java.lang.Object getInputFormats;

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        this.getInputFormats = obj;
                                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                                        return com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getMetadata$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                    }

                                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                        super(continuation);
                                    }
                                }

                                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                    this.getHighSpeedVideoFpsRanges = flowCollector;
                                }
                            }
                        };
                    }
                    dateTimeRepositoryImpl$getDateMetadata$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    dateTimeRepositoryImpl$getDateMetadata$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(orNull);
                    dateTimeRepositoryImpl$getDateMetadata$1.getHighSpeedVideoFpsRangesFor = language;
                    dateTimeRepositoryImpl$getDateMetadata$1.getHighSpeedVideoFpsRanges = languageTag;
                    dateTimeRepositoryImpl$getDateMetadata$1.Camera2StreamConfigurationMap = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(flow, dateTimeRepositoryImpl$getDateMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = languageTag;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) dateTimeRepositoryImpl$getDateMetadata$1.getHighSpeedVideoFpsRanges;
                    language = (java.lang.String) dateTimeRepositoryImpl$getDateMetadata$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either != null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.METADATA_FETCH_FAILED);
                }
                if (either instanceof arrow.core.Either.Right) {
                    kotlinx.serialization.json.JsonObject jsonObject5 = (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue();
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    try {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Processing metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("languageTag", str), kotlin.TuplesKt.to("languageCode", language)), null, 4, null);
                        jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject5.get((java.lang.Object) "main");
                    } catch (java.lang.Throwable th) {
                        left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
                    }
                    if (jsonElement == null || (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
                        throw new java.lang.IllegalStateException("Missing 'main' field in date metadata".toString());
                    }
                    kotlinx.serialization.json.JsonObject jsonObject6 = jsonObject;
                    if (language != null) {
                        str2 = language.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                    }
                    kotlinx.serialization.json.JsonElement jsonElement2 = jsonObject6.get((java.lang.Object) str2);
                    if (jsonElement2 == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) == null) {
                        kotlinx.serialization.json.JsonElement jsonElement3 = jsonObject6.get((java.lang.Object) str);
                        if (jsonElement3 == null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Missing locale '");
                            sb2.append(language);
                            sb2.append("' (or '");
                            sb2.append(str);
                            sb2.append("') in date metadata");
                            throw new java.lang.IllegalStateException(sb2.toString().toString());
                        }
                        jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement3);
                    }
                    kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER_DATES_ITEM);
                    if (jsonElement4 == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4)) == null) {
                        throw new java.lang.IllegalStateException("Missing 'dates' field in date metadata".toString());
                    }
                    kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "fields");
                    if (jsonElement5 != null && (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5)) != null) {
                        left = new arrow.core.Either.Right((com.paypal.oslo.core.i18n.domain.model.DateMetaData) this.getHighSpeedVideoFpsRangesFor.decodeFromJsonElement(com.paypal.oslo.core.i18n.domain.model.DateMetaData.INSTANCE.serializer(), jsonObject4));
                        arrow.core.Either either2 = left;
                        if (either2 instanceof arrow.core.Either.Left) {
                            java.lang.Throwable th2 = (java.lang.Throwable) ((arrow.core.Either.Left) either2).getValue();
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to parse date metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("languageTag", str), kotlin.TuplesKt.to("languageCode", language)), null, th2, 4, null);
                            if ((th2 instanceof kotlinx.serialization.SerializationException) || (th2 instanceof java.lang.IllegalStateException)) {
                                dateTimeError = com.paypal.oslo.core.i18n.domain.model.DateTimeError.PARSE_ERROR;
                            } else {
                                dateTimeError = com.paypal.oslo.core.i18n.domain.model.DateTimeError.UNKNOWN_ERROR;
                            }
                            return new arrow.core.Either.Left(dateTimeError);
                        }
                        if (either2 instanceof arrow.core.Either.Right) {
                            return new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    throw new java.lang.IllegalStateException("Missing 'fields' field in date metadata".toString());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dateTimeRepositoryImpl$getDateMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getDateMetadata$1(this, continuation);
        java.lang.Object obj2 = dateTimeRepositoryImpl$getDateMetadata$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dateTimeRepositoryImpl$getDateMetadata$1.Camera2StreamConfigurationMap;
        java.lang.String str22 = null;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either != null) {
        }
    }
}
