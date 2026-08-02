package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u009a\u0001\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b+\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b-\u0010\u0011R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b.\u0010\u0011R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b\r\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsCallbacks;", "", "Lkotlin/Function0;", "", "onBackClick", "onAgreeClick", "onFdicInsuredClick", "onFdicRatesClick", "onRateInfoClick", "onEDeliveryClick", "onDepositAccountClick", "onPrivacyClick", "", "isLoading", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "copy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsCallbacks;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getOnBackClick", "getOnAgreeClick", "getOnFdicInsuredClick", "getOnFdicRatesClick", "getOnRateInfoClick", "getOnEDeliveryClick", "getOnDepositAccountClick", "getOnPrivacyClick", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsTermsCallbacks {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onAgreeClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDepositAccountClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onEDeliveryClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onFdicInsuredClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onFdicRatesClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrivacyClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onRateInfoClick;

    public SavingsTermsCallbacks(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, kotlin.jvm.functions.Function0<kotlin.Unit> function06, kotlin.jvm.functions.Function0<kotlin.Unit> function07, kotlin.jvm.functions.Function0<kotlin.Unit> function08, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function06, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function07, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function08, "");
        this.onBackClick = function0;
        this.onAgreeClick = function02;
        this.onFdicInsuredClick = function03;
        this.onFdicRatesClick = function04;
        this.onRateInfoClick = function05;
        this.onEDeliveryClick = function06;
        this.onDepositAccountClick = function07;
        this.onPrivacyClick = function08;
        this.isLoading = z;
    }

    public /* synthetic */ SavingsTermsCallbacks(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, kotlin.jvm.functions.Function0 function06, kotlin.jvm.functions.Function0 function07, kotlin.jvm.functions.Function0 function08, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, function03, function04, function05, function06, function07, function08, (i & 256) != 0 ? false : z);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackClick() {
        return this.onBackClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAgreeClick() {
        return this.onAgreeClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFdicInsuredClick() {
        return this.onFdicInsuredClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFdicRatesClick() {
        return this.onFdicRatesClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRateInfoClick() {
        return this.onRateInfoClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnEDeliveryClick() {
        return this.onEDeliveryClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDepositAccountClick() {
        return this.onDepositAccountClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrivacyClick() {
        return this.onPrivacyClick;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onBackClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onAgreeClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.onFdicInsuredClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = this.onFdicRatesClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05 = this.onRateInfoClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06 = this.onEDeliveryClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07 = this.onDepositAccountClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08 = this.onPrivacyClick;
        boolean z = this.isLoading;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsTermsCallbacks(onBackClick=");
        sb.append(function0);
        sb.append(", onAgreeClick=");
        sb.append(function02);
        sb.append(", onFdicInsuredClick=");
        sb.append(function03);
        sb.append(", onFdicRatesClick=");
        sb.append(function04);
        sb.append(", onRateInfoClick=");
        sb.append(function05);
        sb.append(", onEDeliveryClick=");
        sb.append(function06);
        sb.append(", onDepositAccountClick=");
        sb.append(function07);
        sb.append(", onPrivacyClick=");
        sb.append(function08);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.onBackClick.hashCode() * 31) + this.onAgreeClick.hashCode()) * 31) + this.onFdicInsuredClick.hashCode()) * 31) + this.onFdicRatesClick.hashCode()) * 31) + this.onRateInfoClick.hashCode()) * 31) + this.onEDeliveryClick.hashCode()) * 31) + this.onDepositAccountClick.hashCode()) * 31) + this.onPrivacyClick.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLoading);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks savingsTermsCallbacks = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onBackClick, savingsTermsCallbacks.onBackClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAgreeClick, savingsTermsCallbacks.onAgreeClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onFdicInsuredClick, savingsTermsCallbacks.onFdicInsuredClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onFdicRatesClick, savingsTermsCallbacks.onFdicRatesClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRateInfoClick, savingsTermsCallbacks.onRateInfoClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEDeliveryClick, savingsTermsCallbacks.onEDeliveryClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDepositAccountClick, savingsTermsCallbacks.onDepositAccountClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPrivacyClick, savingsTermsCallbacks.onPrivacyClick) && this.isLoading == savingsTermsCallbacks.isLoading;
    }

    public final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks copy(kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick, kotlin.jvm.functions.Function0<kotlin.Unit> onAgreeClick, kotlin.jvm.functions.Function0<kotlin.Unit> onFdicInsuredClick, kotlin.jvm.functions.Function0<kotlin.Unit> onFdicRatesClick, kotlin.jvm.functions.Function0<kotlin.Unit> onRateInfoClick, kotlin.jvm.functions.Function0<kotlin.Unit> onEDeliveryClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDepositAccountClick, kotlin.jvm.functions.Function0<kotlin.Unit> onPrivacyClick, boolean isLoading) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAgreeClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFdicInsuredClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFdicRatesClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRateInfoClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEDeliveryClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDepositAccountClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPrivacyClick, "");
        return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks(onBackClick, onAgreeClick, onFdicInsuredClick, onFdicRatesClick, onRateInfoClick, onEDeliveryClick, onDepositAccountClick, onPrivacyClick, isLoading);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component8() {
        return this.onPrivacyClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component7() {
        return this.onDepositAccountClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component6() {
        return this.onEDeliveryClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
        return this.onRateInfoClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
        return this.onFdicRatesClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onFdicInsuredClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onAgreeClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
        return this.onBackClick;
    }
}
