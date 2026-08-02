package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzmp implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzmq zzb;

    public zzmp(zzmq zzmqVar) {
        zzkr zzkrVar;
        this.zzb = zzmqVar;
        zzkrVar = zzmqVar.zza;
        this.zza = zzkrVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
