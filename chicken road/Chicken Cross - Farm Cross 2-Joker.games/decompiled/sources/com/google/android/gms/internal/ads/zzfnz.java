package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfnz {
    private final HashMap zza = new HashMap();

    public final zzfny zza(zzfnp zzfnpVar, Context context, zzfnh zzfnhVar, zzfoe zzfoeVar) {
        HashMap hashMap = this.zza;
        zzfny zzfnyVar = (zzfny) hashMap.get(zzfnpVar);
        if (zzfnyVar != null) {
            return zzfnyVar;
        }
        zzfnm zzfnmVar = new zzfnm(zzfns.zza(zzfnpVar, context));
        zzfny zzfnyVar2 = new zzfny(zzfnmVar, new zzfoh(zzfnmVar, zzfnhVar, zzfoeVar));
        hashMap.put(zzfnpVar, zzfnyVar2);
        return zzfnyVar2;
    }
}
