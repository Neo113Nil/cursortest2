package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawz extends zzaxe {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawz(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "dA064m2ZUYG0yhXwELrkTlzdvl2eO4aE5sy5cB8j/bTSuEue0U48dVh9pkXbFiE1", "F2M5z4XeTn27F5LKy6wt7Gr39E0q7FeQyL+BvA48crs=", zzarrVar, i7, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzT(zzh.longValue());
        }
    }
}
