package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "OnInitialized", "OnNetworkError", "OnAccountsLinked", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$Initialize;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnAccountsLinked;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnInitialized;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AccountLinkingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AccountLinkingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$Initialize;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.Initialize INSTANCE = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.Initialize();

        public final int hashCode() {
            return 1288399936;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnInitialized;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;", "copy", "(Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;)Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitialized extends com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInitialized(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel accountLinkingUiModel) {
            super("OnInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountLinkingUiModel, "");
            this.uiModel = accountLinkingUiModel;
        }

        public final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel accountLinkingUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInitialized(uiModel=");
            sb.append(accountLinkingUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized) other).uiModel);
        }

        public final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized copy(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized copy$default(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized onInitialized, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel accountLinkingUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountLinkingUiModel = onInitialized.uiModel;
            }
            return onInitialized.copy(accountLinkingUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnNetworkError;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNetworkError extends com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnNetworkError INSTANCE = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnNetworkError();

        public final int hashCode() {
            return -597030743;
        }

        private OnNetworkError() {
            super("OnNetworkError", null);
        }

        public final java.lang.String toString() {
            return "OnNetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnNetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent$OnAccountsLinked;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAccountsLinked extends com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnAccountsLinked INSTANCE = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnAccountsLinked();

        public final int hashCode() {
            return 979914254;
        }

        private OnAccountsLinked() {
            super("OnAccountsLinked", null);
        }

        public final java.lang.String toString() {
            return "OnAccountsLinked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnAccountsLinked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AccountLinkingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
