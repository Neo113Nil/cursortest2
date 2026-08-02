package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType, java.lang.String, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType fieldType, java.lang.String str) {
        java.lang.String m16558unboximpl = fieldType.m16558unboximpl();
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m16558unboximpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel) this.receiver).m16386updateFieldhlZgF5g(m16558unboximpl, str2);
        return kotlin.Unit.INSTANCE;
    }

    PersonalInfoViewModel$createCallbackMapForPersonalInfo$1$map$1$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.class, "updateField", "updateField-hlZgF5g(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }
}
