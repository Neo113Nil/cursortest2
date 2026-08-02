package com.paypal.oslo.feature.activity.domain.base.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Failure;", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Loading;", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Loading;", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading INSTANCE = new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading();

        public final int hashCode() {
            return 2092243934;
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
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private ActivityUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Success;", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;)Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult result;

        public Success(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult activityNetworkSuccessResult) {
            super(null);
            this.result = activityNetworkSuccessResult;
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult activityNetworkSuccessResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(result=");
            sb.append(activityNetworkSuccessResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult activityNetworkSuccessResult = this.result;
            if (activityNetworkSuccessResult == null) {
                return 0;
            }
            return activityNetworkSuccessResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) other).result);
        }

        public final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success copy(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult result) {
            return new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success copy$default(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success success, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult activityNetworkSuccessResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityNetworkSuccessResult = success.result;
            }
            return success.copy(activityNetworkSuccessResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Failure;", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;)Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult result;

        public Failure(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult) {
            super(null);
            this.result = activityNetworkFailureResult;
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(result=");
            sb.append(activityNetworkFailureResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult = this.result;
            if (activityNetworkFailureResult == null) {
                return 0;
            }
            return activityNetworkFailureResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure) other).result);
        }

        public final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure copy(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult result) {
            return new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure copy$default(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure failure, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityNetworkFailureResult = failure.result;
            }
            return failure.copy(activityNetworkFailureResult);
        }
    }

    public /* synthetic */ ActivityUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
