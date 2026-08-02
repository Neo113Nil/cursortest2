package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.StandardComparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgj<T> implements Iterable<Map.Entry<zzch, T>> {
    private static final ImmutableSortedMap zzoc = ImmutableSortedMap.Builder.emptyMap(StandardComparator.getComparator(zzid.class));
    private static final zzgj zzod = new zzgj(null, zzoc);
    private final T value;
    private final ImmutableSortedMap<zzid, zzgj<T>> zzob;

    public zzgj(T t) {
        this(t, zzoc);
    }

    private zzgj(T t, ImmutableSortedMap<zzid, zzgj<T>> immutableSortedMap) {
        this.value = t;
        this.zzob = immutableSortedMap;
    }

    private final <R> R zza(zzch zzchVar, zzgm<? super T, R> zzgmVar, R r) {
        Iterator<Map.Entry<zzid, zzgj<T>>> it = this.zzob.iterator();
        while (it.hasNext()) {
            Map.Entry<zzid, zzgj<T>> next = it.next();
            r = (R) next.getValue().zza(zzchVar.zza(next.getKey()), zzgmVar, r);
        }
        Object obj = this.value;
        return obj != null ? zzgmVar.zza(zzchVar, obj, r) : r;
    }

    public static <V> zzgj<V> zzdl() {
        return zzod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzgj zzgjVar = (zzgj) obj;
        ImmutableSortedMap<zzid, zzgj<T>> immutableSortedMap = this.zzob;
        if (immutableSortedMap == null ? zzgjVar.zzob != null : !immutableSortedMap.equals(zzgjVar.zzob)) {
            return false;
        }
        T t = this.value;
        return t == null ? zzgjVar.value == null : t.equals(zzgjVar.value);
    }

    public final T getValue() {
        return this.value;
    }

    public final int hashCode() {
        T t = this.value;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        ImmutableSortedMap<zzid, zzgj<T>> immutableSortedMap = this.zzob;
        return hashCode + (immutableSortedMap != null ? immutableSortedMap.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.value == null && this.zzob.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<zzch, T>> iterator() {
        ArrayList arrayList = new ArrayList();
        zza(new zzgl(this, arrayList));
        return arrayList.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(this.value);
        sb.append(", children={");
        Iterator<Map.Entry<zzid, zzgj<T>>> it = this.zzob.iterator();
        while (it.hasNext()) {
            Map.Entry<zzid, zzgj<T>> next = it.next();
            sb.append(next.getKey().zzfg());
            sb.append("=");
            sb.append(next.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public final Collection<T> values() {
        ArrayList arrayList = new ArrayList();
        zza(new zzgk(this, arrayList));
        return arrayList;
    }

    public final zzch zza(zzch zzchVar, zzgn<? super T> zzgnVar) {
        zzid zzbw;
        zzgj<T> zzgjVar;
        zzch zza;
        T t = this.value;
        if (t != null && zzgnVar.zzd(t)) {
            return zzch.zzbt();
        }
        if (zzchVar.isEmpty() || (zzgjVar = this.zzob.get((zzbw = zzchVar.zzbw()))) == null || (zza = zzgjVar.zza(zzchVar.zzbx(), zzgnVar)) == null) {
            return null;
        }
        return new zzch(zzbw).zzh(zza);
    }

    public final zzgj<T> zza(zzch zzchVar, zzgj<T> zzgjVar) {
        if (zzchVar.isEmpty()) {
            return zzgjVar;
        }
        zzid zzbw = zzchVar.zzbw();
        zzgj<T> zzgjVar2 = this.zzob.get(zzbw);
        if (zzgjVar2 == null) {
            zzgjVar2 = zzod;
        }
        zzgj<T> zza = zzgjVar2.zza(zzchVar.zzbx(), zzgjVar);
        return new zzgj<>(this.value, zza.isEmpty() ? this.zzob.remove(zzbw) : this.zzob.insert(zzbw, zza));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(zzgm<T, Void> zzgmVar) {
        zza(zzch.zzbt(), zzgmVar, null);
    }

    public final zzch zzae(zzch zzchVar) {
        return zza(zzchVar, zzgn.zzof);
    }

    public final T zzaf(zzch zzchVar) {
        zzgn<Object> zzgnVar = zzgn.zzof;
        T t = this.value;
        T t2 = (t == null || !zzgnVar.zzd(t)) ? null : this.value;
        Iterator<zzid> it = zzchVar.iterator();
        T t3 = t2;
        zzgj<T> zzgjVar = this;
        while (it.hasNext()) {
            zzgjVar = zzgjVar.zzob.get(it.next());
            if (zzgjVar == null) {
                break;
            }
            T t4 = zzgjVar.value;
            if (t4 != null && zzgnVar.zzd(t4)) {
                t3 = zzgjVar.value;
            }
        }
        return t3;
    }

    public final zzgj<T> zzag(zzch zzchVar) {
        zzgj<T> zzgjVar = this;
        while (!zzchVar.isEmpty()) {
            zzgjVar = zzgjVar.zzob.get(zzchVar.zzbw());
            if (zzgjVar == null) {
                return zzod;
            }
            zzchVar = zzchVar.zzbx();
        }
        return zzgjVar;
    }

    public final zzgj<T> zzah(zzch zzchVar) {
        if (zzchVar.isEmpty()) {
            return this.zzob.isEmpty() ? zzod : new zzgj<>(null, this.zzob);
        }
        zzid zzbw = zzchVar.zzbw();
        zzgj<T> zzgjVar = this.zzob.get(zzbw);
        if (zzgjVar == null) {
            return this;
        }
        zzgj<T> zzah = zzgjVar.zzah(zzchVar.zzbx());
        ImmutableSortedMap<zzid, zzgj<T>> remove = zzah.isEmpty() ? this.zzob.remove(zzbw) : this.zzob.insert(zzbw, zzah);
        return (this.value == null && remove.isEmpty()) ? zzod : new zzgj<>(this.value, remove);
    }

    public final T zzai(zzch zzchVar) {
        zzgj<T> zzgjVar = this;
        while (!zzchVar.isEmpty()) {
            zzgjVar = zzgjVar.zzob.get(zzchVar.zzbw());
            if (zzgjVar == null) {
                return null;
            }
            zzchVar = zzchVar.zzbx();
        }
        return zzgjVar.value;
    }

    public final zzgj<T> zzb(zzch zzchVar, T t) {
        if (zzchVar.isEmpty()) {
            return new zzgj<>(t, this.zzob);
        }
        zzid zzbw = zzchVar.zzbw();
        zzgj<T> zzgjVar = this.zzob.get(zzbw);
        if (zzgjVar == null) {
            zzgjVar = zzod;
        }
        return new zzgj<>(this.value, this.zzob.insert(zzbw, zzgjVar.zzb(zzchVar.zzbx(), (zzch) t)));
    }

    public final T zzb(zzch zzchVar, zzgn<? super T> zzgnVar) {
        T t = this.value;
        if (t != null && zzgnVar.zzd(t)) {
            return this.value;
        }
        Iterator<zzid> it = zzchVar.iterator();
        zzgj<T> zzgjVar = this;
        while (it.hasNext()) {
            zzgjVar = zzgjVar.zzob.get(it.next());
            if (zzgjVar == null) {
                return null;
            }
            T t2 = zzgjVar.value;
            if (t2 != null && zzgnVar.zzd(t2)) {
                return zzgjVar.value;
            }
        }
        return null;
    }

    public final <R> R zzb(R r, zzgm<? super T, R> zzgmVar) {
        return (R) zza(zzch.zzbt(), zzgmVar, r);
    }

    public final boolean zzb(zzgn<? super T> zzgnVar) {
        T t = this.value;
        if (t != null && zzgnVar.zzd(t)) {
            return true;
        }
        Iterator<Map.Entry<zzid, zzgj<T>>> it = this.zzob.iterator();
        while (it.hasNext()) {
            if (it.next().getValue().zzb(zzgnVar)) {
                return true;
            }
        }
        return false;
    }

    public final ImmutableSortedMap<zzid, zzgj<T>> zzdm() {
        return this.zzob;
    }

    public final zzgj<T> zze(zzid zzidVar) {
        zzgj<T> zzgjVar = this.zzob.get(zzidVar);
        return zzgjVar != null ? zzgjVar : zzod;
    }
}
