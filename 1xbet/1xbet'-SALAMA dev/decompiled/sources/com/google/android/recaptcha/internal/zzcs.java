package com.google.android.recaptcha.internal;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzcs extends c {
    Object zza;
    Object zzb;
    double zzc;
    /* synthetic */ Object zzd;
    final /* synthetic */ zzcx zze;
    int zzf;
    zzcx zzg;
    zzdf zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcx zzcxVar, d dVar) {
        super(dVar);
        this.zze = zzcxVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        Object objZzg = this.zze.zzg(null, 0L, this);
        return objZzg == a.f14648a ? objZzg : new f(objZzg);
    }
}
