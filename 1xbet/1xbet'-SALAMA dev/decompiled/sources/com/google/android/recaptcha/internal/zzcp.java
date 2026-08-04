package com.google.android.recaptcha.internal;

import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzcp extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzcx zzcxVar, d dVar) {
        super(dVar);
        this.zzb = zzcxVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzf(0L, null, null, this);
    }
}
