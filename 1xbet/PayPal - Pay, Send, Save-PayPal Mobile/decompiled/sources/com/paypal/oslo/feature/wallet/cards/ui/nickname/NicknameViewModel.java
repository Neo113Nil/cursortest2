package com.paypal.oslo.feature.wallet.cards.ui.nickname;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "cardId", "initialNickname", "", "initialize", "(Ljava/lang/String;Ljava/lang/String;)V", "nickname", "save", "(Ljava/lang/String;)V", "onSecondaryButtonPressed", "removeNickname", "onRemoveConfirm", "onRemoveCancel", "resetState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "NicknameModalState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class NicknameViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> getUiState();

    public abstract void initialize(java.lang.String cardId, java.lang.String initialNickname);

    public abstract void onRemoveCancel();

    public abstract void onRemoveConfirm();

    public abstract void onSecondaryButtonPressed();

    public abstract void removeNickname();

    public abstract void resetState();

    public abstract void save(java.lang.String nickname);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "", "<init>", "()V", "Idle", "Loading", "Success", "RemoveConfirm", "RemoveLoading", "RemoveSuccess", "Dismissed", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Dismissed;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Idle;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Loading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveConfirm;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveLoading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveSuccess;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class NicknameModalState {
        public static final int $stable = 0;

        private NicknameModalState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Idle;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Idle extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle();

            public final int hashCode() {
                return -1203582653;
            }

            private Idle() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Idle";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Loading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Loading();

            public final int hashCode() {
                return 1423519085;
            }

            private Loading() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Loading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Success;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "cardDetailInfo", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;)Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "getCardDetailInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            private final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
                this.cardDetailInfo = cardDetailInfo;
            }

            public final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo getCardDetailInfo() {
                return this.cardDetailInfo;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo = this.cardDetailInfo;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(cardDetailInfo=");
                sb.append(cardDetailInfo);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.cardDetailInfo.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetailInfo, ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success) other).cardDetailInfo);
            }

            public final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success copy(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
                return new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success(cardDetailInfo);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo getCardDetailInfo() {
                return this.cardDetailInfo;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success copy$default(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success success, com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    cardDetailInfo = success.cardDetailInfo;
                }
                return success.copy(cardDetailInfo);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveConfirm;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RemoveConfirm extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm();

            public final int hashCode() {
                return -2073866995;
            }

            private RemoveConfirm() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RemoveConfirm";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveLoading;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RemoveLoading extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading();

            public final int hashCode() {
                return 1606633353;
            }

            private RemoveLoading() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RemoveLoading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveSuccess;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "cardDetailInfo", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;)Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$RemoveSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "getCardDetailInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RemoveSuccess extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            private final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveSuccess(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
                this.cardDetailInfo = cardDetailInfo;
            }

            public final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo getCardDetailInfo() {
                return this.cardDetailInfo;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo = this.cardDetailInfo;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveSuccess(cardDetailInfo=");
                sb.append(cardDetailInfo);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.cardDetailInfo.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetailInfo, ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess) other).cardDetailInfo);
            }

            public final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess copy(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
                return new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess(cardDetailInfo);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo getCardDetailInfo() {
                return this.cardDetailInfo;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess copy$default(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess removeSuccess, com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    cardDetailInfo = removeSuccess.cardDetailInfo;
                }
                return removeSuccess.copy(cardDetailInfo);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState$Dismissed;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Dismissed extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed();

            public final int hashCode() {
                return 963070106;
            }

            private Dismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Dismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ NicknameModalState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
