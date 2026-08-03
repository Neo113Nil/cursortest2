package com.google.ads.mediation.vungle;

/* compiled from: VungleSdkWrapper.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/google/ads/mediation/vungle/SdkWrapper;", "", "getBiddingToken", "", "context", "Landroid/content/Context;", "callback", "Lcom/vungle/ads/BidTokenCallback;", "getSdkVersion", "", com.ironsource.X3.a.f, com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "initializationListener", "Lcom/vungle/ads/InitializationListener;", "isInitialized", "", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SdkWrapper {
    void getBiddingToken(android.content.Context context, com.vungle.ads.BidTokenCallback callback);

    java.lang.String getSdkVersion();

    void init(android.content.Context context, java.lang.String appId, com.vungle.ads.InitializationListener initializationListener);

    boolean isInitialized();
}
