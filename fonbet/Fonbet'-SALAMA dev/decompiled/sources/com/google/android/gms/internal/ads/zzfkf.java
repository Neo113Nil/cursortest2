package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class zzfkf {
    private final zzflt zza;
    private final String zzb;
    private final zzfjo zzc;
    private final String zzd = "Ad overlay";

    public zzfkf(View view, zzfjo zzfjoVar, String str) {
        this.zza = new zzflt(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfjoVar;
    }

    public final zzfjo zza() {
        return this.zzc;
    }

    public final zzflt zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
