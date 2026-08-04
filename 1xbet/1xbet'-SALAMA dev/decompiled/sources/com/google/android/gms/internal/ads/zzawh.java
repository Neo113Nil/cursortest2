package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzawh extends zzaxe {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawh(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "rg86u8Eiqxk6VzSfgrKDoC73JsO3wASlPs0PLBruSPSI51JFquvfLwP4MA3jyAkS", "9xZbPfpRHpBIYpyLBUW5yIyQeOU6mHT//sEzHeVaxyc=", zzarrVar, i7, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzo(zzh.longValue());
        }
    }
}
