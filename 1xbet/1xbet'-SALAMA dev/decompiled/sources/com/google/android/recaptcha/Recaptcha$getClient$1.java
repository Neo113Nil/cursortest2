package com.google.android.recaptcha;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        return objM2getClientBWLJW6A == a.f14648a ? objM2getClientBWLJW6A : new f(objM2getClientBWLJW6A);
    }
}
