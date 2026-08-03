package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezs implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final java.util.Set zzd;

    public zzezs(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.view.ViewGroup viewGroup, android.content.Context context, java.util.Set set) {
        this.zza = zzhcgVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzezs.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 22;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzezt zzc() {
        android.view.ViewGroup viewGroup;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgR)).booleanValue() && (viewGroup = this.zzb) != null && this.zzd.contains("banner")) {
            return new com.google.android.gms.internal.ads.zzezt(java.lang.Boolean.valueOf(viewGroup.isHardwareAccelerated()));
        }
        java.lang.Boolean bool = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgS)).booleanValue() && this.zzd.contains("native")) {
            android.content.Context context = this.zzc;
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                android.view.Window window = activity.getWindow();
                boolean z = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                            z = false;
                        }
                        bool = java.lang.Boolean.valueOf(z);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = true;
                }
                return new com.google.android.gms.internal.ads.zzezt(bool);
            }
        }
        return new com.google.android.gms.internal.ads.zzezt(null);
    }
}
