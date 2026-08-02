package com.google.android.recaptcha.internal;

import f6.C1113f;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zza extends AbstractC1356c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzd = zzeVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object zzc = this.zzd.zzc(null, 0L, this);
        return zzc == a.f14642a ? zzc : new C1113f(zzc);
    }
}
