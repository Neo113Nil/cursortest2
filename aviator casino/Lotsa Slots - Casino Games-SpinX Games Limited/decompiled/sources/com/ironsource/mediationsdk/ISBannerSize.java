package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class ISBannerSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f6392a;
    private final int b;
    private final java.lang.String c;
    private boolean d;
    com.ironsource.T7 e;
    public static final com.ironsource.mediationsdk.ISBannerSize BANNER = com.ironsource.mediationsdk.j.a(com.ironsource.mediationsdk.j.f6439a, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final com.ironsource.mediationsdk.ISBannerSize LARGE = com.ironsource.mediationsdk.j.a(com.ironsource.mediationsdk.j.b, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final com.ironsource.mediationsdk.ISBannerSize RECTANGLE = com.ironsource.mediationsdk.j.a(com.ironsource.mediationsdk.j.c, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    protected static final com.ironsource.mediationsdk.ISBannerSize f = com.ironsource.mediationsdk.j.a();
    public static final com.ironsource.mediationsdk.ISBannerSize SMART = com.ironsource.mediationsdk.j.a(com.ironsource.mediationsdk.j.e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this(com.ironsource.mediationsdk.j.f, i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return com.ironsource.mediationsdk.j.b(i);
    }

    void a(com.ironsource.T7 t7) {
        if (com.ironsource.mediationsdk.j.a(t7, this.f6392a, this.b)) {
            this.e = t7;
        }
    }

    public java.lang.String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.f6392a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals(com.ironsource.mediationsdk.j.e);
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public com.unity3d.mediation.LevelPlayAdSize toLevelPlayAdSize(android.content.Context context) {
        if (isAdaptive()) {
            return com.unity3d.mediation.LevelPlayAdSize.createAdaptiveAdSize(context, java.lang.Integer.valueOf(this.e.d()));
        }
        java.lang.String description = getDescription();
        description.hashCode();
        description.hashCode();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return com.unity3d.mediation.LevelPlayAdSize.LARGE;
            case "BANNER":
                return com.unity3d.mediation.LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return com.unity3d.mediation.LevelPlayAdSize.createCustomSize(this.f6392a, this.b);
            default:
                return com.unity3d.mediation.LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(java.lang.String str, int i, int i2) {
        this.c = str;
        this.f6392a = i;
        this.b = i2;
        this.e = new com.ironsource.T7(i, i2);
    }
}
