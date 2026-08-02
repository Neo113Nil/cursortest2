package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AccountVisibilityScreenKt$AccountVisibilityScreen$simplifiedCallbacks$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(boolean z) {
        ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel) this.receiver).updateAllowFindByIdentifiers(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoFpsRangesFor(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    AccountVisibilityScreenKt$AccountVisibilityScreen$simplifiedCallbacks$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.class, "updateAllowFindByIdentifiers", "updateAllowFindByIdentifiers(Z)V", 0);
    }
}
