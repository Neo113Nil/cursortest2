package com.google.android.recaptcha.internal;

import f6.C1113f;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzcs extends AbstractC1356c {
    Object zza;
    Object zzb;
    double zzc;
    /* synthetic */ Object zzd;
    final /* synthetic */ zzcx zze;
    int zzf;
    zzcx zzg;
    zzdf zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcx zzcxVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zze = zzcxVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzg;
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        zzg = this.zze.zzg(null, 0L, this);
        return zzg == a.f14642a ? zzg : new C1113f(zzg);
    }
}
