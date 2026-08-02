package com.paypal.oslo.feature.onboarding.validators.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "", "", "messageResId", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ValidationSuccess {
    public static final int $stable = 0;
    private final java.lang.Integer messageResId;

    public ValidationSuccess(java.lang.Integer num) {
        this.messageResId = num;
    }

    public /* synthetic */ ValidationSuccess(java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }

    public final java.lang.Integer getMessageResId() {
        return this.messageResId;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.messageResId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationSuccess(messageResId=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.messageResId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageResId, ((com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess) other).messageResId);
    }

    public final com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess copy(java.lang.Integer messageResId) {
        return new com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess(messageResId);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getMessageResId() {
        return this.messageResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess copy$default(com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess validationSuccess, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = validationSuccess.messageResId;
        }
        return validationSuccess.copy(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationSuccess() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
