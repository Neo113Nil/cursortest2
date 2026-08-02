package com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ContactUsScreenKt$ContactUsScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent contactUsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactUsEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel) this.receiver).processEvent(contactUsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent contactUsEvent) {
        getHighSpeedVideoFpsRanges(contactUsEvent);
        return kotlin.Unit.INSTANCE;
    }

    ContactUsScreenKt$ContactUsScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;)V", 0);
    }
}
