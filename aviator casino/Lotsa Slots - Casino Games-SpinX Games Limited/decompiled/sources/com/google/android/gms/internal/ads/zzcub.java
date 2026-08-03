package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcub {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbur zzb;
    private final java.util.concurrent.Executor zzc;
    private com.google.android.gms.internal.ads.zzcug zzd;
    private final com.google.android.gms.internal.ads.zzbpq zze = new com.google.android.gms.internal.ads.zzcty(this);
    private final com.google.android.gms.internal.ads.zzbpq zzf = new com.google.android.gms.internal.ads.zzcua(this);

    public zzcub(java.lang.String str, com.google.android.gms.internal.ads.zzbur zzburVar, java.util.concurrent.Executor executor) {
        this.zza = str;
        this.zzb = zzburVar;
        this.zzc = executor;
    }

    public final void zza(com.google.android.gms.internal.ads.zzcug zzcugVar) {
        com.google.android.gms.internal.ads.zzbur zzburVar = this.zzb;
        zzburVar.zzb("/updateActiveView", this.zze);
        zzburVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcugVar;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        zzckuVar.zzab("/updateActiveView", this.zze);
        zzckuVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        zzckuVar.zzac("/updateActiveView", this.zze);
        zzckuVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        com.google.android.gms.internal.ads.zzbur zzburVar = this.zzb;
        zzburVar.zzc("/updateActiveView", this.zze);
        zzburVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    final /* synthetic */ boolean zze(java.util.Map map) {
        if (map == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get("hashCode");
        return !android.text.TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    final /* synthetic */ java.util.concurrent.Executor zzf() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcug zzg() {
        return this.zzd;
    }
}
