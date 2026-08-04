package com.google.android.recaptcha.internal;

import s6.a;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzci extends i implements a {
    public static final zzci zza = new zzci();

    public zzci() {
        super(0);
    }

    @Override // s6.a
    public final Object invoke() {
        int i7 = zzbb.zza;
        Object objZzb = zzba.zza().zzb(915034752);
        if (objZzb != null) {
            return (zzeb) objZzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.vm.allowlist.AllowlistHandler");
    }
}
