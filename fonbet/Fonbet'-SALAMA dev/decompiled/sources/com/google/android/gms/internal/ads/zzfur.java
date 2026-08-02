package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class zzfur extends zzfuu implements NavigableMap {
    final /* synthetic */ zzfva zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfur(zzfva zzfvaVar, NavigableMap navigableMap) {
        super(zzfvaVar, navigableMap);
        this.zzc = zzfvaVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zza(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfur(this.zzc, ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zza(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zza(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zza(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu, com.google.android.gms.internal.ads.zzfun, com.google.android.gms.internal.ads.zzfxd, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zza(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zza(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfuu, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection zza = this.zzc.zza();
        zza.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfwd(entry.getKey(), this.zzc.zzb(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzg() {
        return new zzfus(this.zzc, (NavigableMap) ((SortedMap) ((zzfun) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap) ((SortedMap) ((zzfun) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    /* renamed from: zzh */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z4) {
        return new zzfur(this.zzc, ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).headMap(obj, z4));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z4, Object obj2, boolean z7) {
        return new zzfur(this.zzc, ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).subMap(obj, z4, obj2, z7));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z4) {
        return new zzfur(this.zzc, ((NavigableMap) ((SortedMap) ((zzfun) this).zza)).tailMap(obj, z4));
    }
}
