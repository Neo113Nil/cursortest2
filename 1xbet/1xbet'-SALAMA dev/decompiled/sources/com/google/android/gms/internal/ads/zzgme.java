package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzgme implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzgme(zzgmi zzgmiVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgmg(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
