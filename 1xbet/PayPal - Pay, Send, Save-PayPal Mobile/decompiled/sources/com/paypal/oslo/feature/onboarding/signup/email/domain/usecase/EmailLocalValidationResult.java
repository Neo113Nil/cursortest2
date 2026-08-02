package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/EmailLocalValidationResult;", "", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "", "isValid", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/EmailLocalValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getValidationResults", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmailLocalValidationResult {
    public static final int $stable = 8;
    private final boolean isValid;
    private final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailLocalValidationResult(java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.validationResults = list;
        this.isValid = z;
    }

    public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getValidationResults() {
        return this.validationResults;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final java.lang.String toString() {
        java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list = this.validationResults;
        boolean z = this.isValid;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailLocalValidationResult(validationResults=");
        sb.append(list);
        sb.append(", isValid=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.validationResults.hashCode() * 31) + java.lang.Boolean.hashCode(this.isValid);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult emailLocalValidationResult = (com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.validationResults, emailLocalValidationResult.validationResults) && this.isValid == emailLocalValidationResult.isValid;
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult copy(java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults, boolean isValid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResults, "");
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult(validationResults, isValid);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> component1() {
        return this.validationResults;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult copy$default(com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult emailLocalValidationResult, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = emailLocalValidationResult.validationResults;
        }
        if ((i & 2) != 0) {
            z = emailLocalValidationResult.isValid;
        }
        return emailLocalValidationResult.copy(list, z);
    }
}
