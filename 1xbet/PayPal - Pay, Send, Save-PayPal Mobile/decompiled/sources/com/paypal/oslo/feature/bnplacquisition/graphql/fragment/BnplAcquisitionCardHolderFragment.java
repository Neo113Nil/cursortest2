package com.paypal.oslo.feature.bnplacquisition.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\"#B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;", "name", "", "phoneNumber", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$BillingAddress;", "billingAddresses", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;", "getName", "Ljava/lang/String;", "getPhoneNumber", "Ljava/util/List;", "getBillingAddresses", "Name", "BillingAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplAcquisitionCardHolderFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> billingAddresses;
    private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name;
    private final java.lang.String phoneNumber;

    public BnplAcquisitionCardHolderFragment(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2, java.lang.String str, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = name2;
        this.phoneNumber = str;
        this.billingAddresses = list;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name getName() {
        return this.name;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> getBillingAddresses() {
        return this.billingAddresses;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;", "", "", "fullName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String fullName;

        public Name(java.lang.String str) {
            this.fullName = str;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(fullName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.fullName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, ((com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name) other).fullName);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name copy(java.lang.String fullName) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name(fullName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.fullName;
            }
            return name2.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$BillingAddress;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "bnplAcquisitionAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment$BillingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "getBnplAcquisitionAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingAddress {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment;

        public BillingAddress(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
            this.__typename = str;
            this.bnplAcquisitionAddressFragment = bnplAcquisitionAddressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment getBnplAcquisitionAddressFragment() {
            return this.bnplAcquisitionAddressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment = this.bnplAcquisitionAddressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddress(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionAddressFragment=");
            sb.append(bnplAcquisitionAddressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionAddressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress billingAddress = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, billingAddress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionAddressFragment, billingAddress.bnplAcquisitionAddressFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress(__typename, bnplAcquisitionAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment getBnplAcquisitionAddressFragment() {
            return this.bnplAcquisitionAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress billingAddress, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = billingAddress.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionAddressFragment = billingAddress.bnplAcquisitionAddressFragment;
            }
            return billingAddress.copy(str, bnplAcquisitionAddressFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2 = this.name;
        java.lang.String str = this.phoneNumber;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> list = this.billingAddresses;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAcquisitionCardHolderFragment(name=");
        sb.append(name2);
        sb.append(", phoneNumber=");
        sb.append(str);
        sb.append(", billingAddresses=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2 = this.name;
        int hashCode = name2 == null ? 0 : name2.hashCode();
        int hashCode2 = this.phoneNumber.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> list = this.billingAddresses;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, bnplAcquisitionCardHolderFragment.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, bnplAcquisitionCardHolderFragment.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddresses, bnplAcquisitionCardHolderFragment.billingAddresses);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment copy(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2, java.lang.String phoneNumber, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> billingAddresses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment(name2, phoneNumber, billingAddresses);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.BillingAddress> component3() {
        return this.billingAddresses;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment.Name name2, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            name2 = bnplAcquisitionCardHolderFragment.name;
        }
        if ((i & 2) != 0) {
            str = bnplAcquisitionCardHolderFragment.phoneNumber;
        }
        if ((i & 4) != 0) {
            list = bnplAcquisitionCardHolderFragment.billingAddresses;
        }
        return bnplAcquisitionCardHolderFragment.copy(name2, str, list);
    }
}
