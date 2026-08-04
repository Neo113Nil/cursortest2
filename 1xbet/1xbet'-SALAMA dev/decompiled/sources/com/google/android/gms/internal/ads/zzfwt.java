package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class zzfwt extends zzfym {
    final /* synthetic */ zzfwu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwt(zzfwu zzfwuVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzfwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
