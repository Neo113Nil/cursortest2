package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    public static final com.google.android.gms.ads.AdSize BANNER = new com.google.android.gms.ads.AdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50_mb");
    public static final com.google.android.gms.ads.AdSize FULL_BANNER = new com.google.android.gms.ads.AdSize(468, 60, "468x60_as");
    public static final com.google.android.gms.ads.AdSize LARGE_BANNER = new com.google.android.gms.ads.AdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100_as");
    public static final com.google.android.gms.ads.AdSize LEADERBOARD = new com.google.android.gms.ads.AdSize(728, 90, "728x90_as");
    public static final com.google.android.gms.ads.AdSize MEDIUM_RECTANGLE = new com.google.android.gms.ads.AdSize(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    public static final com.google.android.gms.ads.AdSize WIDE_SKYSCRAPER = new com.google.android.gms.ads.AdSize(160, 600, "160x600_as");

    @java.lang.Deprecated
    public static final com.google.android.gms.ads.AdSize SMART_BANNER = new com.google.android.gms.ads.AdSize(-1, -2, "smart_banner");
    public static final com.google.android.gms.ads.AdSize FLUID = new com.google.android.gms.ads.AdSize(-3, -4, "fluid");
    public static final com.google.android.gms.ads.AdSize INVALID = new com.google.android.gms.ads.AdSize(0, 0, "invalid");
    public static final com.google.android.gms.ads.AdSize zza = new com.google.android.gms.ads.AdSize(50, 50, "50x50_mb");

    @java.lang.Deprecated
    public static com.google.android.gms.ads.AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize zzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i, 50, 0);
        zzk.zze = true;
        return zzk;
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(android.content.Context context, int i) {
        int zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 0);
        if (zzr == -1) {
            return INVALID;
        }
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        adSize.zzh = zzr;
        adSize.zzg = true;
        return adSize;
    }

    public static com.google.android.gms.ads.AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        adSize.zzh = i2;
        adSize.zzg = true;
        if (i2 < 32) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 118);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i2);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        }
        return adSize;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.ads.AdSize getLandscapeAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize zzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i, 50, 2);
        zzk.zze = true;
        return zzk;
    }

    public static com.google.android.gms.ads.AdSize getLandscapeInlineAdaptiveBannerAdSize(android.content.Context context, int i) {
        int zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 2);
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        if (zzr == -1) {
            return INVALID;
        }
        adSize.zzh = zzr;
        adSize.zzg = true;
        return adSize;
    }

    public static com.google.android.gms.ads.AdSize getLargeAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize zzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i, 0);
        zzl.zzf = true;
        return zzl;
    }

    public static com.google.android.gms.ads.AdSize getLargeLandscapeAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize zzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i, 2);
        zzl.zzf = true;
        return zzl;
    }

    public static com.google.android.gms.ads.AdSize getLargePortraitAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize zzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i, 1);
        zzl.zzf = true;
        return zzl;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.ads.AdSize getPortraitAnchoredAdaptiveBannerAdSize(android.content.Context context, int i) {
        com.google.android.gms.ads.AdSize zzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i, 50, 1);
        zzk.zze = true;
        return zzk;
    }

    public static com.google.android.gms.ads.AdSize getPortraitInlineAdaptiveBannerAdSize(android.content.Context context, int i) {
        int zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 1);
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, 0);
        if (zzr == -1) {
            return INVALID;
        }
        adSize.zzh = zzr;
        adSize.zzg = true;
        return adSize;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.ads.AdSize)) {
            return false;
        }
        com.google.android.gms.ads.AdSize adSize = (com.google.android.gms.ads.AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public java.lang.String toString() {
        return this.zzd;
    }

    final boolean zza() {
        return this.zze;
    }

    final boolean zzb() {
        return this.zzf;
    }

    final boolean zzc() {
        return this.zzg;
    }

    final void zzd(boolean z) {
        this.zzg = true;
    }

    final void zze(int i) {
        this.zzh = i;
    }

    final int zzf() {
        return this.zzh;
    }

    final boolean zzg() {
        return this.zzi;
    }

    final void zzh(boolean z) {
        this.zzi = true;
    }

    final int zzi() {
        return this.zzj;
    }

    final void zzj(int i) {
        this.zzj = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSize(int i, int i2) {
        this(i, i2, r3.toString());
        java.lang.String valueOf = i == -1 ? "FULL" : java.lang.String.valueOf(i);
        java.lang.String valueOf2 = i2 == -2 ? "AUTO" : java.lang.String.valueOf(i2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(valueOf2).length() + 3);
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
    }

    public int getHeightInPixels(android.content.Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return com.google.android.gms.ads.internal.client.zzr.zza(context.getResources().getDisplayMetrics());
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
    }

    public int getWidthInPixels(android.content.Context context) {
        int i = this.zzb;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzr> creator = com.google.android.gms.ads.internal.client.zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    AdSize(int i, int i2, java.lang.String str) {
        if (i < 0 && i != -1 && i != -3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 26);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 27);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
    }
}
