package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcca {
    final /* synthetic */ com.google.android.libraries.places.internal.zzccd zza;
    private final com.google.android.libraries.places.internal.zzcff zzb;
    private final int zzc;
    private int zzd;
    private int zze;
    private final com.google.android.libraries.places.internal.zzcbz zzf;
    private boolean zzg;

    zzcca(com.google.android.libraries.places.internal.zzccd zzccdVar, int i, int i2, com.google.android.libraries.places.internal.zzcbz zzcbzVar) {
        java.util.Objects.requireNonNull(zzccdVar);
        this.zza = zzccdVar;
        this.zzb = new com.google.android.libraries.places.internal.zzcff();
        this.zzg = false;
        this.zzc = i;
        this.zzd = i2;
        this.zzf = zzcbzVar;
    }

    final int zzd() {
        return java.lang.Math.max(0, java.lang.Math.min(this.zzd, (int) this.zzb.zzb())) - this.zze;
    }

    final int zzf(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.zzd) {
            int i2 = this.zzd + i;
            this.zzd = i2;
            return i2;
        }
        int i3 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 33);
        sb.append("Window size overflow for stream: ");
        sb.append(i3);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final int zzg() {
        return java.lang.Math.min(this.zzd, this.zza.zzh().zzd);
    }

    final int zzi(int i, com.google.android.libraries.places.internal.zzccc zzcccVar) {
        int min = java.lang.Math.min(i, zzg());
        int i2 = 0;
        while (zzh() && min > 0) {
            com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
            if (min >= zzcffVar.zzb()) {
                i2 += (int) zzcffVar.zzb();
                zzj(zzcffVar, (int) zzcffVar.zzb(), this.zzg);
            } else {
                i2 += min;
                zzj(zzcffVar, min, false);
            }
            zzcccVar.zza++;
            min = java.lang.Math.min(i - i2, zzg());
        }
        return i2;
    }

    final void zzj(com.google.android.libraries.places.internal.zzcff zzcffVar, int i, boolean z) {
        do {
            com.google.android.libraries.places.internal.zzccd zzccdVar = this.zza;
            int min = java.lang.Math.min(i, zzccdVar.zzg().zzg());
            int i2 = -min;
            zzccdVar.zzh().zzf(i2);
            zzf(i2);
            try {
                boolean z2 = false;
                if (zzcffVar.zzb() == min && z) {
                    z2 = true;
                }
                zzccdVar.zzg().zzh(z2, this.zzc, zzcffVar, min);
                this.zzf.zzt(min);
                i -= min;
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        } while (i > 0);
    }

    final void zzk(com.google.android.libraries.places.internal.zzcff zzcffVar, int i, boolean z) {
        this.zzb.zzc(zzcffVar, i);
        this.zzg |= z;
    }

    final boolean zzh() {
        return this.zzb.zzb() > 0;
    }

    final void zze() {
        this.zze = 0;
    }

    final int zzc() {
        return this.zze;
    }

    final void zzb(int i) {
        this.zze += i;
    }

    final int zza() {
        return this.zzd;
    }
}
