package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BusinessHomeScreenKt$BusinessHomeScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType stepType) {
        com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType stepType2 = stepType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepType2, "");
        ((com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel) this.receiver).onStepClick$business_home_prodRelease(stepType2);
        return kotlin.Unit.INSTANCE;
    }

    BusinessHomeScreenKt$BusinessHomeScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel.class, "onStepClick", "onStepClick$business_home_prodRelease(Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData$StepType;)V", 0);
    }
}
