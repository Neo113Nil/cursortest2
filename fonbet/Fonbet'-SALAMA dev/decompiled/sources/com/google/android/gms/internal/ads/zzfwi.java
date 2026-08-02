package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
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
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        StringBuilder l7 = k.l("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        l7.append(valueOf3);
        l7.append("=");
        l7.append(valueOf4);
        return new IllegalArgumentException(l7.toString());
    }
}
