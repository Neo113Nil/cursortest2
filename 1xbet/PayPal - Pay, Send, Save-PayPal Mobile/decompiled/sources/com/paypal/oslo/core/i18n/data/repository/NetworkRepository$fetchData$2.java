package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lkotlinx/serialization/json/JsonObject;", "e", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$2", f = "NetworkRepository.kt", i = {0, 0}, l = {121}, m = "invokeSuspend", n = {"$this$catch", "e"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class NetworkRepository$fetchData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends kotlinx.serialization.json.JsonObject>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable th = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "NetworkRepository - unexpected error fetching data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("endpoint", this.getHighSpeedVideoFpsRangesFor)), null, th, 4, null);
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise.raise(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(th));
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(th);
                this.getHighSpeedVideoSizes = 1;
                if (flowCollector.emit(new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (java.lang.Throwable th2) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends kotlinx.serialization.json.JsonObject>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$2 networkRepository$fetchData$2 = new com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$2(this.getHighSpeedVideoFpsRangesFor, continuation);
        networkRepository$fetchData$2.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
        networkRepository$fetchData$2.Camera2StreamConfigurationMap = th;
        return networkRepository$fetchData$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkRepository$fetchData$2(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.NetworkRepository$fetchData$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
