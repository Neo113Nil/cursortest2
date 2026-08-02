package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B5\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\b\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/viewmodel/DebitCardCreationSuccessScreenViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "isEligible", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenReducer;", "reducer", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "debitCardWebViewUrlBuilder", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZLcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenReducer;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenState;", "", "stateStoreName", "()Ljava/lang/String;", "getUsername", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Z", "()Z", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "getDebitCardWebViewUrlBuilder", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardCreationSuccessScreenViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;
    private final boolean isEligible;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/viewmodel/DebitCardCreationSuccessScreenViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "isEligible", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/viewmodel/DebitCardCreationSuccessScreenViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Z)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/viewmodel/DebitCardCreationSuccessScreenViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, boolean isEligible);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    /* renamed from: isEligible, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder getDebitCardWebViewUrlBuilder() {
        return this.debitCardWebViewUrlBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DebitCardCreationSuccessScreenViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, @dagger.assisted.Assisted boolean z, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenReducer debitCardCreationSuccessScreenReducer, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        super(debitCardCreationSuccessScreenReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardCreationSuccessScreenReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewUrlBuilder, "");
        this.productName = debitCardProductName;
        this.isEligible = z;
        this.getHighSpeedVideoFpsRanges = userStore;
        this.debitCardWebViewUrlBuilder = debitCardWebViewUrlBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState initialState() {
        if (this.isEligible) {
            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState.Eligible.INSTANCE;
        }
        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenState.Ineligible.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitCardCreationSuccessScreenViewModel.store";
    }

    public final java.lang.String getUsername() {
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
        if (!(value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
            return "";
        }
        com.paypal.oslo.core.userstore.model.ProfileName legalName = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getLegalName();
        java.lang.String surname = (legalName == null || (personName = legalName.getPersonName()) == null) ? null : personName.getSurname();
        return surname == null ? "" : surname;
    }
}
