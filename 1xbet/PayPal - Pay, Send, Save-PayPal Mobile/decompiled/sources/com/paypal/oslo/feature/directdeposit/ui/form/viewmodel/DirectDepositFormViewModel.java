package com.paypal.oslo.feature.directdeposit.ui.form.viewmodel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/viewmodel/DirectDepositFormViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/common/MviViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/state/DirectDepositFormUiState;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect;", "<init>", "()V", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;)V", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Z)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositFormViewModel extends com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel<com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState, com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect> {
    public static final int $stable = 8;

    @javax.inject.Inject
    public DirectDepositFormViewModel() {
        super(new com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState(null, null, false, null, null, null, false, null, null, false, 1023, null));
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel
    public final void processIntent(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName)) {
            if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType)) {
                if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount)) {
                    if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount)) {
                        if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature)) {
                            if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.Submit)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.$r8$lambda$bqAUSqKRfs0VQfhZnZ1wbpHQcWc(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.this, (com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState) obj);
                                }
                            });
                            if (getState().getValue().isFormValid()) {
                                com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState value = getState().getValue();
                                emitEffect(new com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview(value.getCompanyName(), value.isPercentageAmount() ? value.getPercentageAmount() : value.getDollarAmount(), value.isPercentageAmount()));
                                return;
                            }
                            return;
                        }
                        final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature signESignature = (com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature) intent;
                        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.m14730$r8$lambda$nrWYsFvTDpKndJipFJoR1jT4k(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature.this, this, (com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState) obj);
                            }
                        });
                        return;
                    }
                    final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount updateDollarAmount = (com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount) intent;
                    reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.$r8$lambda$vdhMDlQu54CUlxUa5q_KekOuiIw(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount.this, this, (com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState) obj);
                        }
                    });
                    return;
                }
                final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount updatePercentageAmount = (com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount) intent;
                reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.$r8$lambda$lnEHv_gtFMhR_fPgiGWeZ3hV1ZQ(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount.this, this, (com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState) obj);
                    }
                });
                return;
            }
            final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType updateAmountType = (com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType) intent;
            reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.m14731$r8$lambda$rUzS4GiP8oqjE9_8iEc3CnJOk(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType.this, this, (com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState) obj);
                }
            });
            return;
        }
        final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName updateCompanyName = (com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName) intent;
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel.m14729$r8$lambda$Lsp_vTohFNd0SLEJHxZIIInV3o(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName.this, this, (com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState) obj);
            }
        });
    }

    private static java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        int length = kotlin.text.StringsKt.trim(p0).toString().length();
        if (2 > length || length >= 92) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_error_company_name_required);
        }
        return null;
    }

    private static java.lang.Integer Camera2StreamConfigurationMap(java.lang.String p0, boolean p1) {
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(p0);
        if (doubleOrNull != null) {
            double doubleValue = doubleOrNull.doubleValue();
            if (p1) {
                if (0.01d <= doubleValue && doubleValue <= 100.0d) {
                    return null;
                }
            } else if (doubleValue >= 0.01d && doubleOrNull.doubleValue() < 999999.0d) {
                return null;
            }
        }
        if (p1) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_error_amount_invalid_percentage);
        }
        return java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_error_amount_invalid_dollar_amount);
    }

    /* renamed from: $r8$lambda$Lsp_vTohFNd0SLEJHx-ZIIInV3o, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState m14729$r8$lambda$Lsp_vTohFNd0SLEJHxZIIInV3o(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName updateCompanyName, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState directDepositFormUiState) {
        com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormUiState, "");
        copy = directDepositFormUiState.copy((r22 & 1) != 0 ? directDepositFormUiState.companyName : updateCompanyName.getCompanyName(), (r22 & 2) != 0 ? directDepositFormUiState.companyNameError : null, (r22 & 4) != 0 ? directDepositFormUiState.isPercentageAmount : false, (r22 & 8) != 0 ? directDepositFormUiState.percentageAmount : null, (r22 & 16) != 0 ? directDepositFormUiState.dollarAmount : null, (r22 & 32) != 0 ? directDepositFormUiState.amountError : null, (r22 & 64) != 0 ? directDepositFormUiState.isSignatureSigned : false, (r22 & 128) != 0 ? directDepositFormUiState.signatureBitmap : null, (r22 & 256) != 0 ? directDepositFormUiState.eSignatureError : null, (r22 & 512) != 0 ? directDepositFormUiState.isFormValid : getHighResolutionOutputSizeshNQ4ISI(updateCompanyName.getCompanyName()) == null && Camera2StreamConfigurationMap(directDepositFormUiState.isPercentageAmount() ? directDepositFormUiState.getPercentageAmount() : directDepositFormUiState.getDollarAmount(), directDepositFormUiState.isPercentageAmount()) == null && directDepositFormUiState.isSignatureSigned());
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState $r8$lambda$bqAUSqKRfs0VQfhZnZ1wbpHQcWc(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState directDepositFormUiState) {
        com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormUiState, "");
        java.lang.String percentageAmount = directDepositFormUiState.isPercentageAmount() ? directDepositFormUiState.getPercentageAmount() : directDepositFormUiState.getDollarAmount();
        copy = directDepositFormUiState.copy((r22 & 1) != 0 ? directDepositFormUiState.companyName : null, (r22 & 2) != 0 ? directDepositFormUiState.companyNameError : getHighResolutionOutputSizeshNQ4ISI(directDepositFormUiState.getCompanyName()), (r22 & 4) != 0 ? directDepositFormUiState.isPercentageAmount : false, (r22 & 8) != 0 ? directDepositFormUiState.percentageAmount : null, (r22 & 16) != 0 ? directDepositFormUiState.dollarAmount : null, (r22 & 32) != 0 ? directDepositFormUiState.amountError : Camera2StreamConfigurationMap(percentageAmount, directDepositFormUiState.isPercentageAmount()), (r22 & 64) != 0 ? directDepositFormUiState.isSignatureSigned : false, (r22 & 128) != 0 ? directDepositFormUiState.signatureBitmap : null, (r22 & 256) != 0 ? directDepositFormUiState.eSignatureError : !directDepositFormUiState.isSignatureSigned() ? java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_esignature_section_label) : null, (r22 & 512) != 0 ? directDepositFormUiState.isFormValid : getHighResolutionOutputSizeshNQ4ISI(directDepositFormUiState.getCompanyName()) == null && Camera2StreamConfigurationMap(percentageAmount, directDepositFormUiState.isPercentageAmount()) == null && directDepositFormUiState.isSignatureSigned());
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState $r8$lambda$lnEHv_gtFMhR_fPgiGWeZ3hV1ZQ(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount updatePercentageAmount, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState directDepositFormUiState) {
        com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormUiState, "");
        copy = directDepositFormUiState.copy((r22 & 1) != 0 ? directDepositFormUiState.companyName : null, (r22 & 2) != 0 ? directDepositFormUiState.companyNameError : null, (r22 & 4) != 0 ? directDepositFormUiState.isPercentageAmount : false, (r22 & 8) != 0 ? directDepositFormUiState.percentageAmount : updatePercentageAmount.getAmount(), (r22 & 16) != 0 ? directDepositFormUiState.dollarAmount : null, (r22 & 32) != 0 ? directDepositFormUiState.amountError : null, (r22 & 64) != 0 ? directDepositFormUiState.isSignatureSigned : false, (r22 & 128) != 0 ? directDepositFormUiState.signatureBitmap : null, (r22 & 256) != 0 ? directDepositFormUiState.eSignatureError : null, (r22 & 512) != 0 ? directDepositFormUiState.isFormValid : getHighResolutionOutputSizeshNQ4ISI(directDepositFormUiState.getCompanyName()) == null && Camera2StreamConfigurationMap(updatePercentageAmount.getAmount(), directDepositFormUiState.isPercentageAmount()) == null && directDepositFormUiState.isSignatureSigned());
        return copy;
    }

    /* renamed from: $r8$lambda$nr-WYsFvTDpKndJipFJoR1jT-4k, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState m14730$r8$lambda$nrWYsFvTDpKndJipFJoR1jT4k(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature signESignature, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState directDepositFormUiState) {
        com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormUiState, "");
        copy = directDepositFormUiState.copy((r22 & 1) != 0 ? directDepositFormUiState.companyName : null, (r22 & 2) != 0 ? directDepositFormUiState.companyNameError : null, (r22 & 4) != 0 ? directDepositFormUiState.isPercentageAmount : false, (r22 & 8) != 0 ? directDepositFormUiState.percentageAmount : null, (r22 & 16) != 0 ? directDepositFormUiState.dollarAmount : null, (r22 & 32) != 0 ? directDepositFormUiState.amountError : null, (r22 & 64) != 0 ? directDepositFormUiState.isSignatureSigned : true, (r22 & 128) != 0 ? directDepositFormUiState.signatureBitmap : signESignature.getBitmap(), (r22 & 256) != 0 ? directDepositFormUiState.eSignatureError : null, (r22 & 512) != 0 ? directDepositFormUiState.isFormValid : getHighResolutionOutputSizeshNQ4ISI(directDepositFormUiState.getCompanyName()) == null && Camera2StreamConfigurationMap(directDepositFormUiState.isPercentageAmount() ? directDepositFormUiState.getPercentageAmount() : directDepositFormUiState.getDollarAmount(), directDepositFormUiState.isPercentageAmount()) == null);
        return copy;
    }

    /* renamed from: $r8$lambda$r-UzS4GiP8oqj-E9_8iEc3CnJOk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState m14731$r8$lambda$rUzS4GiP8oqjE9_8iEc3CnJOk(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType updateAmountType, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState directDepositFormUiState) {
        com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormUiState, "");
        copy = directDepositFormUiState.copy((r22 & 1) != 0 ? directDepositFormUiState.companyName : null, (r22 & 2) != 0 ? directDepositFormUiState.companyNameError : null, (r22 & 4) != 0 ? directDepositFormUiState.isPercentageAmount : updateAmountType.isPercentage(), (r22 & 8) != 0 ? directDepositFormUiState.percentageAmount : null, (r22 & 16) != 0 ? directDepositFormUiState.dollarAmount : null, (r22 & 32) != 0 ? directDepositFormUiState.amountError : null, (r22 & 64) != 0 ? directDepositFormUiState.isSignatureSigned : false, (r22 & 128) != 0 ? directDepositFormUiState.signatureBitmap : null, (r22 & 256) != 0 ? directDepositFormUiState.eSignatureError : null, (r22 & 512) != 0 ? directDepositFormUiState.isFormValid : getHighResolutionOutputSizeshNQ4ISI(directDepositFormUiState.getCompanyName()) == null && Camera2StreamConfigurationMap(updateAmountType.isPercentage() ? directDepositFormUiState.getPercentageAmount() : directDepositFormUiState.getDollarAmount(), updateAmountType.isPercentage()) == null && directDepositFormUiState.isSignatureSigned());
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState $r8$lambda$vdhMDlQu54CUlxUa5q_KekOuiIw(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount updateDollarAmount, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState directDepositFormUiState) {
        com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormUiState, "");
        copy = directDepositFormUiState.copy((r22 & 1) != 0 ? directDepositFormUiState.companyName : null, (r22 & 2) != 0 ? directDepositFormUiState.companyNameError : null, (r22 & 4) != 0 ? directDepositFormUiState.isPercentageAmount : false, (r22 & 8) != 0 ? directDepositFormUiState.percentageAmount : null, (r22 & 16) != 0 ? directDepositFormUiState.dollarAmount : updateDollarAmount.getAmount(), (r22 & 32) != 0 ? directDepositFormUiState.amountError : null, (r22 & 64) != 0 ? directDepositFormUiState.isSignatureSigned : false, (r22 & 128) != 0 ? directDepositFormUiState.signatureBitmap : null, (r22 & 256) != 0 ? directDepositFormUiState.eSignatureError : null, (r22 & 512) != 0 ? directDepositFormUiState.isFormValid : getHighResolutionOutputSizeshNQ4ISI(directDepositFormUiState.getCompanyName()) == null && Camera2StreamConfigurationMap(updateDollarAmount.getAmount(), directDepositFormUiState.isPercentageAmount()) == null && directDepositFormUiState.isSignatureSigned());
        return copy;
    }
}
