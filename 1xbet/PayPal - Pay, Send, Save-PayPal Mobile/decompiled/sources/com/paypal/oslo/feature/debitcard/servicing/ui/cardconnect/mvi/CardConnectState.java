package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "Loading", "SessionCreated", "KnotSdkActive", "SessionCreationFailed", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$KnotSdkActive;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$SessionCreated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$SessionCreationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CardConnectState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private CardConnectState() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final int retryCount;

        public Loading(int i) {
            super(null);
            this.retryCount = i;
            this.name = "Loading";
        }

        public /* synthetic */ Loading(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading) && this.retryCount == ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading) other).retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading copy(int retryCount) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading(retryCount);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading loading, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(i);
        }

        public Loading() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$SessionCreated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "session", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$SessionCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "getSession", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionCreated extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState {
        public static final int $stable = 8;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionCreated(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectSession, "");
            this.session = cardConnectSession;
            this.name = "SessionCreated";
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession getSession() {
            return this.session;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession = this.session;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionCreated(session=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated) other).session);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated copy(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated(session);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession getSession() {
            return this.session;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated sessionCreated, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardConnectSession = sessionCreated.session;
            }
            return sessionCreated.copy(cardConnectSession);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$KnotSdkActive;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotSdkActive extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive();
        private static final java.lang.String name = "KnotSdkActive";

        public final int hashCode() {
            return -148174530;
        }

        private KnotSdkActive() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "KnotSdkActive";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00188\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$SessionCreationFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "errorInfo", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;I)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState$SessionCreationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "getErrorInfo", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionCreationFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.String name;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionCreationFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            this.errorType = debitErrorType;
            this.errorInfo = errorInfo;
            this.retryCount = i;
            this.name = "SessionCreationFailed";
        }

        public /* synthetic */ SessionCreationFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, errorInfo, (i2 & 4) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo = this.errorInfo;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionCreationFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorInfo=");
            sb.append(errorInfo);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorType.hashCode() * 31) + this.errorInfo.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed sessionCreationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed) other;
            return this.errorType == sessionCreationFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorInfo, sessionCreationFailed.errorInfo) && this.retryCount == sessionCreationFailed.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed(errorType, errorInfo, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed sessionCreationFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitErrorType = sessionCreationFailed.errorType;
            }
            if ((i2 & 2) != 0) {
                errorInfo = sessionCreationFailed.errorInfo;
            }
            if ((i2 & 4) != 0) {
                i = sessionCreationFailed.retryCount;
            }
            return sessionCreationFailed.copy(debitErrorType, errorInfo, i);
        }
    }

    public /* synthetic */ CardConnectState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
