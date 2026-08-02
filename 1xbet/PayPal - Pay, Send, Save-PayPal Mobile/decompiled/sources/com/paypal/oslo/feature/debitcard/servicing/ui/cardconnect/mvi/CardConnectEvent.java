package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CreateSessionLoading", "CreateSessionSuccess", "CreateSessionFailed", "KnotSdkLaunched", "KnotSdkSuccess", "KnotSdkError", "KnotSdkExit", "KnotSdkEvent", "RetryClicked", "DismissClicked", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionLoading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$DismissClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkExit;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkLaunched;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$RetryClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CardConnectEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CardConnectEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionLoading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateSessionLoading extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionLoading INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionLoading();

        public final int hashCode() {
            return -639333965;
        }

        private CreateSessionLoading() {
            super("CreateSessionLoading", null);
        }

        public final java.lang.String toString() {
            return "CreateSessionLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "session", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "getSession"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateSessionSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateSessionSuccess(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession) {
            super("CreateSessionSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectSession, "");
            this.session = cardConnectSession;
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession getSession() {
            return this.session;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession = this.session;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateSessionSuccess(session=");
            sb.append(cardConnectSession);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.session.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess) other).session);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess copy(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess(session);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession getSession() {
            return this.session;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess createSessionSuccess, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardConnectSession = createSessionSuccess.session;
            }
            return createSessionSuccess.copy(cardConnectSession);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "errorInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$CreateSessionFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "getErrorInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateSessionFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateSessionFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo) {
            super("CreateSessionFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            this.errorType = debitErrorType;
            this.errorInfo = errorInfo;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo = this.errorInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateSessionFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorInfo=");
            sb.append(errorInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + this.errorInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed createSessionFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed) other;
            return this.errorType == createSessionFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorInfo, createSessionFailed.errorInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed(errorType, errorInfo);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed createSessionFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = createSessionFailed.errorType;
            }
            if ((i & 2) != 0) {
                errorInfo = createSessionFailed.errorInfo;
            }
            return createSessionFailed.copy(debitErrorType, errorInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkLaunched;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotSdkLaunched extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkLaunched INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkLaunched();

        public final int hashCode() {
            return 1534683091;
        }

        private KnotSdkLaunched() {
            super("KnotSdkLaunched", null);
        }

        public final java.lang.String toString() {
            return "KnotSdkLaunched";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkLaunched)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "", "merchantId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotSdkSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String merchantId;

        public KnotSdkSuccess(java.lang.String str) {
            super("KnotSdkSuccess", null);
            this.merchantId = str;
        }

        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KnotSdkSuccess(merchantId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.merchantId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess) other).merchantId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess copy(java.lang.String merchantId) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess(merchantId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess knotSdkSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = knotSdkSuccess.merchantId;
            }
            return knotSdkSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "", "errorCode", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotSdkError extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnotSdkError(java.lang.String str, java.lang.String str2) {
            super("KnotSdkError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
            this.errorDescription = str2;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KnotSdkError(errorCode=");
            sb.append(str);
            sb.append(", errorDescription=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            java.lang.String str = this.errorDescription;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError knotSdkError = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, knotSdkError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, knotSdkError.errorDescription);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError copy(java.lang.String errorCode, java.lang.String errorDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError(errorCode, errorDescription);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError knotSdkError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = knotSdkError.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = knotSdkError.errorDescription;
            }
            return knotSdkError.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkExit;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotSdkExit extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkExit INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkExit();

        public final int hashCode() {
            return 1798986207;
        }

        private KnotSdkExit() {
            super("KnotSdkExit", null);
        }

        public final java.lang.String toString() {
            return "KnotSdkExit";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkExit)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JV\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "", "event", "merchantName", "merchantId", "taskId", "", "metaData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$KnotSdkEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEvent", "getMerchantName", "getMerchantId", "getTaskId", "Ljava/util/Map;", "getMetaData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotSdkEvent extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 8;
        private final java.lang.String event;
        private final java.lang.String merchantId;
        private final java.lang.String merchantName;
        private final java.util.Map<java.lang.String, java.lang.String> metaData;
        private final java.lang.String taskId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnotSdkEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
            super("KnotSdkEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.event = str;
            this.merchantName = str2;
            this.merchantId = str3;
            this.taskId = str4;
            this.metaData = map;
        }

        public final java.lang.String getEvent() {
            return this.event;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public final java.lang.String getTaskId() {
            return this.taskId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getMetaData() {
            return this.metaData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.event;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.merchantId;
            java.lang.String str4 = this.taskId;
            java.util.Map<java.lang.String, java.lang.String> map = this.metaData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KnotSdkEvent(event=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", merchantId=");
            sb.append(str3);
            sb.append(", taskId=");
            sb.append(str4);
            sb.append(", metaData=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.event.hashCode();
            java.lang.String str = this.merchantName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.merchantId;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.taskId;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.metaData;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (map != null ? map.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent knotSdkEvent = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.event, knotSdkEvent.event) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, knotSdkEvent.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, knotSdkEvent.merchantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.taskId, knotSdkEvent.taskId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, knotSdkEvent.metaData);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent copy(java.lang.String event, java.lang.String merchantName, java.lang.String merchantId, java.lang.String taskId, java.util.Map<java.lang.String, java.lang.String> metaData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent(event, merchantName, merchantId, taskId, metaData);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component5() {
            return this.metaData;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTaskId() {
            return this.taskId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEvent() {
            return this.event;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent knotSdkEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = knotSdkEvent.event;
            }
            if ((i & 2) != 0) {
                str2 = knotSdkEvent.merchantName;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = knotSdkEvent.merchantId;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = knotSdkEvent.taskId;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                map = knotSdkEvent.metaData;
            }
            return knotSdkEvent.copy(str, str5, str6, str7, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$RetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.RetryClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.RetryClicked();

        public final int hashCode() {
            return 808328496;
        }

        private RetryClicked() {
            super("RetryClicked", null);
        }

        public final java.lang.String toString() {
            return "RetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.RetryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent$DismissClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.DismissClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.DismissClicked();

        public final int hashCode() {
            return -514499890;
        }

        private DismissClicked() {
            super("DismissClicked", null);
        }

        public final java.lang.String toString() {
            return "DismissClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.DismissClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CardConnectEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
