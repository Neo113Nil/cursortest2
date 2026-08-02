package com.google.android.recaptcha;

import f6.C1113f;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = recaptcha;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        return m2getClientBWLJW6A == a.f14642a ? m2getClientBWLJW6A : new C1113f(m2getClientBWLJW6A);
    }
}
