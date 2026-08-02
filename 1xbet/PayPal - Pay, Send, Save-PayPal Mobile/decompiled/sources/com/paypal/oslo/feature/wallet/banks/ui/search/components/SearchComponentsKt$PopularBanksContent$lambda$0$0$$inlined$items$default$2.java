package com.paypal.oslo.feature.wallet.banks.ui.search.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchComponentsKt$PopularBanksContent$lambda$0$0$$inlined$items$default$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoSizes.get(i));
    }

    public SearchComponentsKt$PopularBanksContent$lambda$0$0$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = list;
    }
}
