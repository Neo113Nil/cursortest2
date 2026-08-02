package com.paypal.oslo.feature.activity.domain.base.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "", "<init>", "()V", "ActivityMutationsResult", "ActivityNavigationResult", "ActivityWebKitResult", "ActivityUnSupportedActionResult", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityMutationsResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityUnSupportedActionResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityWebKitResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityActionResult {
    public static final int $stable = 0;

    private ActivityActionResult() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityMutationsResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Larrow/core/Ior;)V", "component1", "()Larrow/core/Ior;", "copy", "(Larrow/core/Ior;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityMutationsResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Larrow/core/Ior;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityMutationsResult extends com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult {
        public static final int $stable = 8;
        private final arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutationsResult(arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> ior) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
            this.data = ior;
        }

        public final arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> ior = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityMutationsResult(data=");
            sb.append(ior);
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
            return (other instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult) other).data);
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult copy(arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult(data);
        }

        public final arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult copy$default(com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult activityMutationsResult, arrow.core.Ior ior, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ior = activityMutationsResult.data;
            }
            return activityMutationsResult.copy(ior);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityNavigationResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityNavigationResult extends com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType data;

        public ActivityNavigationResult(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType) {
            super(null);
            this.data = activityActionNavigationType;
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityNavigationResult(data=");
            sb.append(activityActionNavigationType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType = this.data;
            if (activityActionNavigationType == null) {
                return 0;
            }
            return activityActionNavigationType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult) other).data);
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult copy(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType data) {
            return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult copy$default(com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult activityNavigationResult, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityActionNavigationType = activityNavigationResult.data;
            }
            return activityNavigationResult.copy(activityActionNavigationType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityWebKitResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityWebKitResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityWebKitResult extends com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType data;

        public ActivityWebKitResult(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType) {
            super(null);
            this.data = activityActionNavigationType;
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityWebKitResult(data=");
            sb.append(activityActionNavigationType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType = this.data;
            if (activityActionNavigationType == null) {
                return 0;
            }
            return activityActionNavigationType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult) other).data);
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult copy(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType data) {
            return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult copy$default(com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult activityWebKitResult, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType activityActionNavigationType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityActionNavigationType = activityWebKitResult.data;
            }
            return activityWebKitResult.copy(activityActionNavigationType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityUnSupportedActionResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;)Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityActionResult$ActivityUnSupportedActionResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityUnSupportedActionResult extends com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult data;

        public ActivityUnSupportedActionResult(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult) {
            super(null);
            this.data = activityNetworkFailureResult;
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityUnSupportedActionResult(data=");
            sb.append(activityNetworkFailureResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult = this.data;
            if (activityNetworkFailureResult == null) {
                return 0;
            }
            return activityNetworkFailureResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult) other).data);
        }

        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult copy(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult data) {
            return new com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult copy$default(com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityUnSupportedActionResult activityUnSupportedActionResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityNetworkFailureResult = activityUnSupportedActionResult.data;
            }
            return activityUnSupportedActionResult.copy(activityNetworkFailureResult);
        }
    }

    public /* synthetic */ ActivityActionResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
