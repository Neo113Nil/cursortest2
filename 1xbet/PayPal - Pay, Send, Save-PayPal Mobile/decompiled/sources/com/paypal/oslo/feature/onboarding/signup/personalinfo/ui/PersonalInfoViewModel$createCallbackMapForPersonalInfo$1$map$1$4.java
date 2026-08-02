package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$4 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.access$handleStateSearch((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel) this.receiver, str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor(str);
        return kotlin.Unit.INSTANCE;
    }

    PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$4(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.class, "handleStateSearch", "handleStateSearch(Ljava/lang/String;)V", 0);
    }
}
