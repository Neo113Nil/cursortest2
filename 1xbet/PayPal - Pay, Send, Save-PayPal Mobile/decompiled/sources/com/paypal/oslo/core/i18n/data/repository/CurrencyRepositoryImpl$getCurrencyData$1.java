package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError;", "Lkotlinx/serialization/json/JsonObject;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1", f = "CurrencyRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "invokeSuspend", n = {"$this$flow", "userLocale", "languageTag", "$this$flow", "userLocale", "languageTag", "endpoint"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes10.dex */
final class CurrencyRepositoryImpl$getCurrencyData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError, ? extends kotlinx.serialization.json.JsonObject>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Locale getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r0.emit(arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure("Unable to resolve locale tag", null, 2, null)), r12) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        if (r5.fetchData(r3).collect(new com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1.AnonymousClass1<>(), r12) == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache;
        java.lang.String languageTag;
        com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository;
        final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        localeResolverCache = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Locale orNull = localeResolverCache.getUserLocale().getOrNull();
        java.util.Locale locale = this.getHighResolutionOutputSizeshNQ4ISI;
        if (locale == null || (languageTag = locale.toLanguageTag()) == null) {
            languageTag = orNull != null ? orNull.toLanguageTag() : null;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Fetching Currency language metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("languageTag", languageTag)), null, 4, null);
        if (languageTag == null) {
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(orNull);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(languageTag);
            this.getHighSpeedVideoFpsRanges = 1;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/wrmobile-i18n-metadata/1/");
            sb.append(languageTag);
            sb.append("/currency.json");
            java.lang.String obj2 = sb.toString();
            networkRepository = this.getInputFormats.getHighSpeedVideoSizes;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(orNull);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(languageTag);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.getHighSpeedVideoFpsRanges = 2;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError, ? extends kotlinx.serialization.json.JsonObject>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1 currencyRepositoryImpl$getCurrencyData$1 = new com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        currencyRepositoryImpl$getCurrencyData$1.getInputSizeshNQ4ISI = obj;
        return currencyRepositoryImpl$getCurrencyData$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyRepositoryImpl$getCurrencyData$1(com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl, java.util.Locale locale, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyData$1> continuation) {
        super(2, continuation);
        this.getInputFormats = currencyRepositoryImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = locale;
    }
}
