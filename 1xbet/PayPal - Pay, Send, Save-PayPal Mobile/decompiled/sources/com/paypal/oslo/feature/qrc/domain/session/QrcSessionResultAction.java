package com.paypal.oslo.feature.qrc.domain.session;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction;", "", "<init>", "()V", "Action", "Error", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class QrcSessionResultAction {
    public static final int $stable = 0;

    private QrcSessionResultAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction;", "<init>", "()V", "", "isTerminalPollingEvent", "()Z", "PollForQrcSessionAction", "ProcessPaymentAction", "LaunchEnrolmentFlow", "Redirect", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$LaunchEnrolmentFlow;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$PollForQrcSessionAction;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$ProcessPaymentAction;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$Redirect;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Action extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction {
        public static final int $stable = 0;

        private Action() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$PollForQrcSessionAction;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "pollingSessionInfo", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;)Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$PollForQrcSessionAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "getPollingSessionInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PollForQrcSessionAction extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PollForQrcSessionAction(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingSessionInfo, "");
                this.pollingSessionInfo = pollingSessionInfo;
            }

            public final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo getPollingSessionInfo() {
                return this.pollingSessionInfo;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo = this.pollingSessionInfo;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PollForQrcSessionAction(pollingSessionInfo=");
                sb.append(pollingSessionInfo);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.pollingSessionInfo.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.pollingSessionInfo, ((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction) other).pollingSessionInfo);
            }

            public final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction copy(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollingSessionInfo, "");
                return new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction(pollingSessionInfo);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo getPollingSessionInfo() {
                return this.pollingSessionInfo;
            }

            public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction copy$default(com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction pollForQrcSessionAction, com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    pollingSessionInfo = pollForQrcSessionAction.pollingSessionInfo;
                }
                return pollForQrcSessionAction.copy(pollingSessionInfo);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$ProcessPaymentAction;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "qrcPaymentAmountNavArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$ProcessPaymentAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getQrcPaymentAmountNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ProcessPaymentAction extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcPaymentAmountNavArgs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProcessPaymentAction(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
                this.qrcPaymentAmountNavArgs = qrcSessionNavArgs;
            }

            public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getQrcPaymentAmountNavArgs() {
                return this.qrcPaymentAmountNavArgs;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.qrcPaymentAmountNavArgs;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessPaymentAction(qrcPaymentAmountNavArgs=");
                sb.append(qrcSessionNavArgs);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.qrcPaymentAmountNavArgs.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrcPaymentAmountNavArgs, ((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) other).qrcPaymentAmountNavArgs);
            }

            public final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcPaymentAmountNavArgs) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPaymentAmountNavArgs, "");
                return new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction(qrcPaymentAmountNavArgs);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getQrcPaymentAmountNavArgs() {
                return this.qrcPaymentAmountNavArgs;
            }

            public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction copy$default(com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction processPaymentAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    qrcSessionNavArgs = processPaymentAction.qrcPaymentAmountNavArgs;
                }
                return processPaymentAction.copy(qrcSessionNavArgs);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$LaunchEnrolmentFlow;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$LaunchEnrolmentFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LaunchEnrolmentFlow extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LaunchEnrolmentFlow(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
                this.navArgs = qrcSessionNavArgs;
            }

            public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
                return this.navArgs;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchEnrolmentFlow(navArgs=");
                sb.append(qrcSessionNavArgs);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.navArgs.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow) other).navArgs);
            }

            public final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
                return new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow(navArgs);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
                return this.navArgs;
            }

            public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow copy$default(com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.LaunchEnrolmentFlow launchEnrolmentFlow, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    qrcSessionNavArgs = launchEnrolmentFlow.navArgs;
                }
                return launchEnrolmentFlow.copy(qrcSessionNavArgs);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action$Redirect;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Redirect extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.Redirect INSTANCE = new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.Redirect();

            public final int hashCode() {
                return 1937907346;
            }

            private Redirect() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Redirect";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.Redirect)) {
                    return false;
                }
                return true;
            }
        }

        public final boolean isTerminalPollingEvent() {
            return !(this instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.PollForQrcSessionAction);
        }

        public /* synthetic */ Action(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction;", "<init>", "()V", "", "isRecoverable", "()Z", "GenericError", "NoInternetError", "UnSupportedResultAction", "TimeoutError", "ValidationError", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$GenericError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$NoInternetError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$TimeoutError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$UnSupportedResultAction;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$GenericError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class GenericError extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.GenericError INSTANCE = new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.GenericError();

            private GenericError() {
                super(null);
            }
        }

        private Error() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$NoInternetError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NoInternetError extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.NoInternetError INSTANCE = new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.NoInternetError();

            private NoInternetError() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$UnSupportedResultAction;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class UnSupportedResultAction extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.UnSupportedResultAction INSTANCE = new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.UnSupportedResultAction();

            private UnSupportedResultAction() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$TimeoutError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TimeoutError extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.TimeoutError INSTANCE = new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.TimeoutError();

            public final int hashCode() {
                return -576807729;
            }

            private TimeoutError() {
                super(null);
            }

            public final java.lang.String toString() {
                return "TimeoutError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.TimeoutError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$ValidationError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "", "reason", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;)Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", "getIssue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ValidationError extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue issue;
            private final java.lang.String reason;

            public ValidationError(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue) {
                super(null);
                this.reason = str;
                this.issue = qrcSessionErrorIssue;
            }

            public /* synthetic */ ValidationError(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : qrcSessionErrorIssue);
            }

            public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue getIssue() {
                return this.issue;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.reason;
                com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue = this.issue;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(reason=");
                sb.append(str);
                sb.append(", issue=");
                sb.append(qrcSessionErrorIssue);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.reason;
                int hashCode = str == null ? 0 : str.hashCode();
                com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue = this.issue;
                return (hashCode * 31) + (qrcSessionErrorIssue != null ? qrcSessionErrorIssue.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError)) {
                    return false;
                }
                com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError validationError = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, validationError.reason) && this.issue == validationError.issue;
            }

            public final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError copy(java.lang.String reason, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue issue) {
                return new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError(reason, issue);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue getIssue() {
                return this.issue;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError copy$default(com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError validationError, java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = validationError.reason;
                }
                if ((i & 2) != 0) {
                    qrcSessionErrorIssue = validationError.issue;
                }
                return validationError.copy(str, qrcSessionErrorIssue);
            }
        }

        public final boolean isRecoverable() {
            return this instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.NoInternetError;
        }

        public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QrcSessionResultAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
