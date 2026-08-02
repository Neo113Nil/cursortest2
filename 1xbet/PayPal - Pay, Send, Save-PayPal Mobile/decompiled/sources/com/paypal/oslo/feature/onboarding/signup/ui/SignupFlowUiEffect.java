package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect;", "", "ExitFlow", "NavigateToOneOnboarding", "NavigateToOneOnboardingForResult", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$ExitFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$NavigateToOneOnboarding;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$NavigateToOneOnboardingForResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SignupFlowUiEffect {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$ExitFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;)Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$ExitFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitFlow implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult result;

        public ExitFlow(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupFlowNavResult, "");
            this.result = signupFlowNavResult;
        }

        public final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitFlow(result=");
            sb.append(signupFlowNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.ExitFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.ExitFlow) other).result);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.ExitFlow copy(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.ExitFlow(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.ExitFlow copy$default(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.ExitFlow exitFlow, com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signupFlowNavResult = exitFlow.result;
            }
            return exitFlow.copy(signupFlowNavResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$NavigateToOneOnboarding;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$NavigateToOneOnboarding;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOneOnboarding implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

        public NavigateToOneOnboarding(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            this.intentId = intentId;
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToOneOnboarding(intentId=");
            sb.append(intentId);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding) other).intentId);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding(intentId);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding copy$default(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboarding navigateToOneOnboarding, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                intentId = navigateToOneOnboarding.intentId;
            }
            return navigateToOneOnboarding.copy(intentId);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$NavigateToOneOnboardingForResult;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiEffect$NavigateToOneOnboardingForResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOneOnboardingForResult implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

        public NavigateToOneOnboardingForResult(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            this.intentId = intentId;
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToOneOnboardingForResult(intentId=");
            sb.append(intentId);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult) other).intentId);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult(intentId);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult copy$default(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiEffect.NavigateToOneOnboardingForResult navigateToOneOnboardingForResult, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                intentId = navigateToOneOnboardingForResult.intentId;
            }
            return navigateToOneOnboardingForResult.copy(intentId);
        }
    }
}
