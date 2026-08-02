package com.paypal.oslo.feature.inappcheckout.ui.entry.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSwitchEntryContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract();

    private AppSwitchEntryContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "", "Idle", "Loading", "Fallback", "RequiresAuthentication", "Error", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Error;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Fallback;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Idle;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Loading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$RequiresAuthentication;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Idle;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Idle implements com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Idle INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Idle();

            private Idle() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Loading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "loadingSettings", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "getLoadingSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings;

            public Loading(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSettings, "");
                this.loadingSettings = loadingSettings;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings getLoadingSettings() {
                return this.loadingSettings;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings = this.loadingSettings;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(loadingSettings=");
                sb.append(loadingSettings);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.loadingSettings.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadingSettings, ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading) other).loadingSettings);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading copy(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSettings, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading(loadingSettings);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings getLoadingSettings() {
                return this.loadingSettings;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading copy$default(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading loading, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    loadingSettings = loading.loadingSettings;
                }
                return loading.copy(loadingSettings);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Fallback;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Fallback implements com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State {
            public static final int $stable = 8;
            private final android.net.Uri uri;

            public Fallback(android.net.Uri uri) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
                this.uri = uri;
            }

            public final android.net.Uri getUri() {
                return this.uri;
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$RequiresAuthentication;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "component2-QDVFmTU", "()Ljava/lang/String;", "component2", "copy-hN0UB1M", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$RequiresAuthentication;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "getCheckoutAuthenticationContext", "Ljava/lang/String;", "getRequestId-QDVFmTU"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RequiresAuthentication implements com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext;
            private final java.lang.String requestId;

            private RequiresAuthentication(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.checkoutAuthenticationContext = checkoutAuthenticationContext;
                this.requestId = str;
            }

            public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
                return this.checkoutAuthenticationContext;
            }

            /* renamed from: getRequestId-QDVFmTU, reason: not valid java name */
            public final java.lang.String m15520getRequestIdQDVFmTU() {
                return this.requestId;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext = this.checkoutAuthenticationContext;
                java.lang.String m11591toStringimpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.requestId);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RequiresAuthentication(checkoutAuthenticationContext=");
                sb.append(checkoutAuthenticationContext);
                sb.append(", requestId=");
                sb.append(m11591toStringimpl);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.checkoutAuthenticationContext.hashCode() * 31) + com.paypal.oslo.core.navigation.result.NavResultRequestId.m11590hashCodeimpl(this.requestId);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication requiresAuthentication = (com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutAuthenticationContext, requiresAuthentication.checkoutAuthenticationContext) && com.paypal.oslo.core.navigation.result.NavResultRequestId.m11589equalsimpl0(this.requestId, requiresAuthentication.requestId);
            }

            /* renamed from: copy-hN0UB1M, reason: not valid java name */
            public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication m15519copyhN0UB1M(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String requestId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication(checkoutAuthenticationContext, requestId, null);
            }

            /* renamed from: component2-QDVFmTU, reason: not valid java name and from getter */
            public final java.lang.String getRequestId() {
                return this.requestId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
                return this.checkoutAuthenticationContext;
            }

            /* renamed from: copy-hN0UB1M$default, reason: not valid java name */
            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication m15517copyhN0UB1M$default(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication requiresAuthentication, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    checkoutAuthenticationContext = requiresAuthentication.checkoutAuthenticationContext;
                }
                if ((i & 2) != 0) {
                    str = requiresAuthentication.requestId;
                }
                return requiresAuthentication.m15519copyhN0UB1M(checkoutAuthenticationContext, str);
            }

            public /* synthetic */ RequiresAuthentication(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(checkoutAuthenticationContext, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Error;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;", "", "canGoBackToMerchant", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCanGoBackToMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error implements com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State {
            public static final int $stable = 0;
            private final boolean canGoBackToMerchant;

            public Error(boolean z) {
                this.canGoBackToMerchant = z;
            }

            public final boolean getCanGoBackToMerchant() {
                return this.canGoBackToMerchant;
            }

            public final java.lang.String toString() {
                boolean z = this.canGoBackToMerchant;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(canGoBackToMerchant=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.canGoBackToMerchant);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error) && this.canGoBackToMerchant == ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error) other).canGoBackToMerchant;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error copy(boolean canGoBackToMerchant) {
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error(canGoBackToMerchant);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getCanGoBackToMerchant() {
                return this.canGoBackToMerchant;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error copy$default(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error error, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = error.canGoBackToMerchant;
                }
                return error.copy(z);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "", "<init>", "()V", "Initialize", "DeepLinkReceived", "OneShotAuthenticationSuccess", "AuthenticationRequired", "OneShotAuthenticationError", "NavigateToFallback", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$AuthenticationRequired;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$DeepLinkReceived;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$NavigateToFallback;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$OneShotAuthenticationError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$OneShotAuthenticationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Initialize extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.Initialize INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.Initialize();

            private Initialize() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$DeepLinkReceived;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "getUniversalLinkData", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DeepLinkReceived extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData;

            public DeepLinkReceived(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData) {
                super(null);
                this.universalLinkData = universalLinkData;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData getUniversalLinkData() {
                return this.universalLinkData;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$OneShotAuthenticationSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "result", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "universalLinkData", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "getResult", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "getUniversalLinkData", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OneShotAuthenticationSuccess extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult result;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid universalLinkData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OneShotAuthenticationSuccess(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotAuthenticationResult, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valid, "");
                this.result = oneShotAuthenticationResult;
                this.universalLinkData = valid;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult getResult() {
                return this.result;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid getUniversalLinkData() {
                return this.universalLinkData;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$AuthenticationRequired;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;)V", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "getCheckoutAuthenticationContext", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AuthenticationRequired extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthenticationRequired(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
                this.checkoutAuthenticationContext = checkoutAuthenticationContext;
            }

            public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
                return this.checkoutAuthenticationContext;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$OneShotAuthenticationError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "error", "", "canGoBackToMerchant", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;Z)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "getError", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Z", "getCanGoBackToMerchant", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class OneShotAuthenticationError extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event {
            public static final int $stable = 0;
            private final boolean canGoBackToMerchant;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OneShotAuthenticationError(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError checkoutURLError, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLError, "");
                this.error = checkoutURLError;
                this.canGoBackToMerchant = z;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError getError() {
                return this.error;
            }

            public final boolean getCanGoBackToMerchant() {
                return this.canGoBackToMerchant;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event$NavigateToFallback;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToFallback extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event {
            public static final int $stable = 8;
            private final android.net.Uri uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToFallback(android.net.Uri uri) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
                this.uri = uri;
            }

            public final android.net.Uri getUri() {
                return this.uri;
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect;", "", "<init>", "()V", "ReturnToMerchant", "NavigateToHome", "NavigateToNativeCheckout", "NavigateToWebViewCheckout", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToHome;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToNativeCheckout;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToWebViewCheckout;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$ReturnToMerchant;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$ReturnToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect;", "", "cancelUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$ReturnToMerchant;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCancelUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ReturnToMerchant extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect {
            public static final int $stable = 0;
            private final java.lang.String cancelUrl;

            public ReturnToMerchant(java.lang.String str) {
                super(null);
                this.cancelUrl = str;
            }

            public final java.lang.String getCancelUrl() {
                return this.cancelUrl;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.cancelUrl;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnToMerchant(cancelUrl=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.cancelUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelUrl, ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant) other).cancelUrl);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant copy(java.lang.String cancelUrl) {
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant(cancelUrl);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCancelUrl() {
                return this.cancelUrl;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant copy$default(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant returnToMerchant, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = returnToMerchant.cancelUrl;
                }
                return returnToMerchant.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToHome;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToHome extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToHome INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToHome();

            private NavigateToHome() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToNativeCheckout;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "authenticationXOResponse", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToNativeCheckout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthenticationXOResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToNativeCheckout extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse;

            public NavigateToNativeCheckout(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                this.authenticationXOResponse = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.authenticationXOResponse;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNativeCheckout(authenticationXOResponse=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.authenticationXOResponse;
                if (authenticationXOResponse == null) {
                    return 0;
                }
                return authenticationXOResponse.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationXOResponse, ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout) other).authenticationXOResponse);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout(authenticationXOResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout copy$default(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToNativeCheckout navigateToNativeCheckout, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToNativeCheckout.authenticationXOResponse;
                }
                return navigateToNativeCheckout.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToWebViewCheckout;", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "universalLinkData", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;)Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Effect$NavigateToWebViewCheckout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "getUniversalLinkData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToWebViewCheckout extends com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid universalLinkData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToWebViewCheckout(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valid, "");
                this.universalLinkData = valid;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid getUniversalLinkData() {
                return this.universalLinkData;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.universalLinkData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToWebViewCheckout(universalLinkData=");
                sb.append(valid);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.universalLinkData.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout) && kotlin.jvm.internal.Intrinsics.areEqual(this.universalLinkData, ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout) other).universalLinkData);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout copy(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid universalLinkData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalLinkData, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout(universalLinkData);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid getUniversalLinkData() {
                return this.universalLinkData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout copy$default(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToWebViewCheckout navigateToWebViewCheckout, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    valid = navigateToWebViewCheckout.universalLinkData;
                }
                return navigateToWebViewCheckout.copy(valid);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
