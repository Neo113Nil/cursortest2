package com.paypal.oslo.feature.balance.di.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.domain.model.Money, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) this.receiver).formatScaledMoney(money, continuation);
    }

    NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$2$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class, "formatScaledMoney", "formatScaledMoney(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
