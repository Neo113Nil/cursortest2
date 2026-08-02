package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsEvent;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsUiState;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/alltransactions/mvi/AllTransactionsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsReducer INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsReducer();

    private AllTransactionsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AllTransactionsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiEffect>> reduce(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState state, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent event) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem copy$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading) {
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadSucceeded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content(((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadSucceeded) event).getYears()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadEmpty) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.NoStatementsYet.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadAccountCreationUnavailable) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.AccountCreationUnavailable.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Error(((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadFailed) event).getMessage()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) {
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.YearHeaderClicked) {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content content = (com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content) state;
                java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem> years = content.getYears();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(years, 10));
                for (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem : years) {
                    if (yearAccordionItem.getYear() == ((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.YearHeaderClicked) event).getYear()) {
                        copy$default = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem.copy$default(yearAccordionItem, 0, null, !yearAccordionItem.isExpanded(), null, 11, null);
                    } else {
                        copy$default = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem.copy$default(yearAccordionItem, 0, null, false, null, 11, null);
                    }
                    arrayList.add(copy$default);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(arrayList), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.RetryClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Error) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.RetryClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.NoStatementsYet.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.AccountCreationUnavailable.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
    }
}
