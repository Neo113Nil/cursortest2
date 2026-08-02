package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitPinUseCase;", "getDebitPinUseCase", "", "debitInstrumentId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitPinUseCase;Ljava/lang/String;)V", "preState", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleStateTransition", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitPinUseCase;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewPinSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase getHighSpeedVideoFpsRanges;
    private kotlinx.coroutines.Job getHighSpeedVideoSizes;

    public ViewPinSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase getDebitPinUseCase, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitPinUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = getDebitPinUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:10:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$startCountdownTimer(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware viewPinSideEffectsMiddleware, int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$startCountdownTimer$1 viewPinSideEffectsMiddleware$startCountdownTimer$1;
        int i2;
        int i3;
        int i4;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$startCountdownTimer$1) {
            viewPinSideEffectsMiddleware$startCountdownTimer$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$startCountdownTimer$1) continuation;
            if ((viewPinSideEffectsMiddleware$startCountdownTimer$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                viewPinSideEffectsMiddleware$startCountdownTimer$1.getInputFormats -= 2147483648;
                java.lang.Object obj = viewPinSideEffectsMiddleware$startCountdownTimer$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = viewPinSideEffectsMiddleware$startCountdownTimer$1.getInputFormats;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i;
                    i4 = 0;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighResolutionOutputSizeshNQ4ISI;
                    i4 = viewPinSideEffectsMiddleware$startCountdownTimer$1.Camera2StreamConfigurationMap;
                    int i6 = viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighSpeedVideoSizes;
                    int i7 = viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i7;
                    com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$startCountdownTimer$1 viewPinSideEffectsMiddleware$startCountdownTimer$12 = viewPinSideEffectsMiddleware$startCountdownTimer$1;
                    int i8 = i6;
                    function1 = function12;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer(i3 - (i4 + 1)));
                    i4 = i8 + 1;
                    viewPinSideEffectsMiddleware$startCountdownTimer$1 = viewPinSideEffectsMiddleware$startCountdownTimer$12;
                    if (i4 < i3) {
                        viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighSpeedVideoFpsRangesFor = function1;
                        viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighSpeedVideoFpsRanges = i3;
                        viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighSpeedVideoSizes = i4;
                        viewPinSideEffectsMiddleware$startCountdownTimer$1.Camera2StreamConfigurationMap = i4;
                        viewPinSideEffectsMiddleware$startCountdownTimer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        viewPinSideEffectsMiddleware$startCountdownTimer$1.getInputFormats = 1;
                        if (kotlinx.coroutines.DelayKt.delay(1000L, viewPinSideEffectsMiddleware$startCountdownTimer$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        viewPinSideEffectsMiddleware$startCountdownTimer$12 = viewPinSideEffectsMiddleware$startCountdownTimer$1;
                        i8 = i4;
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer(i3 - (i4 + 1)));
                        i4 = i8 + 1;
                        viewPinSideEffectsMiddleware$startCountdownTimer$1 = viewPinSideEffectsMiddleware$startCountdownTimer$12;
                        if (i4 < i3) {
                            function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimerExpired.INSTANCE);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        viewPinSideEffectsMiddleware$startCountdownTimer$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$startCountdownTimer$1(viewPinSideEffectsMiddleware, continuation);
        java.lang.Object obj2 = viewPinSideEffectsMiddleware$startCountdownTimer$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = viewPinSideEffectsMiddleware$startCountdownTimer$1.getInputFormats;
        if (i2 != 0) {
        }
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleStateTransition(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleStateTransition2(viewPinState, viewPinState2, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: handleStateTransition, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object handleStateTransition2(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$handleStateTransition$1 viewPinSideEffectsMiddleware$handleStateTransition$1;
        int i;
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$handleStateTransition$1) {
            viewPinSideEffectsMiddleware$handleStateTransition$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$handleStateTransition$1) continuation;
            if ((viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (viewPinState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing) {
                        java.lang.String cvv = ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing) viewPinState2).getCvv();
                        viewPinSideEffectsMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap = viewPinState;
                        viewPinSideEffectsMiddleware$handleStateTransition$1.getHighResolutionOutputSizeshNQ4ISI = viewPinState2;
                        viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges = 1;
                        if (getHighResolutionOutputSizeshNQ4ISI(cvv, function1, viewPinSideEffectsMiddleware$handleStateTransition$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if ((viewPinState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin) && !(viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin)) {
                        kotlinx.coroutines.Job job2 = this.getHighSpeedVideoSizes;
                        if (job2 != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(viewPinSideEffectsMiddleware$handleStateTransition$1.getContext()), null, null, new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$handleStateTransition$2(this, viewPinState2, function1, null), 3, null);
                        this.getHighSpeedVideoSizes = launch$default;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    viewPinState2 = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState) viewPinSideEffectsMiddleware$handleStateTransition$1.getHighResolutionOutputSizeshNQ4ISI;
                    viewPinState = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState) viewPinSideEffectsMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if ((viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin) && !(viewPinState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin)) {
                    job = this.getHighSpeedVideoSizes;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    this.getHighSpeedVideoSizes = null;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        viewPinSideEffectsMiddleware$handleStateTransition$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$handleStateTransition$1(this, continuation);
        java.lang.Object obj2 = viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = viewPinSideEffectsMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin) {
            job = this.getHighSpeedVideoSizes;
            if (job != null) {
            }
            this.getHighSpeedVideoSizes = null;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$verifyPin$1 viewPinSideEffectsMiddleware$verifyPin$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$verifyPin$1) {
            viewPinSideEffectsMiddleware$verifyPin$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$verifyPin$1) continuation;
            if ((viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest getDebitPinRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest(this.getHighResolutionOutputSizeshNQ4ISI, str, null, null, 12, null);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase getDebitPinUseCase = this.getHighSpeedVideoFpsRanges;
                    viewPinSideEffectsMiddleware$verifyPin$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoFpsRangesFor = function1;
                    viewPinSideEffectsMiddleware$verifyPin$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getDebitPinRequest);
                    viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoSizes = 1;
                    obj = getDebitPinUseCase.invoke2(getDebitPinRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails>>) viewPinSideEffectsMiddleware$verifyPin$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded((com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitInstrumentPinDetails) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    java.lang.String errorMessage = error.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "Failed to verify PIN";
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed(errorMessage, error.getTag(), com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        viewPinSideEffectsMiddleware$verifyPin$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$verifyPin$1(this, continuation);
        java.lang.Object obj2 = viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = viewPinSideEffectsMiddleware$verifyPin$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
