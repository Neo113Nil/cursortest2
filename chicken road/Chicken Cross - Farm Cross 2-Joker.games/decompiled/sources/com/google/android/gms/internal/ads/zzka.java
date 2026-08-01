package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzka {
    private final Map zza;
    private zzjc zzb;

    /* synthetic */ zzka(zzlk zzlkVar, int i, byte[] bArr) {
        Objects.requireNonNull(zzlkVar);
        this.zza = new HashMap();
        this.zzb = zzjc.zza;
    }

    private static final zzjc zzb(zzjc zzjcVar, List list) {
        zzjb zzjbVar = new zzjb(zzjcVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzjcVar.zza()) {
            if (!hashSet.contains(str)) {
                zzjbVar.zzf(str);
            }
        }
        return zzjbVar.zzg();
    }

    final /* synthetic */ void zza(zzjc zzjcVar) {
        for (Map.Entry entry : new HashMap(this.zza).entrySet()) {
            zzjd zzjdVar = (zzjd) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzb(zzjcVar, list).equals(zzb(this.zzb, list))) {
                zzjdVar.zza();
            }
        }
        this.zzb = zzjcVar;
    }
}
