package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B3\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00170\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware$Factory;", "sideEffectsMiddlewareFactory", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "webViewUrlBuilder", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroReducer;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware$Factory;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;Lcom/paypal/oslo/core/userstore/UserStore;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware$Factory;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "getWebViewUrlBuilder", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "Lcom/paypal/oslo/core/userstore/UserStore;", "getUserStore", "()Lcom/paypal/oslo/core/userstore/UserStore;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
    private final com.paypal.oslo.core.userstore.UserStore userStore;
    private final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder webViewUrlBuilder;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder getWebViewUrlBuilder() {
        return this.webViewUrlBuilder;
    }

    public final com.paypal.oslo.core.userstore.UserStore getUserStore() {
        return this.userStore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DebitCardAcquisitionIntroViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer debitCardAcquisitionIntroReducer, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory factory, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder, com.paypal.oslo.core.userstore.UserStore userStore) {
        super(debitCardAcquisitionIntroReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewUrlBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.productName = debitCardProductName;
        this.getHighResolutionOutputSizeshNQ4ISI = factory;
        this.webViewUrlBuilder = debitCardWebViewUrlBuilder;
        this.userStore = userStore;
        processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.CheckEligibility.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState initialState() {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading(0, 1, null);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitCardAcquisitionIntroViewModel.store";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(this.getHighResolutionOutputSizeshNQ4ISI.create(this.productName));
    }
}
