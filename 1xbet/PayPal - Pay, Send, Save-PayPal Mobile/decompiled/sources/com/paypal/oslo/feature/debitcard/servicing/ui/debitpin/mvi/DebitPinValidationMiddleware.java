package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\r\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0094@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "<init>", "()V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Dispatcher", "Validator", "ValidationResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitPinValidationMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent> {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Companion Companion = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Companion(null);

    @java.lang.Deprecated
    public static final int PIN_LENGTH = 4;

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent debitPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(debitPinEvent, debitPinState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$Companion;", "", "<init>", "()V", "", "PIN_LENGTH", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent debitPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        boolean z;
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validateConfirmPin$default;
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input input = debitPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input ? (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input) debitPinState : null;
        if (input == null) {
            return kotlin.Unit.INSTANCE;
        }
        if (!(debitPinEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged)) {
            if (!(debitPinEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged)) {
                if (debitPinEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.SubmitClicked) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher dispatcher = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher.INSTANCE;
                    if (!com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher.getHighResolutionOutputSizeshNQ4ISI(input, function1)) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validatePin = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE.validatePin(input.getPin(), true);
                        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validateConfirmPin = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE.validateConfirmPin(input.getPin(), input.getConfirmPin(), true, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE.hasPinOtherErrorForSubmit(validatePin));
                        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher dispatcher2 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validatePin, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConfirmPin, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                        if (!validatePin.isValid()) {
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(false, validatePin.getErrorMessageResId()));
                        }
                        if (!validateConfirmPin.isValid()) {
                            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher.getHighSpeedVideoFpsRanges(validateConfirmPin, function1);
                        }
                        if (validatePin.isValid() && validateConfirmPin.isValid()) {
                            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher.getHighSpeedVideoFpsRangesFor(function1);
                        }
                    }
                }
            } else {
                com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged confirmPinChanged = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged) debitPinEvent;
                if (confirmPinChanged.getConfirmPin().length() == 4) {
                    java.lang.Integer pinErrorResId = input.getPinErrorResId();
                    if (pinErrorResId != null) {
                        if (pinErrorResId.intValue() != com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_mismatch) {
                            z = true;
                            validateConfirmPin$default = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.validateConfirmPin$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE, input.getPin(), confirmPinChanged.getConfirmPin(), false, z, 4, null);
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(validateConfirmPin$default.isValid(), validateConfirmPin$default.getErrorMessageResId()));
                            if (validateConfirmPin$default.getShowOnBothFields() && !validateConfirmPin$default.isValid()) {
                                function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(false, validateConfirmPin$default.getErrorMessageResId()));
                            }
                        }
                    }
                    z = false;
                    validateConfirmPin$default = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.validateConfirmPin$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE, input.getPin(), confirmPinChanged.getConfirmPin(), false, z, 4, null);
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(validateConfirmPin$default.isValid(), validateConfirmPin$default.getErrorMessageResId()));
                    if (validateConfirmPin$default.getShowOnBothFields()) {
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(false, validateConfirmPin$default.getErrorMessageResId()));
                    }
                }
            }
        } else {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged pinChanged = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged) debitPinEvent;
            if (pinChanged.getPin().length() == 4) {
                com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validatePin$default = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.validatePin$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE, pinChanged.getPin(), false, 2, null);
                function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(validatePin$default.isValid(), validatePin$default.getErrorMessageResId()));
                if (validatePin$default.isValid() && input.getConfirmPin().length() > 0) {
                    java.lang.String pin = pinChanged.getPin();
                    if (input.getConfirmPin().length() == 4) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validateConfirmPin$default2 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.validateConfirmPin$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator.INSTANCE, pin, input.getConfirmPin(), false, false, 4, null);
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(validateConfirmPin$default2.isValid(), validateConfirmPin$default2.getErrorMessageResId()));
                        if (validateConfirmPin$default2.getShowOnBothFields() && !validateConfirmPin$default2.isValid()) {
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(false, validateConfirmPin$default2.getErrorMessageResId()));
                        }
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$Dispatcher;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "p0", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;Lkotlin/jvm/functions/Function1;)Z", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Dispatcher {
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Dispatcher();

        private Dispatcher() {
        }

        public static boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (p0.getPin().length() != 0 || p0.getConfirmPin().length() != 0) {
                return false;
            }
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_pin_field)));
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_confirm)));
            return true;
        }

        static void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> p1) {
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(false, p0.getErrorMessageResId()));
            if (p0.getShowOnBothFields()) {
                p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(false, p0.getErrorMessageResId()));
            }
        }

        static void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> p0) {
            p0.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(true, null));
            p0.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(true, null));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ1\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$Validator;", "", "<init>", "()V", "", "pin", "", "isSubmitValidation", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;", "validatePin", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;", "confirmPin", "pinHasError", "validateConfirmPin", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;", "pinValidation", "hasPinOtherErrorForSubmit", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Validator {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator();

        private Validator() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validatePin$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator validator, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return validator.validatePin(str, z);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validatePin(java.lang.String pin, boolean isSubmitValidation) {
            boolean z;
            boolean z2;
            boolean z3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            java.lang.String str = pin;
            if (str.length() == 0) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_pin_field), false, 4, null);
            }
            if (pin.length() >= 4) {
                for (int i = 0; i < str.length(); i++) {
                    if (java.lang.Character.isDigit(str.charAt(i))) {
                    }
                }
                boolean z4 = true;
                if (pin.length() >= 2) {
                    java.util.List<java.lang.String> windowed$default = kotlin.text.StringsKt.windowed$default(str, 2, 0, false, 6, null);
                    if (!(windowed$default instanceof java.util.Collection) || !windowed$default.isEmpty()) {
                        for (java.lang.String str2 : windowed$default) {
                            if (kotlin.text.CharsKt.digitToInt(str2.charAt(1)) != kotlin.text.CharsKt.digitToInt(str2.charAt(0)) + 1) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    java.util.List<java.lang.String> windowed$default2 = kotlin.text.StringsKt.windowed$default(str, 2, 0, false, 6, null);
                    if (!(windowed$default2 instanceof java.util.Collection) || !windowed$default2.isEmpty()) {
                        for (java.lang.String str3 : windowed$default2) {
                            if (kotlin.text.CharsKt.digitToInt(str3.charAt(1)) != kotlin.text.CharsKt.digitToInt(str3.charAt(0)) - 1) {
                                z3 = false;
                                break;
                            }
                        }
                    }
                    z3 = true;
                    if (z2 || z3) {
                        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_sequential), false, 4, null);
                    }
                }
                if (pin.length() >= 2) {
                    java.util.List<java.lang.String> windowed$default3 = kotlin.text.StringsKt.windowed$default(str, 2, 0, false, 6, null);
                    if (!(windowed$default3 instanceof java.util.Collection) || !windowed$default3.isEmpty()) {
                        for (java.lang.String str4 : windowed$default3) {
                            if (kotlin.text.CharsKt.digitToInt(str4.charAt(1)) != kotlin.text.CharsKt.digitToInt(str4.charAt(0)) + 2) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    java.util.List windowed$default4 = kotlin.text.StringsKt.windowed$default(str, 2, 0, false, 6, null);
                    if (!(windowed$default4 instanceof java.util.Collection) || !windowed$default4.isEmpty()) {
                        java.util.Iterator it = windowed$default4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.String str5 = (java.lang.String) it.next();
                            if (kotlin.text.CharsKt.digitToInt(str5.charAt(1)) != kotlin.text.CharsKt.digitToInt(str5.charAt(0)) - 2) {
                                z4 = false;
                                break;
                            }
                        }
                    }
                    if (z || z4) {
                        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_alternate), false, 4, null);
                    }
                }
                if (str.length() != 0) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (str.charAt(i2) == pin.charAt(0)) {
                        }
                    }
                    return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_identical), false, 4, null);
                }
                return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(true, null, false, 6, null);
            }
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, isSubmitValidation ? java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_pin_field) : null, false, 4, null);
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validateConfirmPin$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.Validator validator, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return validator.validateConfirmPin(str, str2, z, z2);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validateConfirmPin(java.lang.String pin, java.lang.String confirmPin, boolean isSubmitValidation, boolean pinHasError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPin, "");
            if (!isSubmitValidation && pin.length() == 0) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(true, null, false, 6, null);
            }
            if (confirmPin.length() == 0) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_confirm), false, 4, null);
            }
            if (confirmPin.length() < 4) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, isSubmitValidation ? java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_confirm) : null, false, 4, null);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(confirmPin, pin)) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_mismatch), !pinHasError);
            }
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(true, null, false, 6, null);
        }

        public final boolean hasPinOtherErrorForSubmit(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult pinValidation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinValidation, "");
            if (pinValidation.isValid() || pinValidation.getErrorMessageResId() == null) {
                return false;
            }
            java.lang.Integer errorMessageResId = pinValidation.getErrorMessageResId();
            return errorMessageResId == null || errorMessageResId.intValue() != com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_mismatch;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;", "", "", "isValid", "", "errorMessageResId", "showOnBothFields", "<init>", "(ZLjava/lang/Integer;Z)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(ZLjava/lang/Integer;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinValidationMiddleware$ValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "getErrorMessageResId", "getShowOnBothFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationResult {
        public static final int $stable = 0;
        private final java.lang.Integer errorMessageResId;
        private final boolean isValid;
        private final boolean showOnBothFields;

        public ValidationResult(boolean z, java.lang.Integer num, boolean z2) {
            this.isValid = z;
            this.errorMessageResId = num;
            this.showOnBothFields = z2;
        }

        public /* synthetic */ ValidationResult(boolean z, java.lang.Integer num, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final boolean getShowOnBothFields() {
            return this.showOnBothFields;
        }

        public final java.lang.String toString() {
            boolean z = this.isValid;
            java.lang.Integer num = this.errorMessageResId;
            boolean z2 = this.showOnBothFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationResult(isValid=");
            sb.append(z);
            sb.append(", errorMessageResId=");
            sb.append(num);
            sb.append(", showOnBothFields=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isValid);
            java.lang.Integer num = this.errorMessageResId;
            return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.showOnBothFields);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validationResult = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult) other;
            return this.isValid == validationResult.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageResId, validationResult.errorMessageResId) && this.showOnBothFields == validationResult.showOnBothFields;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult copy(boolean isValid, java.lang.Integer errorMessageResId, boolean showOnBothFields) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult(isValid, errorMessageResId, showOnBothFields);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowOnBothFields() {
            return this.showOnBothFields;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware.ValidationResult validationResult, boolean z, java.lang.Integer num, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = validationResult.isValid;
            }
            if ((i & 2) != 0) {
                num = validationResult.errorMessageResId;
            }
            if ((i & 4) != 0) {
                z2 = validationResult.showOnBothFields;
            }
            return validationResult.copy(z, num, z2);
        }
    }
}
