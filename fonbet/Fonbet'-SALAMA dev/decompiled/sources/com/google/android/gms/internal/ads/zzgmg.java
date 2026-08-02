package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgmg implements Iterator {
    private final Iterator zza;
    private final Iterator zzb;

    public /* synthetic */ zzgmg(Iterator it, Iterator it2, zzgmh zzgmhVar) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.hasNext() ? this.zza.next() : this.zzb.next();
    }
}
