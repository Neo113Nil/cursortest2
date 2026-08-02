package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PersonalInfoScreenKt$PersonalInfoScreen$12$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent personalInfoEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel) this.receiver).processEvent(personalInfoEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent personalInfoEvent) {
        Camera2StreamConfigurationMap(personalInfoEvent);
        return kotlin.Unit.INSTANCE;
    }

    PersonalInfoScreenKt$PersonalInfoScreen$12$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoEvent;)V", 0);
    }
}
