package org.betup.services.ads.interstitial;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3664q2;
import kotlin.Metadata;

/* compiled from: InterstitialAdController.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lorg/betup/services/ads/interstitial/InterstitialAdController;", "", "setListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/services/ads/interstitial/InterstitialAdListener;", "preload", "activity", "Landroid/app/Activity;", "adUnitId", "", "isReady", "", C3664q2.v, "clear", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface InterstitialAdController {
    void clear();

    boolean isReady(String adUnitId);

    void preload(Activity activity, String adUnitId);

    void setListener(InterstitialAdListener listener);

    boolean show(Activity activity, String adUnitId);
}
