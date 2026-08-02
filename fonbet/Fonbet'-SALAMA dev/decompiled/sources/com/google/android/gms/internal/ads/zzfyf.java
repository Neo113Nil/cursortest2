package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class zzfyf extends zzfye implements SortedSet {
    public zzfyf(SortedSet sortedSet, zzfti zzftiVar) {
        super(sortedSet, zzftiVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfti zzftiVar = this.zzb;
        zzftiVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzftiVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zzfyf(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            zzfti zzftiVar = this.zzb;
            Object last = sortedSet.last();
            if (zzftiVar.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzfyf(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zzfyf(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
