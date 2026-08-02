package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressAddScreenKt$AddressAddSuccessContent$1$4$1$1 implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId, java.lang.String, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId2 = formFieldId;
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged(formFieldId2, str2));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    AddressAddScreenKt$AddressAddSuccessContent$1$4$1$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
