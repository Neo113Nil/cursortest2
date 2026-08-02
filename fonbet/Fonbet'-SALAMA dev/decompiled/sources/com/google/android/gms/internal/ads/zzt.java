package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class zzt {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzt zza(int i7) {
        zzcv.zzf(!this.zzb);
        this.zza.append(i7, true);
        return this;
    }

    public final zzv zzb() {
        zzcv.zzf(!this.zzb);
        this.zzb = true;
        return new zzv(this.zza, null);
    }
}
