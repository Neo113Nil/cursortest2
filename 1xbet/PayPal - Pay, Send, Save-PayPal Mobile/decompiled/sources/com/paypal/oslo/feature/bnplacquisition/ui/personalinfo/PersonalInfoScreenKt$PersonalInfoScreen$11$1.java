package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PersonalInfoScreenKt$PersonalInfoScreen$11$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController) this.receiver).scrollTo(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighSpeedVideoFpsRanges(str);
        return kotlin.Unit.INSTANCE;
    }

    PersonalInfoScreenKt$PersonalInfoScreen$11$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController.class, "scrollTo", "scrollTo(Ljava/lang/String;)V", 0);
    }
}
