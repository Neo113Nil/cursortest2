package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSelectionListKt$AddressSelectionList$lambda$0$0$$inlined$itemsIndexed$default$1 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ java.util.List getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRanges.get(i));
    }

    public AddressSelectionListKt$AddressSelectionList$lambda$0$0$$inlined$itemsIndexed$default$1(kotlin.jvm.functions.Function2 function2, java.util.List list) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
