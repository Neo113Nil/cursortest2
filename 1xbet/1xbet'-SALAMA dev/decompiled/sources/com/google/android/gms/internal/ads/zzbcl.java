package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbcl {
    private final Map zza = new HashMap();
    private final zzbcn zzb;

    public zzbcl(zzbcn zzbcnVar) {
        this.zzb = zzbcnVar;
    }

    public final zzbcn zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbck zzbckVar) {
        this.zza.put(str, zzbckVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbck zzbckVar = (zzbck) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbckVar != null) {
            this.zzb.zze(zzbckVar, j, strArr);
        }
        this.zza.put(str, new zzbck(j, null, null));
    }
}
