package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToWebView", "NavigateToInContextAcquisitionLoading", "NavigateToConfirmBank", "NavigateToAddBank", "NavigateBackWithCancellation", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateBackWithCancellation;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToAddBank;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToConfirmBank;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToInContextAcquisitionLoading;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToWebView;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardInContextAcquisitionUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToWebView;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToWebView extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToWebView(java.lang.String str) {
            super("NavigateToWebView", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToWebView(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView) other).url);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView navigateToWebView, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToWebView.url;
            }
            return navigateToWebView.copy(str);
        }
    }

    private DebitCardInContextAcquisitionUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToInContextAcquisitionLoading;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "", "selectedFundingSourceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToInContextAcquisitionLoading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedFundingSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInContextAcquisitionLoading extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect {
        public static final int $stable = 0;
        private final java.lang.String selectedFundingSourceId;

        public NavigateToInContextAcquisitionLoading(java.lang.String str) {
            super("NavigateToInContextAcquisitionLoading", null);
            this.selectedFundingSourceId = str;
        }

        public /* synthetic */ NavigateToInContextAcquisitionLoading(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedFundingSourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToInContextAcquisitionLoading(selectedFundingSourceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.selectedFundingSourceId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading) other).selectedFundingSourceId);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading copy(java.lang.String selectedFundingSourceId) {
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading(selectedFundingSourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading navigateToInContextAcquisitionLoading, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToInContextAcquisitionLoading.selectedFundingSourceId;
            }
            return navigateToInContextAcquisitionLoading.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToInContextAcquisitionLoading() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToConfirmBank;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToConfirmBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "getConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToConfirmBank extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig.$stable;
        private final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConfirmBank(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig) {
            super("NavigateToConfirmBank", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankConfig, "");
            this.config = confirmBankConfig;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig getConfig() {
            return this.config;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig = this.config;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToConfirmBank(config=");
            sb.append(confirmBankConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank) other).config);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank copy(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank(config);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig getConfig() {
            return this.config;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank navigateToConfirmBank, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                confirmBankConfig = navigateToConfirmBank.config;
            }
            return navigateToConfirmBank.copy(confirmBankConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateToAddBank;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddBank extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToAddBank INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToAddBank();

        public final int hashCode() {
            return 2103395183;
        }

        private NavigateToAddBank() {
            super("NavigateToAddBank", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddBank";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToAddBank)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateBackWithCancellation;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect$NavigateBackWithCancellation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithCancellation extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithCancellation(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason) {
            super("NavigateBackWithCancellation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
            this.reason = cancellationReason;
        }

        public final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithCancellation(reason=");
            sb.append(cancellationReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation) other).reason);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation copy(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation navigateBackWithCancellation, com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cancellationReason = navigateBackWithCancellation.reason;
            }
            return navigateBackWithCancellation.copy(cancellationReason);
        }
    }

    public /* synthetic */ DebitCardInContextAcquisitionUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
