package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1", f = "AdditionalInfoViewModel.kt", i = {1}, l = {105, 110}, m = "invokeSuspend", n = {"ssnResult"}, nl = {110, 115}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class AdditionalInfoViewModel$validateAndContinue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators;
        java.lang.Object validateAllWithResult;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators2;
        java.lang.Object validateAllWithResult2;
        arrow.core.Either either;
        java.util.List listOf;
        java.util.Iterator it;
        java.util.List list;
        java.util.List list2;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel copy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> nationalIdentificationFieldRows = this.getHighSpeedVideoFpsRangesFor.getNationalIdentificationFieldRows();
            formFieldValidators = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            validateAllWithResult = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult(nationalIdentificationFieldRows, formFieldValidators, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel.this));
                }
            }, this);
            if (validateAllWithResult == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                either = (arrow.core.Either) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                validateAllWithResult2 = obj;
                arrow.core.Either either2 = (arrow.core.Either) validateAllWithResult2;
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new arrow.core.Either[]{either, either2});
                if ((listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
                    it = listOf.iterator();
                    while (it.hasNext()) {
                        if (((arrow.core.Either) it.next()).isLeft()) {
                            if (either instanceof arrow.core.Either.Right) {
                                list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                            } else {
                                if (!(either instanceof arrow.core.Either.Left)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                list = (java.util.List) ((arrow.core.Either.Left) either).getValue();
                            }
                            java.util.List list3 = list;
                            if (either2 instanceof arrow.core.Either.Right) {
                                list2 = (java.util.List) ((arrow.core.Either.Right) either2).getValue();
                            } else {
                                if (!(either2 instanceof arrow.core.Either.Left)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                list2 = (java.util.List) ((arrow.core.Either.Left) either2).getValue();
                            }
                            copy = r6.copy((r26 & 1) != 0 ? r6.nationalIdentificationFieldRows : list3, (r26 & 2) != 0 ? r6.incomeFieldRows : list2, (r26 & 4) != 0 ? r6.formattedAmount : null, (r26 & 8) != 0 ? r6.selectedOfferId : null, (r26 & 16) != 0 ? r6.isLoading : false, (r26 & 32) != 0 ? r6.screenTitle : null, (r26 & 64) != 0 ? r6.screenDescription : null, (r26 & 128) != 0 ? r6.continueButtonText : null, (r26 & 256) != 0 ? r6.incomeGuidanceTitle : null, (r26 & 512) != 0 ? r6.incomeGuidanceBody : null, (r26 & 1024) != 0 ? r6.incomeGuidanceDoneButtonText : null, (r26 & 2048) != 0 ? this.getHighSpeedVideoFpsRangesFor.toolBarContent : null);
                            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid(copy));
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid(this.getHighSpeedVideoFpsRangesFor));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            validateAllWithResult = obj;
        }
        arrow.core.Either either3 = (arrow.core.Either) validateAllWithResult;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> incomeFieldRows = this.getHighSpeedVideoFpsRangesFor.getIncomeFieldRows();
        formFieldValidators2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel2 = this.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = either3;
        this.getHighSpeedVideoSizes = 2;
        validateAllWithResult2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult(incomeFieldRows, formFieldValidators2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel.this));
            }
        }, this);
        if (validateAllWithResult2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        either = either3;
        arrow.core.Either either22 = (arrow.core.Either) validateAllWithResult2;
        listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new arrow.core.Either[]{either, either22});
        if (listOf instanceof java.util.Collection) {
        }
        it = listOf.iterator();
        while (it.hasNext()) {
        }
        this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid(this.getHighSpeedVideoFpsRangesFor));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
        return !additionalInfoUiModel.getNationalIdentificationFieldRows().isEmpty();
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel) {
        return !additionalInfoUiModel.getIncomeFieldRows().isEmpty();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalInfoViewModel$validateAndContinue$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = additionalInfoUiModel;
        this.getHighResolutionOutputSizeshNQ4ISI = additionalInfoViewModel;
    }
}
