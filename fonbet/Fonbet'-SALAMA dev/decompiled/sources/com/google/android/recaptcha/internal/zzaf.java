package com.google.android.recaptcha.internal;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzaf extends AbstractC1356c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzag zzc;
    int zzd;
    zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzag zzagVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzc = zzagVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzd(null, this);
    }
}
