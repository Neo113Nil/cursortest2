package com.google.android.recaptcha.internal;

import f6.C1113f;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzc extends AbstractC1356c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzc = zzeVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        return zze == a.f14642a ? zze : new C1113f(zze);
    }
}
