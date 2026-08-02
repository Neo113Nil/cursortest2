package com.paypal.oslo.feature.identity.clienttoken;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.clienttoken.ClientTokenInitializer$create$1", f = "ClientTokenInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, nl = {50}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ClientTokenInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.identity.domain.TokenProvider getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getToken(new com.paypal.oslo.core.identity.domain.model.TokenType.ClientAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_APP_LAUNCH_KEY, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Client access token successfully fetched at app launch", null, null, 6, null);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to fetch client access token at app launch", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.identity.domain.model.TokenError) ((arrow.core.Either.Left) either).getValue()).getClass()).getSimpleName()), kotlin.TuplesKt.to("source", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_APP_LAUNCH_KEY)), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.clienttoken.ClientTokenInitializer$create$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.clienttoken.ClientTokenInitializer$create$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClientTokenInitializer$create$1(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.clienttoken.ClientTokenInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = tokenProvider;
    }
}
