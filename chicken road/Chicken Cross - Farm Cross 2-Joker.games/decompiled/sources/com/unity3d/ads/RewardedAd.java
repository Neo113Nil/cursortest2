package com.unity3d.ads;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardedAd.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/RewardedAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "show", "", "activity", "Landroid/app/Activity;", "configuration", "Lcom/unity3d/ads/ShowConfiguration;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/RewardedShowListener;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardedAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<RewardedAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;

    @JvmStatic
    public static final void load(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener) {
        INSTANCE.load(loadConfiguration, loadListener);
    }

    public RewardedAd(AdObject adObject, SafeCallbackInvoke safeCallbackInvoke) {
        CoroutineScope scope;
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new RewardedAd$1$1(this, null), 3, null);
    }

    public final AdExpiredListener<RewardedAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(AdExpiredListener<RewardedAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            rewardedShowListener = null;
        }
        rewardedAd.show(activity, showConfiguration, rewardedShowListener);
    }

    public final void show(Activity activity, ShowConfiguration configuration, RewardedShowListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), null, null, new RewardedAd$show$1(configuration, this, activity, listener, null), 3, null);
    }

    /* compiled from: RewardedAd.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/RewardedAd$Companion;", "", "<init>", "()V", "load", "", "configuration", "Lcom/unity3d/ads/LoadConfiguration;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/RewardedAd;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void load(LoadConfiguration configuration, LoadListener<RewardedAd> listener) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(listener, "listener");
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), null, null, new RewardedAd$Companion$load$1(configuration, listener, null), 3, null);
        }
    }
}
