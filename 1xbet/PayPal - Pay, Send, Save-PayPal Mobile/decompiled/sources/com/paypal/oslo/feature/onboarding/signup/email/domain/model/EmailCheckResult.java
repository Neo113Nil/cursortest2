package com.paypal.oslo.feature.onboarding.signup.email.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;", "", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;", "onboardingEmailStatus", "", "isExistingAccount", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;Z)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;Z)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;", "getOnboardingEmailStatus", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EmailCheckResult {
    public static final int $stable = 8;
    private final boolean isExistingAccount;
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus;

    public EmailCheckResult(com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus, boolean z) {
        this.onboardingEmailStatus = onboardingEmailStatus;
        this.isExistingAccount = z;
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus getOnboardingEmailStatus() {
        return this.onboardingEmailStatus;
    }

    public final boolean isExistingAccount() {
        return this.isExistingAccount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus = this.onboardingEmailStatus;
        boolean z = this.isExistingAccount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailCheckResult(onboardingEmailStatus=");
        sb.append(onboardingEmailStatus);
        sb.append(", isExistingAccount=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus = this.onboardingEmailStatus;
        return ((onboardingEmailStatus == null ? 0 : onboardingEmailStatus.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExistingAccount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult emailCheckResult = (com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingEmailStatus, emailCheckResult.onboardingEmailStatus) && this.isExistingAccount == emailCheckResult.isExistingAccount;
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult copy(com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus, boolean isExistingAccount) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult(onboardingEmailStatus, isExistingAccount);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsExistingAccount() {
        return this.isExistingAccount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus getOnboardingEmailStatus() {
        return this.onboardingEmailStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult copy$default(com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult emailCheckResult, com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardingEmailStatus = emailCheckResult.onboardingEmailStatus;
        }
        if ((i & 2) != 0) {
            z = emailCheckResult.isExistingAccount;
        }
        return emailCheckResult.copy(onboardingEmailStatus, z);
    }
}
