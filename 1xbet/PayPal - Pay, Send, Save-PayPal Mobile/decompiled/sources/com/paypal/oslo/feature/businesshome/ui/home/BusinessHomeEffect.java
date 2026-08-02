package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "", "NavigateToBusinessExperienceDisabled", "NavigateToDisputes", "NavigateToPayableP2PDetail", "NavigateToPayableInvoiceDetail", "NavigateToPayablesList", "NavigateToReceivableP2PDetail", "NavigateToReceivableInvoiceDetail", "NavigateToReceivablesList", "NavigateToRecentTransactions", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToBusinessExperienceDisabled;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToDisputes;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayableInvoiceDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayableP2PDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayablesList;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivableInvoiceDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivableP2PDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivablesList;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToRecentTransactions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BusinessHomeEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToBusinessExperienceDisabled;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBusinessExperienceDisabled implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToBusinessExperienceDisabled INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToBusinessExperienceDisabled();

        public final int hashCode() {
            return 1799698237;
        }

        private NavigateToBusinessExperienceDisabled() {
        }

        public final java.lang.String toString() {
            return "NavigateToBusinessExperienceDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToBusinessExperienceDisabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToDisputes;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDisputes implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToDisputes INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToDisputes();

        public final int hashCode() {
            return -1960308410;
        }

        private NavigateToDisputes() {
        }

        public final java.lang.String toString() {
            return "NavigateToDisputes";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToDisputes)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayableP2PDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "", "transactionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayableP2PDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPayableP2PDetail implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        private final java.lang.String transactionId;

        public NavigateToPayableP2PDetail(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transactionId = str;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transactionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPayableP2PDetail(transactionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transactionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail) other).transactionId);
        }

        public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail copy(java.lang.String transactionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail(transactionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail navigateToPayableP2PDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPayableP2PDetail.transactionId;
            }
            return navigateToPayableP2PDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayableInvoiceDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayableInvoiceDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPayableInvoiceDetail implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        private final java.lang.String invoiceId;

        public NavigateToPayableInvoiceDetail(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.invoiceId = str;
        }

        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPayableInvoiceDetail(invoiceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.invoiceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail) other).invoiceId);
        }

        public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail copy(java.lang.String invoiceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
            return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail(invoiceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail navigateToPayableInvoiceDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPayableInvoiceDetail.invoiceId;
            }
            return navigateToPayableInvoiceDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToPayablesList;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPayablesList implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayablesList INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayablesList();

        public final int hashCode() {
            return 213009542;
        }

        private NavigateToPayablesList() {
        }

        public final java.lang.String toString() {
            return "NavigateToPayablesList";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayablesList)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivableP2PDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "", "transactionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivableP2PDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReceivableP2PDetail implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        private final java.lang.String transactionId;

        public NavigateToReceivableP2PDetail(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transactionId = str;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transactionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReceivableP2PDetail(transactionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transactionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail) other).transactionId);
        }

        public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail copy(java.lang.String transactionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail(transactionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail navigateToReceivableP2PDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReceivableP2PDetail.transactionId;
            }
            return navigateToReceivableP2PDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivableInvoiceDetail;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivableInvoiceDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReceivableInvoiceDetail implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        private final java.lang.String invoiceId;

        public NavigateToReceivableInvoiceDetail(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.invoiceId = str;
        }

        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReceivableInvoiceDetail(invoiceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.invoiceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail) other).invoiceId);
        }

        public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail copy(java.lang.String invoiceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
            return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail(invoiceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail navigateToReceivableInvoiceDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReceivableInvoiceDetail.invoiceId;
            }
            return navigateToReceivableInvoiceDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToReceivablesList;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReceivablesList implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivablesList INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivablesList();

        public final int hashCode() {
            return 1407397406;
        }

        private NavigateToReceivablesList() {
        }

        public final java.lang.String toString() {
            return "NavigateToReceivablesList";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivablesList)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect$NavigateToRecentTransactions;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRecentTransactions implements com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToRecentTransactions INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToRecentTransactions();

        public final int hashCode() {
            return -1934035033;
        }

        private NavigateToRecentTransactions() {
        }

        public final java.lang.String toString() {
            return "NavigateToRecentTransactions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToRecentTransactions)) {
                return false;
            }
            return true;
        }
    }
}
