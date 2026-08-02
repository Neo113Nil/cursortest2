package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel$processOnboardingStatus$1", f = "TtpEopWebViewViewModel.kt", i = {}, l = {94, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, nl = {99, 126}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TtpEopWebViewViewModel$processOnboardingStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.EopReturnStatus getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r9.emit(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction.NavigateToSuccessScreen.INSTANCE, r8) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (r9.emit(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction.NavigateBack.INSTANCE, r8) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRanges.getOnboardingJourneyStatus() != com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingJourneyStatusType.COMPLETED) {
                mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            } else {
                switch (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel$processOnboardingStatus$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.getOnBoardingStatus().ordinal()]) {
                    case 1:
                    case 2:
                        mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        break;
                    case 3:
                    case 4:
                        mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow.setValue(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewUiState.Content.EopInReview(0, 0, null, 0, 15, null));
                        break;
                    case 5:
                    case 6:
                    case 7:
                        mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow2.setValue(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewUiState.Content.EopDenied(0, 0, null, 0, 15, null));
                        break;
                    case 8:
                    case 9:
                        mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow3.setValue(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewUiState.Content.EopError(0, 0, null, 0, 15, null));
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow4.setValue(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewUiState.Content.EopError(0, 0, null, 0, 15, null));
                        break;
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel$processOnboardingStatus$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.APPROVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.SUBSCRIBED_WITH_ALL_FEATURES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.IN_REVIEW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.SUBSCRIBED_WITH_PRINCIPAL_FEATURES_IN_REVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.DENIED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.SUBSCRIBED_WITH_PRINCIPAL_FEATURES_DENIED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.DENIED_BEFORE_PROVISIONING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.NEED_MORE_DATA.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.SUBSCRIBED_WITH_PRINCIPAL_FEATURES_NEED_DATA.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.PAUSED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.CANCELLED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.SUBSCRIBED_WITH_PRINCIPAL_FEATURES_LIMITED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.SUBSCRIBED_WITH_UNVERIFIED_EMAIL.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel$processOnboardingStatus$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TtpEopWebViewViewModel$processOnboardingStatus$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.EopReturnStatus eopReturnStatus, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel ttpEopWebViewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel$processOnboardingStatus$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = eopReturnStatus;
        this.getHighSpeedVideoFpsRangesFor = ttpEopWebViewViewModel;
    }
}
