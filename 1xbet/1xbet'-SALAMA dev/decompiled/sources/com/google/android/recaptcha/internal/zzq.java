package com.google.android.recaptcha.internal;

import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzx zzxVar, d dVar) {
        super(dVar);
        this.zzb = zzxVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzu(null, null, this);
    }
}
