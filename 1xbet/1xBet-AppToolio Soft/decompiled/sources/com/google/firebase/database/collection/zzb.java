package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class zzb<K, V> implements Iterator<Map.Entry<K, V>> {
    private int zzd;
    private final /* synthetic */ int zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zza zzg;

    zzb(zza zzaVar, int i, boolean z) {
        this.zzg = zzaVar;
        this.zze = i;
        this.zzf = z;
        this.zzd = this.zze;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object[] objArr;
        if (this.zzf) {
            return this.zzd >= 0;
        }
        int i = this.zzd;
        objArr = this.zzg.zza;
        return i < objArr.length;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        Object[] objArr2;
        objArr = this.zzg.zza;
        Object obj = objArr[this.zzd];
        objArr2 = this.zzg.zzb;
        int i = this.zzd;
        Object obj2 = objArr2[i];
        this.zzd = this.zzf ? i - 1 : i + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
