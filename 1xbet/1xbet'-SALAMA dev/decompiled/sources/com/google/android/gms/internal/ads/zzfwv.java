package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class zzfwv extends zzfym {
    final /* synthetic */ zzfww zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwv(zzfww zzfwwVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzfwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
