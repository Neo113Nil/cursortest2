package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;", "", "", "isVisible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "walletOverview", "<init>", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "copy", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "getWalletOverview", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PushToWalletUiState {
    private final boolean isVisible;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview walletOverview;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState.Companion(null);
    public static final int $stable = 8;

    public PushToWalletUiState(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview) {
        this.isVisible = z;
        this.walletOverview = starPayWalletOverview;
    }

    public /* synthetic */ PushToWalletUiState(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : starPayWalletOverview);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview getWalletOverview() {
        return this.walletOverview;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "starPayWalletOverview", "", "isPushToWalletEnabled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;", "from", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState from(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, boolean isPushToWalletEnabled) {
            boolean z = false;
            if (starPayWalletOverview != null && starPayWalletOverview.getExternalWalletStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.ELIGIBLE && starPayWalletOverview.getExternalWalletReason() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_NOT_IN_WALLET && isPushToWalletEnabled && kotlin.jvm.internal.Intrinsics.areEqual(starPayWalletOverview.getPushProvisioningActionEnabled(), java.lang.Boolean.TRUE)) {
                z = true;
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState(z, starPayWalletOverview);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        boolean z = this.isVisible;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = this.walletOverview;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PushToWalletUiState(isVisible=");
        sb.append(z);
        sb.append(", walletOverview=");
        sb.append(starPayWalletOverview);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isVisible);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = this.walletOverview;
        return (hashCode * 31) + (starPayWalletOverview == null ? 0 : starPayWalletOverview.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState) other;
        return this.isVisible == pushToWalletUiState.isVisible && kotlin.jvm.internal.Intrinsics.areEqual(this.walletOverview, pushToWalletUiState.walletOverview);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState copy(boolean isVisible, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview walletOverview) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState(isVisible, walletOverview);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview getWalletOverview() {
        return this.walletOverview;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pushToWalletUiState.isVisible;
        }
        if ((i & 2) != 0) {
            starPayWalletOverview = pushToWalletUiState.walletOverview;
        }
        return pushToWalletUiState.copy(z, starPayWalletOverview);
    }
}
