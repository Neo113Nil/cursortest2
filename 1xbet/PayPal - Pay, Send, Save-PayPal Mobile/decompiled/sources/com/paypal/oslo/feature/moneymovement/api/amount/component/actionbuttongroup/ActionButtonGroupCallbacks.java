package com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R'\u0010\u0012\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0014\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "", "Lkotlin/Function0;", "", "getOnPrimaryClick", "()Lkotlin/jvm/functions/Function0;", "onPrimaryClick", "getOnSecondaryClick", "onSecondaryClick", "getOnTertiaryClick", "onTertiaryClick", "getOnPrimaryLongClick", "onPrimaryLongClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getOnDisclaimerLinkClick", "()Lkotlin/jvm/functions/Function1;", "onDisclaimerLinkClick", "getOnFooterNoteLinkClick", "onFooterNoteLinkClick", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ActionButtonGroupCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion INSTANCE = com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion.Camera2StreamConfigurationMap;

    default kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDisclaimerLinkClick() {
        return null;
    }

    default kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnFooterNoteLinkClick() {
        return null;
    }

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryClick();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryLongClick();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryClick();

    kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryClick();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDisclaimerLinkClick(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks) {
            return com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.super.getOnDisclaimerLinkClick();
        }

        @java.lang.Deprecated
        public static kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnFooterNoteLinkClick(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks) {
            return com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.super.getOnFooterNoteLinkClick();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008c\u0001\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001b\b\u0002\u0010\r\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onPrimaryClick", "onSecondaryClick", "onTertiaryClick", "onPrimaryLongClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onDisclaimerLinkClick", "onFooterNoteLinkClick", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "invoke", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion();

        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks invoke$default(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion companion, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            if ((i & 2) != 0) {
                function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks$Companion$$ExternalSyntheticLambda1
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
                function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            return companion.invoke(function0, function05, function03, (i & 8) != 0 ? null : function04, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : function12);
        }

        public final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks invoke(final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryClick, final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryClick, final kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryClick, final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryLongClick, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDisclaimerLinkClick, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFooterNoteLinkClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPrimaryClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSecondaryClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTertiaryClick, "");
            return new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks(onPrimaryClick, onSecondaryClick, onTertiaryClick, onPrimaryLongClick, onDisclaimerLinkClick, onFooterNoteLinkClick) { // from class: com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks$Companion$invoke$4
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onDisclaimerLinkClick;
                private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onFooterNoteLinkClick;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryClick;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryLongClick;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryClick;
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryClick;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.onPrimaryClick = onPrimaryClick;
                    this.onSecondaryClick = onSecondaryClick;
                    this.onTertiaryClick = onTertiaryClick;
                    this.onPrimaryLongClick = onPrimaryLongClick;
                    this.onDisclaimerLinkClick = onDisclaimerLinkClick;
                    this.onFooterNoteLinkClick = onFooterNoteLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryClick() {
                    return this.onPrimaryClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryClick() {
                    return this.onSecondaryClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryClick() {
                    return this.onTertiaryClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryLongClick() {
                    return this.onPrimaryLongClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDisclaimerLinkClick() {
                    return this.onDisclaimerLinkClick;
                }

                @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
                public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnFooterNoteLinkClick() {
                    return this.onFooterNoteLinkClick;
                }
            };
        }
    }
}
