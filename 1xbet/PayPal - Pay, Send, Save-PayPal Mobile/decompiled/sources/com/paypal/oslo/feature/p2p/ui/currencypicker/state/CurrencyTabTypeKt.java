package com.paypal.oslo.feature.p2p.ui.currencypicker.state;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyTabType;", "", "action", "findTabTypeAndRun", "(ILkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyTabType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyTabTypeKt {
    public static final com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType findTabTypeAndRun(int i, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType, kotlin.Unit> function1) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType) obj).getPosition() == i) {
                break;
            }
        }
        com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType currencyTabType = (com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType) obj;
        if (currencyTabType == null) {
            return null;
        }
        function1.invoke(currencyTabType);
        return currencyTabType;
    }
}
