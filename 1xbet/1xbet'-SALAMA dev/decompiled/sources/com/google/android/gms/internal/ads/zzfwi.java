package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzfwi {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzfwi(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        StringBuilder sbL = k.l("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbL.append(strValueOf3);
        sbL.append("=");
        sbL.append(strValueOf4);
        return new IllegalArgumentException(sbL.toString());
    }
}
