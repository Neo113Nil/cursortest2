package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzct {
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    public final int zza;
    public final int zzb;
    public final int zzc;

    static {
        int i7 = zzen.zza;
        zzd = Integer.toString(0, 36);
        zze = Integer.toString(1, 36);
        zzf = Integer.toString(2, 36);
    }

    public zzct(int i7, int i8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putInt(zzd, this.zza);
        bundle.putInt(zze, this.zzb);
        bundle.putInt(zzf, this.zzc);
        return bundle;
    }
}
