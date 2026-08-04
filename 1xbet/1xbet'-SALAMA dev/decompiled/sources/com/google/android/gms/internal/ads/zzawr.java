package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzawr extends zzaxe {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzawr(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "496dpPiVBlKLJl+6GqQcdxxWKnNUTzi6YOwAhFFFD6beVSeyQO/1LvIZEYZZJ0Qz", "c4v1i/raIY0Ei0Tuq9iaU99feAhkgfxr3x1mgUKZTmQ=", zzarrVar, i7, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        this.zzd.zzz("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzz(zzh);
        }
    }
}
