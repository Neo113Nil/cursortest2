package com.google.android.recaptcha.internal;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zza extends c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, d dVar) {
        super(dVar);
        this.zzd = zzeVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == a.f14648a ? objZzc : new f(objZzc);
    }
}
