package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzawp extends zzaxe {
    private final zzauu zzh;
    private final long zzi;
    private final long zzj;

    public zzawp(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, zzauu zzauuVar, long j, long j3) {
        super(zzavrVar, "KjFacdNn5PPWCLQokyVsHYZkpB7lI2vjo8OL1Ig4+GFqroO1kDAlu4WZvBEp2Hv+", "4bybCIkxTAtnHNWCdmL1dmda4M1ht3MZm0TchEEbK5g=", zzarrVar, i7, 11);
        this.zzh = zzauuVar;
        this.zzi = j;
        this.zzj = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        zzauu zzauuVar = this.zzh;
        if (zzauuVar != null) {
            zzaus zzausVar = new zzaus((String) this.zze.invoke(null, zzauuVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzx(zzausVar.zza.longValue());
                    if (zzausVar.zzb.longValue() >= 0) {
                        this.zzd.zzO(zzausVar.zzb.longValue());
                    }
                    if (zzausVar.zzc.longValue() >= 0) {
                        this.zzd.zzf(zzausVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
