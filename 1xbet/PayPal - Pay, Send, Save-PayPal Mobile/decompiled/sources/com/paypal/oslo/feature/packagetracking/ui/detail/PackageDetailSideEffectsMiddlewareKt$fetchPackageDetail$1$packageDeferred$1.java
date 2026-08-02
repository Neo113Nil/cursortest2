package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1", f = "PackageDetailSideEffectsMiddleware.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.model.PackageData>>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object invoke = this.getHighSpeedVideoFpsRangesFor.getGetPackageDetailUseCase().invoke(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.model.PackageData>> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = packageDetailViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }
}
