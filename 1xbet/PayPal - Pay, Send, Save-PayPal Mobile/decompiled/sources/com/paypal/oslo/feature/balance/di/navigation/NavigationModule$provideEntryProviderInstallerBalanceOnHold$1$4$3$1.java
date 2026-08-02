package com.paypal.oslo.feature.balance.di.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.String invoke(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) this.receiver).formatDate(str);
    }

    NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class, "formatDate", "formatDate(Ljava/lang/String;)Ljava/lang/String;", 0);
    }
}
