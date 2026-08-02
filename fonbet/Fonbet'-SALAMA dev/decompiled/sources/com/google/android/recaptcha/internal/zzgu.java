package com.google.android.recaptcha.internal;

import f6.C1113f;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzgu extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgu(zzgv zzgvVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = zzgvVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == a.f14642a ? zzh : new C1113f(zzh);
    }
}
