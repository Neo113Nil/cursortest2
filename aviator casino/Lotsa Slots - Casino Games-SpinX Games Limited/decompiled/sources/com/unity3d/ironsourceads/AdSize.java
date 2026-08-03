package com.unity3d.ironsourceads;

/* loaded from: classes5.dex */
public final class AdSize {
    public static final com.unity3d.ironsourceads.AdSize.Companion Companion = new com.unity3d.ironsourceads.AdSize.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8006a;
    private final int b;
    private final java.lang.String c;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize banner() {
            return new com.unity3d.ironsourceads.AdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, com.ironsource.mediationsdk.j.f6439a, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize large() {
            return new com.unity3d.ironsourceads.AdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, com.ironsource.mediationsdk.j.b, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize leaderboard() {
            return new com.unity3d.ironsourceads.AdSize(728, 90, com.ironsource.mediationsdk.j.d, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize mediumRectangle() {
            return new com.unity3d.ironsourceads.AdSize(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, com.ironsource.mediationsdk.j.g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i, int i2, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize banner() {
        return Companion.banner();
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize large() {
        return Companion.large();
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.b;
    }

    public final java.lang.String getSizeDescription() {
        return this.c;
    }

    public final int getWidth() {
        return this.f8006a;
    }

    private AdSize(int i, int i2, java.lang.String str) {
        this.f8006a = i;
        this.b = i2;
        this.c = str;
    }
}
