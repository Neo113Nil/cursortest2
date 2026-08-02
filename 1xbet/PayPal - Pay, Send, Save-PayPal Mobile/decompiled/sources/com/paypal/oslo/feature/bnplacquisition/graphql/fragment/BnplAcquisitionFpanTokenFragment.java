package com.paypal.oslo.feature.bnplacquisition.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "cardNetwork", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment$ProvisionedExternalWalletToken;", "provisionedExternalWalletTokens", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "serviceProvider", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "getCardNetwork", "Ljava/util/List;", "getProvisionedExternalWalletTokens", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "getServiceProvider", "ProvisionedExternalWalletToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplAcquisitionFpanTokenFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork cardNetwork;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> provisionedExternalWalletTokens;
    private final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider serviceProvider;

    public BnplAcquisitionFpanTokenFragment(com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> list, com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuanceCardNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuanceNetworkTokenServiceProvider, "");
        this.cardNetwork = issuanceCardNetwork;
        this.provisionedExternalWalletTokens = list;
        this.serviceProvider = issuanceNetworkTokenServiceProvider;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> getProvisionedExternalWalletTokens() {
        return this.provisionedExternalWalletTokens;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment$ProvisionedExternalWalletToken;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "deviceType", "referenceId", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;", "walletType", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment$ProvisionedExternalWalletToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "getDeviceType", "Ljava/lang/Object;", "getReferenceId", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;", "getWalletType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionedExternalWalletToken {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType deviceType;
        private final java.lang.Object referenceId;
        private final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType walletType;

        public ProvisionedExternalWalletToken(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditExternalWalletDeviceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditExternalWalletType, "");
            this.deviceType = creditExternalWalletDeviceType;
            this.referenceId = obj;
            this.walletType = creditExternalWalletType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType getDeviceType() {
            return this.deviceType;
        }

        public final java.lang.Object getReferenceId() {
            return this.referenceId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType getWalletType() {
            return this.walletType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType = this.deviceType;
            java.lang.Object obj = this.referenceId;
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType = this.walletType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionedExternalWalletToken(deviceType=");
            sb.append(creditExternalWalletDeviceType);
            sb.append(", referenceId=");
            sb.append(obj);
            sb.append(", walletType=");
            sb.append(creditExternalWalletType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.deviceType.hashCode();
            java.lang.Object obj = this.referenceId;
            return (((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.walletType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken provisionedExternalWalletToken = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken) other;
            return this.deviceType == provisionedExternalWalletToken.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, provisionedExternalWalletToken.referenceId) && this.walletType == provisionedExternalWalletToken.walletType;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken copy(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType deviceType, java.lang.Object referenceId, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType walletType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletType, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken(deviceType, referenceId, walletType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType getWalletType() {
            return this.walletType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType getDeviceType() {
            return this.deviceType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken provisionedExternalWalletToken, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                creditExternalWalletDeviceType = provisionedExternalWalletToken.deviceType;
            }
            if ((i & 2) != 0) {
                obj = provisionedExternalWalletToken.referenceId;
            }
            if ((i & 4) != 0) {
                creditExternalWalletType = provisionedExternalWalletToken.walletType;
            }
            return provisionedExternalWalletToken.copy(creditExternalWalletDeviceType, obj, creditExternalWalletType);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork = this.cardNetwork;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> list = this.provisionedExternalWalletTokens;
        com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider = this.serviceProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAcquisitionFpanTokenFragment(cardNetwork=");
        sb.append(issuanceCardNetwork);
        sb.append(", provisionedExternalWalletTokens=");
        sb.append(list);
        sb.append(", serviceProvider=");
        sb.append(issuanceNetworkTokenServiceProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardNetwork.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> list = this.provisionedExternalWalletTokens;
        return (((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.serviceProvider.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment) other;
        return this.cardNetwork == bnplAcquisitionFpanTokenFragment.cardNetwork && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedExternalWalletTokens, bnplAcquisitionFpanTokenFragment.provisionedExternalWalletTokens) && this.serviceProvider == bnplAcquisitionFpanTokenFragment.serviceProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment copy(com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork cardNetwork, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> provisionedExternalWalletTokens, com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider serviceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment(cardNetwork, provisionedExternalWalletTokens, serviceProvider);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> component2() {
        return this.provisionedExternalWalletTokens;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment, com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork, java.util.List list, com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            issuanceCardNetwork = bnplAcquisitionFpanTokenFragment.cardNetwork;
        }
        if ((i & 2) != 0) {
            list = bnplAcquisitionFpanTokenFragment.provisionedExternalWalletTokens;
        }
        if ((i & 4) != 0) {
            issuanceNetworkTokenServiceProvider = bnplAcquisitionFpanTokenFragment.serviceProvider;
        }
        return bnplAcquisitionFpanTokenFragment.copy(issuanceCardNetwork, list, issuanceNetworkTokenServiceProvider);
    }
}
