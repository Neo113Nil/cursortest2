package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.pds.components.MenuItem, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.access$handleStateSelect((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel) this.receiver, menuItem);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.pds.components.MenuItem menuItem) {
        getHighResolutionOutputSizeshNQ4ISI(menuItem);
        return kotlin.Unit.INSTANCE;
    }

    PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$2(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.class, "handleStateSelect", "handleStateSelect(Lcom/paypal/pds/components/MenuItem;)V", 0);
    }
}
