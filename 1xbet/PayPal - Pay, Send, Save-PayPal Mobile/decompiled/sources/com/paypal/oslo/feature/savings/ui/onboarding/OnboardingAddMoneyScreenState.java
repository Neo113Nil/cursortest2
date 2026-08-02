package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState;", "", "<init>", "()V", "Loading", "Content", "ServiceUnavailable", "NetworkError", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$Content;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$ServiceUnavailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class OnboardingAddMoneyScreenState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Loading INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Loading();

        public final int hashCode() {
            return -499204518;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private OnboardingAddMoneyScreenState() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$Content;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;", "formState", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component2", "()Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;)Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;", "getFormState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState formState;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState onboardingAddMoneyFormState) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingAddMoneyFormState, "");
            this.goal = goalSummaryDTO;
            this.formState = onboardingAddMoneyFormState;
        }

        public final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState getFormState() {
            return this.formState;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState onboardingAddMoneyFormState = this.formState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(goal=");
            sb.append(goalSummaryDTO);
            sb.append(", formState=");
            sb.append(onboardingAddMoneyFormState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.goal.hashCode() * 31) + this.formState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content content = (com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.goal, content.goal) && kotlin.jvm.internal.Intrinsics.areEqual(this.formState, content.formState);
        }

        public final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState formState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formState, "");
            return new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content(goal, formState);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState getFormState() {
            return this.formState;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content copy$default(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content content, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState onboardingAddMoneyFormState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = content.goal;
            }
            if ((i & 2) != 0) {
                onboardingAddMoneyFormState = content.formState;
            }
            return content.copy(goalSummaryDTO, onboardingAddMoneyFormState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$ServiceUnavailable;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServiceUnavailable extends com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.ServiceUnavailable INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.ServiceUnavailable();

        public final int hashCode() {
            return -362460547;
        }

        private ServiceUnavailable() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ServiceUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.ServiceUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.NetworkError INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.NetworkError();

        public final int hashCode() {
            return 1435327004;
        }

        private NetworkError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OnboardingAddMoneyScreenState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
