package com.paypal.oslo.feature.inappcheckout.ui.error.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "errorScreenType", "", "returnUrl", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$State;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "getErrorScreenType", "Ljava/lang/String;", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType;
        private final java.lang.String returnUrl;

        public State(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
            this.errorScreenType = errorScreenType;
            this.returnUrl = str;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE : errorScreenType, (i & 2) != 0 ? null : str);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(errorScreenType=");
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
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State) other;
            return this.errorScreenType == state.errorScreenType && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, state.returnUrl);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State copy(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String returnUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
            return new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State(errorScreenType, returnUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getErrorScreenType() {
            return this.errorScreenType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State copy$default(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State state, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorScreenType = state.errorScreenType;
            }
            if ((i & 2) != 0) {
                str = state.returnUrl;
            }
            return state.copy(errorScreenType, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    private ErrorContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;", "", "<init>", "()V", "Retry", "ReturnToMerchant", "CheckAccount", "ContactUs", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$CheckAccount;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$ContactUs;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$Retry;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$ReturnToMerchant;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$Retry;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Retry extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.Retry INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.Retry();

            public final int hashCode() {
                return -1929117113;
            }

            private Retry() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Retry";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.Retry)) {
                    return false;
                }
                return true;
            }
        }

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$ReturnToMerchant;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ReturnToMerchant extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ReturnToMerchant INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ReturnToMerchant();

            public final int hashCode() {
                return 1434412468;
            }

            private ReturnToMerchant() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ReturnToMerchant";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ReturnToMerchant)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$CheckAccount;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CheckAccount extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.CheckAccount INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.CheckAccount();

            public final int hashCode() {
                return -772136058;
            }

            private CheckAccount() {
                super(null);
            }

            public final java.lang.String toString() {
                return "CheckAccount";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.CheckAccount)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event$ContactUs;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ContactUs extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ContactUs INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ContactUs();

            public final int hashCode() {
                return -1362780419;
            }

            private ContactUs() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ContactUs";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ContactUs)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect;", "", "<init>", "()V", "NavigateBackWithRetry", "NavigateBack", "NavigateToNativeInAppWebView", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateBackWithRetry;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateToNativeInAppWebView;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateBackWithRetry;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateBackWithRetry extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateBackWithRetry INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateBackWithRetry();

            public final int hashCode() {
                return -853728774;
            }

            private NavigateBackWithRetry() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NavigateBackWithRetry";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateBackWithRetry)) {
                    return false;
                }
                return true;
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateBack INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateBack();

            public final int hashCode() {
                return -1135345560;
            }

            private NavigateBack() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NavigateBack";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateBack)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect$NavigateToNativeInAppWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToNativeInAppWebView extends com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToNativeInAppWebView(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewData, "");
                this.data = nativeInAppWebViewData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNativeInAppWebView(data=");
                sb.append(nativeInAppWebViewData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateToNativeInAppWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateToNativeInAppWebView) other).data);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateToNativeInAppWebView copy(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateToNativeInAppWebView(data);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateToNativeInAppWebView copy$default(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect.NavigateToNativeInAppWebView navigateToNativeInAppWebView, com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeInAppWebViewData = navigateToNativeInAppWebView.data;
                }
                return navigateToNativeInAppWebView.copy(nativeInAppWebViewData);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
