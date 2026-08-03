package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbbt {
    private long zza = -1;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;

    private static boolean zzl(android.view.View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((android.view.ViewGroup) view).getChildAt(0);
            }
            java.lang.Object invoke = view.getClass().getMethod("getAdConfiguration", new java.lang.Class[0]).invoke(view, new java.lang.Object[0]);
            java.lang.Integer num = (java.lang.Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            java.lang.String str = (java.lang.String) invoke.getClass().getMethod("adTypeToString", java.lang.Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ReflectiveOperationException | java.lang.SecurityException unused) {
            return false;
        }
    }

    private static android.util.DisplayMetrics zzm(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (java.lang.NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public final void zza() {
        this.zzb = this.zza;
        this.zza = android.os.SystemClock.uptimeMillis();
    }

    public final void zzb(android.content.Context context, android.view.View view) {
        this.zzd = this.zzc;
        this.zzc = android.os.SystemClock.uptimeMillis();
        long j = this.zze;
        if (j != -1) {
            this.zzf = j;
        }
        android.util.DisplayMetrics zzm = zzm(context);
        int i = zzm.widthPixels * zzm.heightPixels;
        if (view != null) {
            int min = java.lang.Math.min(view.getWidth(), zzm.widthPixels) * java.lang.Math.min(view.getHeight(), zzm.heightPixels);
            if (min + min >= i || (min == 0 && zzl(view))) {
                this.zze = this.zzc;
                return;
            }
        }
        this.zze = -1L;
    }

    public final void zzc() {
        this.zzh = this.zzg;
        this.zzg = android.os.SystemClock.uptimeMillis();
    }

    public final long zzd() {
        return this.zzb;
    }

    public final long zze() {
        return this.zza;
    }

    public final long zzf() {
        return this.zzc;
    }

    public final long zzg() {
        return this.zzd;
    }

    public final long zzh() {
        return this.zzf;
    }

    public final long zzi() {
        return this.zze;
    }

    public final long zzj() {
        return this.zzg;
    }

    public final long zzk() {
        return this.zzh;
    }
}
