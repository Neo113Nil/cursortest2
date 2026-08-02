package com.google.android.recaptcha.internal;

import s6.a;
import t6.i;

/* loaded from: classes.dex */
public final class zzde extends i implements a {
    public static final zzde zza = new zzde();

    public zzde() {
        super(0);
    }

    @Override // s6.a
    public final Object invoke() {
        int i7 = zzbb.zza;
        Object zzb = zzba.zza().zzb(915034668);
        if (zzb != null) {
            return (zzbk) zzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.common.NetworkStatus");
    }
}
