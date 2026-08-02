package com.paypal.oslo.feature.activity.domain.base.error;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityGenericErrorActivityImpl;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "", "errorMessage", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/error/CallError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/network/graphql/error/CallError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/activity/domain/base/error/ActivityGenericErrorActivityImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getCallError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityGenericErrorActivityImpl implements com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.network.graphql.error.CallError callError;
    private final java.lang.String errorMessage;

    public ActivityGenericErrorActivityImpl(java.lang.String str, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        this.errorMessage = str;
        this.callError = callError;
    }

    public /* synthetic */ ActivityGenericErrorActivityImpl(java.lang.String str, com.paypal.oslo.core.network.graphql.error.CallError callError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : callError);
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError
    public final com.paypal.oslo.core.network.graphql.error.CallError getCallError() {
        return this.callError;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.errorMessage;
        com.paypal.oslo.core.network.graphql.error.CallError callError = this.callError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityGenericErrorActivityImpl(errorMessage=");
        sb.append(str);
        sb.append(", callError=");
        sb.append(callError);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.errorMessage;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.core.network.graphql.error.CallError callError = this.callError;
        return (hashCode * 31) + (callError != null ? callError.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl activityGenericErrorActivityImpl = (com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, activityGenericErrorActivityImpl.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.callError, activityGenericErrorActivityImpl.callError);
    }

    public final com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl copy(java.lang.String errorMessage, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        return new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(errorMessage, callError);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.network.graphql.error.CallError getCallError() {
        return this.callError;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl copy$default(com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl activityGenericErrorActivityImpl, java.lang.String str, com.paypal.oslo.core.network.graphql.error.CallError callError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityGenericErrorActivityImpl.errorMessage;
        }
        if ((i & 2) != 0) {
            callError = activityGenericErrorActivityImpl.callError;
        }
        return activityGenericErrorActivityImpl.copy(str, callError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityGenericErrorActivityImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
