package com.google.android.recaptcha.internal;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzaj extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzap zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzap zzapVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = zzapVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(null, this);
        return zzj;
    }
}
