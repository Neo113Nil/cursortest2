package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b \u0010\u0018J\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010'8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010'8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/BaseViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionUiEffect;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase;", "getCategorySelectionUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/ConfirmCategoryUseCase;", "confirmCategoryUseCase", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/ConfirmCategoryUseCase;)V", "", "onLoad", "()V", "onLoadSingleCategory", "", "categoryId", "onToggleCategorySelection", "(Ljava/lang/String;)V", "onContinue", "onClose", "offerId", "touchpointId", "onConfirm", "(Ljava/lang/String;Ljava/lang/String;)V", "text", "tag", "onSelectionTermsClick", "onConfirmationTermsClick", "onRetry", "handleOnLoad$shopping_rewards_prodRelease", "handleOnLoadSingleCategory$shopping_rewards_prodRelease", "handleOnContinue$shopping_rewards_prodRelease", "handleOnConfirm$shopping_rewards_prodRelease", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/ConfirmCategoryUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "analyticsMiddlewareDelegate", "getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease", "sideEffectMiddlewareDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategorySelectionViewModel extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionUiEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public CategorySelectionViewModel(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getCategorySelectionUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase confirmCategoryUseCase) {
        super("CategorySelectionViewModel", com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionReducer.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCategorySelectionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmCategoryUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getCategorySelectionUseCase;
        this.getHighSpeedVideoFpsRanges = confirmCategoryUseCase;
    }

    public final void onLoad() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoad.INSTANCE);
    }

    public final void onLoadSingleCategory() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSingleCategory.INSTANCE);
    }

    public final void onToggleCategorySelection(java.lang.String categoryId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryId, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnToggleCategorySelection(categoryId));
    }

    public final void onContinue() {
        java.lang.Object obj;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState value = getUiState().getValue();
        if (value instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection) {
            java.util.Iterator<T> it = ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection) value).getCategorySelectionUiData().getCategories().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj).isSelected()) {
                        break;
                    }
                }
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory shoppingCategory = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj;
            java.lang.String id = shoppingCategory != null ? shoppingCategory.getId() : null;
            if (id == null) {
                id = "";
            }
            processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnContinue(id, com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.CATEGORY_OFFERS));
        }
    }

    public final void onClose() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss.INSTANCE);
    }

    public final void onConfirm(java.lang.String offerId, java.lang.String touchpointId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchpointId, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirm(offerId, touchpointId));
    }

    public final void onSelectionTermsClick(java.lang.String text, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnSelectionTermsClick(text, tag));
    }

    public final void onConfirmationTermsClick(java.lang.String text, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmationTermsClick(text, tag));
    }

    public final void onRetry() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnRetry.INSTANCE);
    }

    public final void handleOnLoad$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnLoad$1(this, null), 3, null);
    }

    public final void handleOnLoadSingleCategory$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnLoadSingleCategory$1(this, null), 3, null);
    }

    public final void handleOnContinue$shopping_rewards_prodRelease(java.lang.String offerId, java.lang.String touchpointId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchpointId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnContinue$1(this, offerId, touchpointId, null), 3, null);
    }

    public final void handleOnConfirm$shopping_rewards_prodRelease(java.lang.String offerId, java.lang.String touchpointId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchpointId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnConfirm$1(this, offerId, touchpointId, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent> getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionAnalyticsMiddlewareDelegate();
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent> getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionSideEffectMiddlewareDelegate(this);
    }
}
