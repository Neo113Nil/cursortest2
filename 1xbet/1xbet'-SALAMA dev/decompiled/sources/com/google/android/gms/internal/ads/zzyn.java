package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzyn {
    private zzym zza;
    private zzyv zzb;

    public zzlo zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zze zzeVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzyo zzo(zzlp[] zzlpVarArr, zzwv zzwvVar, zzuq zzuqVar, zzbn zzbnVar);

    public abstract void zzp(Object obj);

    public final zzyv zzq() {
        zzyv zzyvVar = this.zzb;
        zzcv.zzb(zzyvVar);
        return zzyvVar;
    }

    public final void zzr(zzym zzymVar, zzyv zzyvVar) {
        this.zza = zzymVar;
        this.zzb = zzyvVar;
    }

    public final void zzs() {
        zzym zzymVar = this.zza;
        if (zzymVar != null) {
            zzymVar.zzk();
        }
    }
}
