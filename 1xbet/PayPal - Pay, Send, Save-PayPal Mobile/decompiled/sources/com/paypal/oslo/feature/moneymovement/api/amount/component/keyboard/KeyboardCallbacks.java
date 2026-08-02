package com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "", "getOnKeyPress", "()Lkotlin/jvm/functions/Function1;", "onKeyPress", "Lkotlin/Function0;", "getOnBackspace", "()Lkotlin/jvm/functions/Function0;", "onBackspace", "getOnClear", "onClear", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getOnQuickAmountSelected", "onQuickAmountSelected", "", "getOnVisibilityChange", "onVisibilityChange", "", "getFormattedAmount", "formattedAmount", "getOnAmountChange", "onAmountChange", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface KeyboardCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.getHighResolutionOutputSizeshNQ4ISI;

    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> getFormattedAmount();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAmountChange();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackspace();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnClear();

    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey, kotlin.Unit> getOnKeyPress();

    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, kotlin.Unit> getOnQuickAmountSelected();

    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnVisibilityChange();

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u00042\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "", "onKeyPress", "Lkotlin/Function0;", "onBackspace", "onClear", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "onQuickAmountSelected", "", "onVisibilityChange", "", "formattedAmount", "onAmountChange", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "create", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion();

        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks create$default(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion companion, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.$r8$lambda$Izg91l_bHxpRszjxV24JAcfgSys((com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey) obj2);
                    }
                };
            }
            if ((i & 2) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            kotlin.jvm.functions.Function0 function03 = function0;
            if ((i & 4) != 0) {
                function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            kotlin.jvm.functions.Function0 function04 = function02;
            if ((i & 8) != 0) {
                function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.$r8$lambda$rOxRh0owZRkBBUgRnSsj3k_onpM((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj2);
                    }
                };
            }
            kotlin.jvm.functions.Function1 function16 = function12;
            if ((i & 16) != 0) {
                function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj2).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            kotlin.jvm.functions.Function1 function17 = function13;
            if ((i & 32) != 0) {
                function14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.m15608$r8$lambda$X8MsXDjyG3vwzuidsjEQsx89gQ((com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount) obj2);
                    }
                };
            }
            kotlin.jvm.functions.Function1 function18 = function14;
            if ((i & 64) != 0) {
                function15 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.m15609$r8$lambda$Y5Dhk6XN2ysUbSLnEyuNZNs8YA((java.lang.String) obj2);
                    }
                };
            }
            return companion.create(function1, function03, function04, function16, function17, function18, function15);
        }

        public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks create(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey, kotlin.Unit> onKeyPress, final kotlin.jvm.functions.Function0<kotlin.Unit> onBackspace, final kotlin.jvm.functions.Function0<kotlin.Unit> onClear, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, kotlin.Unit> onQuickAmountSelected, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onVisibilityChange, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> formattedAmount, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAmountChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onKeyPress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackspace, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClear, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onQuickAmountSelected, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onVisibilityChange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAmountChange, "");
            return new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks(onKeyPress, onBackspace, onClear, onQuickAmountSelected, onVisibilityChange, formattedAmount, onAmountChange) { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks$Companion$create$8
                private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, java.lang.String> formattedAmount;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onAmountChange;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackspace;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onClear;
                private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey, kotlin.Unit> onKeyPress;
                private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount, kotlin.Unit> onQuickAmountSelected;
                private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onVisibilityChange;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onKeyPress = onKeyPress;
                    this.onBackspace = onBackspace;
                    this.onClear = onClear;
                    this.onQuickAmountSelected = onQuickAmountSelected;
                    this.onVisibilityChange = onVisibilityChange;
                    this.formattedAmount = formattedAmount;
                    this.onAmountChange = onAmountChange;
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
            };
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$Izg91l_bHxpRszjxV24JAcfgSys(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey keyboardKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardKey, "");
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$X8MsXDjyG3vwzuidsjEQsx8-9gQ, reason: not valid java name */
        public static /* synthetic */ java.lang.String m15608$r8$lambda$X8MsXDjyG3vwzuidsjEQsx89gQ(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
            int i = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
            if (i == 1) {
                return moneyAmount.requireFiat().getQuantity();
            }
            if (i == 2) {
                return moneyAmount.requireCrypto().getQuantity();
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        /* renamed from: $r8$lambda$Y5Dhk6XN2ysUbSLnEyuN-ZNs8YA, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m15609$r8$lambda$Y5Dhk6XN2ysUbSLnEyuNZNs8YA(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$rOxRh0owZRkBBUgRnSsj3k_onpM(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
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
}
