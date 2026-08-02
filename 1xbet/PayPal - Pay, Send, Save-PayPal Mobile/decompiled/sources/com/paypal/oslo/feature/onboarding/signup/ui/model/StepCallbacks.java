package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\fR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "", "Lkotlin/Function0;", "", "onNavigateNext", "onNavigateBack", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/SignupFlowNavResult;", "onExitFlow", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "component3", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnNavigateNext", "getOnNavigateBack", "Lkotlin/jvm/functions/Function1;", "getOnExitFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StepCallbacks {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.Unit> onExitFlow;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateNext;

    /* JADX WARN: Multi-variable type inference failed */
    public StepCallbacks(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigateNext = function0;
        this.onNavigateBack = function02;
        this.onExitFlow = function1;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNavigateNext() {
        return this.onNavigateNext;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNavigateBack() {
        return this.onNavigateBack;
    }

    public /* synthetic */ StepCallbacks(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks.m16498$r8$lambda$iC8C8lCjmFSMt_bSyalPSXNBr4((com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult) obj);
            }
        } : function1);
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.Unit> getOnExitFlow() {
        return this.onExitFlow;
    }

    /* renamed from: $r8$lambda$iC8C8lCjm-FSMt_bSyalPSXNBr4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16498$r8$lambda$iC8C8lCjmFSMt_bSyalPSXNBr4(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupFlowNavResult, "");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onNavigateNext;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onNavigateBack;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.Unit> function1 = this.onExitFlow;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepCallbacks(onNavigateNext=");
        sb.append(function0);
        sb.append(", onNavigateBack=");
        sb.append(function02);
        sb.append(", onExitFlow=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.onNavigateNext.hashCode() * 31) + this.onNavigateBack.hashCode()) * 31) + this.onExitFlow.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks = (com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onNavigateNext, stepCallbacks.onNavigateNext) && kotlin.jvm.internal.Intrinsics.areEqual(this.onNavigateBack, stepCallbacks.onNavigateBack) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExitFlow, stepCallbacks.onExitFlow);
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks copy(kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateNext, kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.Unit> onExitFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateNext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateBack, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExitFlow, "");
        return new com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks(onNavigateNext, onNavigateBack, onExitFlow);
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult, kotlin.Unit> component3() {
        return this.onExitFlow;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onNavigateBack;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
        return this.onNavigateNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = stepCallbacks.onNavigateNext;
        }
        if ((i & 2) != 0) {
            function02 = stepCallbacks.onNavigateBack;
        }
        if ((i & 4) != 0) {
            function1 = stepCallbacks.onExitFlow;
        }
        return stepCallbacks.copy(function0, function02, function1);
    }
}
