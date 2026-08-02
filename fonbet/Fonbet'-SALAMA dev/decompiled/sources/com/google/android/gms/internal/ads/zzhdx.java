package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class zzhdx extends AbstractList {
    private static final zzhdy zzc = zzhdy.zzb(zzhdx.class);
    final List zza;
    final Iterator zzb;

    public zzhdx(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        if (this.zza.size() > i7) {
            return this.zza.get(i7);
        }
        if (!this.zzb.hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza.add(this.zzb.next());
        return get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhdw(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzhdy zzhdyVar = zzc;
        zzhdyVar.zza("potentially expensive size() call");
        zzhdyVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
