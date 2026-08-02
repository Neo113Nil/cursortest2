package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AccountVisibilityScreenKt$AccountVisibilityScreen$onRetry$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges() {
        ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel) this.receiver).retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    AccountVisibilityScreenKt$AccountVisibilityScreen$onRetry$1$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.class, "retry", "retry()V", 0);
    }
}
