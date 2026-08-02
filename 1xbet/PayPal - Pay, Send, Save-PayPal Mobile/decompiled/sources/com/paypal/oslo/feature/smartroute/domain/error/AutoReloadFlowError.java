package com.paypal.oslo.feature.smartroute.domain.error;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\u0082\u0001\u0006\u001b\u001c\u001d\u001e\u001f "}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "", "p0", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;Z)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "step", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "getStep", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "isRetriable", "Z", "()Z", "FetchSetupDetailsFailed", "SetupFailed", "DeactivateFailed", "UpdateSmartRouteFailed", "InsufficientSavingsBalance", "RollbackFailed", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$DeactivateFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$FetchSetupDetailsFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$InsufficientSavingsBalance;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$RollbackFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$SetupFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$UpdateSmartRouteFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AutoReloadFlowError {
    public static final int $stable = 0;
    private final boolean isRetriable;
    private final java.lang.String message;
    private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep step;

    private AutoReloadFlowError(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep, boolean z) {
        this.message = str;
        this.step = autoReloadFlowStep;
        this.isRetriable = z;
    }

    public /* synthetic */ AutoReloadFlowError(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, autoReloadFlowStep, (i & 4) != 0 ? true : z, null);
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep getStep() {
        return this.step;
    }

    /* renamed from: isRetriable, reason: from getter */
    public boolean getIsRetriable() {
        return this.isRetriable;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$FetchSetupDetailsFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$FetchSetupDetailsFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchSetupDetailsFailed extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError {
        public static final int $stable = 0;
        private final java.lang.String message;

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchSetupDetailsFailed(java.lang.String str) {
            super(str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.FETCH_SETUP_DETAILS, true, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchSetupDetailsFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed copy$default(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed fetchSetupDetailsFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fetchSetupDetailsFailed.message;
            }
            return fetchSetupDetailsFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$SetupFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$SetupFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetupFailed extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError {
        public static final int $stable = 0;
        private final java.lang.String message;

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupFailed(java.lang.String str) {
            super(str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.SETUP_AUTO_RELOAD, true, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetupFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed copy$default(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed setupFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setupFailed.message;
            }
            return setupFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$DeactivateFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$DeactivateFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeactivateFailed extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError {
        public static final int $stable = 0;
        private final java.lang.String message;

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeactivateFailed(java.lang.String str) {
            super(str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.DEACTIVATE_AUTO_RELOAD, true, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeactivateFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed copy$default(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed deactivateFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deactivateFailed.message;
            }
            return deactivateFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$UpdateSmartRouteFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "message", "", "requiresRollback", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$UpdateSmartRouteFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z", "getRequiresRollback"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateSmartRouteFailed extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final boolean requiresRollback;

        public /* synthetic */ UpdateSmartRouteFailed(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z);
        }

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean getRequiresRollback() {
            return this.requiresRollback;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSmartRouteFailed(java.lang.String str, boolean z) {
            super(str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.UPDATE_SMART_ROUTE, false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.requiresRollback = z;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            boolean z = this.requiresRollback;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSmartRouteFailed(message=");
            sb.append(str);
            sb.append(", requiresRollback=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Boolean.hashCode(this.requiresRollback);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed updateSmartRouteFailed = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, updateSmartRouteFailed.message) && this.requiresRollback == updateSmartRouteFailed.requiresRollback;
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed copy(java.lang.String message, boolean requiresRollback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed(message, requiresRollback);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequiresRollback() {
            return this.requiresRollback;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed copy$default(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed updateSmartRouteFailed, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateSmartRouteFailed.message;
            }
            if ((i & 2) != 0) {
                z = updateSmartRouteFailed.requiresRollback;
            }
            return updateSmartRouteFailed.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$InsufficientSavingsBalance;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$InsufficientSavingsBalance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InsufficientSavingsBalance extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError {
        public static final int $stable = 0;
        private final java.lang.String message;

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsufficientSavingsBalance(java.lang.String str) {
            super(str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.VALIDATE_SAVINGS_BALANCE, false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InsufficientSavingsBalance(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance copy$default(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance insufficientSavingsBalance, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = insufficientSavingsBalance.message;
            }
            return insufficientSavingsBalance.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$RollbackFailed;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "", "message", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "step", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;)Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError$RollbackFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RollbackFailed extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RollbackFailed(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep) {
            super(str, autoReloadFlowStep, false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowStep, "");
            this.message = str;
            this.step = autoReloadFlowStep;
        }

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError
        public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RollbackFailed(message=");
            sb.append(str);
            sb.append(", step=");
            sb.append(autoReloadFlowStep);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed rollbackFailed = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, rollbackFailed.message) && this.step == rollbackFailed.step;
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed copy(java.lang.String message, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed(message, step);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep getStep() {
            return this.step;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed copy$default(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed rollbackFailed, java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rollbackFailed.message;
            }
            if ((i & 2) != 0) {
                autoReloadFlowStep = rollbackFailed.step;
            }
            return rollbackFailed.copy(str, autoReloadFlowStep);
        }
    }

    public /* synthetic */ AutoReloadFlowError(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, autoReloadFlowStep, z);
    }
}
