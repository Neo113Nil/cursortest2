package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzawy extends zzaxe {
    private final zzavy zzh;
    private long zzi;

    public zzawy(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, zzavy zzavyVar) {
        super(zzavrVar, "mL/M8ecQGt8RmCRDQPcbWEE+oWeZ4Wc+YCIErjOqEy2nibA6S7moTyTBkn8UDgvs", "KC/lBg1nYoL5pL7BWJbzywoEHmWUpTVVfaLhnCVLguw=", zzarrVar, i7, 53);
        this.zzh = zzavyVar;
        if (zzavyVar != null) {
            this.zzi = zzavyVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        if (this.zzh != null) {
            this.zzd.zzN(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
