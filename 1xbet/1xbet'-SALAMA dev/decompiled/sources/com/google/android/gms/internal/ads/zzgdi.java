package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class zzgdi {
    static {
        Logger.getLogger(zzgdi.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzgci.class);
        hashSet.add(zzgco.class);
        hashSet.add(zzgdk.class);
        hashSet.add(zzgcq.class);
        hashSet.add(zzgcp.class);
        hashSet.add(zzgde.class);
        hashSet.add(zzgpn.class);
        hashSet.add(zzgdg.class);
        hashSet.add(zzgdh.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzgdi() {
    }

    public static Object zza(zzgsa zzgsaVar, Class cls) {
        String strZzg = zzgsaVar.zzg();
        return zzgkh.zzc().zza(strZzg, cls).zzc(zzgsaVar.zzf());
    }
}
