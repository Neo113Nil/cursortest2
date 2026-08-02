package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiEffect;", "", "NavigateBack", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiEffect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LinkAgreementInAppBrowserUiEffect {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiEffect;", "", "refreshNeeded", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiEffect$NavigateBack;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getRefreshNeeded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect {
        public static final int $stable = 0;
        private final boolean refreshNeeded;

        public NavigateBack(boolean z) {
            this.refreshNeeded = z;
        }

        public final boolean getRefreshNeeded() {
            return this.refreshNeeded;
        }

        public final java.lang.String toString() {
            boolean z = this.refreshNeeded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBack(refreshNeeded=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.refreshNeeded);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack) && this.refreshNeeded == ((com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack) other).refreshNeeded;
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack copy(boolean refreshNeeded) {
            return new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack(refreshNeeded);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRefreshNeeded() {
            return this.refreshNeeded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiEffect.NavigateBack navigateBack, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateBack.refreshNeeded;
            }
            return navigateBack.copy(z);
        }
    }
}
