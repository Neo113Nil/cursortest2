package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AccountVisibilityScreenKt$AccountVisibilityScreen$granularCallbacks$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel) this.receiver).updateGranularPersonalProfile(z, str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, java.lang.String str) {
        getHighSpeedVideoFpsRangesFor(bool.booleanValue(), str);
        return kotlin.Unit.INSTANCE;
    }

    AccountVisibilityScreenKt$AccountVisibilityScreen$granularCallbacks$1$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.class, "updateGranularPersonalProfile", "updateGranularPersonalProfile(ZLjava/lang/String;)V", 0);
    }
}
