package com.paypal.oslo.feature.moneymovement.api.ui.plan;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R%\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R0\u0010\u0016\u001a\u001e\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R0\u0010\u0018\u001a\u001e\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R0\u0010\u001a\u001a\u001e\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R%\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;", "", "Lkotlin/Function0;", "", "getOnExpand", "()Lkotlin/jvm/functions/Function0;", "onExpand", "getOnCollapse", "onCollapse", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getOnSelectOption", "()Lkotlin/jvm/functions/Function1;", "onSelectOption", "getOnAddPaymentMethod", "onAddPaymentMethod", "getOnSeeUnavailableOptions", "onSeeUnavailableOptions", "Lkotlin/Function2;", "getOnCvvChanged", "()Lkotlin/jvm/functions/Function2;", "onCvvChanged", "getOnCvvSubmit", "onCvvSubmit", "getOnDisclosureLinkClick", "onDisclosureLinkClick", "getOnAgreeAndAddBank", "onAgreeAndAddBank", "getOnAddAnotherWayToPay", "onAddAnotherWayToPay", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PlanAccordionCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion.getHighSpeedVideoFpsRanges;

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAddAnotherWayToPay();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddPaymentMethod();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnAgreeAndAddBank();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse();

    kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnCvvChanged();

    kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnCvvSubmit();

    kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnDisclosureLinkClick();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnSeeUnavailableOptions();

    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSelectOption();

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0083\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042$\b\u0002\u0010\u000f\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u00050\r2$\b\u0002\u0010\u0010\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u00050\r2$\b\u0002\u0010\u0011\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u00050\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u00050\bH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onExpand", "onCollapse", "Lkotlin/Function1;", "", "onSelectOption", "onAddPaymentMethod", "onSeeUnavailableOptions", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "onCvvChanged", "onCvvSubmit", "onDisclosureLinkClick", "onAgreeAndAddBank", "onAddAnotherWayToPay", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion();

        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand, final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelectOption, final kotlin.jvm.functions.Function0<kotlin.Unit> onAddPaymentMethod, final kotlin.jvm.functions.Function0<kotlin.Unit> onSeeUnavailableOptions, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onCvvChanged, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onCvvSubmit, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onDisclosureLinkClick, final kotlin.jvm.functions.Function0<kotlin.Unit> onAgreeAndAddBank, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAddAnotherWayToPay) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCollapse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelectOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAddPaymentMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSeeUnavailableOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCvvChanged, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCvvSubmit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDisclosureLinkClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAgreeAndAddBank, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAddAnotherWayToPay, "");
            return new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks(onExpand, onCollapse, onSelectOption, onAddPaymentMethod, onSeeUnavailableOptions, onCvvChanged, onCvvSubmit, onDisclosureLinkClick, onAgreeAndAddBank, onAddAnotherWayToPay) { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$invoke$11
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onAddAnotherWayToPay;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onAddPaymentMethod;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onAgreeAndAddBank;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onCollapse;
                private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onCvvChanged;
                private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onCvvSubmit;
                private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onDisclosureLinkClick;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onExpand;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onSeeUnavailableOptions;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onSelectOption;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onExpand = onExpand;
                    this.onCollapse = onCollapse;
                    this.onSelectOption = onSelectOption;
                    this.onAddPaymentMethod = onAddPaymentMethod;
                    this.onSeeUnavailableOptions = onSeeUnavailableOptions;
                    this.onCvvChanged = onCvvChanged;
                    this.onCvvSubmit = onCvvSubmit;
                    this.onDisclosureLinkClick = onDisclosureLinkClick;
                    this.onAgreeAndAddBank = onAgreeAndAddBank;
                    this.onAddAnotherWayToPay = onAddAnotherWayToPay;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnExpand() {
                    return this.onExpand;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCollapse() {
                    return this.onCollapse;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSelectOption() {
                    return this.onSelectOption;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddPaymentMethod() {
                    return this.onAddPaymentMethod;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSeeUnavailableOptions() {
                    return this.onSeeUnavailableOptions;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnCvvChanged() {
                    return this.onCvvChanged;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnCvvSubmit() {
                    return this.onCvvSubmit;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnDisclosureLinkClick() {
                    return this.onDisclosureLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAgreeAndAddBank() {
                    return this.onAgreeAndAddBank;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAddAnotherWayToPay() {
                    return this.onAddAnotherWayToPay;
                }
            };
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$2PTMKqcOIiM2EJRmAag1jwtoxLE(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$cVRzragHusDqTHFdD6KIEZQzV6Y(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$g2adtQY_j4GG8dly2ErUscijucc(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$knMh_9CSmIBinwOiZC7pfOhQAUE(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$qb3V3MKibja2IMQYYb720txqjxs(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
