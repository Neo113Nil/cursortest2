package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/NameMetadataError;", "Lkotlinx/serialization/json/JsonObject;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1", f = "NameRepositoryImpl.kt", i = {0, 0, 1, 1, 1}, l = {339, 343}, m = "invokeSuspend", n = {"$this$flow", "languageTag", "$this$flow", "languageTag", "endpoint"}, nl = {340, 351}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class NameRepositoryImpl$getLabelMetadata$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends kotlinx.serialization.json.JsonObject>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Locale getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r0.emit(arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.NameMetadataError.ParsingFailure("Unable to resolve locale tag", null, 2, null)), r11) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (r3.fetchData(r2).collect(new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1.AnonymousClass1<>(), r11) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache;
        java.lang.String languageTag;
        com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository;
        final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
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
        java.util.Locale locale = this.getHighSpeedVideoSizes;
        if (locale == null || (languageTag = locale.toLanguageTag()) == null) {
            localeResolverCache = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            java.util.Locale orNull = localeResolverCache.getUserLocale().getOrNull();
            languageTag = orNull != null ? orNull.toLanguageTag() : null;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Resolved language tag for locale metadata fetch", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("languageTag", languageTag)), null, 4, null);
        if (languageTag == null) {
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(languageTag);
            this.Camera2StreamConfigurationMap = 1;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/wr-i18n-metadata/3/");
            sb.append(languageTag);
            sb.append("/name.json");
            java.lang.String obj2 = sb.toString();
            networkRepository = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(languageTag);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.Camera2StreamConfigurationMap = 2;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends kotlinx.serialization.json.JsonObject>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1 nameRepositoryImpl$getLabelMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        nameRepositoryImpl$getLabelMetadata$1.getHighSpeedVideoSizesFor = obj;
        return nameRepositoryImpl$getLabelMetadata$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameRepositoryImpl$getLabelMetadata$1(java.util.Locale locale, com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl nameRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = locale;
        this.getHighSpeedVideoFpsRanges = nameRepositoryImpl;
    }
}
