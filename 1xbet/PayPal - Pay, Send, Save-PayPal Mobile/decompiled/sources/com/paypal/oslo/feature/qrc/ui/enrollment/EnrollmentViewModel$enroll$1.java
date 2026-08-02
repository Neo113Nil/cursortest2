package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$enroll$1", f = "EnrollmentViewModel.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"request"}, nl = {145}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class EnrollmentViewModel$enroll$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase enrollConsumerQrcUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest qrcEnrollmentRequest = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest(this.getHighSpeedVideoFpsRanges.getQrCodeType(), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.ONLINE), 4);
            enrollConsumerQrcUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcEnrollmentRequest);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = enrollConsumerQrcUseCase.invoke(qrcEnrollmentRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            if (((com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentResult) ((arrow.core.Either.Right) either).getValue()).getStatus() == com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.ENROLLED) {
                enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentSuccess.INSTANCE);
            } else {
                enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentFailed.INSTANCE);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentFailed.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$enroll$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$enroll$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrollmentViewModel$enroll$1(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$enroll$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = qrcSessionNavArgs;
        this.Camera2StreamConfigurationMap = enrollmentViewModel;
    }
}
