package com.paypal.oslo.feature.moneymovement.api.ui.paymenttype;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R%\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR%\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;", "", "Lkotlin/Function0;", "", "getOnExpand", "()Lkotlin/jvm/functions/Function0;", "onExpand", "getOnCollapse", "onCollapse", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getOnSelectType", "()Lkotlin/jvm/functions/Function1;", "onSelectType", "getOnInfoLinkClick", "onInfoLinkClick", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentTypeAccordionCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion.getHighSpeedVideoSizes;

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnInfoLinkClick();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSelectType();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onExpand", "onCollapse", "Lkotlin/Function1;", "", "onSelectType", "onInfoLinkClick", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion companion, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 2) != 0) {
                function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 4) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion.$r8$lambda$iolSg3XTEeX3OaiPZ0b5sCrKIQ4((java.lang.String) obj2);
                    }
                };
            }
            if ((i & 8) != 0) {
                function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.Companion.$r8$lambda$2JthMRAHioI0vjKpkB8dylx3aF0((java.lang.String) obj2);
                    }
                };
            }
            return companion.invoke(function0, function02, function1, function12);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand, final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelectType, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onInfoLinkClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCollapse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelectType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInfoLinkClick, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks(onExpand, onCollapse, onSelectType, onInfoLinkClick) { // from class: com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks$Companion$invoke$5
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onInfoLinkClick;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onSelectType;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onExpand = onExpand;
                    this.onCollapse = onCollapse;
                    this.onSelectType = onSelectType;
                    this.onInfoLinkClick = onInfoLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand() {
                    return this.onExpand;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse() {
                    return this.onCollapse;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSelectType() {
                    return this.onSelectType;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnInfoLinkClick() {
                    return this.onInfoLinkClick;
                }
            };
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$2JthMRAHioI0vjKpkB8dylx3aF0(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$iolSg3XTEeX3OaiPZ0b5sCrKIQ4(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
