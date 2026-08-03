package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
class zzmi<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean zzot;
    private final int zzvd;
    private java.util.List<com.google.android.gms.internal.drive.zzmp> zzve;
    private java.util.Map<K, V> zzvf;
    private volatile com.google.android.gms.internal.drive.zzmr zzvg;
    private java.util.Map<K, V> zzvh;
    private volatile com.google.android.gms.internal.drive.zzml zzvi;

    static <FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>> com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object> zzav(int i) {
        return new com.google.android.gms.internal.drive.zzmj(i);
    }

    private zzmi(int i) {
        this.zzvd = i;
        this.zzve = java.util.Collections.emptyList();
        this.zzvf = java.util.Collections.emptyMap();
        this.zzvh = java.util.Collections.emptyMap();
    }

    public void zzbp() {
        java.util.Map<K, V> unmodifiableMap;
        java.util.Map<K, V> unmodifiableMap2;
        if (this.zzot) {
            return;
        }
        if (this.zzvf.isEmpty()) {
            unmodifiableMap = java.util.Collections.emptyMap();
        } else {
            unmodifiableMap = java.util.Collections.unmodifiableMap(this.zzvf);
        }
        this.zzvf = unmodifiableMap;
        if (this.zzvh.isEmpty()) {
            unmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            unmodifiableMap2 = java.util.Collections.unmodifiableMap(this.zzvh);
        }
        this.zzvh = unmodifiableMap2;
        this.zzot = true;
    }

    public final boolean isImmutable() {
        return this.zzot;
    }

    public final int zzer() {
        return this.zzve.size();
    }

    public final java.util.Map.Entry<K, V> zzaw(int i) {
        return this.zzve.get(i);
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzes() {
        if (this.zzvf.isEmpty()) {
            return com.google.android.gms.internal.drive.zzmm.zzex();
        }
        return this.zzvf.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzve.size() + this.zzvf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza((com.google.android.gms.internal.drive.zzmi<K, V>) comparable) >= 0 || this.zzvf.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zza = zza((com.google.android.gms.internal.drive.zzmi<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzve.get(zza).getValue();
        }
        return this.zzvf.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzeu();
        int zza = zza((com.google.android.gms.internal.drive.zzmi<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzve.get(zza).setValue(v);
        }
        zzeu();
        if (this.zzve.isEmpty() && !(this.zzve instanceof java.util.ArrayList)) {
            this.zzve = new java.util.ArrayList(this.zzvd);
        }
        int i = -(zza + 1);
        if (i >= this.zzvd) {
            return zzev().put(k, v);
        }
        int size = this.zzve.size();
        int i2 = this.zzvd;
        if (size == i2) {
            com.google.android.gms.internal.drive.zzmp remove = this.zzve.remove(i2 - 1);
            zzev().put((java.lang.Comparable) remove.getKey(), remove.getValue());
        }
        this.zzve.add(i, new com.google.android.gms.internal.drive.zzmp(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzeu();
        if (!this.zzve.isEmpty()) {
            this.zzve.clear();
        }
        if (this.zzvf.isEmpty()) {
            return;
        }
        this.zzvf.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzeu();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zza = zza((com.google.android.gms.internal.drive.zzmi<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzax(zza);
        }
        if (this.zzvf.isEmpty()) {
            return null;
        }
        return this.zzvf.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzax(int i) {
        zzeu();
        V v = (V) this.zzve.remove(i).getValue();
        if (!this.zzvf.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzev().entrySet().iterator();
            this.zzve.add(new com.google.android.gms.internal.drive.zzmp(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int i;
        int size = this.zzve.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo((java.lang.Comparable) this.zzve.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo((java.lang.Comparable) this.zzve.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.zzvg == null) {
            this.zzvg = new com.google.android.gms.internal.drive.zzmr(this, null);
        }
        return this.zzvg;
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zzet() {
        if (this.zzvi == null) {
            this.zzvi = new com.google.android.gms.internal.drive.zzml(this, null);
        }
        return this.zzvi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzeu() {
        if (this.zzot) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzev() {
        zzeu();
        if (this.zzvf.isEmpty() && !(this.zzvf instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzvf = treeMap;
            this.zzvh = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzvf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzmi)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzmi zzmiVar = (com.google.android.gms.internal.drive.zzmi) obj;
        int size = size();
        if (size != zzmiVar.size()) {
            return false;
        }
        int zzer = zzer();
        if (zzer != zzmiVar.zzer()) {
            return entrySet().equals(zzmiVar.entrySet());
        }
        for (int i = 0; i < zzer; i++) {
            if (!zzaw(i).equals(zzmiVar.zzaw(i))) {
                return false;
            }
        }
        if (zzer != size) {
            return this.zzvf.equals(zzmiVar.zzvf);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzer = zzer();
        int i = 0;
        for (int i2 = 0; i2 < zzer; i2++) {
            i += this.zzve.get(i2).hashCode();
        }
        return this.zzvf.size() > 0 ? i + this.zzvf.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return zza((com.google.android.gms.internal.drive.zzmi<K, V>) obj, (java.lang.Comparable) obj2);
    }

    /* synthetic */ zzmi(int i, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(i);
    }
}
