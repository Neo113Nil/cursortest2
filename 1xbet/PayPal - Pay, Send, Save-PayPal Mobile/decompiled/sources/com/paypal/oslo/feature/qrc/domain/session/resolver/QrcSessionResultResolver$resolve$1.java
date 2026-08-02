package com.paypal.oslo.feature.qrc.domain.session.resolver;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver", f = "QrcSessionResultResolver.kt", i = {0}, l = {30}, m = "resolve", n = {"qrcSession"}, nl = {31}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class QrcSessionResultResolver$resolve$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.resolve(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QrcSessionResultResolver$resolve$1(com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver$resolve$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = qrcSessionResultResolver;
    }
}
