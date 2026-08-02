package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect;", "", "OpenMerchantWebsite", "ShowSearch", "ShowHowToLinkBottomSheet", "NavigateBackToHub", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$NavigateBackToHub;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$OpenMerchantWebsite;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$ShowHowToLinkBottomSheet;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$ShowSearch;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LinkAgreementsUiEffect {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$OpenMerchantWebsite;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect;", "", "merchantUrl", "source", "merchantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$OpenMerchantWebsite;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantUrl", "getSource", "getMerchantName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenMerchantWebsite implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String merchantName;
        private final java.lang.String merchantUrl;
        private final java.lang.String source;

        public OpenMerchantWebsite(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.merchantUrl = str;
            this.source = str2;
            this.merchantName = str3;
        }

        public final java.lang.String getMerchantUrl() {
            return this.merchantUrl;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantUrl;
            java.lang.String str2 = this.source;
            java.lang.String str3 = this.merchantName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenMerchantWebsite(merchantUrl=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(", merchantName=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.merchantUrl.hashCode() * 31) + this.source.hashCode()) * 31) + this.merchantName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite openMerchantWebsite = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantUrl, openMerchantWebsite.merchantUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, openMerchantWebsite.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, openMerchantWebsite.merchantName);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite copy(java.lang.String merchantUrl, java.lang.String source, java.lang.String merchantName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite(merchantUrl, source, merchantName);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantUrl() {
            return this.merchantUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite openMerchantWebsite, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openMerchantWebsite.merchantUrl;
            }
            if ((i & 2) != 0) {
                str2 = openMerchantWebsite.source;
            }
            if ((i & 4) != 0) {
                str3 = openMerchantWebsite.merchantName;
            }
            return openMerchantWebsite.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$ShowSearch;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSearch implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowSearch INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowSearch();

        public final int hashCode() {
            return 77382508;
        }

        private ShowSearch() {
        }

        public final java.lang.String toString() {
            return "ShowSearch";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowSearch)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$ShowHowToLinkBottomSheet;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowHowToLinkBottomSheet implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowHowToLinkBottomSheet INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowHowToLinkBottomSheet();

        public final int hashCode() {
            return -1472471565;
        }

        private ShowHowToLinkBottomSheet() {
        }

        public final java.lang.String toString() {
            return "ShowHowToLinkBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowHowToLinkBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$NavigateBackToHub;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect;", "", "refreshNeeded", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEffect$NavigateBackToHub;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getRefreshNeeded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackToHub implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect {
        public static final int $stable = 0;
        private final boolean refreshNeeded;

        public NavigateBackToHub(boolean z) {
            this.refreshNeeded = z;
        }

        public final boolean getRefreshNeeded() {
            return this.refreshNeeded;
        }

        public final java.lang.String toString() {
            boolean z = this.refreshNeeded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackToHub(refreshNeeded=");
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub) && this.refreshNeeded == ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub) other).refreshNeeded;
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub copy(boolean refreshNeeded) {
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub(refreshNeeded);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRefreshNeeded() {
            return this.refreshNeeded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub navigateBackToHub, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateBackToHub.refreshNeeded;
            }
            return navigateBackToHub.copy(z);
        }
    }
}
