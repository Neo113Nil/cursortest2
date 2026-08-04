package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import p050g6.s;
import s6.a;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzaz extends i implements a {
    final /* synthetic */ zzbc[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzbc[] zzbcVarArr) {
        super(0);
        this.zza = zzbcVarArr;
    }

    @Override // s6.a
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Map invoke() {
        int iK0 = s.K0(3);
        if (iK0 < 16) {
            iK0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
        for (int i7 = 0; i7 < 3; i7++) {
            zzbc zzbcVar = this.zza[i7];
            linkedHashMap.put(Integer.valueOf(zzbcVar.zza()), zzbcVar.zzb());
        }
        return linkedHashMap;
    }
}
