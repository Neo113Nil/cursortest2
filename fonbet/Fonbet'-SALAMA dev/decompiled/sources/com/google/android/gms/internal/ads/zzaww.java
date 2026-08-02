package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaww extends zzaxe {
    private final StackTraceElement[] zzh;

    public zzaww(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, StackTraceElement[] stackTraceElementArr) {
        super(zzavrVar, "DRZosogAisEOArK1SbKuv10KbVGKzJ5DHp2JnkR+iImfs1q87b6G3b1Ooqruee6b", "2FHp0bJQtrPbapHMX5Elki045HOFEBY5oxw0JLn9yqA=", zzarrVar, i7, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzavi zzaviVar = new zzavi((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzD(zzaviVar.zza.longValue());
                    if (zzaviVar.zzb.booleanValue()) {
                        this.zzd.zzZ(true != zzaviVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        this.zzd.zzZ(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
