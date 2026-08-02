package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onSave", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "updateCVV", "(Ljava/lang/String;)V", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "updateExpiryDate", "", "isFocused", "onExpirationDateFocusChanged", "(Z)V", "onCvvFocusChanged", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "billingAddress", "onBillingAddressSelected", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;)V", "handleAddNewAddress", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;", "result", "handleAddAddressResult", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;)V", "cardId", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "brand", "initialize", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/edit/UpdateCardScreenState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "getAddAddressRequestId-QDVFmTU", "()Ljava/lang/String;", "addAddressRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class UpdateCardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getAddAddressRequestId-QDVFmTU, reason: not valid java name */
    public abstract java.lang.String getGetOutputFormats();

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState> getUiState();

    public abstract void handleAddAddressResult(com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult result);

    public abstract void handleAddNewAddress();

    public abstract void initialize(java.lang.String cardId, java.lang.String expiryDate, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand);

    public abstract void onBillingAddressSelected(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress);

    public abstract void onCvvFocusChanged(boolean isFocused);

    public abstract void onExpirationDateFocusChanged(boolean isFocused);

    public abstract void onSave();

    public abstract void updateCVV(java.lang.String cvv);

    public abstract void updateExpiryDate(java.lang.String expiryDate);

    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModel updateCardViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
        if ((i & 8) != 0) {
            cardBrand = com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN;
        }
        updateCardViewModel.initialize(str, str2, billingAddress, cardBrand);
    }
}
