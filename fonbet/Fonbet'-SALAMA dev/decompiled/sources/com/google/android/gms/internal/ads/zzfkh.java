package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfkh {
    private static final zzfkh zza = new zzfkh();
    private Context zzb;

    private zzfkh() {
    }

    public static zzfkh zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
