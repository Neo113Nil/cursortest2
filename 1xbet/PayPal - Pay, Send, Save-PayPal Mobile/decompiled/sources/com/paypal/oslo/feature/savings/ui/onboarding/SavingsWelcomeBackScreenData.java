package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsWelcomeBackScreenData;", "", "Lkotlin/Function0;", "", "onBackClick", "onStartSavingsClick", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "copy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsWelcomeBackScreenData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnBackClick", "getOnStartSavingsClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsWelcomeBackScreenData {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onStartSavingsClick;

    public SavingsWelcomeBackScreenData(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.onBackClick = function0;
        this.onStartSavingsClick = function02;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackClick() {
        return this.onBackClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnStartSavingsClick() {
        return this.onStartSavingsClick;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onBackClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onStartSavingsClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsWelcomeBackScreenData(onBackClick=");
        sb.append(function0);
        sb.append(", onStartSavingsClick=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.onBackClick.hashCode() * 31) + this.onStartSavingsClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData savingsWelcomeBackScreenData = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onBackClick, savingsWelcomeBackScreenData.onBackClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onStartSavingsClick, savingsWelcomeBackScreenData.onStartSavingsClick);
    }

    public final com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData copy(kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick, kotlin.jvm.functions.Function0<kotlin.Unit> onStartSavingsClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStartSavingsClick, "");
        return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData(onBackClick, onStartSavingsClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onStartSavingsClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
        return this.onBackClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData copy$default(com.paypal.oslo.feature.savings.ui.onboarding.SavingsWelcomeBackScreenData savingsWelcomeBackScreenData, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = savingsWelcomeBackScreenData.onBackClick;
        }
        if ((i & 2) != 0) {
            function02 = savingsWelcomeBackScreenData.onStartSavingsClick;
        }
        return savingsWelcomeBackScreenData.copy(function0, function02);
    }
}
