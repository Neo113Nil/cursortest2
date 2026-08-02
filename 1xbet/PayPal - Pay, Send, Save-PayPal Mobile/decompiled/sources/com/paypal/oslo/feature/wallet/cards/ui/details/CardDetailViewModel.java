package com.paypal.oslo.feature.wallet.cards.ui.details;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H&¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0003R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\"8'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\"8'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\"8'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\"8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "cardId", "", "initialize", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "card", "updateFromCard", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;)V", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "cardDetailInfo", "updateFromCardDetail", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;)V", "onEditClick", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;Ljava/lang/String;)V", "onEditCurrencyClick", "onEditNicknameClick", "onExpiredCardBannerClick", "onConfirmCardClick", "startLoading", "stopLoading", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailScreenState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "getUpdateCardRequestId-QDVFmTU", "()Ljava/lang/String;", "updateCardRequestId", "Lkotlinx/coroutines/flow/Flow;", "getShowCurrencyEdit", "()Lkotlinx/coroutines/flow/Flow;", "showCurrencyEdit", "getShowNicknameSheet", "showNicknameSheet", "getShowExpiredCardSheet", "showExpiredCardSheet", "getShowConfirmCard", "showConfirmCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardDetailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> getShowConfirmCard();

    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> getShowCurrencyEdit();

    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> getShowExpiredCardSheet();

    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> getShowNicknameSheet();

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState> getUiState();

    /* renamed from: getUpdateCardRequestId-QDVFmTU, reason: not valid java name */
    public abstract java.lang.String mo21130getUpdateCardRequestIdQDVFmTU();

    public abstract void initialize(java.lang.String cardId);

    public abstract void onConfirmCardClick();

    public abstract void onEditClick(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo, java.lang.String cardId);

    public abstract void onEditCurrencyClick();

    public abstract void onEditNicknameClick();

    public abstract void onExpiredCardBannerClick();

    public abstract void startLoading();

    public abstract void stopLoading();

    public abstract void updateFromCard(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card);

    public abstract void updateFromCardDetail(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo);
}
