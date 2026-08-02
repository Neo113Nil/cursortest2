package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0094@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0019\u0010\u001fJ,\u0010 \u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetWalletInstrumentsUseCase;", "getWalletInstrumentsUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;", "lockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "unlockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;", "cancelCardUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetWalletInstrumentsUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;)V", "preState", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleStateTransition", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "event", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "p1", "p2", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetWalletInstrumentsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageWalletMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase Camera2StreamConfigurationMap;

    public ManageWalletMiddleware(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase getWalletInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWalletInstrumentsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardUseCase, "");
        this.getHighSpeedVideoFpsRanges = getWalletInstrumentsUseCase;
        this.getHighSpeedVideoSizes = lockCardUseCase;
        this.Camera2StreamConfigurationMap = unlockCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = cancelCardUseCase;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent manageWalletEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(manageWalletEvent, manageWalletState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleStateTransition(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleStateTransition2(manageWalletState, manageWalletState2, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (getHighSpeedVideoFpsRanges(r2, r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r5, r2, r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: handleStateTransition, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object handleStateTransition2(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleStateTransition$1 manageWalletMiddleware$handleStateTransition$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleStateTransition$1) {
            manageWalletMiddleware$handleStateTransition$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleStateTransition$1) continuation;
            if ((manageWalletMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                manageWalletMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageWalletMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if ((manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) && (manageWalletState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading)) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) manageWalletState2;
                        if ((loading.getLoadingType() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Lock) || (loading.getLoadingType() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Unlock)) {
                            i2 = 1;
                            if (i2 != 0) {
                                com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError lockUnlockError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) manageWalletState;
                                java.lang.String cardId = lockUnlockError.getCardId();
                                boolean isLockOperation = lockUnlockError.isLockOperation();
                                manageWalletMiddleware$handleStateTransition$1.getHighResolutionOutputSizeshNQ4ISI = manageWalletState;
                                manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRangesFor = manageWalletState2;
                                manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoSizes = function1;
                                manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges = i2;
                                manageWalletMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap = 1;
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    int i4 = manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoSizes;
                    manageWalletState2 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState3 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) manageWalletMiddleware$handleStateTransition$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i4;
                    manageWalletState = manageWalletState3;
                }
                if ((manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) || !(manageWalletState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) || !(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) manageWalletState2).getLoadingType() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Remove)) {
                    return kotlin.Unit.INSTANCE;
                }
                java.lang.String cardId2 = ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) manageWalletState).getCardId();
                manageWalletMiddleware$handleStateTransition$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageWalletState);
                manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageWalletState2);
                manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoFpsRanges = i2;
                manageWalletMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap = 2;
            }
        }
        manageWalletMiddleware$handleStateTransition$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleStateTransition$1(this, continuation);
        java.lang.Object obj2 = manageWalletMiddleware$handleStateTransition$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageWalletMiddleware$handleStateTransition$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent manageWalletEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if ((manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData) || (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData)) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if ((manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully) || (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully) || (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully)) {
            function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData.INSTANCE);
        } else if (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked) {
            if (!(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) || (((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) manageWalletState).getLoadingType() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen)) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(function1, continuation);
                return highResolutionOutputSizeshNQ4ISI2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI2 : kotlin.Unit.INSTANCE;
            }
        } else {
            if (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled) manageWalletEvent).getCardId(), true, function1, continuation);
                return highResolutionOutputSizeshNQ4ISI3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI3 : kotlin.Unit.INSTANCE;
            }
            if (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled) manageWalletEvent).getCardId(), false, function1, continuation);
                return highResolutionOutputSizeshNQ4ISI4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI4 : kotlin.Unit.INSTANCE;
            }
            if (manageWalletEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked) {
                java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked) manageWalletEvent).getCardId(), function1, continuation);
                return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleLoadWalletData$1 manageWalletMiddleware$handleLoadWalletData$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleLoadWalletData$1) {
            manageWalletMiddleware$handleLoadWalletData$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleLoadWalletData$1) continuation;
            if ((manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = manageWalletMiddleware$handleLoadWalletData$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_GOOGLE_PAY.getValue(), null);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase getWalletInstrumentsUseCase = this.getHighSpeedVideoFpsRanges;
                    manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRanges = function1;
                    manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsRequest);
                    manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getWalletInstrumentsUseCase.invoke2(debitInstrumentsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.TokenInstrumentsResponse>>) manageWalletMiddleware$handleLoadWalletData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded(((com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.TokenInstrumentsResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()).getInstruments()));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), error.getTag()));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageWalletMiddleware$handleLoadWalletData$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleLoadWalletData$1(this, continuation);
        java.lang.Object obj2 = manageWalletMiddleware$handleLoadWalletData$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageWalletMiddleware$handleLoadWalletData$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r14 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$toggleWalletLockUnlock$1 manageWalletMiddleware$toggleWalletLockUnlock$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.core.mvi.Event event;
        com.paypal.oslo.core.mvi.Event event2;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$toggleWalletLockUnlock$1) {
            manageWalletMiddleware$toggleWalletLockUnlock$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$toggleWalletLockUnlock$1) continuation;
            if ((manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = manageWalletMiddleware$toggleWalletLockUnlock$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z) {
                        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest lockCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest(str);
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRangesFor = str;
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoSizes = z;
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRanges = 1;
                        obj = lockCardUseCase.invoke2(lockCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardResult>>) manageWalletMiddleware$toggleWalletLockUnlock$1);
                    } else {
                        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest unlockCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest(str, null, null, 6, null);
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRangesFor = str;
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoSizes = z;
                        manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRanges = 2;
                        obj = unlockCardUseCase.invoke2(unlockCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult>>) manageWalletMiddleware$toggleWalletLockUnlock$1);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    z = manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoSizes;
                    function1 = (kotlin.jvm.functions.Function1) manageWalletMiddleware$toggleWalletLockUnlock$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoSizes;
                    function1 = (kotlin.jvm.functions.Function1) manageWalletMiddleware$toggleWalletLockUnlock$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                }
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    if (z) {
                        event2 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully.INSTANCE;
                    } else {
                        event2 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully.INSTANCE;
                    }
                    function1.invoke(event2);
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error);
                    if (z) {
                        event = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed(debitErrorType, str, error.getTag());
                    } else {
                        event = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed(debitErrorType, str, error.getTag());
                    }
                    function1.invoke(event);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageWalletMiddleware$toggleWalletLockUnlock$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$toggleWalletLockUnlock$1(this, continuation);
        java.lang.Object obj2 = manageWalletMiddleware$toggleWalletLockUnlock$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageWalletMiddleware$toggleWalletLockUnlock$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleRemoveWallet$1 manageWalletMiddleware$handleRemoveWallet$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleRemoveWallet$1) {
            manageWalletMiddleware$handleRemoveWallet$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleRemoveWallet$1) continuation;
            if ((manageWalletMiddleware$handleRemoveWallet$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                manageWalletMiddleware$handleRemoveWallet$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = manageWalletMiddleware$handleRemoveWallet$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageWalletMiddleware$handleRemoveWallet$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest cancelCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest(str);
                    manageWalletMiddleware$handleRemoveWallet$1.getHighSpeedVideoFpsRangesFor = str;
                    manageWalletMiddleware$handleRemoveWallet$1.getHighSpeedVideoSizes = function1;
                    manageWalletMiddleware$handleRemoveWallet$1.Camera2StreamConfigurationMap = 1;
                    obj = cancelCardUseCase.invoke2(cancelCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardResult>>) manageWalletMiddleware$handleRemoveWallet$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) manageWalletMiddleware$handleRemoveWallet$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) manageWalletMiddleware$handleRemoveWallet$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully.INSTANCE);
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), str, error.getTag()));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageWalletMiddleware$handleRemoveWallet$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware$handleRemoveWallet$1(this, continuation);
        java.lang.Object obj2 = manageWalletMiddleware$handleRemoveWallet$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageWalletMiddleware$handleRemoveWallet$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
