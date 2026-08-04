package com.google.android.recaptcha.internal;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, d dVar) {
        super(dVar);
        this.zzc = zzeVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == a.f14648a ? objZze : new f(objZze);
    }
}
