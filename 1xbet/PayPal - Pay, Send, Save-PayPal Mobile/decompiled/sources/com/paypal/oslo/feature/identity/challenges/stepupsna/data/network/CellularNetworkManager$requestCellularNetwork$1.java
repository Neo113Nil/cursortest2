package com.paypal.oslo.feature.identity.challenges.stepupsna.data.network;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager", f = "CellularNetworkManager.kt", i = {0}, l = {97}, m = "requestCellularNetwork", n = {"networkRequest"}, nl = {116}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CellularNetworkManager$requestCellularNetwork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellularNetworkManager$requestCellularNetwork$1(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cellularNetworkManager;
    }
}
