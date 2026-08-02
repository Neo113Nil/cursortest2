package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PreQualReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PreQualReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PreQualReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState state, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect>> output$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error error = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.NavigateBack.INSTANCE);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.CloseServicing.INSTANCE);
                    } else {
                        output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LoadData ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                } else {
                    com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success) state;
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.NavigateBack.INSTANCE);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.CloseServicing.INSTANCE);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error.INSTANCE, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled) {
                        java.util.List<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem> faqItems = success.getModel().getFaqItems();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(faqItems, 10));
                        for (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem faqItem : faqItems) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(faqItem.getId(), ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled) event).getFaqId())) {
                                faqItem = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem.copy$default(faqItem, null, null, null, !faqItem.isExpanded(), 7, null);
                            }
                            arrayList.add(faqItem);
                        }
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.copy$default(success.getModel(), null, null, arrayList, null, false, null, 59, null)), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.OnReloadingAmount) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading(success.getModel()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.NavigateToWebView(((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked) event).getUrl()));
                    } else {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading reLoading = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded) {
                    com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model = reLoading.getModel();
                    com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded amountDataReloaded = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded) event;
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.copy$default(model, amountDataReloaded.getFormattedAmount(), null, null, null, amountDataReloaded.getPreQualificationEligible(), null, 46, null)), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error.INSTANCE, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(reLoading, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.NavigateBack.INSTANCE);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(reLoading, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.CloseServicing.INSTANCE);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled) {
                    java.util.List<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem> faqItems2 = reLoading.getModel().getFaqItems();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(faqItems2, 10));
                    for (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem faqItem2 : faqItems2) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(faqItem2.getId(), ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled) event).getFaqId())) {
                            faqItem2 = com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem.copy$default(faqItem2, null, null, null, !faqItem2.isExpanded(), 7, null);
                        }
                        arrayList2.add(faqItem2);
                    }
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(reLoading.copy(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.copy$default(reLoading.getModel(), null, null, arrayList2, null, false, null, 59, null)), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(reLoading, new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.NavigateToWebView(((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked) event).getUrl()));
                } else {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(reLoading, event);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading loading = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LoadData) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded) event).getModel()), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error.INSTANCE, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.NavigateBack.INSTANCE);
            } else {
                output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiEffect.CloseServicing.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        if (output$default instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return output$default;
        }
        if (output$default instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return output$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
