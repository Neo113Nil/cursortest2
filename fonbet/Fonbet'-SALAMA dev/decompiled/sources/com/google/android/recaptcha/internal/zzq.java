package com.google.android.recaptcha.internal;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzq extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzx zzxVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = zzxVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzu;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzu = this.zzb.zzu(null, null, this);
        return zzu;
    }
}
