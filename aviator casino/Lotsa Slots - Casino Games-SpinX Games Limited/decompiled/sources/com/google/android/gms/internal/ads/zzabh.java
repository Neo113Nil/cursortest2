package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzabh {
    private com.google.android.gms.internal.ads.zzabg zza;
    private com.google.android.gms.internal.ads.zzabq zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(com.google.android.gms.internal.ads.zzd zzdVar) {
        throw null;
    }

    public com.google.android.gms.internal.ads.zznb zzg() {
        throw null;
    }

    public abstract void zzq(java.lang.Object obj);

    public abstract com.google.android.gms.internal.ads.zzabi zzr(com.google.android.gms.internal.ads.zznc[] zzncVarArr, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbf zzbfVar) throws com.google.android.gms.internal.ads.zzjk;

    public final void zzs(com.google.android.gms.internal.ads.zzabg zzabgVar, com.google.android.gms.internal.ads.zzabq zzabqVar) {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zza == null);
        this.zza = zzabgVar;
        this.zzb = zzabqVar;
    }

    protected final void zzt() {
        com.google.android.gms.internal.ads.zzabg zzabgVar = this.zza;
        if (zzabgVar != null) {
            zzabgVar.zzq();
        }
    }

    protected final com.google.android.gms.internal.ads.zzabq zzu() {
        com.google.android.gms.internal.ads.zzabq zzabqVar = this.zzb;
        zzabqVar.getClass();
        return zzabqVar;
    }
}
