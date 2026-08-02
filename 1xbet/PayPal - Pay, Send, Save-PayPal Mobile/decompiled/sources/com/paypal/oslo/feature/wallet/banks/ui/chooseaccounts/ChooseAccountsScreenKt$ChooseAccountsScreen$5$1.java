package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ChooseAccountsScreenKt$ChooseAccountsScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.Boolean, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel) this.receiver).onAccountSelectionChanged(str, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.Boolean bool) {
        Camera2StreamConfigurationMap(str, bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    ChooseAccountsScreenKt$ChooseAccountsScreen$5$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.class, "onAccountSelectionChanged", "onAccountSelectionChanged(Ljava/lang/String;Z)V", 0);
    }
}
