package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/CurrencyRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "networkRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lkotlinx/serialization/json/Json;)V", "Ljava/util/Locale;", "locale", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;", "getCurrencyMetadata", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CurrencyRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.repository.NetworkRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CurrencyRepositoryImpl(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoSizes = networkRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = localeResolverCache;
        this.getHighSpeedVideoFpsRanges = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCurrencyMetadata(java.util.Locale locale, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError, com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyMetadata$1 currencyRepositoryImpl$getCurrencyMetadata$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either left;
        com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure parsingFailure;
        java.lang.String languageTag;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject;
        java.util.List split$default;
        java.lang.String str;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonObject jsonObject4;
        if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyMetadata$1) {
            currencyRepositoryImpl$getCurrencyMetadata$1 = (com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyMetadata$1) continuation;
            if ((currencyRepositoryImpl$getCurrencyMetadata$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                currencyRepositoryImpl$getCurrencyMetadata$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = currencyRepositoryImpl$getCurrencyMetadata$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = currencyRepositoryImpl$getCurrencyMetadata$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow flow = kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1(this, locale, null));
                    currencyRepositoryImpl$getCurrencyMetadata$1.getHighSpeedVideoFpsRanges = locale;
                    currencyRepositoryImpl$getCurrencyMetadata$1.Camera2StreamConfigurationMap = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(flow, currencyRepositoryImpl$getCurrencyMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locale = (java.util.Locale) currencyRepositoryImpl$getCurrencyMetadata$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    kotlinx.serialization.json.JsonObject jsonObject5 = (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue();
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    try {
                        java.util.Locale orNull = this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale().getOrNull();
                        if (locale == null || (languageTag = locale.toLanguageTag()) == null) {
                            languageTag = orNull != null ? orNull.toLanguageTag() : null;
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Processing metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("locale", languageTag)), null, 4, null);
                        jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject5.get((java.lang.Object) "main");
                    } catch (java.lang.Throwable th) {
                        left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
                    }
                    if (jsonElement == null || (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
                        throw new java.lang.IllegalStateException("Missing 'main' field in currency metadata".toString());
                    }
                    if (languageTag != null && (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) languageTag, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)) != null && (str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(split$default)) != null) {
                        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        if (lowerCase != null) {
                            kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) languageTag);
                            if (jsonElement2 == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) == null) {
                                kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) lowerCase);
                                if (jsonElement3 == null) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing locale '");
                                    sb.append(languageTag);
                                    sb.append("' and '");
                                    sb.append(lowerCase);
                                    sb.append("' in currency metadata");
                                    throw new java.lang.IllegalStateException(sb.toString().toString());
                                }
                                jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement3);
                            }
                            kotlinx.serialization.json.Json json = this.getHighSpeedVideoFpsRanges;
                            kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.CurrencyLayout> serializer = com.paypal.oslo.core.i18n.domain.model.CurrencyLayout.INSTANCE.serializer();
                            kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonObject2).get((java.lang.Object) "currencyLayout");
                            if (jsonElement4 != null) {
                                com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout = (com.paypal.oslo.core.i18n.domain.model.CurrencyLayout) json.decodeFromJsonElement(serializer, jsonElement4);
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "CurrencyLayout Metadata parsed successfully", null, null, 6, null);
                                kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "currencies");
                                if (jsonElement5 == null || kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5) == null) {
                                    throw new java.lang.IllegalStateException("Missing 'currencies' field in locale metadata".toString());
                                }
                                com.paypal.oslo.core.i18n.domain.model.Currencies currencies = (com.paypal.oslo.core.i18n.domain.model.Currencies) this.getHighSpeedVideoFpsRanges.decodeFromJsonElement(com.paypal.oslo.core.i18n.domain.model.Currencies.INSTANCE.serializer(), jsonObject2);
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Currencies Metadata parsed successfully", null, null, 6, null);
                                kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject5.get((java.lang.Object) "supplemental");
                                if (jsonElement6 == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement6)) == null) {
                                    throw new java.lang.IllegalStateException("Missing 'supplemental' field in currency metadata".toString());
                                }
                                kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "currencyData");
                                if (jsonElement7 == null || (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement7)) == null) {
                                    throw new java.lang.IllegalStateException("Missing 'currencyData' field in currency metadata".toString());
                                }
                                kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject4.get((java.lang.Object) "fractions");
                                if (jsonElement8 == null || kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement8) == null) {
                                    throw new java.lang.IllegalStateException("Missing 'fractions' field in currency metadata".toString());
                                }
                                com.paypal.oslo.core.i18n.domain.model.Fractions fractions = (com.paypal.oslo.core.i18n.domain.model.Fractions) this.getHighSpeedVideoFpsRanges.decodeFromJsonElement(com.paypal.oslo.core.i18n.domain.model.Fractions.INSTANCE.serializer(), jsonObject4);
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Fractions Metadata parsed successfully", null, null, 6, null);
                                left = new arrow.core.Either.Right(new com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata(currencyLayout, currencies, fractions));
                                arrow.core.Either either2 = left;
                                if (either2 instanceof arrow.core.Either.Left) {
                                    java.lang.Throwable th2 = (java.lang.Throwable) ((arrow.core.Either.Left) either2).getValue();
                                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to parse currency metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("locale", locale != null ? locale.toLanguageTag() : null)), null, th2, 4, null);
                                    if ((th2 instanceof kotlinx.serialization.SerializationException) || (th2 instanceof java.lang.IllegalStateException)) {
                                        java.lang.String message = th2.getMessage();
                                        if (message == null) {
                                            message = "Failed to deserialize currency metadata";
                                        }
                                        parsingFailure = new com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure(message, th2);
                                    } else {
                                        parsingFailure = new com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure("Unexpected error during currency metadata processing", th2);
                                    }
                                    return new arrow.core.Either.Left(parsingFailure);
                                }
                                if (either2 instanceof arrow.core.Either.Right) {
                                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                                }
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            throw new java.lang.IllegalStateException("Missing 'currencyLayout' field in locale metadata".toString());
                        }
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to extract language code from locale '");
                    sb2.append(languageTag);
                    sb2.append("'");
                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        currencyRepositoryImpl$getCurrencyMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyMetadata$1(this, continuation);
        java.lang.Object obj2 = currencyRepositoryImpl$getCurrencyMetadata$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = currencyRepositoryImpl$getCurrencyMetadata$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
