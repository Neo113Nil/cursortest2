package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "StepNavigation", "StepBack", "CloseFlow", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$CloseFlow;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$StepBack;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$StepNavigation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PostOnboardingUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$StepNavigation;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$StepNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StepNavigation extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StepNavigation(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            super("StepNavigation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StepNavigation(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation) other).step);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation copy(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepNavigation stepNavigation, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = stepNavigation.step;
            }
            return stepNavigation.copy(step);
        }
    }

    private PostOnboardingUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$StepBack;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$StepBack;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StepBack extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StepBack(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            super("GoBack", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StepBack(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack) other).step);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack copy(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.StepBack stepBack, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = stepBack.step;
            }
            return stepBack.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$CloseFlow;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiEffect$CloseFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseFlow extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        public CloseFlow(androidx.navigation3.runtime.NavKey navKey) {
            super("CloseFlow", null);
            this.destination = navKey;
        }

        public /* synthetic */ CloseFlow(androidx.navigation3.runtime.NavKey navKey, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : navKey);
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseFlow(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            if (navKey == null) {
                return 0;
            }
            return navKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow) other).destination);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow copy(androidx.navigation3.runtime.NavKey destination) {
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiEffect.CloseFlow closeFlow, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = closeFlow.destination;
            }
            return closeFlow.copy(navKey);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CloseFlow() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ PostOnboardingUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
