package com.paypal.oslo.feature.smartroute.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "Initial", "Loading", "Content", "Error", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Content;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Error;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Initial;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DistributionState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private DistributionState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Initial;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Initial INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Initial();

        public final int hashCode() {
            return -149043368;
        }

        private Initial() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Loading;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Loading INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Loading();

        public final int hashCode() {
            return -1760734896;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Content;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "screenState", "<init>", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "copy", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "getScreenState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionScreenState, "");
            this.screenState = distributionScreenState;
        }

        public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getScreenState() {
            return this.screenState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState = this.screenState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(screenState=");
            sb.append(distributionScreenState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.screenState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenState, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) other).screenState);
        }

        public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content copy(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
            return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content(screenState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getScreenState() {
            return this.screenState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                distributionScreenState = content.screenState;
            }
            return content.copy(distributionScreenState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0011\u0010!\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Error;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "", "message", "", "retryCount", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;", "errorType", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;", "copy", "(Ljava/lang/String;ILcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getMessage", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;", "getErrorType", "getCanRetry", "()Z", "canRetry", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType errorType;
        private final java.lang.String message;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, int i, com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteErrorType, "");
            this.message = str;
            this.retryCount = i;
            this.errorType = smartRouteErrorType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType getErrorType() {
            return this.errorType;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Error(java.lang.String str, int i, com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, smartRouteErrorType);
            i = (i2 & 2) != 0 ? 0 : i;
            if ((i2 & 4) != 0) {
                if (i < 2) {
                    smartRouteErrorType = com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.RETRY;
                } else {
                    smartRouteErrorType = com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.FATAL;
                }
            }
        }

        public final boolean getCanRetry() {
            return this.retryCount < 2;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            int i = this.retryCount;
            com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", errorType=");
            sb.append(smartRouteErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.message.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error error = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.retryCount == error.retryCount && this.errorType == error.errorType;
        }

        public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error copy(java.lang.String message, int retryCount, com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error(message, retryCount, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error error, java.lang.String str, int i, com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.retryCount;
            }
            if ((i2 & 4) != 0) {
                smartRouteErrorType = error.errorType;
            }
            return error.copy(str, i, smartRouteErrorType);
        }
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        if (this instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Initial) {
            return "DistributionState.Initial";
        }
        if (this instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Loading) {
            return "DistributionState.Loading";
        }
        if (this instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) {
            return "DistributionState.Content";
        }
        if (this instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error) {
            return "DistributionState.Error";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ DistributionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
