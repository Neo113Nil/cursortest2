package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfvo extends AbstractCollection {
    final /* synthetic */ zzfvq zza;

    public zzfvo(zzfvq zzfvqVar) {
        this.zza = zzfvqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfvq zzfvqVar = this.zza;
        Map zzl = zzfvqVar.zzl();
        return zzl != null ? zzl.values().iterator() : new zzfvj(zzfvqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
