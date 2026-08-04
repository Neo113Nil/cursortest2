package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzftf implements Serializable {
    public static zzftf zzc() {
        return zzfsl.zza;
    }

    public static zzftf zzd(Object obj) {
        return obj == null ? zzfsl.zza : new zzftm(obj);
    }

    public abstract zzftf zza(zzfsw zzfswVar);

    public abstract Object zzb(Object obj);
}
