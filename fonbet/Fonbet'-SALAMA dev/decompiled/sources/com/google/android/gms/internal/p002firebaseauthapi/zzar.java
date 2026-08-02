package com.google.android.gms.internal.p002firebaseauthapi;

import e1.k;

/* loaded from: classes.dex */
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
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        StringBuilder l7 = k.l("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        l7.append(valueOf3);
        l7.append("=");
        l7.append(valueOf4);
        return new IllegalArgumentException(l7.toString());
    }
}
