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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzgwc extends zzgwf implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzgwc(Map map) {
        zzguk.zza(map.isEmpty());
        this.zza = map;
    }

    abstract Collection zza(Collection collection);

    abstract Collection zzb(Object obj, Collection collection);

    abstract Collection zzc();

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwf, com.google.android.gms.internal.ads.zzgyu
    public final boolean zze(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zzc = zzc();
        if (!zzc.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, zzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final void zzf() {
        Map map = this.zza;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    final List zzg(Object obj, List list, zzgvz zzgvzVar) {
        return list instanceof RandomAccess ? new zzgvv(this, obj, list, zzgvzVar) : new zzgwb(this, obj, list, zzgvzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    Set zzh() {
        throw null;
    }

    final Set zzi() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzgvu(this, (NavigableMap) map) : map instanceof SortedMap ? new zzgvx(this, (SortedMap) map) : new zzgvs(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    final Collection zzj() {
        return new zzgwe(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    final Iterator zzk() {
        return new zzgvm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    Map zzl() {
        throw null;
    }

    final Map zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzgvt(this, (NavigableMap) map) : map instanceof SortedMap ? new zzgvw(this, (SortedMap) map) : new zzgvp(this, map);
    }

    final /* synthetic */ void zzn(Object obj) {
        Object obj2;
        try {
            obj2 = this.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.zzb -= size;
        }
    }

    final /* synthetic */ Map zzo() {
        return this.zza;
    }

    final /* synthetic */ int zzp() {
        return this.zzb;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzb = i;
    }
}
