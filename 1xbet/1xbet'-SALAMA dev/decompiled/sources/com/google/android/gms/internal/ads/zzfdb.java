package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzfdb {
    private final HashMap zza = new HashMap();

    public final zzfda zza(zzfcr zzfcrVar, Context context, zzfcj zzfcjVar, zzfdh zzfdhVar) {
        zzfda zzfdaVar = (zzfda) this.zza.get(zzfcrVar);
        if (zzfdaVar != null) {
            return zzfdaVar;
        }
        zzfco zzfcoVar = new zzfco(zzfcu.zza(zzfcrVar, context));
        zzfda zzfdaVar2 = new zzfda(zzfcoVar, new zzfdj(zzfcoVar, zzfcjVar, zzfdhVar));
        this.zza.put(zzfcrVar, zzfdaVar2);
        return zzfdaVar2;
    }
}
