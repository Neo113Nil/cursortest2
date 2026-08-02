package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl$getUsersMe$2", f = "XoomRepositoryImpl.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, nl = {57}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class XoomRepositoryImpl$getUsersMe$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends com.paypal.oslo.feature.xoom.domain.model.UserInfo>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.xoom.data.XoomApiService xoomApiService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xoomApiService = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            java.lang.String format = java.lang.String.format("paypal-uat %s", java.util.Arrays.copyOf(new java.lang.Object[]{this.getHighSpeedVideoSizes}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            kotlin.Pair[] pairArr = {kotlin.TuplesKt.to("authorization", format), kotlin.TuplesKt.to("X-PayPal-Client-Metadata-Id", com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl.access$getRiskClientMetadataId(this.getHighSpeedVideoFpsRangesFor))};
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = xoomApiService.fetchMe(kotlin.collections.MapsKt.mapOf(pairArr), this);
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
        com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl xoomRepositoryImpl = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            return arrow.core.EitherKt.right(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl.access$mapToUserInfo(xoomRepositoryImpl, (com.paypal.oslo.feature.xoom.data.response.UserResponse) ((arrow.core.Either.Right) either).getValue()));
        }
        if (either instanceof arrow.core.Either.Left) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl.access$mapNetworkError(xoomRepositoryImpl, (com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends com.paypal.oslo.feature.xoom.domain.model.UserInfo>> continuation) {
        return ((com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl$getUsersMe$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl$getUsersMe$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    XoomRepositoryImpl$getUsersMe$2(com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl xoomRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl$getUsersMe$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = xoomRepositoryImpl;
        this.getHighSpeedVideoSizes = str;
    }
}
