package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$5 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Terms link pressed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("linkText", str), kotlin.TuplesKt.to("linkUrl", str2)), null, 4, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
        Camera2StreamConfigurationMap(str, str2);
        return kotlin.Unit.INSTANCE;
    }

    PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$5(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.class, "onLinkedPressed", "onLinkedPressed(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }
}
