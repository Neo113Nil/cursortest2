package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzfle {
    private final zzfkf zza;
    private final ArrayList zzb;

    public zzfle(zzfkf zzfkfVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfkfVar;
        arrayList.add(str);
    }

    public final zzfkf zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
