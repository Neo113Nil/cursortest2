package com.google.android.recaptcha.internal;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzcp extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzcx zzcxVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = zzcxVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzf = this.zzb.zzf(0L, null, null, this);
        return zzf;
    }
}
