package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1", f = "PasskeyListScreen.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "emit", n = {"effect"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1.AnonymousClass1<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass1;
    }
}
