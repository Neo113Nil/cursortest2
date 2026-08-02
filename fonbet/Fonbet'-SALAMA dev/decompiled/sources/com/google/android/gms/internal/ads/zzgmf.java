package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgmf {
    private final Map zza = new HashMap();

    public final zzgmf zza(zzgvd zzgvdVar, Object obj) {
        List list;
        if (zzgvdVar.zza() != 0 && zzgvdVar.zza() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (this.zza.containsKey(zzgvdVar)) {
            list = (List) this.zza.get(zzgvdVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.zza.put(zzgvdVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzgmi zzb() {
        return new zzgmi(this.zza, null);
    }
}
