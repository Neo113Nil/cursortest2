package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdyo implements com.google.android.gms.internal.ads.zzfpl {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzbhp zzb;

    zzdyo(com.google.android.gms.internal.ads.zzbhp zzbhpVar, java.util.Map map) {
        this.zza = map;
        this.zzb = zzbhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdL(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdM(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        java.util.Map map = this.zza;
        if (map.containsKey(zzfpeVar)) {
            this.zzb.zzc(((com.google.android.gms.internal.ads.zzdyn) map.get(zzfpeVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdN(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str, java.lang.Throwable th) {
        java.util.Map map = this.zza;
        if (map.containsKey(zzfpeVar)) {
            this.zzb.zzc(((com.google.android.gms.internal.ads.zzdyn) map.get(zzfpeVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdO(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        java.util.Map map = this.zza;
        if (map.containsKey(zzfpeVar)) {
            this.zzb.zzc(((com.google.android.gms.internal.ads.zzdyn) map.get(zzfpeVar)).zzb);
        }
    }
}
