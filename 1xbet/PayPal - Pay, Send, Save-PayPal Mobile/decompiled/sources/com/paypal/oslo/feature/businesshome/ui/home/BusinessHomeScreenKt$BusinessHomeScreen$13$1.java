package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BusinessHomeScreenKt$BusinessHomeScreen$13$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel) this.receiver).loadData$business_home_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    BusinessHomeScreenKt$BusinessHomeScreen$13$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.class, "loadData", "loadData$business_home_prodRelease()V", 0);
    }
}
