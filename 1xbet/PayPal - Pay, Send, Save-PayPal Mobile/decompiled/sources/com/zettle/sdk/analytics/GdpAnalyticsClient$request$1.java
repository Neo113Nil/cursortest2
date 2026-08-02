package com.zettle.sdk.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class GdpAnalyticsClient$request$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.izettle.android.net.Response<java.lang.String>, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.net.Response<java.lang.String> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        ((com.zettle.sdk.analytics.CallbackWrapper) this.receiver).onResponse(response);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Response<java.lang.String> response) {
        getHighResolutionOutputSizeshNQ4ISI(response);
        return kotlin.Unit.INSTANCE;
    }

    GdpAnalyticsClient$request$1(java.lang.Object obj) {
        super(1, obj, com.zettle.sdk.analytics.CallbackWrapper.class, "onResponse", "onResponse(Lcom/izettle/android/net/Response;)V", 0);
    }
}
