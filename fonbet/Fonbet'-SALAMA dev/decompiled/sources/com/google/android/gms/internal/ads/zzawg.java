package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawg extends zzaxe {
    public zzawg(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "4Zf4Tomu37/6FX0mX97agkSMasRCdYamHdKukE8saU8mPNW4t6cVjcP7DSXNReFp", "eWfhPdiS5v8GxFs0Hf2vsL2scmctLu9oVNuwcH5ilps=", zzarrVar, i7, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (this.zzd) {
            try {
                this.zzd.zzm(iArr[0]);
                this.zzd.zzl(iArr[1]);
                int i7 = iArr[2];
                if (i7 != Integer.MIN_VALUE) {
                    this.zzd.zzk(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
