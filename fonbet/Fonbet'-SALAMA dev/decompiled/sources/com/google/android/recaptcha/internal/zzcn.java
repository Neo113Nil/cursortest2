package com.google.android.recaptcha.internal;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
final class zzcn extends AbstractC1356c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzco zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzco zzcoVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.zzb = zzcoVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzi;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzi = this.zzb.zzi(null, null, null, this);
        return zzi;
    }
}
