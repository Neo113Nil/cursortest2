package com.google.android.recaptcha.internal;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzgu extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgu(zzgv zzgvVar, d dVar) {
        super(dVar);
        this.zzb = zzgvVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == a.f14648a ? objZzh : new f(objZzh);
    }
}
