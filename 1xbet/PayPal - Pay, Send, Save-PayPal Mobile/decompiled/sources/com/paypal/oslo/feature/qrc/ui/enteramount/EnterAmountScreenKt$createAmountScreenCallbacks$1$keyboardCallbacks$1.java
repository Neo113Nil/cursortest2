package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "", "onKeyPress", "Lkotlin/jvm/functions/Function1;", "getOnKeyPress", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "onBackspace", "Lkotlin/jvm/functions/Function0;", "getOnBackspace", "()Lkotlin/jvm/functions/Function0;", "onClear", "getOnClear", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "onQuickAmountSelected", "getOnQuickAmountSelected", "", "onVisibilityChange", "getOnVisibilityChange", "", "formattedAmount", "getFormattedAmount", "onAmountChange", "getOnAmountChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1 implements com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onAmountChange;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey, kotlin.Unit> onKeyPress = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1.m17791$r8$lambda$HNQDbWUBBE4Yi0Bp1CDw7s5C20((com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey) obj);
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackspace = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClear = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, kotlin.Unit> onQuickAmountSelected = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1.m17792$r8$lambda$aOWX2RAo89XpXG7cZiuTSOiI((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj);
        }
    };
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onVisibilityChange = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit unit;
            ((java.lang.Boolean) obj).booleanValue();
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> formattedAmount = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1.$r8$lambda$9F0gZqSAxOlOG8kTCjGHvGU4qxQ((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj);
        }
    };

    EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent, kotlin.Unit> function1) {
        this.onAmountChange = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1.m17793$r8$lambda$fMR6ECdVbD_NxkjWnmxVPE_w0(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        };
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey, kotlin.Unit> getOnKeyPress() {
        return this.onKeyPress;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackspace() {
        return this.onBackspace;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClear() {
        return this.onClear;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, kotlin.Unit> getOnQuickAmountSelected() {
        return this.onQuickAmountSelected;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnVisibilityChange() {
        return this.onVisibilityChange;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> getFormattedAmount() {
        return this.formattedAmount;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAmountChange() {
        return this.onAmountChange;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$9F0gZqSAxOlOG8kTCjGHvGU4qxQ(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        int i = com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountScreenKt$createAmountScreenCallbacks$1$keyboardCallbacks$1.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
        if (i == 1) {
            return moneyAmount.requireFiat().getQuantity();
        }
        if (i == 2) {
            return moneyAmount.requireCrypto().getQuantity();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: $r8$lambda$HNQDbWUBBE4Yi0Bp1CDw7s5C2-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17791$r8$lambda$HNQDbWUBBE4Yi0Bp1CDw7s5C20(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey keyboardKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardKey, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aOWX2RAo89-XpXG7cZi-uTSO-iI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17792$r8$lambda$aOWX2RAo89XpXG7cZiuTSOiI(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fM-R6ECdVbD_NxkjWnmxVPE_-w0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17793$r8$lambda$fMR6ECdVbD_NxkjWnmxVPE_w0(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
