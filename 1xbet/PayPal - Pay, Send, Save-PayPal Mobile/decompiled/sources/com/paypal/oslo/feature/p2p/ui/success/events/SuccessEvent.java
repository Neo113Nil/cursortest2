package com.paypal.oslo.feature.p2p.ui.success.events;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "InitializationSucceeded", "InitializationFailed", "SharePaymentLink", "AttemptLeave", "DismissShareConfirmationSheet", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$AttemptLeave;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$DismissShareConfirmationSheet;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$InitializationFailed;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$InitializationSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$SharePaymentLink;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SuccessEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SuccessEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "successState", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;)Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "getSuccessState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
            this.successState = successState;
        }

        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState getSuccessState() {
            return this.successState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState = this.successState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(successState=");
            sb.append(successState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.successState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.successState, ((com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize) other).successState);
        }

        public final com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize copy(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
            return new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize(successState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState getSuccessState() {
            return this.successState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize copy$default(com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize initialize, com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                successState = initialize.successState;
            }
            return initialize.copy(successState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$InitializationSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "successState", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;)Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$InitializationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessState;", "getSuccessState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializationSucceeded extends com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializationSucceeded(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState) {
            super("InitializationSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
            this.successState = successState;
        }

        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState getSuccessState() {
            return this.successState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState = this.successState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializationSucceeded(successState=");
            sb.append(successState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.successState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.successState, ((com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded) other).successState);
        }

        public final com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded copy(com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successState, "");
            return new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded(successState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.success.state.SuccessState getSuccessState() {
            return this.successState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded copy$default(com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded initializationSucceeded, com.paypal.oslo.feature.p2p.ui.success.state.SuccessState successState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                successState = initializationSucceeded.successState;
            }
            return initializationSucceeded.copy(successState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$InitializationFailed;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$InitializationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializationFailed extends com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        public InitializationFailed(java.lang.String str) {
            super("InitializationFailed", null);
            this.errorMessage = str;
        }

        public /* synthetic */ InitializationFailed(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializationFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed copy(java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed copy$default(com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed initializationFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initializationFailed.errorMessage;
            }
            return initializationFailed.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InitializationFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$SharePaymentLink;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SharePaymentLink extends com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.SharePaymentLink INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.SharePaymentLink();

        public final int hashCode() {
            return -659470409;
        }

        private SharePaymentLink() {
            super("SharePaymentLink", null);
        }

        public final java.lang.String toString() {
            return "SharePaymentLink";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.SharePaymentLink)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$AttemptLeave;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AttemptLeave extends com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.AttemptLeave INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.AttemptLeave();

        public final int hashCode() {
            return 741674208;
        }

        private AttemptLeave() {
            super("AttemptLeave", null);
        }

        public final java.lang.String toString() {
            return "AttemptLeave";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.AttemptLeave)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent$DismissShareConfirmationSheet;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissShareConfirmationSheet extends com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.DismissShareConfirmationSheet INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.DismissShareConfirmationSheet();

        public final int hashCode() {
            return 1594097919;
        }

        private DismissShareConfirmationSheet() {
            super("DismissShareConfirmationSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissShareConfirmationSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.DismissShareConfirmationSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SuccessEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
