package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$checkEligibility$1", f = "EnrollmentViewModel.kt", i = {0, 0}, l = {91}, m = "invokeSuspend", n = {"qrCodeType", "request"}, nl = {145}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class EnrollmentViewModel$checkEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase checkQrcEligibilityUseCase;
        java.lang.Object invoke;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        boolean z2 = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.getHighSpeedVideoFpsRanges.getQrCodeType();
            com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest qrcEligibilityRequest = new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest(new com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata(null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null), null, null, qrCodeType != null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter(qrCodeType, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.ONLINE), kotlin.coroutines.jvm.internal.Boxing.boxInt(4))) : null, 6, null);
            checkQrcEligibilityUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrCodeType);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcEligibilityRequest);
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = checkQrcEligibilityUseCase.invoke(qrcEligibilityRequest, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = ((arrow.core.Ior) invoke).toEither();
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibility qrcEligibility = (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibility) ((arrow.core.Either.Right) either).getValue();
            java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeEligibilityStatus> eligibilityStatuses = qrcEligibility.getEligibilityStatuses();
            if (!(eligibilityStatuses instanceof java.util.Collection) || !eligibilityStatuses.isEmpty()) {
                java.util.Iterator<T> it = eligibilityStatuses.iterator();
                while (it.hasNext()) {
                    if (((com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeEligibilityStatus) it.next()).getStatus() == com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.ENROLLED) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeEligibilityStatus> eligibilityStatuses2 = qrcEligibility.getEligibilityStatuses();
            if (!(eligibilityStatuses2 instanceof java.util.Collection) || !eligibilityStatuses2.isEmpty()) {
                for (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeEligibilityStatus qrcTypeEligibilityStatus : eligibilityStatuses2) {
                    if (qrcTypeEligibilityStatus.getStatus() == com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.ELIGIBLE || qrcTypeEligibilityStatus.getStatus() == com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.ELIGIBLE_WITH_CONDITIONS) {
                        break;
                    }
                }
            }
            z2 = false;
            if (z) {
                enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilitySuccess.INSTANCE);
                enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentSuccess.INSTANCE);
            } else if (z2) {
                enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilitySuccess.INSTANCE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(enrollmentViewModel), null, null, new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$enroll$1(qrcSessionNavArgs, enrollmentViewModel, null), 3, null);
            } else {
                enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilityFailed.INSTANCE);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            enrollmentViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilityFailed.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$checkEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$checkEligibility$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrollmentViewModel$checkEligibility$1(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel$checkEligibility$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = qrcSessionNavArgs;
        this.Camera2StreamConfigurationMap = enrollmentViewModel;
    }
}
