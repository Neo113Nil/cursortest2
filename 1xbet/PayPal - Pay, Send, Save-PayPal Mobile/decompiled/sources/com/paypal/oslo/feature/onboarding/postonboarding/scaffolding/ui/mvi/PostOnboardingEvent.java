package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "StartFlow", "RequestTransition", "HandleTransition", "RequestBack", "HandleBack", "HandleStepError", "RetryFlow", "RequestCloseFlowAndNavigate", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleBack;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleStepError;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleTransition;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestBack;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestCloseFlowAndNavigate;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestTransition;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RetryFlow;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$StartFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PostOnboardingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$StartFlow;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-8NcbBzM", "()Ljava/lang/String;", "component1", "copy-786ZxuM", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$StartFlow;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getFlowId-8NcbBzM"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartFlow extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 0;
        private final java.lang.String flowId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private StartFlow(java.lang.String str) {
            super("StartFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.flowId = str;
        }

        /* renamed from: getFlowId-8NcbBzM, reason: not valid java name */
        public final java.lang.String m16135getFlowId8NcbBzM() {
            return this.flowId;
        }

        public final java.lang.String toString() {
            java.lang.String m16025toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16025toStringimpl(this.flowId);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartFlow(flowId=");
            sb.append(m16025toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16024hashCodeimpl(this.flowId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow) && com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(this.flowId, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow) other).flowId);
        }

        /* renamed from: copy-786ZxuM, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow m16134copy786ZxuM(java.lang.String flowId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowId, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow(flowId, null);
        }

        /* renamed from: component1-8NcbBzM, reason: not valid java name and from getter */
        public final java.lang.String getFlowId() {
            return this.flowId;
        }

        /* renamed from: copy-786ZxuM$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow m16132copy786ZxuM$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.StartFlow startFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = startFlow.flowId;
            }
            return startFlow.m16134copy786ZxuM(str);
        }

        public /* synthetic */ StartFlow(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    private PostOnboardingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestTransition;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "transition", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "component2", "()Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestTransition;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getStep", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "getTransition"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestTransition extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step;
        private final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestTransition(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition) {
            super("RequestTransition", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "");
            this.step = step;
            this.transition = transition;
        }

        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition getTransition() {
            return this.transition;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = this.step;
            com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition = this.transition;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestTransition(step=");
            sb.append(step);
            sb.append(", transition=");
            sb.append(transition);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.step.hashCode() * 31) + this.transition.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition requestTransition = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.step, requestTransition.step) && kotlin.jvm.internal.Intrinsics.areEqual(this.transition, requestTransition.transition);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition copy(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(step, transition);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition getTransition() {
            return this.transition;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition requestTransition, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = requestTransition.step;
            }
            if ((i & 2) != 0) {
                transition = requestTransition.transition;
            }
            return requestTransition.copy(step, transition);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleTransition;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleTransition;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleTransition extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleTransition(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            super("HandleTransition", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleTransition(step=");
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
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition) other).step);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition copy(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleTransition handleTransition, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = handleTransition.step;
            }
            return handleTransition.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestBack;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestBack extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestBack INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestBack();

        public final int hashCode() {
            return -260004814;
        }

        private RequestBack() {
            super("RequestBack", null);
        }

        public final java.lang.String toString() {
            return "RequestBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleBack;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleBack;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleBack extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleBack(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            super("HandleBack", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleBack(step=");
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
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack) other).step);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack copy(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleBack handleBack, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = handleBack.step;
            }
            return handleBack.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleStepError;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "error", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$HandleStepError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleStepError extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleStepError(com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError stepError) {
            super("HandleStepError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepError, "");
            this.error = stepError;
        }

        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError stepError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleStepError(error=");
            sb.append(stepError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError) other).error);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError copy(com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.HandleStepError handleStepError, com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError stepError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                stepError = handleStepError.error;
            }
            return handleStepError.copy(stepError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RetryFlow;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryFlow extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RetryFlow INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RetryFlow();

        public final int hashCode() {
            return 1225880338;
        }

        private RetryFlow() {
            super("RetryFlow", null);
        }

        public final java.lang.String toString() {
            return "RetryFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RetryFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestCloseFlowAndNavigate;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-8NcbBzM", "()Ljava/lang/String;", "component1", "copy-786ZxuM", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent$RequestCloseFlowAndNavigate;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getFlowId-8NcbBzM"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestCloseFlowAndNavigate extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent {
        public static final int $stable = 0;
        private final java.lang.String flowId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private RequestCloseFlowAndNavigate(java.lang.String str) {
            super("RequestCloseFlowAndNavigate", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.flowId = str;
        }

        /* renamed from: getFlowId-8NcbBzM, reason: not valid java name */
        public final java.lang.String m16131getFlowId8NcbBzM() {
            return this.flowId;
        }

        public final java.lang.String toString() {
            java.lang.String m16025toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16025toStringimpl(this.flowId);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCloseFlowAndNavigate(flowId=");
            sb.append(m16025toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16024hashCodeimpl(this.flowId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate) && com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(this.flowId, ((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate) other).flowId);
        }

        /* renamed from: copy-786ZxuM, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate m16130copy786ZxuM(java.lang.String flowId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowId, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate(flowId, null);
        }

        /* renamed from: component1-8NcbBzM, reason: not valid java name and from getter */
        public final java.lang.String getFlowId() {
            return this.flowId;
        }

        /* renamed from: copy-786ZxuM$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate m16128copy786ZxuM$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate requestCloseFlowAndNavigate, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestCloseFlowAndNavigate.flowId;
            }
            return requestCloseFlowAndNavigate.m16130copy786ZxuM(str);
        }

        public /* synthetic */ RequestCloseFlowAndNavigate(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public /* synthetic */ PostOnboardingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
