package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategorySelectionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionReducer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionReducer();

    private CategorySelectionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CategorySelectionReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect>> reduce(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState state, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent event) {
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen dismissScreen;
        java.lang.String termsTextLink;
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect>> output;
        java.lang.String termsTextLink2;
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect>> output2;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection readySelection;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial)) {
            int i = -1;
            int i2 = 0;
            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading)) {
                if (state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory loadingSingleCategory = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory) state;
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSingleCategorySuccess) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData(kotlin.collections.CollectionsKt.emptyList(), "", null, new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData("Done", null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_ENABLED(), 2, null), kotlin.collections.CollectionsKt.emptyList(), ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSingleCategorySuccess) event).getUiData())), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error(((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError) event).getErrorType()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loadingSingleCategory, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loadingSingleCategory, event);
                }
                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection)) {
                    if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview)) {
                        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation)) {
                            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming)) {
                                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error) state;
                                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnRetry) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading.INSTANCE, null, 2, null);
                                }
                                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen.INSTANCE);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                            }
                            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming confirming = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming) state;
                            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmSuccess) {
                                com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmSuccess onConfirmSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmSuccess) event;
                                if (onConfirmSuccess.getCategoryConfirmationData() != null) {
                                    categorySelectionUiData = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData.copy$default(confirming.getCategorySelectionUiData(), null, null, null, null, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.UiDataMappers.INSTANCE.getAsCategoryConfirmationUiData(onConfirmSuccess.getCategoryConfirmationData())), null, 47, null);
                                } else {
                                    categorySelectionUiData = confirming.getCategorySelectionUiData();
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.UiDataMappers.INSTANCE.getAsReady(categorySelectionUiData), true), null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmError) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(confirming, event);
                        }
                        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation readyConfirmation = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation) state;
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoad) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(readyConfirmation, null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmationTermsClick) {
                            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData categoryConfirmationUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) readyConfirmation.getCategorySelectionUiData().getConfirmationDataList());
                            return (categoryConfirmationUiData == null || (termsTextLink = categoryConfirmationUiData.getTermsTextLink()) == null || (output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyConfirmation, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.OpenTermsUrl(termsTextLink))) == null) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(readyConfirmation, null, 2, null) : output;
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) {
                            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation readyConfirmation2 = readyConfirmation;
                            if (readyConfirmation.getEnrollmentSuccessful()) {
                                dismissScreen = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreenAfterChange.INSTANCE;
                            } else {
                                dismissScreen = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen.INSTANCE;
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyConfirmation2, dismissScreen);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readyConfirmation, event);
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview readyReview = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview) state;
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmationTermsClick) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData categoryConfirmationUiData2 = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) readyReview.getCategorySelectionUiData().getConfirmationDataList());
                        if (categoryConfirmationUiData2 == null || (termsTextLink2 = categoryConfirmationUiData2.getTermsTextLink()) == null) {
                            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData selectedCategoryData = readyReview.getCategorySelectionUiData().getSelectedCategoryData();
                            termsTextLink2 = selectedCategoryData != null ? selectedCategoryData.getTermsTextLink() : null;
                        }
                        return (termsTextLink2 == null || (output2 = com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyReview, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.OpenTermsUrl(termsTextLink2))) == null) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(readyReview, null, 2, null) : output2;
                    }
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyReview, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readyReview, event);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection readySelection2 = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection) state;
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnToggleCategorySelection) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection.copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.ReducerUtils.INSTANCE.recalculateReadyStateAfterCategorySelection$shopping_rewards_prodRelease(readySelection2, ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnToggleCategorySelection) event).getCategoryId()), null, false, 1, null), null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnContinue)) {
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnSelectionTermsClick) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection readySelection3 = readySelection2;
                        java.lang.String termsUrl = readySelection2.getCategorySelectionUiData().getTermsUrl();
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readySelection3, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.OpenTermsUrl(termsUrl != null ? termsUrl : ""));
                    }
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readySelection2, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readySelection2, event);
                }
                java.util.Iterator<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> it = readySelection2.getCategorySelectionUiData().getCategories().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().isSelected()) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (i >= 0) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData categoryConfirmationUiData3 = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData) kotlin.collections.CollectionsKt.getOrNull(readySelection2.getCategorySelectionUiData().getConfirmationDataList(), i);
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.UiDataMappers uiDataMappers = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.UiDataMappers.INSTANCE;
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData2 = readySelection2.getCategorySelectionUiData();
                    java.util.List listOf = categoryConfirmationUiData3 != null ? kotlin.collections.CollectionsKt.listOf(categoryConfirmationUiData3) : null;
                    if (listOf == null) {
                        listOf = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming(uiDataMappers.getAsConfirming(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData.copy$default(categorySelectionUiData2, null, null, null, null, listOf, null, 47, null))), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection.copy$default(readySelection2, null, true, 1, null), null, 2, null);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading loading = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSuccess) {
                com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSuccess onLoadSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSuccess) event;
                if (onLoadSuccess.getData().getCategories().isEmpty()) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError), null, 2, null);
                }
                java.util.Iterator<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> it2 = onLoadSuccess.getData().getCategories().iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().isEnabled()) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                if (i >= 0) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData data = onLoadSuccess.getData();
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData categoryConfirmationUiData4 = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData) kotlin.collections.CollectionsKt.getOrNull(onLoadSuccess.getData().getConfirmationDataList(), i);
                    java.util.List listOf2 = categoryConfirmationUiData4 != null ? kotlin.collections.CollectionsKt.listOf(categoryConfirmationUiData4) : null;
                    if (listOf2 == null) {
                        listOf2 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    readySelection = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData.copy$default(data, null, null, null, null, listOf2, null, 47, null));
                } else {
                    readySelection = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.UiDataMappers.INSTANCE.getAsReady(onLoadSuccess.getData()), false, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(readySelection, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error(((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError) event).getErrorType()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect.DismissScreen.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial initial = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoad) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSingleCategory) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
