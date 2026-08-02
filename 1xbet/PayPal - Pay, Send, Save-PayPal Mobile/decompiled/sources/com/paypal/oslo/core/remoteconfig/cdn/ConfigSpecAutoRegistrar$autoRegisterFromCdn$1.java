package com.paypal.oslo.core.remoteconfig.cdn;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar", f = "ConfigSpecAutoRegistrar.kt", i = {}, l = {58}, m = "autoRegisterFromCdn", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class ConfigSpecAutoRegistrar$autoRegisterFromCdn$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.autoRegisterFromCdn(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigSpecAutoRegistrar$autoRegisterFromCdn$1(com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar configSpecAutoRegistrar, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar$autoRegisterFromCdn$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = configSpecAutoRegistrar;
    }
}
