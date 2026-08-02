package com.paypal.oslo.feature.balance.di.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.balance.domain.model.Money, java.lang.Integer, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.domain.model.Money money, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) this.receiver).formatMoney(money, i, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.Money money, java.lang.Integer num, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return getHighSpeedVideoFpsRangesFor(money, num.intValue(), continuation);
    }

    NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$1$1(java.lang.Object obj) {
        super(3, obj, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class, "formatMoney", "formatMoney(Lcom/paypal/oslo/feature/balance/domain/model/Money;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
