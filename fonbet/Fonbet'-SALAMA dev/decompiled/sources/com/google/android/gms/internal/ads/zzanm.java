package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzanm {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanm(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i7 = this.zzd;
        int i8 = i7 == Integer.MIN_VALUE ? this.zzb : i7 + this.zzc;
        this.zzd = i8;
        this.zze = this.zza + i8;
    }
}
