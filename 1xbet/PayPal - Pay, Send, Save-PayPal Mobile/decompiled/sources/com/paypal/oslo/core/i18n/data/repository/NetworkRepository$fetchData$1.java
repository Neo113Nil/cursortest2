package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lkotlinx/serialization/json/JsonObject;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$1", f = "NetworkRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {86, 114}, m = "invokeSuspend", n = {"$this$flow", "raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-NetworkRepository$fetchData$1$result$1", "$this$flow", "result", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "executionTime"}, nl = {129, 115}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "J$0", "J$1", "J$2"}, v = 2)
/* loaded from: classes10.dex */
final class NetworkRepository$fetchData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends kotlinx.serialization.json.JsonObject>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    long getInputFormats;
    long getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    long getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.NetworkRepository getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x016a, code lost:
    
        if (r2.emit(r10, r23) != r3) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Type inference failed for: r0v28, types: [arrow.core.raise.Raise] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long currentTimeMillis;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService i18nMetadataApiService;
        java.lang.Object fetchMetadata;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.Either.Left left;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            currentTimeMillis = java.lang.System.currentTimeMillis();
            com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository = this.getOutputStallDuration;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise2 = defaultRaise;
                i18nMetadataApiService = networkRepository.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = flowCollector;
                this.getHighSpeedVideoSizesFor = defaultRaise;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                this.getOutputSizeshNQ4ISI = defaultRaise2;
                this.getOutputMinFrameDuration = currentTimeMillis;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getOutputStallDurationlomOqCM = 1;
                fetchMetadata = i18nMetadataApiService.fetchMetadata(str, this);
                if (fetchMetadata != coroutine_suspended) {
                    defaultRaise3 = defaultRaise;
                }
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                long j = currentTimeMillis2 - currentTimeMillis;
                java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                if (left instanceof arrow.core.Either.Right) {
                }
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputFormats = null;
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputMinFrameDuration = currentTimeMillis;
                this.getInputSizeshNQ4ISI = currentTimeMillis2;
                this.getInputFormats = j;
                this.getOutputStallDurationlomOqCM = 2;
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        currentTimeMillis = this.getOutputMinFrameDuration;
        ?? r0 = (arrow.core.raise.Raise) this.getOutputSizeshNQ4ISI;
        defaultRaise3 = (arrow.core.raise.DefaultRaise) this.getHighSpeedVideoSizesFor;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            defaultRaise2 = r0;
            fetchMetadata = obj;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            long currentTimeMillis22 = java.lang.System.currentTimeMillis();
            long j2 = currentTimeMillis22 - currentTimeMillis;
            java.lang.String str22 = this.getHighSpeedVideoFpsRanges;
            if (left instanceof arrow.core.Either.Right) {
            }
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getOutputFormats = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = currentTimeMillis;
            this.getInputSizeshNQ4ISI = currentTimeMillis22;
            this.getInputFormats = j2;
            this.getOutputStallDurationlomOqCM = 2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) defaultRaise2.bind((arrow.core.Either) fetchMetadata);
        defaultRaise3.complete();
        left = new arrow.core.Either.Right(jsonObject);
        long currentTimeMillis222 = java.lang.System.currentTimeMillis();
        long j22 = currentTimeMillis222 - currentTimeMillis;
        java.lang.String str222 = this.getHighSpeedVideoFpsRanges;
        if (left instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "NetworkRepository - metadata fetched successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("endpoint", str222), kotlin.TuplesKt.to("executionTime", java.lang.String.valueOf(j22))), null, 4, null);
        } else if (left instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.network.http.error.NetworkError networkError = (com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) left).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
            kotlin.Pair pair = kotlin.TuplesKt.to("endpoint", str222);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j22);
            sb.append(" ms");
            com.paypal.android.logger.Logger.e$default(logger, "NetworkRepository request failed", kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to("executionTime", sb.toString()), kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(networkError.getClass()).getSimpleName()), kotlin.TuplesKt.to("errorDetails", networkError.toString())), null, null, 12, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getOutputFormats = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = currentTimeMillis;
        this.getInputSizeshNQ4ISI = currentTimeMillis222;
        this.getInputFormats = j22;
        this.getOutputStallDurationlomOqCM = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends kotlinx.serialization.json.JsonObject>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$1 networkRepository$fetchData$1 = new com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$1(this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, continuation);
        networkRepository$fetchData$1.getOutputSizes = obj;
        return networkRepository$fetchData$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkRepository$fetchData$1(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$1> continuation) {
        super(2, continuation);
        this.getOutputStallDuration = networkRepository;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
