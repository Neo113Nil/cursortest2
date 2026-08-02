package com.paypal.oslo.feature.identity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;", "checkoutPreferences", "", "nativeCheckOutData", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;", "getCheckoutPreferences", "Ljava/lang/String;", "getNativeCheckOutData", "CheckoutPreferences", "AppSwitchPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IdentityCheckoutDataFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences;
    private final java.lang.String nativeCheckOutData;

    public IdentityCheckoutDataFragment(com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferences, "");
        this.checkoutPreferences = checkoutPreferences;
        this.nativeCheckOutData = str;
    }

    public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences getCheckoutPreferences() {
        return this.checkoutPreferences;
    }

    public final java.lang.String getNativeCheckOutData() {
        return this.nativeCheckOutData;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;", "", "cancelUrl", "returnUrl", "checkoutApprovalUrl", "bridgeUrl", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;", "appSwitchPreferences", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;)Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$CheckoutPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCancelUrl", "getReturnUrl", "getCheckoutApprovalUrl", "getBridgeUrl", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;", "getAppSwitchPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckoutPreferences {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences;
        private final java.lang.Object bridgeUrl;
        private final java.lang.Object cancelUrl;
        private final java.lang.Object checkoutApprovalUrl;
        private final java.lang.Object returnUrl;

        public CheckoutPreferences(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchPreferences, "");
            this.cancelUrl = obj;
            this.returnUrl = obj2;
            this.checkoutApprovalUrl = obj3;
            this.bridgeUrl = obj4;
            this.appSwitchPreferences = appSwitchPreferences;
        }

        public final java.lang.Object getCancelUrl() {
            return this.cancelUrl;
        }

        public final java.lang.Object getReturnUrl() {
            return this.returnUrl;
        }

        public final java.lang.Object getCheckoutApprovalUrl() {
            return this.checkoutApprovalUrl;
        }

        public final java.lang.Object getBridgeUrl() {
            return this.bridgeUrl;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences getAppSwitchPreferences() {
            return this.appSwitchPreferences;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.cancelUrl;
            java.lang.Object obj2 = this.returnUrl;
            java.lang.Object obj3 = this.checkoutApprovalUrl;
            java.lang.Object obj4 = this.bridgeUrl;
            com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences = this.appSwitchPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutPreferences(cancelUrl=");
            sb.append(obj);
            sb.append(", returnUrl=");
            sb.append(obj2);
            sb.append(", checkoutApprovalUrl=");
            sb.append(obj3);
            sb.append(", bridgeUrl=");
            sb.append(obj4);
            sb.append(", appSwitchPreferences=");
            sb.append(appSwitchPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cancelUrl.hashCode();
            int hashCode2 = this.returnUrl.hashCode();
            int hashCode3 = this.checkoutApprovalUrl.hashCode();
            java.lang.Object obj = this.bridgeUrl;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.appSwitchPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences = (com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cancelUrl, checkoutPreferences.cancelUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, checkoutPreferences.returnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutApprovalUrl, checkoutPreferences.checkoutApprovalUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.bridgeUrl, checkoutPreferences.bridgeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.appSwitchPreferences, checkoutPreferences.appSwitchPreferences);
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences copy(java.lang.Object cancelUrl, java.lang.Object returnUrl, java.lang.Object checkoutApprovalUrl, java.lang.Object bridgeUrl, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutApprovalUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchPreferences, "");
            return new com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences(cancelUrl, returnUrl, checkoutApprovalUrl, bridgeUrl, appSwitchPreferences);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences getAppSwitchPreferences() {
            return this.appSwitchPreferences;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getBridgeUrl() {
            return this.bridgeUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCheckoutApprovalUrl() {
            return this.checkoutApprovalUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCancelUrl() {
            return this.cancelUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences copy$default(com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences, int i, java.lang.Object obj5) {
            if ((i & 1) != 0) {
                obj = checkoutPreferences.cancelUrl;
            }
            if ((i & 2) != 0) {
                obj2 = checkoutPreferences.returnUrl;
            }
            java.lang.Object obj6 = obj2;
            if ((i & 4) != 0) {
                obj3 = checkoutPreferences.checkoutApprovalUrl;
            }
            java.lang.Object obj7 = obj3;
            if ((i & 8) != 0) {
                obj4 = checkoutPreferences.bridgeUrl;
            }
            java.lang.Object obj8 = obj4;
            if ((i & 16) != 0) {
                appSwitchPreferences = checkoutPreferences.appSwitchPreferences;
            }
            return checkoutPreferences.copy(obj, obj6, obj7, obj8, appSwitchPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchReturnFlowType;", "returnFlow", "Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;", "appSwitchApiIntegrationChannel", "", "browserName", "", "isWebView", "fallbackUrlScheme", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchReturnFlowType;Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchReturnFlowType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchReturnFlowType;Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment$AppSwitchPreferences;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchReturnFlowType;", "getReturnFlow", "Lcom/paypal/oslo/api/graphql/schema/type/AppSwitchAPIIntegrationChannel;", "getAppSwitchApiIntegrationChannel", "Ljava/lang/String;", "getBrowserName", "Ljava/lang/Boolean;", "getFallbackUrlScheme"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AppSwitchPreferences {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchApiIntegrationChannel;
        private final java.lang.String browserName;
        private final java.lang.String fallbackUrlScheme;
        private final java.lang.Boolean isWebView;
        private final com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType returnFlow;

        public AppSwitchPreferences(com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType, com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel, java.lang.String str, java.lang.Boolean bool, java.lang.String str2) {
            this.returnFlow = appSwitchReturnFlowType;
            this.appSwitchApiIntegrationChannel = appSwitchAPIIntegrationChannel;
            this.browserName = str;
            this.isWebView = bool;
            this.fallbackUrlScheme = str2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType getReturnFlow() {
            return this.returnFlow;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel getAppSwitchApiIntegrationChannel() {
            return this.appSwitchApiIntegrationChannel;
        }

        public final java.lang.String getBrowserName() {
            return this.browserName;
        }

        public final java.lang.Boolean isWebView() {
            return this.isWebView;
        }

        public final java.lang.String getFallbackUrlScheme() {
            return this.fallbackUrlScheme;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType = this.returnFlow;
            com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel = this.appSwitchApiIntegrationChannel;
            java.lang.String str = this.browserName;
            java.lang.Boolean bool = this.isWebView;
            java.lang.String str2 = this.fallbackUrlScheme;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppSwitchPreferences(returnFlow=");
            sb.append(appSwitchReturnFlowType);
            sb.append(", appSwitchApiIntegrationChannel=");
            sb.append(appSwitchAPIIntegrationChannel);
            sb.append(", browserName=");
            sb.append(str);
            sb.append(", isWebView=");
            sb.append(bool);
            sb.append(", fallbackUrlScheme=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType = this.returnFlow;
            int hashCode = appSwitchReturnFlowType == null ? 0 : appSwitchReturnFlowType.hashCode();
            com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel = this.appSwitchApiIntegrationChannel;
            int hashCode2 = appSwitchAPIIntegrationChannel == null ? 0 : appSwitchAPIIntegrationChannel.hashCode();
            java.lang.String str = this.browserName;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool = this.isWebView;
            int hashCode4 = bool == null ? 0 : bool.hashCode();
            java.lang.String str2 = this.fallbackUrlScheme;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences = (com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences) other;
            return this.returnFlow == appSwitchPreferences.returnFlow && this.appSwitchApiIntegrationChannel == appSwitchPreferences.appSwitchApiIntegrationChannel && kotlin.jvm.internal.Intrinsics.areEqual(this.browserName, appSwitchPreferences.browserName) && kotlin.jvm.internal.Intrinsics.areEqual(this.isWebView, appSwitchPreferences.isWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.fallbackUrlScheme, appSwitchPreferences.fallbackUrlScheme);
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences copy(com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType returnFlow, com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchApiIntegrationChannel, java.lang.String browserName, java.lang.Boolean isWebView, java.lang.String fallbackUrlScheme) {
            return new com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences(returnFlow, appSwitchApiIntegrationChannel, browserName, isWebView, fallbackUrlScheme);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFallbackUrlScheme() {
            return this.fallbackUrlScheme;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getIsWebView() {
            return this.isWebView;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBrowserName() {
            return this.browserName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel getAppSwitchApiIntegrationChannel() {
            return this.appSwitchApiIntegrationChannel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType getReturnFlow() {
            return this.returnFlow;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences copy$default(com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.AppSwitchPreferences appSwitchPreferences, com.paypal.oslo.api.graphql.schema.type.AppSwitchReturnFlowType appSwitchReturnFlowType, com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                appSwitchReturnFlowType = appSwitchPreferences.returnFlow;
            }
            if ((i & 2) != 0) {
                appSwitchAPIIntegrationChannel = appSwitchPreferences.appSwitchApiIntegrationChannel;
            }
            com.paypal.oslo.api.graphql.schema.type.AppSwitchAPIIntegrationChannel appSwitchAPIIntegrationChannel2 = appSwitchAPIIntegrationChannel;
            if ((i & 4) != 0) {
                str = appSwitchPreferences.browserName;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                bool = appSwitchPreferences.isWebView;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 16) != 0) {
                str2 = appSwitchPreferences.fallbackUrlScheme;
            }
            return appSwitchPreferences.copy(appSwitchReturnFlowType, appSwitchAPIIntegrationChannel2, str3, bool2, str2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences = this.checkoutPreferences;
        java.lang.String str = this.nativeCheckOutData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IdentityCheckoutDataFragment(checkoutPreferences=");
        sb.append(checkoutPreferences);
        sb.append(", nativeCheckOutData=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.checkoutPreferences.hashCode();
        java.lang.String str = this.nativeCheckOutData;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment)) {
            return false;
        }
        com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment = (com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutPreferences, identityCheckoutDataFragment.checkoutPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.nativeCheckOutData, identityCheckoutDataFragment.nativeCheckOutData);
    }

    public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment copy(com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences, java.lang.String nativeCheckOutData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferences, "");
        return new com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment(checkoutPreferences, nativeCheckOutData);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNativeCheckOutData() {
        return this.nativeCheckOutData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences getCheckoutPreferences() {
        return this.checkoutPreferences;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment copy$default(com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment.CheckoutPreferences checkoutPreferences, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            checkoutPreferences = identityCheckoutDataFragment.checkoutPreferences;
        }
        if ((i & 2) != 0) {
            str = identityCheckoutDataFragment.nativeCheckOutData;
        }
        return identityCheckoutDataFragment.copy(checkoutPreferences, str);
    }
}
