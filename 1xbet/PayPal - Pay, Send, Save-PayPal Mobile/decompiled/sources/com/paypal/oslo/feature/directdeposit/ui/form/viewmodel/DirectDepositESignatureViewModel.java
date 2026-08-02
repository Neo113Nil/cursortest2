package com.paypal.oslo.feature.directdeposit.ui.form.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/viewmodel/DirectDepositESignatureViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/common/MviViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/ESignatureIntent;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/state/ESignatureUiState;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/ESignatureEffect;", "<init>", "()V", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/ESignatureIntent;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositESignatureViewModel extends com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel<com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent, com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState, com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect> {
    public static final int $stable = 8;

    @javax.inject.Inject
    public DirectDepositESignatureViewModel() {
        super(new com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState(null, 1, null));
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel
    public final void processIntent(com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.BackClicked) {
            emitEffect(com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect.NavigateBack.INSTANCE);
            return;
        }
        if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.DoneClicked)) {
            if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.ClearClicked)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.$r8$lambda$n7jGAum5s8p7WeYde0TdToPC75E((com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState) obj);
                }
            });
            emitEffect(com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect.ClearCanvas.INSTANCE);
            return;
        }
        final com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.DoneClicked doneClicked = (com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.DoneClicked) intent;
        reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.$r8$lambda$ovPzl8MNSt9hW5uWK8gvGScoV6E(com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.DoneClicked.this, (com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState) obj);
            }
        });
        emitEffect(com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect.NavigateDone.INSTANCE);
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState $r8$lambda$n7jGAum5s8p7WeYde0TdToPC75E(com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState eSignatureUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eSignatureUiState, "");
        return eSignatureUiState.copy(null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState $r8$lambda$ovPzl8MNSt9hW5uWK8gvGScoV6E(com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.DoneClicked doneClicked, com.paypal.oslo.feature.directdeposit.ui.form.state.ESignatureUiState eSignatureUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eSignatureUiState, "");
        return eSignatureUiState.copy(doneClicked.getBitmap());
    }
}
