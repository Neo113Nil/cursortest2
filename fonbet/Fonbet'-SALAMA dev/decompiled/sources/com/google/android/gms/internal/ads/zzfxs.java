package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zzfxs implements Comparator {
    public static zzfxs zzb(Comparator comparator) {
        return new zzfvs(comparator);
    }

    public static zzfxs zzc() {
        return zzfxq.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfxs zza() {
        return new zzfyb(this);
    }
}
