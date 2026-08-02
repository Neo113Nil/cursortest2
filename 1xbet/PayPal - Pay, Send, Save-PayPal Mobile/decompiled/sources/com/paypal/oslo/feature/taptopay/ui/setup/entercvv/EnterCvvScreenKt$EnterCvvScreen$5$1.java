package com.paypal.oslo.feature.taptopay.ui.setup.entercvv;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class EnterCvvScreenKt$EnterCvvScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Character, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(char c) {
        ((com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel) this.receiver).onDigitInput(c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Character ch) {
        getHighSpeedVideoSizes(ch.charValue());
        return kotlin.Unit.INSTANCE;
    }

    EnterCvvScreenKt$EnterCvvScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvViewModel.class, "onDigitInput", "onDigitInput(C)V", 0);
    }
}
