package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOffersScreenKt$ActiveOffersListScreen$lambda$1$0$$inlined$items$default$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoFpsRangesFor.get(i));
    }

    public ActiveOffersScreenKt$ActiveOffersListScreen$lambda$1$0$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
