package com.zettle.sdk.core.os;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class LocationInfoImpl$doCheckPermission$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.zettle.sdk.core.os.LocationInfo.State, com.zettle.sdk.core.os.LocationInfo.State> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final com.zettle.sdk.core.os.LocationInfo.State invoke(com.zettle.sdk.core.os.LocationInfo.State state) {
        com.zettle.sdk.core.os.LocationInfo.State highSpeedVideoSizes;
        highSpeedVideoSizes = ((com.zettle.sdk.core.os.LocationInfoImpl) this.receiver).getHighSpeedVideoSizes();
        return highSpeedVideoSizes;
    }

    LocationInfoImpl$doCheckPermission$1(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.core.os.LocationInfoImpl.class, "getHighSpeedVideoSizes", "getHighSpeedVideoSizes()Lcom/zettle/sdk/core/os/LocationInfo$State;", 0);
    }
}
