package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzcr {
    private static final String zzc;
    private static final String zzd;
    public final String zza;
    public final int zzb;

    static {
        int i7 = zzen.zza;
        zzc = Integer.toString(0, 36);
        zzd = Integer.toString(1, 36);
    }

    public zzcr(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}
