package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgpw implements com.google.android.gms.internal.ads.zzgpe {
    private long zza = -1;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private final long zzi = android.os.SystemClock.uptimeMillis();

    public zzgpw(com.google.android.gms.internal.ads.zzgcn zzgcnVar) {
    }

    private static boolean zza(android.view.View view) {
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
        } catch (java.lang.NullPointerException | java.lang.ReflectiveOperationException | java.lang.SecurityException unused) {
            return false;
        }
    }

    private static android.util.DisplayMetrics zze(android.content.Context context) {
        android.view.WindowManager windowManager;
        if ((android.os.Build.VERSION.SDK_INT >= 33 && !context.isUiContext()) || (windowManager = (android.view.WindowManager) context.getSystemService("window")) == null) {
            return null;
        }
        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (java.lang.NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private final void zzf(java.util.Map map) {
        map.put("tcq", java.lang.Long.valueOf(this.zza));
        map.put("tpq", java.lang.Long.valueOf(this.zzb));
        map.put("tcc", java.lang.Long.valueOf(this.zzg));
        map.put("tpc", java.lang.Long.valueOf(this.zzh));
        map.put("tpv", java.lang.Long.valueOf(this.zzd));
        map.put("tcv", java.lang.Long.valueOf(this.zzc));
        map.put("tchv", java.lang.Long.valueOf(this.zze));
        map.put("tphv", java.lang.Long.valueOf(this.zzf));
        map.put("tst", java.lang.Long.valueOf(this.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final synchronized void zzb(java.util.Map map) {
        this.zzb = this.zza;
        this.zza = android.os.SystemClock.uptimeMillis();
        zzf(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (zza(r8) != false) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzgpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
        this.zzd = this.zzc;
        this.zzc = android.os.SystemClock.uptimeMillis();
        long j = this.zze;
        if (j != -1) {
            this.zzf = j;
        }
        android.util.DisplayMetrics zze = zze(context);
        if (zze != null) {
            int i = zze.widthPixels * zze.heightPixels;
            if (view != null) {
                int min = java.lang.Math.min(view.getWidth(), zze.widthPixels) * java.lang.Math.min(view.getHeight(), zze.heightPixels);
                if (min + min < i) {
                    if (min == 0) {
                    }
                }
                this.zze = this.zzc;
                zzf(map);
            }
        }
        this.zze = -1L;
        zzf(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final synchronized void zzd(java.util.Map map) {
        this.zzh = this.zzg;
        this.zzg = android.os.SystemClock.uptimeMillis();
        zzf(map);
    }
}
