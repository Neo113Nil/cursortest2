package com.google.android.recaptcha.internal;

import f6.C1113f;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzcq extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzcx zzcxVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = zzcxVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo3execute0E7RQCE = this.zzb.mo3execute0E7RQCE(null, 0L, this);
        return mo3execute0E7RQCE == a.f14642a ? mo3execute0E7RQCE : new C1113f(mo3execute0E7RQCE);
    }
}
