package com.google.android.recaptcha.internal;

import s6.a;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends i implements a {
    public static final zzdd zza = new zzdd();

    public zzdd() {
        super(0);
    }

    @Override // s6.a
    public final Object invoke() {
        int i7 = zzbb.zza;
        Object objZzb = zzba.zza().zzb(915034663);
        if (objZzb != null) {
            return (zzbf) objZzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.common.Experiments");
    }
}
