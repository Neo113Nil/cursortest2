package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0013B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/viewmodel/ReportCardReasonSelectionViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionReducer;)V", "", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionState;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReportCardReasonSelectionViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/viewmodel/ReportCardReasonSelectionViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/viewmodel/ReportCardReasonSelectionViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/viewmodel/ReportCardReasonSelectionViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
        return this.replacementInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public ReportCardReasonSelectionViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionReducer reportCardReasonSelectionReducer) {
        super(reportCardReasonSelectionReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReasonSelectionReducer, "");
        this.replacementInfo = cardReplacementInfo;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "ReportCardReasonSelectionViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionState.Initial.INSTANCE;
    }
}
