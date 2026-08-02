package com.paypal.oslo.feature.moneymovement.api.success;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR0\u0010\u0010\u001a\u001e\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u00030\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;", "", "Lkotlin/Function0;", "", "getOnCloseButtonClick", "()Lkotlin/jvm/functions/Function0;", "onCloseButtonClick", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "getActionButtonCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "actionButtonCallbacks", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "getOnLinkClick", "()Lkotlin/jvm/functions/Function2;", "onLinkClick", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MMPSuccessScreenCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks getActionButtonCallbacks();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnCloseButtonClick();

    kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnLinkClick();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onCloseButtonClick", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "actionButtonCallbacks", "Lkotlin/Function2;", "", "onLinkClick", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion companion, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 2) != 0) {
                actionButtonGroupCallbacks = com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.INSTANCE, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, null, null, null, 48, null);
            }
            if ((i & 4) != 0) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion.m15614$r8$lambda$Zdj59ndjqBC3YtYg_va1ME5hIU((java.lang.String) obj2, (java.lang.String) obj3);
                    }
                };
            }
            return companion.invoke(function0, actionButtonGroupCallbacks, function2);
        }

        public final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClick, final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonCallbacks, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onLinkClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCloseButtonClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonCallbacks, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLinkClick, "");
            return new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks(onCloseButtonClick, actionButtonCallbacks, onLinkClick) { // from class: com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks$Companion$invoke$6
                private final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonCallbacks;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClick;
                private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onLinkClick;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onCloseButtonClick = onCloseButtonClick;
                    this.actionButtonCallbacks = actionButtonCallbacks;
                    this.onLinkClick = onLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCloseButtonClick() {
                    return this.onCloseButtonClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks
                public final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks getActionButtonCallbacks() {
                    return this.actionButtonCallbacks;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks
                public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnLinkClick() {
                    return this.onLinkClick;
                }
            };
        }

        /* renamed from: $r8$lambda$Zdj59ndjqBC3YtYg_va1-ME5hIU, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m15614$r8$lambda$Zdj59ndjqBC3YtYg_va1ME5hIU(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
