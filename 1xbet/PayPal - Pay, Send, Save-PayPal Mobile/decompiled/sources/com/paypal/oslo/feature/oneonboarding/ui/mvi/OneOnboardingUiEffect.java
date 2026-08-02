package com.paypal.oslo.feature.oneonboarding.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "CompleteFlow", "HandleStepForward", "HandleStepBack", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$CompleteFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$HandleStepBack;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$HandleStepForward;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OneOnboardingUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private OneOnboardingUiEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$CompleteFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$CompleteFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "getResult", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CompleteFlow extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect {
        public static final int $stable = 8;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompleteFlow(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowNavResult, "");
            this.result = oneOnboardingFlowNavResult;
            this.name = "OneOnboardingUiEffect.CompleteFlow";
        }

        public final com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult getResult() {
            return this.result;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CompleteFlow(result=");
            sb.append(oneOnboardingFlowNavResult);
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
            return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow) other).result);
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow copy(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.CompleteFlow completeFlow, com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                oneOnboardingFlowNavResult = completeFlow.result;
            }
            return completeFlow.copy(oneOnboardingFlowNavResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00198\u0017X\u0097D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$HandleStepForward;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "stepComponentConfig", "", "clearBackStack", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;Z)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;Z)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$HandleStepForward;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "getStepComponentConfig", "Z", "getClearBackStack", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleStepForward extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect {
        public static final int $stable = 8;
        private final boolean clearBackStack;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleStepForward(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentConfig, "");
            this.intentId = intentId;
            this.stepComponentConfig = stepComponentConfig;
            this.clearBackStack = z;
            this.name = "OneOnboardingUiEffect.HandleStepForward";
        }

        public /* synthetic */ HandleStepForward(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(intentId, stepComponentConfig, (i & 4) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig getStepComponentConfig() {
            return this.stepComponentConfig;
        }

        public final boolean getClearBackStack() {
            return this.clearBackStack;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
            com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig = this.stepComponentConfig;
            boolean z = this.clearBackStack;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleStepForward(intentId=");
            sb.append(intentId);
            sb.append(", stepComponentConfig=");
            sb.append(stepComponentConfig);
            sb.append(", clearBackStack=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.intentId.hashCode() * 31) + this.stepComponentConfig.hashCode()) * 31) + java.lang.Boolean.hashCode(this.clearBackStack);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward handleStepForward = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, handleStepForward.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepComponentConfig, handleStepForward.stepComponentConfig) && this.clearBackStack == handleStepForward.clearBackStack;
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, boolean clearBackStack) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentConfig, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward(intentId, stepComponentConfig, clearBackStack);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getClearBackStack() {
            return this.clearBackStack;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig getStepComponentConfig() {
            return this.stepComponentConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepForward handleStepForward, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                intentId = handleStepForward.intentId;
            }
            if ((i & 2) != 0) {
                stepComponentConfig = handleStepForward.stepComponentConfig;
            }
            if ((i & 4) != 0) {
                z = handleStepForward.clearBackStack;
            }
            return handleStepForward.copy(intentId, stepComponentConfig, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00188\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$HandleStepBack;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "stepComponentConfig", "", "stepsToPopBack", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;I)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;I)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiEffect$HandleStepBack;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "getStepComponentConfig", com.visa.cbp.getEncExpo.warmup, "getStepsToPopBack", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleStepBack extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig;
        private final int stepsToPopBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleStepBack(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentConfig, "");
            this.intentId = intentId;
            this.stepComponentConfig = stepComponentConfig;
            this.stepsToPopBack = i;
            this.name = "OneOnboardingUiEffect.HandleStepBack";
        }

        public /* synthetic */ HandleStepBack(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(intentId, stepComponentConfig, (i2 & 4) != 0 ? 1 : i);
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig getStepComponentConfig() {
            return this.stepComponentConfig;
        }

        public final int getStepsToPopBack() {
            return this.stepsToPopBack;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
            com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig = this.stepComponentConfig;
            int i = this.stepsToPopBack;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleStepBack(intentId=");
            sb.append(intentId);
            sb.append(", stepComponentConfig=");
            sb.append(stepComponentConfig);
            sb.append(", stepsToPopBack=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.intentId.hashCode() * 31) + this.stepComponentConfig.hashCode()) * 31) + java.lang.Integer.hashCode(this.stepsToPopBack);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack handleStepBack = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, handleStepBack.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepComponentConfig, handleStepBack.stepComponentConfig) && this.stepsToPopBack == handleStepBack.stepsToPopBack;
        }

        public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, int stepsToPopBack) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentConfig, "");
            return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack(intentId, stepComponentConfig, stepsToPopBack);
        }

        /* renamed from: component3, reason: from getter */
        public final int getStepsToPopBack() {
            return this.stepsToPopBack;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig getStepComponentConfig() {
            return this.stepComponentConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
            return this.intentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiEffect.HandleStepBack handleStepBack, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig stepComponentConfig, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                intentId = handleStepBack.intentId;
            }
            if ((i2 & 2) != 0) {
                stepComponentConfig = handleStepBack.stepComponentConfig;
            }
            if ((i2 & 4) != 0) {
                i = handleStepBack.stepsToPopBack;
            }
            return handleStepBack.copy(intentId, stepComponentConfig, i);
        }
    }

    public /* synthetic */ OneOnboardingUiEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
