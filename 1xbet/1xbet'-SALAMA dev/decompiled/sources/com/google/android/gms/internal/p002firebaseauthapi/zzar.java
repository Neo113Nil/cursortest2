package com.google.android.gms.internal.p002firebaseauthapi;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzar {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzar(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        String strValueOf3 = String.valueOf(this.zza);
        String strValueOf4 = String.valueOf(this.zzc);
        StringBuilder sbL = k.l("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbL.append(strValueOf3);
        sbL.append("=");
        sbL.append(strValueOf4);
        return new IllegalArgumentException(sbL.toString());
    }
}
