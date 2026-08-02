package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNavigationActionType;", "navigationType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;", "mobileDeepLink", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNavigationActionType;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNavigationActionType;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNavigationActionType;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNavigationActionType;", "getNavigationType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;", "getMobileDeepLink", "MobileDeepLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditServicingNavigationActionFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType navigationType;

    public RevolvingCreditServicingNavigationActionFragment(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType revolvingCreditServicingNavigationActionType, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingNavigationActionType, "");
        this.navigationType = revolvingCreditServicingNavigationActionType;
        this.mobileDeepLink = mobileDeepLink;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType getNavigationType() {
        return this.navigationType;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink getMobileDeepLink() {
        return this.mobileDeepLink;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;", "revolvingCreditServicingMobileDeepLinkFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment$MobileDeepLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;", "getRevolvingCreditServicingMobileDeepLinkFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MobileDeepLink {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment;

        public MobileDeepLink(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingMobileDeepLinkFragment, "");
            this.__typename = str;
            this.revolvingCreditServicingMobileDeepLinkFragment = revolvingCreditServicingMobileDeepLinkFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment getRevolvingCreditServicingMobileDeepLinkFragment() {
            return this.revolvingCreditServicingMobileDeepLinkFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment = this.revolvingCreditServicingMobileDeepLinkFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileDeepLink(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditServicingMobileDeepLinkFragment=");
            sb.append(revolvingCreditServicingMobileDeepLinkFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditServicingMobileDeepLinkFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, mobileDeepLink.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingMobileDeepLinkFragment, mobileDeepLink.revolvingCreditServicingMobileDeepLinkFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingMobileDeepLinkFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink(__typename, revolvingCreditServicingMobileDeepLinkFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment getRevolvingCreditServicingMobileDeepLinkFragment() {
            return this.revolvingCreditServicingMobileDeepLinkFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = mobileDeepLink.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditServicingMobileDeepLinkFragment = mobileDeepLink.revolvingCreditServicingMobileDeepLinkFragment;
            }
            return mobileDeepLink.copy(str, revolvingCreditServicingMobileDeepLinkFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType revolvingCreditServicingNavigationActionType = this.navigationType;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink = this.mobileDeepLink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingNavigationActionFragment(navigationType=");
        sb.append(revolvingCreditServicingNavigationActionType);
        sb.append(", mobileDeepLink=");
        sb.append(mobileDeepLink);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.navigationType.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink = this.mobileDeepLink;
        return (hashCode * 31) + (mobileDeepLink == null ? 0 : mobileDeepLink.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment revolvingCreditServicingNavigationActionFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment) other;
        return this.navigationType == revolvingCreditServicingNavigationActionFragment.navigationType && kotlin.jvm.internal.Intrinsics.areEqual(this.mobileDeepLink, revolvingCreditServicingNavigationActionFragment.mobileDeepLink);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType navigationType, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment(navigationType, mobileDeepLink);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink getMobileDeepLink() {
        return this.mobileDeepLink;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType getNavigationType() {
        return this.navigationType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment revolvingCreditServicingNavigationActionFragment, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType revolvingCreditServicingNavigationActionType, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditServicingNavigationActionType = revolvingCreditServicingNavigationActionFragment.navigationType;
        }
        if ((i & 2) != 0) {
            mobileDeepLink = revolvingCreditServicingNavigationActionFragment.mobileDeepLink;
        }
        return revolvingCreditServicingNavigationActionFragment.copy(revolvingCreditServicingNavigationActionType, mobileDeepLink);
    }
}
