package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class EmailConfirmationScreenKt$EmailConfirmationScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent emailConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationEvent, "");
        ((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel) this.receiver).processEvent(emailConfirmationEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent emailConfirmationEvent) {
        getHighSpeedVideoFpsRanges(emailConfirmationEvent);
        return kotlin.Unit.INSTANCE;
    }

    EmailConfirmationScreenKt$EmailConfirmationScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationEvent;)V", 0);
    }
}
