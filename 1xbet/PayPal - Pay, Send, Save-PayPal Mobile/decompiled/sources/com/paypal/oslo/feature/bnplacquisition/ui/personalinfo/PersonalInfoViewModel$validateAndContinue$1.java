package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$validateAndContinue$1", f = "PersonalInfoViewModel.kt", i = {1, 2, 2}, l = {471, 476, 481}, m = "invokeSuspend", n = {"billingResult", "billingResult", "dobResult"}, nl = {476, 481, 486}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$validateAndContinue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0051, code lost:
    
        if (r13 != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators2;
        arrow.core.Either either;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators3;
        java.lang.Object validateAllWithResult$default;
        arrow.core.Either either2;
        arrow.core.Either either3;
        boolean z;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> billingAddressFieldRows = this.getHighSpeedVideoFpsRangesFor.getBillingAddressFieldRows();
            formFieldValidators = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult(billingAddressFieldRows, formFieldValidators, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$validateAndContinue$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    boolean showBillingAddressFields;
                    showBillingAddressFields = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.this.getShowBillingAddressFields();
                    return java.lang.Boolean.valueOf(showBillingAddressFields);
                }
            }, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    either = (arrow.core.Either) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either4 = (arrow.core.Either) obj;
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> incomeFieldRows = this.getHighSpeedVideoFpsRangesFor.getIncomeFieldRows();
                    formFieldValidators3 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = either;
                    this.getHighResolutionOutputSizeshNQ4ISI = either4;
                    this.getHighSpeedVideoSizes = 3;
                    validateAllWithResult$default = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult$default(incomeFieldRows, formFieldValidators3, null, this, 2, null);
                    if (validateAllWithResult$default != coroutine_suspended) {
                        either2 = either4;
                        obj = validateAllWithResult$default;
                        either3 = (arrow.core.Either) obj;
                        boolean z2 = either instanceof arrow.core.Either.Left;
                        if (z2) {
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.LegalConsentUiModel legalConsent = this.getHighSpeedVideoFpsRangesFor.getLegalConsent();
                        if (legalConsent != null) {
                        }
                        if (z) {
                        }
                        if (!(either instanceof arrow.core.Either.Right)) {
                        }
                        if (!(either2 instanceof arrow.core.Either.Right)) {
                        }
                        if (!(either3 instanceof arrow.core.Either.Right)) {
                        }
                        this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid(list, list2, list3));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                either2 = (arrow.core.Either) this.getHighResolutionOutputSizeshNQ4ISI;
                either = (arrow.core.Either) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                either3 = (arrow.core.Either) obj;
                boolean z22 = either instanceof arrow.core.Either.Left;
                z = !z22 || (either2 instanceof arrow.core.Either.Left) || (either3 instanceof arrow.core.Either.Left);
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.LegalConsentUiModel legalConsent2 = this.getHighSpeedVideoFpsRangesFor.getLegalConsent();
                boolean isAccepted = legalConsent2 != null ? legalConsent2.isAccepted() : true;
                if (z && com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel.access$isRepaymentSectionValid(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor) && isAccepted) {
                    this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Valid(this.getHighSpeedVideoFpsRangesFor));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    } else {
                        if (!z22) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        list = (java.util.List) ((arrow.core.Either.Left) either).getValue();
                    }
                    if (!(either2 instanceof arrow.core.Either.Right)) {
                        list2 = (java.util.List) ((arrow.core.Either.Right) either2).getValue();
                    } else {
                        if (!(either2 instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        list2 = (java.util.List) ((arrow.core.Either.Left) either2).getValue();
                    }
                    if (!(either3 instanceof arrow.core.Either.Right)) {
                        list3 = (java.util.List) ((arrow.core.Either.Right) either3).getValue();
                    } else {
                        if (!(either3 instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        list3 = (java.util.List) ((arrow.core.Either.Left) either3).getValue();
                    }
                    this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.Continue.Invalid(list, list2, list3));
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either5 = (arrow.core.Either) obj;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> dobSsnFieldRows = this.getHighSpeedVideoFpsRangesFor.getDobSsnFieldRows();
        formFieldValidators2 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
        final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = either5;
        this.getHighSpeedVideoSizes = 2;
        java.lang.Object validateAllWithResult = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult(dobSsnFieldRows, formFieldValidators2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$validateAndContinue$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                boolean showPersonalFields;
                showPersonalFields = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.this.getShowPersonalFields();
                return java.lang.Boolean.valueOf(showPersonalFields);
            }
        }, this);
        if (validateAllWithResult != coroutine_suspended) {
            either = either5;
            obj = validateAllWithResult;
            arrow.core.Either either42 = (arrow.core.Either) obj;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> incomeFieldRows2 = this.getHighSpeedVideoFpsRangesFor.getIncomeFieldRows();
            formFieldValidators3 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = either;
            this.getHighResolutionOutputSizeshNQ4ISI = either42;
            this.getHighSpeedVideoSizes = 3;
            validateAllWithResult$default = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult$default(incomeFieldRows2, formFieldValidators3, null, this, 2, null);
            if (validateAllWithResult$default != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$validateAndContinue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$validateAndContinue$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$validateAndContinue$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$validateAndContinue$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = personalInfoUiModel;
        this.Camera2StreamConfigurationMap = personalInfoViewModel;
    }
}
