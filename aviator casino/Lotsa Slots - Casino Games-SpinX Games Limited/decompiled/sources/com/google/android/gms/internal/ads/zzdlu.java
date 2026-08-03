package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdlu extends com.google.android.gms.internal.ads.zzdip {
    private boolean zzb;

    protected zzdlu(java.util.Set set) {
        super(set);
    }

    public final void zza() {
        zzs(com.google.android.gms.internal.ads.zzdlt.zza);
    }

    public final void zzb() {
        zzs(com.google.android.gms.internal.ads.zzdlp.zza);
    }

    public final synchronized void zzc() {
        zzs(com.google.android.gms.internal.ads.zzdlq.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(com.google.android.gms.internal.ads.zzdls.zza);
            this.zzb = true;
        }
        zzs(com.google.android.gms.internal.ads.zzdlr.zza);
    }
}
