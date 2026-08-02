package com.zettle.sdk.commons.network;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class NetworkClientImpl$request$5 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.izettle.android.net.Response<java.lang.String>, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.Response<java.lang.String> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        ((com.zettle.sdk.commons.network.NetworkClientImpl.CallbackWrapper) this.receiver).getHighSpeedVideoFpsRanges(response);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Response<java.lang.String> response) {
        getHighSpeedVideoFpsRanges(response);
        return kotlin.Unit.INSTANCE;
    }

    NetworkClientImpl$request$5(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.commons.network.NetworkClientImpl.CallbackWrapper.class, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRanges(Lcom/izettle/android/net/Response;)V", 0);
    }
}
