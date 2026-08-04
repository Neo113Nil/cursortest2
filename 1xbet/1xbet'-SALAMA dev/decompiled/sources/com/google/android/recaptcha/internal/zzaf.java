package com.google.android.recaptcha.internal;

import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzaf extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzag zzc;
    int zzd;
    zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzag zzagVar, d dVar) {
        super(dVar);
        this.zzc = zzagVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzd(null, this);
    }
}
