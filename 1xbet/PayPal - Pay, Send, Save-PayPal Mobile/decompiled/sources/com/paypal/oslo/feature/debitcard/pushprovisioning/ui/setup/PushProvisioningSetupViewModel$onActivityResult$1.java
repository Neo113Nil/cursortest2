package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class PushProvisioningSetupViewModel$onActivityResult$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent pushProvisioningSetupEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningSetupEvent, "");
        ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel) this.receiver).processEvent(pushProvisioningSetupEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent pushProvisioningSetupEvent) {
        getHighSpeedVideoFpsRangesFor(pushProvisioningSetupEvent);
        return kotlin.Unit.INSTANCE;
    }

    PushProvisioningSetupViewModel$onActivityResult$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
