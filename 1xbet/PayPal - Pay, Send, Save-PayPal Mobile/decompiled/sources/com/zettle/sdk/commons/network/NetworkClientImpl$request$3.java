package com.zettle.sdk.commons.network;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class NetworkClientImpl$request$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        ((com.zettle.sdk.commons.network.NetworkClientImpl.CallbackWrapper) this.receiver).getHighResolutionOutputSizeshNQ4ISI(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        getHighSpeedVideoFpsRangesFor(th);
        return kotlin.Unit.INSTANCE;
    }

    NetworkClientImpl$request$3(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.commons.network.NetworkClientImpl.CallbackWrapper.class, "getHighResolutionOutputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI(Ljava/lang/Throwable;)V", 0);
    }
}
