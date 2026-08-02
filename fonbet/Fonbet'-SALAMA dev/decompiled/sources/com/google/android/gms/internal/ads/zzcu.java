package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzcu {
    private static final String zzb;
    public final String zza;

    static {
        int i7 = zzen.zza;
        zzb = Integer.toString(0, 36);
    }

    public zzcu(String str) {
        this.zza = str;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
