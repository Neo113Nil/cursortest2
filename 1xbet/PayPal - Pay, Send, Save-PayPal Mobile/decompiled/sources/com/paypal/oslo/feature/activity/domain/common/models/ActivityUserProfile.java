package com.paypal.oslo.feature.activity.domain.common.models;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityUserProfile;", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResult;", "Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;", "accountType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityUserProfile;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;", "getAccountType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityUserProfile implements com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType;

    public ActivityUserProfile(com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        this.accountType = accountType;
    }

    public /* synthetic */ ActivityUserProfile(com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.common.models.AccountType.UNKNOWN : accountType);
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.AccountType getAccountType() {
        return this.accountType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType = this.accountType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityUserProfile(accountType=");
        sb.append(accountType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.accountType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile) && this.accountType == ((com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile) other).accountType;
    }

    public final com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile copy(com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile(accountType);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.common.models.AccountType getAccountType() {
        return this.accountType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile copy$default(com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile activityUserProfile, com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            accountType = activityUserProfile.accountType;
        }
        return activityUserProfile.copy(accountType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityUserProfile() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
