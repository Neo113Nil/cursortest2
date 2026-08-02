package com.google.android.recaptcha.internal;

import g6.AbstractC1170s;
import java.util.LinkedHashMap;
import java.util.Map;
import s6.a;
import t6.i;

/* loaded from: classes.dex */
final class zzaz extends i implements a {
    final /* synthetic */ zzbc[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzbc[] zzbcVarArr) {
        super(0);
        this.zza = zzbcVarArr;
    }

    @Override // s6.a
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Map invoke() {
        int K02 = AbstractC1170s.K0(3);
        if (K02 < 16) {
            K02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K02);
        for (int i7 = 0; i7 < 3; i7++) {
            zzbc zzbcVar = this.zza[i7];
            linkedHashMap.put(Integer.valueOf(zzbcVar.zza()), zzbcVar.zzb());
        }
        return linkedHashMap;
    }
}
