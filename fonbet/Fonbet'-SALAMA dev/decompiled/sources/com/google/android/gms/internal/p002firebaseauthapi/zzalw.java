package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class zzalw<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzamc zze;
    private Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzalw<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzamc(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalw)) {
            return super.equals(obj);
        }
        zzalw zzalwVar = (zzalw) obj;
        int size = size();
        if (size != zzalwVar.size()) {
            return false;
        }
        int i7 = this.zzb;
        if (i7 != zzalwVar.zzb) {
            return entrySet().equals(zzalwVar.entrySet());
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!zza(i8).equals(zzalwVar.zza(i8))) {
                return false;
            }
        }
        if (i7 != size) {
            return this.zzc.equals(zzalwVar.zzc);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzalw<K, V>) comparable);
        return zza >= 0 ? (V) ((zzama) this.zza[zza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i7 = this.zzb;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += this.zza[i9].hashCode();
        }
        return this.zzc.size() > 0 ? i8 + this.zzc.hashCode() : i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzalw<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzalw<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzalw() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        return new zzamb(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }

    private final int zza(K k7) {
        int i7;
        int i8 = this.zzb;
        int i9 = i8 - 1;
        if (i9 >= 0) {
            int compareTo = k7.compareTo((Comparable) ((zzama) this.zza[i9]).getKey());
            if (compareTo > 0) {
                i7 = i8 + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i9;
            }
        }
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int compareTo2 = k7.compareTo((Comparable) ((zzama) this.zza[i11]).getKey());
            if (compareTo2 < 0) {
                i9 = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        i7 = i10 + 1;
        return -i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i7) {
        zzg();
        V v6 = (V) ((zzama) this.zza[i7]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.zzb - i7) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzama(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v6;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k7, V v6) {
        zzg();
        int zza = zza((zzalw<K, V>) k7);
        if (zza >= 0) {
            return (V) ((zzama) this.zza[zza]).setValue(v6);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i7 = -(zza + 1);
        if (i7 >= 16) {
            return zzf().put(k7, v6);
        }
        int i8 = this.zzb;
        if (i8 == 16) {
            zzama zzamaVar = (zzama) this.zza[15];
            this.zzb = i8 - 1;
            zzf().put((Comparable) zzamaVar.getKey(), zzamaVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7, objArr, i7 + 1, (objArr.length - i7) - 1);
        this.zza[i7] = new zzama(this, k7, v6);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i7) {
        if (i7 < this.zzb) {
            return (zzama) this.zza[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }
}
