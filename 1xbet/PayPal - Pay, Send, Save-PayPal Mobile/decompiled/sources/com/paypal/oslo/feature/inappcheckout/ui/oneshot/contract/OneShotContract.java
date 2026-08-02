package com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract;", "", "<init>", "()V", "State", "Event", "Effect", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneShotContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract();

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;", "", "", "isLoading", "isAuthenticating", "isRetrying", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "error", "<init>", "(ZZZLcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;)V", "component1", "()Z", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "copy", "(ZZZLcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error;
        private final boolean isAuthenticating;
        private final boolean isLoading;
        private final boolean isRetrying;

        public State(boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error) {
            this.isLoading = z;
            this.isAuthenticating = z2;
            this.isRetrying = z3;
            this.error = error;
        }

        public /* synthetic */ State(boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : error);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isAuthenticating() {
            return this.isAuthenticating;
        }

        public final boolean isRetrying() {
            return this.isRetrying;
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            boolean z = this.isLoading;
            boolean z2 = this.isAuthenticating;
            boolean z3 = this.isRetrying;
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(isLoading=");
            sb.append(z);
            sb.append(", isAuthenticating=");
            sb.append(z2);
            sb.append(", isRetrying=");
            sb.append(z3);
            sb.append(", error=");
            sb.append(error);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isLoading);
            int hashCode2 = java.lang.Boolean.hashCode(this.isAuthenticating);
            int hashCode3 = java.lang.Boolean.hashCode(this.isRetrying);
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error = this.error;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (error == null ? 0 : error.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State) other;
            return this.isLoading == state.isLoading && this.isAuthenticating == state.isAuthenticating && this.isRetrying == state.isRetrying && kotlin.jvm.internal.Intrinsics.areEqual(this.error, state.error);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State copy(boolean isLoading, boolean isAuthenticating, boolean isRetrying, com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error) {
            return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State(isLoading, isAuthenticating, isRetrying, error);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error getError() {
            return this.error;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRetrying() {
            return this.isRetrying;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAuthenticating() {
            return this.isAuthenticating;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State state, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error error, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = state.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = state.isAuthenticating;
            }
            if ((i & 4) != 0) {
                z3 = state.isRetrying;
            }
            if ((i & 8) != 0) {
                error = state.error;
            }
            return state.copy(z, z2, z3, error);
        }

        public State() {
            this(false, false, false, null, 15, null);
        }
    }

    private OneShotContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;", "", "<init>", "()V", "Initialize", "RetryAuthentication", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event$RetryAuthentication;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialize extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response;

            public Initialize(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                this.response = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.response;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(response=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.response;
                if (authenticationXOResponse == null) {
                    return 0;
                }
                return authenticationXOResponse.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize) other).response);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
                return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize(response);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
                return this.response;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize initialize, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = initialize.response;
                }
                return initialize.copy(authenticationXOResponse);
            }
        }

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event$RetryAuthentication;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RetryAuthentication extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.RetryAuthentication INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.RetryAuthentication();

            public final int hashCode() {
                return 351282879;
            }

            private RetryAuthentication() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RetryAuthentication";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.RetryAuthentication)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "", "<init>", "()V", "NavigateToRyp", "NavigateToEConsent", "NavigateToInstantVaultScreen", "NavigateToWebFlow", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToInstantVaultScreen;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToWebFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "authenticationXOResponse", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToRyp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthenticationXOResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToRyp extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToRyp(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.authenticationXOResponse = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.authenticationXOResponse;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRyp(authenticationXOResponse=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.authenticationXOResponse.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationXOResponse, ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp) other).authenticationXOResponse);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp(authenticationXOResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp navigateToRyp, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToRyp.authenticationXOResponse;
                }
                return navigateToRyp.copy(authenticationXOResponse);
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "authenticationXOResponse", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToEConsent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthenticationXOResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToEConsent extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToEConsent(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.authenticationXOResponse = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.authenticationXOResponse;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEConsent(authenticationXOResponse=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.authenticationXOResponse.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationXOResponse, ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent) other).authenticationXOResponse);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent(authenticationXOResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent navigateToEConsent, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToEConsent.authenticationXOResponse;
                }
                return navigateToEConsent.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToInstantVaultScreen;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "authenticationXOResponse", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToInstantVaultScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthenticationXOResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToInstantVaultScreen extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToInstantVaultScreen(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                this.authenticationXOResponse = authenticationXOResponse;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.authenticationXOResponse;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToInstantVaultScreen(authenticationXOResponse=");
                sb.append(authenticationXOResponse);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.authenticationXOResponse.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationXOResponse, ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen) other).authenticationXOResponse);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen(authenticationXOResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getAuthenticationXOResponse() {
                return this.authenticationXOResponse;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen navigateToInstantVaultScreen, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationXOResponse = navigateToInstantVaultScreen.authenticationXOResponse;
                }
                return navigateToInstantVaultScreen.copy(authenticationXOResponse);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToWebFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToWebFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToWebFlow extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect {
            public static final int $stable = 0;
            private final java.lang.String authCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToWebFlow(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.authCode = str;
            }

            public final java.lang.String getAuthCode() {
                return this.authCode;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.authCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToWebFlow(authCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.authCode.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.authCode, ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow) other).authCode);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow copy(java.lang.String authCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCode, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow(authCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAuthCode() {
                return this.authCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToWebFlow navigateToWebFlow, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = navigateToWebFlow.authCode;
                }
                return navigateToWebFlow.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "errorScreenType", "", "returnUrl", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect$NavigateToError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "getErrorScreenType", "Ljava/lang/String;", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToError extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType;
            private final java.lang.String returnUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToError(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
                this.errorScreenType = errorScreenType;
                this.returnUrl = str;
            }

            public /* synthetic */ NavigateToError(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(errorScreenType, (i & 2) != 0 ? null : str);
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getErrorScreenType() {
                return this.errorScreenType;
            }

            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType = this.errorScreenType;
                java.lang.String str = this.returnUrl;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToError(errorScreenType=");
                sb.append(errorScreenType);
                sb.append(", returnUrl=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorScreenType.hashCode();
                java.lang.String str = this.returnUrl;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError navigateToError = (com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError) other;
                return this.errorScreenType == navigateToError.errorScreenType && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, navigateToError.returnUrl);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError copy(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String returnUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError(errorScreenType, returnUrl);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getErrorScreenType() {
                return this.errorScreenType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError copy$default(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError navigateToError, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    errorScreenType = navigateToError.errorScreenType;
                }
                if ((i & 2) != 0) {
                    str = navigateToError.returnUrl;
                }
                return navigateToError.copy(errorScreenType, str);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "", "<init>", "()V", "AuthenticationFailed", "ApiError", "GenericError", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error$ApiError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error$AuthenticationFailed;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error$GenericError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error$AuthenticationFailed;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AuthenticationFailed extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.AuthenticationFailed INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.AuthenticationFailed();

            public final int hashCode() {
                return 1162423944;
            }

            private AuthenticationFailed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AuthenticationFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.AuthenticationFailed)) {
                    return false;
                }
                return true;
            }
        }

        private Error() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error$ApiError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApiError extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.ApiError INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.ApiError();

            public final int hashCode() {
                return 609411649;
            }

            private ApiError() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ApiError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.ApiError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error$GenericError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GenericError extends com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.GenericError INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.GenericError();

            public final int hashCode() {
                return 1126321956;
            }

            private GenericError() {
                super(null);
            }

            public final java.lang.String toString() {
                return "GenericError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Error.GenericError)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
