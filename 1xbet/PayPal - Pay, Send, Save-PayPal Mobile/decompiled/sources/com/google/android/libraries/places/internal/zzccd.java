package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzccd {
    private final com.google.android.libraries.places.internal.zzccb zza;
    private final com.google.android.libraries.places.internal.zzccy zzb;
    private int zzc = 65535;
    private final com.google.android.libraries.places.internal.zzcca zzd = new com.google.android.libraries.places.internal.zzcca(this, 0, 65535, null);

    public zzccd(com.google.android.libraries.places.internal.zzccb zzccbVar, com.google.android.libraries.places.internal.zzccy zzccyVar) {
        this.zza = (com.google.android.libraries.places.internal.zzccb) com.google.common.base.Preconditions.checkNotNull(zzccbVar, androidx.core.app.NotificationCompat.CATEGORY_TRANSPORT);
        this.zzb = (com.google.android.libraries.places.internal.zzccy) com.google.common.base.Preconditions.checkNotNull(zzccyVar, "frameWriter");
    }

    public final boolean zza(int i) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 29);
            sb.append("Invalid initial window size: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i2 = i - this.zzc;
        this.zzc = i;
        for (com.google.android.libraries.places.internal.zzcca zzccaVar : this.zza.zzm()) {
            zzccaVar.zzf(i2);
        }
        return i2 > 0;
    }

    public final int zzb(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzcca zzccaVar, int i) {
        if (zzccaVar == null) {
            int zzf = this.zzd.zzf(i);
            zzf();
            return zzf;
        }
        int zzf2 = zzccaVar.zzf(i);
        com.google.android.libraries.places.internal.zzccc zzcccVar = new com.google.android.libraries.places.internal.zzccc(null);
        zzccaVar.zzi(zzccaVar.zzg(), zzcccVar);
        if (!zzcccVar.zza()) {
            return zzf2;
        }
        zzd();
        return zzf2;
    }

    public final void zzc(boolean z, com.google.android.libraries.places.internal.zzcca zzccaVar, com.google.android.libraries.places.internal.zzcff zzcffVar, boolean z2) {
        com.google.common.base.Preconditions.checkNotNull(zzcffVar, "source");
        int zzg = zzccaVar.zzg();
        boolean zzh = zzccaVar.zzh();
        int zzb = (int) zzcffVar.zzb();
        if (zzh || zzg < zzb) {
            if (!zzh && zzg > 0) {
                zzccaVar.zzj(zzcffVar, zzg, false);
            }
            zzccaVar.zzk(zzcffVar, (int) zzcffVar.zzb(), z);
        } else {
            zzccaVar.zzj(zzcffVar, zzb, z);
        }
        if (z2) {
            zzd();
        }
    }

    public final com.google.android.libraries.places.internal.zzcca zze(com.google.android.libraries.places.internal.zzcbz zzcbzVar, int i) {
        return new com.google.android.libraries.places.internal.zzcca(this, i, this.zzc, (com.google.android.libraries.places.internal.zzcbz) com.google.common.base.Preconditions.checkNotNull(zzcbzVar, "stream"));
    }

    public final void zzf() {
        int i;
        com.google.android.libraries.places.internal.zzccb zzccbVar = this.zza;
        com.google.android.libraries.places.internal.zzcca[] zzm = zzccbVar.zzm();
        java.util.Collections.shuffle(java.util.Arrays.asList(zzm));
        int length = zzm.length;
        int zza = this.zzd.zza();
        while (true) {
            i = 0;
            if (length <= 0 || zza <= 0) {
                break;
            }
            int ceil = (int) java.lang.Math.ceil(zza / length);
            for (int i2 = 0; i2 < length && zza > 0; i2++) {
                com.google.android.libraries.places.internal.zzcca zzccaVar = zzm[i2];
                int min = java.lang.Math.min(zza, java.lang.Math.min(zzccaVar.zzd(), ceil));
                if (min > 0) {
                    zzccaVar.zzb(min);
                    zza -= min;
                }
                if (zzccaVar.zzd() > 0) {
                    zzm[i] = zzccaVar;
                    i++;
                }
            }
            length = i;
        }
        com.google.android.libraries.places.internal.zzccc zzcccVar = new com.google.android.libraries.places.internal.zzccc(null);
        com.google.android.libraries.places.internal.zzcca[] zzm2 = zzccbVar.zzm();
        int length2 = zzm2.length;
        while (i < length2) {
            com.google.android.libraries.places.internal.zzcca zzccaVar2 = zzm2[i];
            zzccaVar2.zzi(zzccaVar2.zzc(), zzcccVar);
            zzccaVar2.zze();
            i++;
        }
        if (zzcccVar.zza()) {
            zzd();
        }
    }

    public final void zzd() {
        try {
            this.zzb.zze();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcca zzh() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzccy zzg() {
        return this.zzb;
    }
}
