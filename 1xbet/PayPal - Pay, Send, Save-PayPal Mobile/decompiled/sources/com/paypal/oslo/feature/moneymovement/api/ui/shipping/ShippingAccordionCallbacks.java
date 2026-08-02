package com.paypal.oslo.feature.moneymovement.api.ui.shipping;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R%\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;", "", "Lkotlin/Function0;", "", "getOnExpand", "()Lkotlin/jvm/functions/Function0;", "onExpand", "getOnCollapse", "onCollapse", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getOnSelectAddress", "()Lkotlin/jvm/functions/Function1;", "onSelectAddress", "getOnSelectNoShipping", "onSelectNoShipping", "getOnAddAddress", "onAddAddress", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ShippingAccordionCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion.getHighSpeedVideoFpsRangesFor;

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddAddress();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSelectAddress();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnSelectNoShipping();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onExpand", "onCollapse", "Lkotlin/Function1;", "", "onSelectAddress", "onSelectNoShipping", "onAddAddress", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion();

        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion companion, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 2) != 0) {
                function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            kotlin.jvm.functions.Function0 function05 = function02;
            if ((i & 4) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.Companion.$r8$lambda$tc18Z2wrPmDjkURIT92gmWiIoiw((java.lang.String) obj2);
                    }
                };
            }
            kotlin.jvm.functions.Function1 function12 = function1;
            if ((i & 8) != 0) {
                function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            kotlin.jvm.functions.Function0 function06 = function03;
            if ((i & 16) != 0) {
                function04 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            return companion.invoke(function0, function05, function12, function06, function04);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand, final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelectAddress, final kotlin.jvm.functions.Function0<kotlin.Unit> onSelectNoShipping, final kotlin.jvm.functions.Function0<kotlin.Unit> onAddAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCollapse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelectAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelectNoShipping, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAddAddress, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks(onExpand, onCollapse, onSelectAddress, onSelectNoShipping, onAddAddress) { // from class: com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks$Companion$invoke$6
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onAddAddress;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onSelectAddress;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onSelectNoShipping;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onExpand = onExpand;
                    this.onCollapse = onCollapse;
                    this.onSelectAddress = onSelectAddress;
                    this.onSelectNoShipping = onSelectNoShipping;
                    this.onAddAddress = onAddAddress;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand() {
                    return this.onExpand;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse() {
                    return this.onCollapse;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSelectAddress() {
                    return this.onSelectAddress;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSelectNoShipping() {
                    return this.onSelectNoShipping;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddAddress() {
                    return this.onAddAddress;
                }
            };
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$tc18Z2wrPmDjkURIT92gmWiIoiw(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
