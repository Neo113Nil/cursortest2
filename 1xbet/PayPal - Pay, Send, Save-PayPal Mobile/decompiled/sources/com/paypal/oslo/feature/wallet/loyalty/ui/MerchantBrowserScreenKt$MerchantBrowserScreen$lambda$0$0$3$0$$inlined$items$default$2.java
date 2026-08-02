package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ java.util.List Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoFpsRanges.invoke(this.Camera2StreamConfigurationMap.get(i));
    }

    public MerchantBrowserScreenKt$MerchantBrowserScreen$lambda$0$0$3$0$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = list;
    }
}
