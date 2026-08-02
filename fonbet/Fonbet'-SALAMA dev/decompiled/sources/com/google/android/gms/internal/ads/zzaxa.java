package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxa extends zzaxe {
    public zzaxa(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "qcIEHLTfCREySmhTcfhBykVOucbCVf1J7ci0US35SgegClSZdV4T0wPo3J98WqQi", "bWwqZRSWUz53lqOJOzvFWLzapmrfK2QHVsSIKaZ59UU=", zzarrVar, i7, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        this.zzd.zzad(3);
        boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (this.zzd) {
            try {
                if (booleanValue) {
                    this.zzd.zzad(2);
                } else {
                    this.zzd.zzad(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
