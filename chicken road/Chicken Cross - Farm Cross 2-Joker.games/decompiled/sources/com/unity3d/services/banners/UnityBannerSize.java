package com.unity3d.services.banners;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.misc.ViewUtilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: UnityBannerSize.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/banners/UnityBannerSize;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    private static final UnityBannerSize standard = new UnityBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);

    @JvmStatic
    public static final UnityBannerSize getDynamicSize(Context context) {
        return INSTANCE.getDynamicSize(context);
    }

    /* compiled from: UnityBannerSize.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/banners/UnityBannerSize$Companion;", "", "<init>", "()V", "leaderboard", "Lcom/unity3d/services/banners/UnityBannerSize;", "getLeaderboard", "()Lcom/unity3d/services/banners/UnityBannerSize;", "iabStandard", "getIabStandard", "standard", "getStandard", "getDynamicSize", "context", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }

        @JvmStatic
        public final UnityBannerSize getDynamicSize(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int roundToInt = MathKt.roundToInt(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            return roundToInt >= getLeaderboard().getWidth() ? getLeaderboard() : roundToInt >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
