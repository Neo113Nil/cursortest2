package com.paypal.oslo.feature.onboarding.signup.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AddressSearchScreenKt$AddressSearchScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel) this.receiver).onAddressSearchQueryChanged(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        Camera2StreamConfigurationMap(str);
        return kotlin.Unit.INSTANCE;
    }

    AddressSearchScreenKt$AddressSearchScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel.class, "onAddressSearchQueryChanged", "onAddressSearchQueryChanged(Ljava/lang/String;)V", 0);
    }
}
