package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1", f = "PackageDetailSideEffectsMiddleware.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = this.getHighResolutionOutputSizeshNQ4ISI.getGetUserEmailProviderUseCase().invoke(this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider>> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = packageDetailViewModel;
    }
}
