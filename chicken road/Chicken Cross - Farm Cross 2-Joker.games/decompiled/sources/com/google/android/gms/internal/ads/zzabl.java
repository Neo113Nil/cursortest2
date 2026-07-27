package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzabl {
    private zzabk zza;
    private zzabu zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zznf zzg() {
        throw null;
    }

    public abstract void zzq(Object obj);

    public abstract zzabm zzr(zzng[] zzngVarArr, zzzr zzzrVar, zzxo zzxoVar, zzbf zzbfVar) throws zzjn;

    public final void zzs(zzabk zzabkVar, zzabu zzabuVar) {
        zzguk.zzi(this.zza == null);
        this.zza = zzabkVar;
        this.zzb = zzabuVar;
    }

    protected final void zzt() {
        zzabk zzabkVar = this.zza;
        if (zzabkVar != null) {
            zzabkVar.zzq();
        }
    }

    protected final zzabu zzu() {
        zzabu zzabuVar = this.zzb;
        zzabuVar.getClass();
        return zzabuVar;
    }
}
