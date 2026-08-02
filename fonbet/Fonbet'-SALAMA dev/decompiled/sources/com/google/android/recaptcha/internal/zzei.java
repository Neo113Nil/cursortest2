package com.google.android.recaptcha.internal;

import s6.a;
import t6.i;

/* loaded from: classes.dex */
public final class zzei extends i implements a {
    public static final zzei zza = new zzei();

    public zzei() {
        super(0);
    }

    @Override // s6.a
    public final Object invoke() {
        int i7 = zzbb.zza;
        Object zzb = zzba.zza().zzb(915034752);
        if (zzb != null) {
            return (zzeb) zzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.vm.allowlist.AllowlistHandler");
    }
}
