package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class PersonalizedAdsScreenKt$PersonalizedAdsScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel) this.receiver).onToggleChange(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighResolutionOutputSizeshNQ4ISI(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    PersonalizedAdsScreenKt$PersonalizedAdsScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel.class, "onToggleChange", "onToggleChange(Z)V", 0);
    }
}
