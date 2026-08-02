package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebViewContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract();

    private WebViewContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "state", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "getState", "ViewState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState state;

        public State(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState, "");
            this.state = viewState;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Idle idle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Idle.INSTANCE : idle);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState getState() {
            return this.state;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "", "<init>", "()V", "Idle", "Loading", "Success", "NonRecoverableError", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Idle;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Loading;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$NonRecoverableError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class ViewState {
            public static final int $stable = 0;

            private ViewState() {
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Idle;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Idle extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Idle INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Idle();

                private Idle() {
                    super(null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Loading;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "settings", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "getSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Loading extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState {
                public static final int $stable = 8;
                private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings settings;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Loading(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings) {
                    super(null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSettings, "");
                    this.settings = loadingSettings;
                }

                public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings getSettings() {
                    return this.settings;
                }

                public final java.lang.String toString() {
                    com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings = this.settings;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(settings=");
                    sb.append(loadingSettings);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.settings.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.settings, ((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading) other).settings);
                }

                public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading copy(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings settings) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
                    return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading(settings);
                }

                /* renamed from: component1, reason: from getter */
                public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings getSettings() {
                    return this.settings;
                }

                public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading loading, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        loadingSettings = loading.settings;
                    }
                    return loading.copy(loadingSettings);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$Success;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "", "", "additionalHttpHeaders", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "loadingSettings", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;Ljava/util/Map;Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "getCheckoutURLs", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "Ljava/util/Map;", "getAdditionalHttpHeaders", "()Ljava/util/Map;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "getLoadingSettings", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Success extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState {
                public static final int $stable = 8;
                private final java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders;
                private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs;
                private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Success(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, java.util.Map<java.lang.String, java.lang.String> map, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings) {
                    super(null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSettings, "");
                    this.checkoutURLs = checkoutURLs;
                    this.additionalHttpHeaders = map;
                    this.loadingSettings = loadingSettings;
                }

                public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getCheckoutURLs() {
                    return this.checkoutURLs;
                }

                public final java.util.Map<java.lang.String, java.lang.String> getAdditionalHttpHeaders() {
                    return this.additionalHttpHeaders;
                }

                public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings getLoadingSettings() {
                    return this.loadingSettings;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState$NonRecoverableError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "", "canGoBackToMerchant", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "merchantDetails", "<init>", "(ZLcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;)V", "Z", "getCanGoBackToMerchant", "()Z", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "getMerchantDetails", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class NonRecoverableError extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState {
                public static final int $stable = 0;
                private final boolean canGoBackToMerchant;
                private final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails;

                public NonRecoverableError(boolean z, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails) {
                    super(null);
                    this.canGoBackToMerchant = z;
                    this.merchantDetails = merchantDetails;
                }

                public final boolean getCanGoBackToMerchant() {
                    return this.canGoBackToMerchant;
                }

                public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getMerchantDetails() {
                    return this.merchantDetails;
                }
            }

            public /* synthetic */ ViewState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState = this.state;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(state=");
            sb.append(viewState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.state.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State) other).state);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State copy(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State(state);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState getState() {
            return this.state;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State state, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                viewState = state.state;
            }
            return state.copy(viewState);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "", "<init>", "()V", "Initialize", "ReadyForCheckout", "ShowError", "SafeCancel", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$ReadyForCheckout;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$SafeCancel;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$ShowError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Initialize extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.Initialize INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.Initialize();

            private Initialize() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$ReadyForCheckout;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "merchantDetails", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "getCheckoutURLs", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "getMerchantDetails", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ReadyForCheckout extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails;

            public ReadyForCheckout(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails) {
                super(null);
                this.checkoutURLs = checkoutURLs;
                this.merchantDetails = merchantDetails;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getCheckoutURLs() {
                return this.checkoutURLs;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getMerchantDetails() {
                return this.merchantDetails;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$ShowError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "", "canGoBackToMerchant", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "merchantDetails", "<init>", "(ZLcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;)V", "Z", "getCanGoBackToMerchant", "()Z", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "getMerchantDetails", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ShowError extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event {
            public static final int $stable = 0;
            private final boolean canGoBackToMerchant;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails;

            public ShowError(boolean z, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails) {
                super(null);
                this.canGoBackToMerchant = z;
                this.merchantDetails = merchantDetails;
            }

            public final boolean getCanGoBackToMerchant() {
                return this.canGoBackToMerchant;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getMerchantDetails() {
                return this.merchantDetails;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event$SafeCancel;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SafeCancel extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.SafeCancel INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.SafeCancel();

            private SafeCancel() {
                super(null);
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "", "<init>", "()V", "ReturnToMerchantAutomatically", "ForceCanceling", "NavigateToCheckoutAuthentication", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$ForceCanceling;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$NavigateToCheckoutAuthentication;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$ReturnToMerchantAutomatically;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$ReturnToMerchantAutomatically;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "action", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$ReturnToMerchantAutomatically;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ReturnToMerchantAutomatically extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReturnToMerchantAutomatically(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent runIntent) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runIntent, "");
                this.action = runIntent;
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent getAction() {
                return this.action;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent runIntent = this.action;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnToMerchantAutomatically(action=");
                sb.append(runIntent);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, ((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically) other).action);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically copy(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent action) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
                return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically(action);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent getAction() {
                return this.action;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically returnToMerchantAutomatically, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent runIntent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    runIntent = returnToMerchantAutomatically.action;
                }
                return returnToMerchantAutomatically.copy(runIntent);
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$ForceCanceling;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ForceCanceling extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ForceCanceling INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ForceCanceling();

            private ForceCanceling() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$NavigateToCheckoutAuthentication;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "component2-QDVFmTU", "()Ljava/lang/String;", "component2", "copy-hN0UB1M", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$NavigateToCheckoutAuthentication;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "getCheckoutAuthenticationContext", "Ljava/lang/String;", "getRequestId-QDVFmTU"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToCheckoutAuthentication extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext;
            private final java.lang.String requestId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private NavigateToCheckoutAuthentication(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.checkoutAuthenticationContext = checkoutAuthenticationContext;
                this.requestId = str;
            }

            public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
                return this.checkoutAuthenticationContext;
            }

            /* renamed from: getRequestId-QDVFmTU, reason: not valid java name */
            public final java.lang.String m15446getRequestIdQDVFmTU() {
                return this.requestId;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext = this.checkoutAuthenticationContext;
                java.lang.String m11591toStringimpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.requestId);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCheckoutAuthentication(checkoutAuthenticationContext=");
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
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication navigateToCheckoutAuthentication = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutAuthenticationContext, navigateToCheckoutAuthentication.checkoutAuthenticationContext) && com.paypal.oslo.core.navigation.result.NavResultRequestId.m11589equalsimpl0(this.requestId, navigateToCheckoutAuthentication.requestId);
            }

            /* renamed from: copy-hN0UB1M, reason: not valid java name */
            public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication m15445copyhN0UB1M(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String requestId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
                return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication(checkoutAuthenticationContext, requestId, null);
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
            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication m15443copyhN0UB1M$default(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication navigateToCheckoutAuthentication, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    checkoutAuthenticationContext = navigateToCheckoutAuthentication.checkoutAuthenticationContext;
                }
                if ((i & 2) != 0) {
                    str = navigateToCheckoutAuthentication.requestId;
                }
                return navigateToCheckoutAuthentication.m15445copyhN0UB1M(checkoutAuthenticationContext, str);
            }

            public /* synthetic */ NavigateToCheckoutAuthentication(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(checkoutAuthenticationContext, str);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
