package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class zzabd<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzbnw;
    private final int zzbwe;
    private List<zzabi> zzbwf;
    private Map<K, V> zzbwg;
    private volatile zzabk zzbwh;
    private Map<K, V> zzbwi;

    private zzabd(int i) {
        this.zzbwe = i;
        this.zzbwf = Collections.emptyList();
        this.zzbwg = Collections.emptyMap();
        this.zzbwi = Collections.emptyMap();
    }

    /* synthetic */ zzabd(int i, zzabe zzabeVar) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzbwf.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzbwf.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzbwf.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends zzzt<FieldDescriptorType>> zzabd<FieldDescriptorType, Object> zzag(int i) {
        return new zzabe(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzai(int i) {
        zzva();
        V v = (V) this.zzbwf.remove(i).getValue();
        if (!this.zzbwg.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzvb().entrySet().iterator();
            this.zzbwf.add(new zzabi(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzva() {
        if (this.zzbnw) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzvb() {
        zzva();
        if (this.zzbwg.isEmpty() && !(this.zzbwg instanceof TreeMap)) {
            this.zzbwg = new TreeMap();
            this.zzbwi = ((TreeMap) this.zzbwg).descendingMap();
        }
        return (SortedMap) this.zzbwg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzva();
        if (!this.zzbwf.isEmpty()) {
            this.zzbwf.clear();
        }
        if (this.zzbwg.isEmpty()) {
            return;
        }
        this.zzbwg.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzabd<K, V>) comparable) >= 0 || this.zzbwg.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzbwh == null) {
            this.zzbwh = new zzabk(this, null);
        }
        return this.zzbwh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabd)) {
            return super.equals(obj);
        }
        zzabd zzabdVar = (zzabd) obj;
        int size = size();
        if (size != zzabdVar.size()) {
            return false;
        }
        int zzuy = zzuy();
        if (zzuy != zzabdVar.zzuy()) {
            return entrySet().equals(zzabdVar.entrySet());
        }
        for (int i = 0; i < zzuy; i++) {
            if (!zzah(i).equals(zzabdVar.zzah(i))) {
                return false;
            }
        }
        if (zzuy != size) {
            return this.zzbwg.equals(zzabdVar.zzbwg);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzabd<K, V>) comparable);
        return zza >= 0 ? (V) this.zzbwf.get(zza).getValue() : this.zzbwg.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzuy = zzuy();
        int i = 0;
        for (int i2 = 0; i2 < zzuy; i2++) {
            i += this.zzbwf.get(i2).hashCode();
        }
        return this.zzbwg.size() > 0 ? i + this.zzbwg.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzbnw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzabd<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzva();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzabd<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzai(zza);
        }
        if (this.zzbwg.isEmpty()) {
            return null;
        }
        return this.zzbwg.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzbwf.size() + this.zzbwg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzva();
        int zza = zza((zzabd<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzbwf.get(zza).setValue(v);
        }
        zzva();
        if (this.zzbwf.isEmpty() && !(this.zzbwf instanceof ArrayList)) {
            this.zzbwf = new ArrayList(this.zzbwe);
        }
        int i = -(zza + 1);
        if (i >= this.zzbwe) {
            return zzvb().put(k, v);
        }
        int size = this.zzbwf.size();
        int i2 = this.zzbwe;
        if (size == i2) {
            zzabi remove = this.zzbwf.remove(i2 - 1);
            zzvb().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzbwf.add(i, new zzabi(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zzah(int i) {
        return this.zzbwf.get(i);
    }

    public void zzru() {
        if (this.zzbnw) {
            return;
        }
        this.zzbwg = this.zzbwg.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbwg);
        this.zzbwi = this.zzbwi.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbwi);
        this.zzbnw = true;
    }

    public final int zzuy() {
        return this.zzbwf.size();
    }

    public final Iterable<Map.Entry<K, V>> zzuz() {
        return this.zzbwg.isEmpty() ? zzabf.zzvc() : this.zzbwg.entrySet();
    }
}
