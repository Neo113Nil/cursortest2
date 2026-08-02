package org.betup.services.ads.rewarded;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3664q2;
import kotlin.Metadata;

/* compiled from: RewardedAdController.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&J\b\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lorg/betup/services/ads/rewarded/RewardedAdController;", "", "setListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/services/ads/rewarded/RewardedAdListener;", "preload", "activity", "Landroid/app/Activity;", "adUnitId", "", "isReady", "", "isLoading", C3664q2.v, "logicalPlacement", "isShowing", "clear", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RewardedAdController {
    void clear();

    boolean isLoading(String adUnitId);

    boolean isReady(String adUnitId);

    boolean isShowing();

    void preload(Activity activity, String adUnitId);

    void setListener(RewardedAdListener listener);

    void show(Activity activity, String adUnitId, String logicalPlacement);
}
