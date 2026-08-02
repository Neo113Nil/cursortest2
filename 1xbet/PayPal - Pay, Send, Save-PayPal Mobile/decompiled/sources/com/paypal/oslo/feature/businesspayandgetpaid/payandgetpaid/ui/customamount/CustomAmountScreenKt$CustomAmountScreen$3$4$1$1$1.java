package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CustomAmountScreenKt$CustomAmountScreen$3$4$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel) this.receiver).onAmountChange(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor(str);
        return kotlin.Unit.INSTANCE;
    }

    CustomAmountScreenKt$CustomAmountScreen$3$4$1$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.class, "onAmountChange", "onAmountChange(Ljava/lang/String;)V", 0);
    }
}
