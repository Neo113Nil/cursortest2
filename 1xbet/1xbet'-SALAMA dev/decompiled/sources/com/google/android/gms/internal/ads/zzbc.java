package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc {
    private final zzt zza = new zzt();

    public final zzbc zza(int i7) {
        this.zza.zza(i7);
        return this;
    }

    public final zzbc zzb(zzbd zzbdVar) {
        zzv zzvVar = zzbdVar.zza;
        for (int i7 = 0; i7 < zzvVar.zzb(); i7++) {
            this.zza.zza(zzvVar.zza(i7));
        }
        return this;
    }

    public final zzbc zzc(int... iArr) {
        for (int i7 = 0; i7 < 20; i7++) {
            this.zza.zza(iArr[i7]);
        }
        return this;
    }

    public final zzbc zzd(int i7, boolean z4) {
        if (z4) {
            this.zza.zza(i7);
        }
        return this;
    }

    public final zzbd zze() {
        return new zzbd(this.zza.zzb(), null);
    }
}
