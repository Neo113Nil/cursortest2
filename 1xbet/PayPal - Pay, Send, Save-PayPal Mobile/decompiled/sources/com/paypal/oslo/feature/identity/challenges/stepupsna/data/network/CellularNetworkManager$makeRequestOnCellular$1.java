package com.paypal.oslo.feature.identity.challenges.stepupsna.data.network;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager", f = "CellularNetworkManager.kt", i = {0, 0}, l = {66}, m = "makeRequestOnCellular", n = {"url", "requestBody"}, nl = {67}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class CellularNetworkManager$makeRequestOnCellular$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.makeRequestOnCellular(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellularNetworkManager$makeRequestOnCellular$1(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$makeRequestOnCellular$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cellularNetworkManager;
    }
}
