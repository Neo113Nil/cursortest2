package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonOptionsBottomSheetDefaults;", "", "<init>", "()V", "Lcom/paypal/pds/components/BottomSheetController;", "controller", "Lkotlin/Function0;", "", "onDismiss", "(Lcom/paypal/pds/components/BottomSheetController;)Lkotlin/jvm/functions/Function0;", "onCloseButtonClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonOptionsBottomSheetDefaults {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults INSTANCE = new com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults();

    private CommonOptionsBottomSheetDefaults() {
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss(final com.paypal.pds.components.BottomSheetController controller) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults.$r8$lambda$OUQroSUNdfb9DbNKoc8earSpubc(com.paypal.pds.components.BottomSheetController.this);
            }
        };
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClick(final com.paypal.pds.components.BottomSheetController controller) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults.$r8$lambda$5asc7GLudg2wE6AIVrPXCt8d4jA(com.paypal.pds.components.BottomSheetController.this);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5asc7GLudg2wE6AIVrPXCt8d4jA(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OUQroSUNdfb9DbNKoc8earSpubc(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }
}
