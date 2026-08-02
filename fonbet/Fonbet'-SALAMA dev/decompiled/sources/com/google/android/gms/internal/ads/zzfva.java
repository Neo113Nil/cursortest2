package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
abstract class zzfva extends zzfvd implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfva(Map map) {
        zzfth.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfva zzfvaVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfvaVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfvaVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final Collection zzf() {
        return new zzfvc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final Iterator zzg() {
        return new zzfuk(this);
    }

    public final List zzh(Object obj, List list, zzfux zzfuxVar) {
        return list instanceof RandomAccess ? new zzfut(this, obj, list, zzfuxVar) : new zzfuz(this, obj, list, zzfuxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfur(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfuu(this, (SortedMap) map) : new zzfun(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfus(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfuv(this, (SortedMap) map) : new zzfuq(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvd, com.google.android.gms.internal.ads.zzfxf
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zza = zza();
        if (!zza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }
}
