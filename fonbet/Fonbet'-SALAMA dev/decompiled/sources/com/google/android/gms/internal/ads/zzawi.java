package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawi extends zzaxe {
    private final long zzh;

    public zzawi(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, long j, int i7, int i8) {
        super(zzavrVar, "ZFQ8Usl03GVbm6FFMmeSH7p/f/dDlZfuQw0gtftw4j1XaHWjVibn46gmN/WjoCN2", "nES3L8mGkoWrH5JqEq3hlXv3CaWWC5TytOWxYGABsdE=", zzarrVar, i7, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        long longValue = ((Long) this.zze.invoke(null, null)).longValue();
        synchronized (this.zzd) {
            try {
                this.zzd.zzr(longValue);
                long j = this.zzh;
                if (j != 0) {
                    this.zzd.zzR(longValue - j);
                    this.zzd.zzS(this.zzh);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
