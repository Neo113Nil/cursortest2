package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawm extends zzaxe {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawm(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "lCB1qsaFUgDlpQrt2rxj7m3A5YhpggpEdNl1gJJq1my0pJeHpAUzwbqaBzvZY/fJ", "bxqysg92iiyTrXcgOUndsxm+L6ljg9XZlLWW9ddD2SQ=", zzarrVar, i7, 22);
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
            this.zzd.zzw(zzh.longValue());
        }
    }
}
