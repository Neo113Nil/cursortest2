package com.paypal.oslo.feature.moneymovement.api.ui.purpose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;", "", "Lkotlin/Function0;", "", "getOnExpand", "()Lkotlin/jvm/functions/Function0;", "onExpand", "getOnCollapse", "onCollapse", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "getOnCodeSelected", "()Lkotlin/jvm/functions/Function1;", "onCodeSelected", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PurposeCodeAccordionCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks.Companion.Camera2StreamConfigurationMap;

    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode, kotlin.Unit> getOnCodeSelected();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand();

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onExpand", "onCollapse", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "onCodeSelected", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks.Companion companion, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 2) != 0) {
                function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 4) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks.Companion.m15621$r8$lambda$uliQN6m3xDuXyQBcApwZe2Jg((com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode) obj2);
                    }
                };
            }
            return companion.invoke(function0, function02, function1);
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand, final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode, kotlin.Unit> onCodeSelected) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCollapse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCodeSelected, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks(onExpand, onCollapse, onCodeSelected) { // from class: com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks$Companion$invoke$4
                private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode, kotlin.Unit> onCodeSelected;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onExpand = onExpand;
                    this.onCollapse = onCollapse;
                    this.onCodeSelected = onCodeSelected;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand() {
                    return this.onExpand;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse() {
                    return this.onCollapse;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks
                public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode, kotlin.Unit> getOnCodeSelected() {
                    return this.onCodeSelected;
                }
            };
        }

        /* renamed from: $r8$lambda$uliQN6m3xDuXyQBcA-pwZe-2-Jg, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m15621$r8$lambda$uliQN6m3xDuXyQBcApwZe2Jg(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCode, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
