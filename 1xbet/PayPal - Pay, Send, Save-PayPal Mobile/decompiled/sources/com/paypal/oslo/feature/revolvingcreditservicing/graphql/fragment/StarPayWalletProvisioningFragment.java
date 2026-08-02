package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "primaryDeviceEligibility", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "getPrimaryDeviceEligibility", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", "getComponent", "PrimaryDeviceEligibility", "Component", "OnRevolvingCreditPushProvisioningEligible", "OnRevolvingCreditPushProvisioningIneligible", "ProvisionedToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StarPayWalletProvisioningFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility;

    public StarPayWalletProvisioningFragment(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryDeviceEligibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        this.primaryDeviceEligibility = primaryDeviceEligibility;
        this.component = component;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility getPrimaryDeviceEligibility() {
        return this.primaryDeviceEligibility;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component getComponent() {
        return this.component;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "onRevolvingCreditPushProvisioningEligible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "onRevolvingCreditPushProvisioningIneligible", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "getOnRevolvingCreditPushProvisioningEligible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "getOnRevolvingCreditPushProvisioningIneligible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryDeviceEligibility {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible;

        public PrimaryDeviceEligibility(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRevolvingCreditPushProvisioningEligible = onRevolvingCreditPushProvisioningEligible;
            this.onRevolvingCreditPushProvisioningIneligible = onRevolvingCreditPushProvisioningIneligible;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible getOnRevolvingCreditPushProvisioningEligible() {
            return this.onRevolvingCreditPushProvisioningEligible;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible getOnRevolvingCreditPushProvisioningIneligible() {
            return this.onRevolvingCreditPushProvisioningIneligible;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible = this.onRevolvingCreditPushProvisioningEligible;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible = this.onRevolvingCreditPushProvisioningIneligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryDeviceEligibility(__typename=");
            sb.append(str);
            sb.append(", onRevolvingCreditPushProvisioningEligible=");
            sb.append(onRevolvingCreditPushProvisioningEligible);
            sb.append(", onRevolvingCreditPushProvisioningIneligible=");
            sb.append(onRevolvingCreditPushProvisioningIneligible);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible = this.onRevolvingCreditPushProvisioningEligible;
            int hashCode2 = onRevolvingCreditPushProvisioningEligible == null ? 0 : onRevolvingCreditPushProvisioningEligible.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible = this.onRevolvingCreditPushProvisioningIneligible;
            return (((hashCode * 31) + hashCode2) * 31) + (onRevolvingCreditPushProvisioningIneligible != null ? onRevolvingCreditPushProvisioningIneligible.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, primaryDeviceEligibility.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPushProvisioningEligible, primaryDeviceEligibility.onRevolvingCreditPushProvisioningEligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPushProvisioningIneligible, primaryDeviceEligibility.onRevolvingCreditPushProvisioningIneligible);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility(__typename, onRevolvingCreditPushProvisioningEligible, onRevolvingCreditPushProvisioningIneligible);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible getOnRevolvingCreditPushProvisioningIneligible() {
            return this.onRevolvingCreditPushProvisioningIneligible;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible getOnRevolvingCreditPushProvisioningEligible() {
            return this.onRevolvingCreditPushProvisioningEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = primaryDeviceEligibility.__typename;
            }
            if ((i & 2) != 0) {
                onRevolvingCreditPushProvisioningEligible = primaryDeviceEligibility.onRevolvingCreditPushProvisioningEligible;
            }
            if ((i & 4) != 0) {
                onRevolvingCreditPushProvisioningIneligible = primaryDeviceEligibility.onRevolvingCreditPushProvisioningIneligible;
            }
            return primaryDeviceEligibility.copy(str, onRevolvingCreditPushProvisioningEligible, onRevolvingCreditPushProvisioningIneligible);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", "", "", "isHidden", "personalizationTrackingId", "<init>", "(ZLjava/lang/Object;)V", "component1", "()Z", "component2", "()Ljava/lang/Object;", "copy", "(ZLjava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Object;", "getPersonalizationTrackingId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Component {
        public static final int $stable = 8;
        private final boolean isHidden;
        private final java.lang.Object personalizationTrackingId;

        public Component(boolean z, java.lang.Object obj) {
            this.isHidden = z;
            this.personalizationTrackingId = obj;
        }

        public final boolean isHidden() {
            return this.isHidden;
        }

        public final java.lang.Object getPersonalizationTrackingId() {
            return this.personalizationTrackingId;
        }

        public final java.lang.String toString() {
            boolean z = this.isHidden;
            java.lang.Object obj = this.personalizationTrackingId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Component(isHidden=");
            sb.append(z);
            sb.append(", personalizationTrackingId=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isHidden);
            java.lang.Object obj = this.personalizationTrackingId;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component) other;
            return this.isHidden == component.isHidden && kotlin.jvm.internal.Intrinsics.areEqual(this.personalizationTrackingId, component.personalizationTrackingId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component copy(boolean isHidden, java.lang.Object personalizationTrackingId) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component(isHidden, personalizationTrackingId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getPersonalizationTrackingId() {
            return this.personalizationTrackingId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsHidden() {
            return this.isHidden;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = component.isHidden;
            }
            if ((i & 2) != 0) {
                obj = component.personalizationTrackingId;
            }
            return component.copy(z, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningEligibleReason;", "eligibleReason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningEligibleReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningEligibleReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningEligibleReason;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningEligibleReason;", "getEligibleReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPushProvisioningEligible {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason eligibleReason;

        public OnRevolvingCreditPushProvisioningEligible(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason revolvingCreditPushProvisioningEligibleReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPushProvisioningEligibleReason, "");
            this.eligibleReason = revolvingCreditPushProvisioningEligibleReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason getEligibleReason() {
            return this.eligibleReason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason revolvingCreditPushProvisioningEligibleReason = this.eligibleReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPushProvisioningEligible(eligibleReason=");
            sb.append(revolvingCreditPushProvisioningEligibleReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eligibleReason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible) && this.eligibleReason == ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible) other).eligibleReason;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason eligibleReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleReason, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible(eligibleReason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason getEligibleReason() {
            return this.eligibleReason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason revolvingCreditPushProvisioningEligibleReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditPushProvisioningEligibleReason = onRevolvingCreditPushProvisioningEligible.eligibleReason;
            }
            return onRevolvingCreditPushProvisioningEligible.copy(revolvingCreditPushProvisioningEligibleReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningIneligibleReason;", "ineligibleReason", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$ProvisionedToken;", "provisionedTokens", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningIneligibleReason;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningIneligibleReason;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningIneligibleReason;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningIneligibleReason;", "getIneligibleReason", "Ljava/util/List;", "getProvisionedTokens"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPushProvisioningIneligible {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason ineligibleReason;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> provisionedTokens;

        public OnRevolvingCreditPushProvisioningIneligible(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason revolvingCreditPushProvisioningIneligibleReason, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPushProvisioningIneligibleReason, "");
            this.ineligibleReason = revolvingCreditPushProvisioningIneligibleReason;
            this.provisionedTokens = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason getIneligibleReason() {
            return this.ineligibleReason;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> getProvisionedTokens() {
            return this.provisionedTokens;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason revolvingCreditPushProvisioningIneligibleReason = this.ineligibleReason;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> list = this.provisionedTokens;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPushProvisioningIneligible(ineligibleReason=");
            sb.append(revolvingCreditPushProvisioningIneligibleReason);
            sb.append(", provisionedTokens=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.ineligibleReason.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> list = this.provisionedTokens;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible) other;
            return this.ineligibleReason == onRevolvingCreditPushProvisioningIneligible.ineligibleReason && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokens, onRevolvingCreditPushProvisioningIneligible.provisionedTokens);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason ineligibleReason, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> provisionedTokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ineligibleReason, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible(ineligibleReason, provisionedTokens);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> component2() {
            return this.provisionedTokens;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason getIneligibleReason() {
            return this.ineligibleReason;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason revolvingCreditPushProvisioningIneligibleReason, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditPushProvisioningIneligibleReason = onRevolvingCreditPushProvisioningIneligible.ineligibleReason;
            }
            if ((i & 2) != 0) {
                list = onRevolvingCreditPushProvisioningIneligible.provisionedTokens;
            }
            return onRevolvingCreditPushProvisioningIneligible.copy(revolvingCreditPushProvisioningIneligibleReason, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\\\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b\n\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b\u000b\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$ProvisionedToken;", "", "id", "fundingPrimaryAccountNumberReferenceId", "", "fundingPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;", "state", "issuerName", "", "isCompanionToken", "isDefaultToken", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;", "component5", "component6", "()Z", "component7", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$ProvisionedToken;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getId", "getFundingPrimaryAccountNumberReferenceId", "Ljava/lang/String;", "getFundingPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;", "getState", "getIssuerName", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionedToken {
        public static final int $stable = 8;
        private final java.lang.String fundingPrimaryAccountNumberLastDigits;
        private final java.lang.Object fundingPrimaryAccountNumberReferenceId;
        private final java.lang.Object id;
        private final boolean isCompanionToken;
        private final boolean isDefaultToken;
        private final java.lang.String issuerName;
        private final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState state;

        public ProvisionedToken(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState creditExternalWalletTokenState, java.lang.String str2, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditExternalWalletTokenState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = obj;
            this.fundingPrimaryAccountNumberReferenceId = obj2;
            this.fundingPrimaryAccountNumberLastDigits = str;
            this.state = creditExternalWalletTokenState;
            this.issuerName = str2;
            this.isCompanionToken = z;
            this.isDefaultToken = z2;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.Object getFundingPrimaryAccountNumberReferenceId() {
            return this.fundingPrimaryAccountNumberReferenceId;
        }

        public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
            return this.fundingPrimaryAccountNumberLastDigits;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState getState() {
            return this.state;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final boolean isCompanionToken() {
            return this.isCompanionToken;
        }

        public final boolean isDefaultToken() {
            return this.isDefaultToken;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            java.lang.Object obj2 = this.fundingPrimaryAccountNumberReferenceId;
            java.lang.String str = this.fundingPrimaryAccountNumberLastDigits;
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState creditExternalWalletTokenState = this.state;
            java.lang.String str2 = this.issuerName;
            boolean z = this.isCompanionToken;
            boolean z2 = this.isDefaultToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionedToken(id=");
            sb.append(obj);
            sb.append(", fundingPrimaryAccountNumberReferenceId=");
            sb.append(obj2);
            sb.append(", fundingPrimaryAccountNumberLastDigits=");
            sb.append(str);
            sb.append(", state=");
            sb.append(creditExternalWalletTokenState);
            sb.append(", issuerName=");
            sb.append(str2);
            sb.append(", isCompanionToken=");
            sb.append(z);
            sb.append(", isDefaultToken=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.id;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.fundingPrimaryAccountNumberReferenceId;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.String str = this.fundingPrimaryAccountNumberLastDigits;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.state.hashCode()) * 31) + this.issuerName.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isCompanionToken)) * 31) + java.lang.Boolean.hashCode(this.isDefaultToken);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken provisionedToken = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, provisionedToken.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberReferenceId, provisionedToken.fundingPrimaryAccountNumberReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberLastDigits, provisionedToken.fundingPrimaryAccountNumberLastDigits) && this.state == provisionedToken.state && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, provisionedToken.issuerName) && this.isCompanionToken == provisionedToken.isCompanionToken && this.isDefaultToken == provisionedToken.isDefaultToken;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken copy(java.lang.Object id, java.lang.Object fundingPrimaryAccountNumberReferenceId, java.lang.String fundingPrimaryAccountNumberLastDigits, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState state, java.lang.String issuerName, boolean isCompanionToken, boolean isDefaultToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken(id, fundingPrimaryAccountNumberReferenceId, fundingPrimaryAccountNumberLastDigits, state, issuerName, isCompanionToken, isDefaultToken);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsDefaultToken() {
            return this.isDefaultToken;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsCompanionToken() {
            return this.isCompanionToken;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState getState() {
            return this.state;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
            return this.fundingPrimaryAccountNumberLastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getFundingPrimaryAccountNumberReferenceId() {
            return this.fundingPrimaryAccountNumberReferenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken provisionedToken, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState creditExternalWalletTokenState, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = provisionedToken.id;
            }
            if ((i & 2) != 0) {
                obj2 = provisionedToken.fundingPrimaryAccountNumberReferenceId;
            }
            java.lang.Object obj4 = obj2;
            if ((i & 4) != 0) {
                str = provisionedToken.fundingPrimaryAccountNumberLastDigits;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                creditExternalWalletTokenState = provisionedToken.state;
            }
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState creditExternalWalletTokenState2 = creditExternalWalletTokenState;
            if ((i & 16) != 0) {
                str2 = provisionedToken.issuerName;
            }
            java.lang.String str4 = str2;
            if ((i & 32) != 0) {
                z = provisionedToken.isCompanionToken;
            }
            boolean z3 = z;
            if ((i & 64) != 0) {
                z2 = provisionedToken.isDefaultToken;
            }
            return provisionedToken.copy(obj, obj4, str3, creditExternalWalletTokenState2, str4, z3, z2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility = this.primaryDeviceEligibility;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component = this.component;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StarPayWalletProvisioningFragment(primaryDeviceEligibility=");
        sb.append(primaryDeviceEligibility);
        sb.append(", component=");
        sb.append(component);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.primaryDeviceEligibility.hashCode() * 31) + this.component.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryDeviceEligibility, starPayWalletProvisioningFragment.primaryDeviceEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.component, starPayWalletProvisioningFragment.component);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryDeviceEligibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment(primaryDeviceEligibility, component);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component getComponent() {
        return this.component;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility getPrimaryDeviceEligibility() {
        return this.primaryDeviceEligibility;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            primaryDeviceEligibility = starPayWalletProvisioningFragment.primaryDeviceEligibility;
        }
        if ((i & 2) != 0) {
            component = starPayWalletProvisioningFragment.component;
        }
        return starPayWalletProvisioningFragment.copy(primaryDeviceEligibility, component);
    }
}
