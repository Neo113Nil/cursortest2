package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class zzheb {
    final LinkedHashMap zza;

    public zzheb(int i7) {
        this.zza = zzhed.zzb(i7);
    }

    public final zzheb zza(Object obj, zzhep zzhepVar) {
        zzheo.zza(obj, "key");
        zzheo.zza(zzhepVar, "provider");
        this.zza.put(obj, zzhepVar);
        return this;
    }
}
