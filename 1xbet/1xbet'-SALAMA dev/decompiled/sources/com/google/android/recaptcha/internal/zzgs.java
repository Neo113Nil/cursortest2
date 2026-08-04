package com.google.android.recaptcha.internal;

import j6.a;
import p044f6.f;
import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
final class zzgs extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgv zzb;
    int zzc;
    zzgv zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgs(zzgv zzgvVar, d dVar) {
        super(dVar);
        this.zzb = zzgvVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == a.f14648a ? objZzf : new f(objZzf);
    }
}
