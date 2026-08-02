package com.paypal.oslo.feature.onboarding.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "", "", "message", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "apiCallError", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;)Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "getApiCallError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StepError {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError;
    private final java.lang.String message;

    public StepError(java.lang.String str, com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.apiCallError = apiCallError;
    }

    public /* synthetic */ StepError(java.lang.String str, com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : apiCallError);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError getApiCallError() {
        return this.apiCallError;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = this.apiCallError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepError(message=");
        sb.append(str);
        sb.append(", apiCallError=");
        sb.append(apiCallError);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = this.apiCallError;
        return (hashCode * 31) + (apiCallError == null ? 0 : apiCallError.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError stepError = (com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, stepError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.apiCallError, stepError.apiCallError);
    }

    public final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError copy(java.lang.String message, com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError(message, apiCallError);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError getApiCallError() {
        return this.apiCallError;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError copy$default(com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError stepError, java.lang.String str, com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepError.message;
        }
        if ((i & 2) != 0) {
            apiCallError = stepError.apiCallError;
        }
        return stepError.copy(str, apiCallError);
    }
}
