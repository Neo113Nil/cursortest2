package com.google.android.recaptcha.internal;

import java.util.Map;
import s6.a;

/* loaded from: classes.dex */
public final class zzba {
    public static final zzbb zza() {
        zzbb zzbbVar;
        a aVar;
        zzbbVar = zzbb.zzb;
        if (zzbbVar != null) {
            return zzbbVar;
        }
        aVar = zzbb.zzc;
        zzbb zzbbVar2 = new zzbb((Map) aVar.invoke(), null);
        zzbb.zzb = zzbbVar2;
        return zzbbVar2;
    }

    public static final void zzb(zzbc... zzbcVarArr) {
        zzbb.zzc = new zzaz(zzbcVarArr);
    }
}
