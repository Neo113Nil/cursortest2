package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect;", "", "ReturnWithMerchant", "NavigateBack", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect$ReturnWithMerchant;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LinkAgreementsSearchUiEffect {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect$ReturnWithMerchant;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect;", "", "merchantId", "merchantName", "merchantUrl", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect$ReturnWithMerchant;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantId", "getMerchantName", "getMerchantUrl", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReturnWithMerchant implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect {
        public static final int $stable = 0;
        private final java.lang.String merchantId;
        private final java.lang.String merchantName;
        private final java.lang.String merchantUrl;
        private final java.lang.String source;

        public ReturnWithMerchant(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.merchantId = str;
            this.merchantName = str2;
            this.merchantUrl = str3;
            this.source = str4;
        }

        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getMerchantUrl() {
            return this.merchantUrl;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantId;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.merchantUrl;
            java.lang.String str4 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnWithMerchant(merchantId=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", merchantUrl=");
            sb.append(str3);
            sb.append(", source=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.merchantId.hashCode() * 31) + this.merchantName.hashCode()) * 31) + this.merchantUrl.hashCode()) * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant returnWithMerchant = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, returnWithMerchant.merchantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, returnWithMerchant.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantUrl, returnWithMerchant.merchantUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, returnWithMerchant.source);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant copy(java.lang.String merchantId, java.lang.String merchantName, java.lang.String merchantUrl, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant(merchantId, merchantName, merchantUrl, source);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMerchantUrl() {
            return this.merchantUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant returnWithMerchant, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = returnWithMerchant.merchantId;
            }
            if ((i & 2) != 0) {
                str2 = returnWithMerchant.merchantName;
            }
            if ((i & 4) != 0) {
                str3 = returnWithMerchant.merchantUrl;
            }
            if ((i & 8) != 0) {
                str4 = returnWithMerchant.source;
            }
            return returnWithMerchant.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.NavigateBack();

        public final int hashCode() {
            return -472629497;
        }

        private NavigateBack() {
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }
}
