package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0094@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "<init>", "()V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Dispatcher", "Validator", "ValidationResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewPinValidationMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent viewPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(viewPinEvent, viewPinState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent viewPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        boolean z;
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateConfirmCvv$default;
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input input = viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input ? (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input) viewPinState : null;
        if (input == null) {
            return kotlin.Unit.INSTANCE;
        }
        if (!(viewPinEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged)) {
            if (!(viewPinEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged)) {
                if (viewPinEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.SubmitClicked) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher dispatcher = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher.INSTANCE;
                    if (!com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher.getHighSpeedVideoSizes(input, function1)) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateCvv = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE.validateCvv(input.getCvv(), true);
                        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateConfirmCvv = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE.validateConfirmCvv(input.getCvv(), input.getConfirmCvv(), true, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE.hasCvvOtherErrorForSubmit(validateCvv));
                        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher dispatcher2 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateCvv, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConfirmCvv, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                        if (!validateCvv.isValid()) {
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(false, validateCvv.getErrorMessageResId()));
                        }
                        if (!validateConfirmCvv.isValid()) {
                            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher.getHighSpeedVideoFpsRangesFor(validateConfirmCvv, function1);
                        }
                        if (validateCvv.isValid() && validateConfirmCvv.isValid()) {
                            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher.getHighSpeedVideoFpsRangesFor(function1);
                        }
                    }
                }
            } else {
                com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged confirmCvvChanged = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged) viewPinEvent;
                if (confirmCvvChanged.getConfirmCvv().length() == 3) {
                    java.lang.Integer cvvErrorResId = input.getCvvErrorResId();
                    if (cvvErrorResId != null) {
                        if (cvvErrorResId.intValue() != com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_mismatch_error) {
                            z = true;
                            validateConfirmCvv$default = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.validateConfirmCvv$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE, input.getCvv(), confirmCvvChanged.getConfirmCvv(), false, z, 4, null);
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(validateConfirmCvv$default.isValid(), validateConfirmCvv$default.getErrorMessageResId()));
                            if (validateConfirmCvv$default.getShowOnBothFields() && !validateConfirmCvv$default.isValid()) {
                                function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(false, validateConfirmCvv$default.getErrorMessageResId()));
                            }
                        }
                    }
                    z = false;
                    validateConfirmCvv$default = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.validateConfirmCvv$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE, input.getCvv(), confirmCvvChanged.getConfirmCvv(), false, z, 4, null);
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(validateConfirmCvv$default.isValid(), validateConfirmCvv$default.getErrorMessageResId()));
                    if (validateConfirmCvv$default.getShowOnBothFields()) {
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(false, validateConfirmCvv$default.getErrorMessageResId()));
                    }
                }
            }
        } else {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged cvvChanged = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged) viewPinEvent;
            if (cvvChanged.getCvv().length() == 3) {
                com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateCvv$default = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.validateCvv$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE, cvvChanged.getCvv(), false, 2, null);
                function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(validateCvv$default.isValid(), validateCvv$default.getErrorMessageResId()));
                if (validateCvv$default.isValid() && input.getConfirmCvv().length() > 0) {
                    java.lang.String cvv = cvvChanged.getCvv();
                    if (input.getConfirmCvv().length() == 3) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateConfirmCvv$default2 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.validateConfirmCvv$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator.INSTANCE, cvv, input.getConfirmCvv(), false, false, 4, null);
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(validateConfirmCvv$default2.isValid(), validateConfirmCvv$default2.getErrorMessageResId()));
                        if (validateConfirmCvv$default2.getShowOnBothFields() && !validateConfirmCvv$default2.isValid()) {
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(false, validateConfirmCvv$default2.getErrorMessageResId()));
                        }
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$Dispatcher;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "p0", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "", "p1", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;Lkotlin/jvm/functions/Function1;)Z", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Dispatcher {
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Dispatcher();

        private Dispatcher() {
        }

        public static boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (p0.getCvv().length() != 0 || p0.getConfirmCvv().length() != 0) {
                return false;
            }
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_cvv_error)));
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_confirm_error)));
            return true;
        }

        static void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> p1) {
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(false, p0.getErrorMessageResId()));
            if (p0.getShowOnBothFields()) {
                p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(false, p0.getErrorMessageResId()));
            }
        }

        static void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> p0) {
            p0.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated(true, null));
            p0.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated(true, null));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ1\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$Validator;", "", "<init>", "()V", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "", "isSubmitValidation", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;", "validateCvv", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;", "confirmCvv", "cvvHasError", "validateConfirmCvv", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;", "cvvValidation", "hasCvvOtherErrorForSubmit", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Validator {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator();

        private Validator() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateCvv$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator validator, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return validator.validateCvv(str, z);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateCvv(java.lang.String cvv, boolean isSubmitValidation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            java.lang.String str = cvv;
            if (str.length() == 0) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_cvv_error), false, 4, null);
            }
            if (cvv.length() >= 3) {
                for (int i = 0; i < str.length(); i++) {
                    if (java.lang.Character.isDigit(str.charAt(i))) {
                    }
                }
                return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(true, null, false, 6, null);
            }
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(false, isSubmitValidation ? java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_cvv_error) : null, false, 4, null);
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateConfirmCvv$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.Validator validator, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return validator.validateConfirmCvv(str, str2, z, z2);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validateConfirmCvv(java.lang.String cvv, java.lang.String confirmCvv, boolean isSubmitValidation, boolean cvvHasError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmCvv, "");
            if (!isSubmitValidation && cvv.length() == 0) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(true, null, false, 6, null);
            }
            if (confirmCvv.length() == 0) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_confirm_error), false, 4, null);
            }
            if (confirmCvv.length() < 3) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(false, isSubmitValidation ? java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_confirm_error) : null, false, 4, null);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(confirmCvv, cvv)) {
                return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_mismatch_error), !cvvHasError);
            }
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(true, null, false, 6, null);
        }

        public final boolean hasCvvOtherErrorForSubmit(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult cvvValidation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvvValidation, "");
            if (cvvValidation.isValid() || cvvValidation.getErrorMessageResId() == null) {
                return false;
            }
            java.lang.Integer errorMessageResId = cvvValidation.getErrorMessageResId();
            return errorMessageResId == null || errorMessageResId.intValue() != com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_mismatch_error;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;", "", "", "isValid", "", "errorMessageResId", "showOnBothFields", "<init>", "(ZLjava/lang/Integer;Z)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(ZLjava/lang/Integer;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinValidationMiddleware$ValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "getErrorMessageResId", "getShowOnBothFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validationResult = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult) other;
            return this.isValid == validationResult.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageResId, validationResult.errorMessageResId) && this.showOnBothFields == validationResult.showOnBothFields;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult copy(boolean isValid, java.lang.Integer errorMessageResId, boolean showOnBothFields) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult(isValid, errorMessageResId, showOnBothFields);
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

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware.ValidationResult validationResult, boolean z, java.lang.Integer num, boolean z2, int i, java.lang.Object obj) {
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
