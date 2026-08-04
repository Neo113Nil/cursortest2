package com.google.android.recaptcha.internal;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzcq extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzcx zzcxVar, d dVar) {
        super(dVar);
        this.zzb = zzcxVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo3execute0E7RQCE = this.zzb.mo3execute0E7RQCE(null, 0L, this);
        return objMo3execute0E7RQCE == a.f14648a ? objMo3execute0E7RQCE : new f(objMo3execute0E7RQCE);
    }
}
