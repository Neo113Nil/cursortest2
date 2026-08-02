package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/SetPinMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/PinValidator;", "pinValidator", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/PinValidator;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$SettingPin;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinState$SettingPin;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/PinValidator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SetPinMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SetPinMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.PinValidator pinValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinValidator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = pinValidator;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState createPinState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(createPinState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState createPinState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(createPinState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin) createPinState, function1, continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinState.SettingPin settingPin, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware$setPin$1 setPinMiddleware$setPin$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent onValidationError;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware$setPin$1) {
            setPinMiddleware$setPin$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware$setPin$1) continuation;
            if ((setPinMiddleware$setPin$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                setPinMiddleware$setPin$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = setPinMiddleware$setPin$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setPinMiddleware$setPin$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> validatePin = this.getHighResolutionOutputSizeshNQ4ISI.validatePin(settingPin.getReadyInfo().getPin(), settingPin.getReadyInfo().getConfirmation());
                    if (validatePin != null) {
                        onValidationError = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError(validatePin);
                        function1.invoke(onValidationError);
                        return kotlin.Unit.INSTANCE;
                    }
                    setPinMiddleware$setPin$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(settingPin);
                    setPinMiddleware$setPin$1.Camera2StreamConfigurationMap = function1;
                    setPinMiddleware$setPin$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                    setPinMiddleware$setPin$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    setPinMiddleware$setPin$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, setPinMiddleware$setPin$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = setPinMiddleware$setPin$1.getHighResolutionOutputSizeshNQ4ISI;
                    function1 = (kotlin.jvm.functions.Function1) setPinMiddleware$setPin$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                onValidationError = com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinSet.INSTANCE;
                function1.invoke(onValidationError);
                return kotlin.Unit.INSTANCE;
            }
        }
        setPinMiddleware$setPin$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware$setPin$1(this, continuation);
        java.lang.Object obj2 = setPinMiddleware$setPin$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setPinMiddleware$setPin$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        onValidationError = com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinSet.INSTANCE;
        function1.invoke(onValidationError);
        return kotlin.Unit.INSTANCE;
    }
}
