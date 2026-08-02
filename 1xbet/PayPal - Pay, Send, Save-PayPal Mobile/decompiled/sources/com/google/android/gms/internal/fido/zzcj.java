package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzcj extends com.google.android.gms.internal.fido.zzcd implements java.util.NavigableMap {
    private static final java.util.Comparator zzb;
    private static final com.google.android.gms.internal.fido.zzcj zzc;
    private final transient com.google.android.gms.internal.fido.zzcv zzd;
    private final transient com.google.android.gms.internal.fido.zzcc zze;

    @javax.annotation.CheckForNull
    private final transient com.google.android.gms.internal.fido.zzcj zzf;

    static {
        com.google.android.gms.internal.fido.zzcq zzcqVar = com.google.android.gms.internal.fido.zzcq.zza;
        zzb = zzcqVar;
        com.google.android.gms.internal.fido.zzcv zzs = com.google.android.gms.internal.fido.zzck.zzs(zzcqVar);
        int i = com.google.android.gms.internal.fido.zzcc.zzd;
        zzc = new com.google.android.gms.internal.fido.zzcj(zzs, com.google.android.gms.internal.fido.zzct.zza, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.internal.fido.zzcj zzf(java.util.Map map) {
        final java.util.Comparator comparator = zzb;
        java.util.Comparator comparator2 = map.comparator();
        int i = 1;
        boolean equals = comparator2 == null ? true : comparator.equals(comparator2);
        java.util.Collection entrySet = map.entrySet();
        java.util.Map.Entry[] entryArr = zza;
        if (!(entrySet instanceof java.util.Collection)) {
            java.util.Iterator it = entrySet.iterator();
            java.util.Collection arrayList = new java.util.ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        java.util.Map.Entry[] entryArr2 = (java.util.Map.Entry[]) entrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return zzg(comparator);
        }
        if (length == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr2[0]);
            return new com.google.android.gms.internal.fido.zzcj(new com.google.android.gms.internal.fido.zzcv(com.google.android.gms.internal.fido.zzcc.zzj(entry.getKey()), comparator), com.google.android.gms.internal.fido.zzcc.zzj(entry.getValue()), null);
        }
        java.lang.Object[] objArr = new java.lang.Object[length];
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        if (equals) {
            for (int i2 = 0; i2 < length; i2++) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr2[i2]);
                java.lang.Object key = entry2.getKey();
                java.lang.Object value = entry2.getValue();
                com.google.android.gms.internal.fido.zzbv.zza(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            java.util.Arrays.sort(entryArr2, 0, length, new java.util.Comparator() { // from class: com.google.android.gms.internal.fido.zzcg
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry) obj;
                    java.util.Map.Entry entry4 = (java.util.Map.Entry) obj2;
                    java.util.Objects.requireNonNull(entry3);
                    java.util.Objects.requireNonNull(entry4);
                    return comparator.compare(entry3.getKey(), entry4.getKey());
                }
            });
            java.util.Map.Entry entry3 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr2[0]);
            java.lang.Object key2 = entry3.getKey();
            objArr[0] = key2;
            java.lang.Object value2 = entry3.getValue();
            objArr2[0] = value2;
            com.google.android.gms.internal.fido.zzbv.zza(objArr[0], value2);
            while (i < length) {
                java.util.Map.Entry entry4 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr2[i - 1]);
                java.util.Map.Entry entry5 = (java.util.Map.Entry) java.util.Objects.requireNonNull(entryArr2[i]);
                java.lang.Object key3 = entry5.getKey();
                java.lang.Object value3 = entry5.getValue();
                com.google.android.gms.internal.fido.zzbv.zza(key3, value3);
                objArr[i] = key3;
                objArr2[i] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(entry4) + " and " + java.lang.String.valueOf(entry5));
                }
                i++;
                key2 = key3;
            }
        }
        return new com.google.android.gms.internal.fido.zzcj(new com.google.android.gms.internal.fido.zzcv(com.google.android.gms.internal.fido.zzcc.zzh(objArr, length), comparator), com.google.android.gms.internal.fido.zzcc.zzh(objArr2, length), null);
    }

    static com.google.android.gms.internal.fido.zzcj zzg(java.util.Comparator comparator) {
        if (com.google.android.gms.internal.fido.zzcq.zza.equals(comparator)) {
            return zzc;
        }
        com.google.android.gms.internal.fido.zzcv zzs = com.google.android.gms.internal.fido.zzck.zzs(comparator);
        int i = com.google.android.gms.internal.fido.zzcc.zzd;
        return new com.google.android.gms.internal.fido.zzcj(zzs, com.google.android.gms.internal.fido.zzct.zza, null);
    }

    private final com.google.android.gms.internal.fido.zzcj zzl(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zze.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return zzg(((com.google.android.gms.internal.fido.zzck) this.zzd).zza);
        }
        return new com.google.android.gms.internal.fido.zzcj(this.zzd.zzw(i, i2), this.zze.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return com.google.android.gms.internal.fido.zzco.zza(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ java.util.NavigableSet descendingKeySet() {
        return this.zzd.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ java.util.NavigableMap descendingMap() {
        com.google.android.gms.internal.fido.zzcj zzcjVar = this.zzf;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        if (!isEmpty()) {
            return new com.google.android.gms.internal.fido.zzcj((com.google.android.gms.internal.fido.zzcv) this.zzd.descendingSet(), this.zze.zzf(), this);
        }
        java.util.Comparator comparator = ((com.google.android.gms.internal.fido.zzck) this.zzd).zza;
        return zzg((comparator instanceof com.google.android.gms.internal.fido.zzcs ? (com.google.android.gms.internal.fido.zzcs) comparator : new com.google.android.gms.internal.fido.zzbw(comparator)).zza());
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ java.util.Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return this.zzd.first();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return com.google.android.gms.internal.fido.zzco.zza(floorEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return com.google.android.gms.internal.fido.zzco.zza(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().zzi().get(this.zze.size() - 1);
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return this.zzd.last();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return com.google.android.gms.internal.fido.zzco.zza(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.util.Map.Entry pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.util.Map.Entry pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zze.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    final com.google.android.gms.internal.fido.zzcf zzb() {
        return isEmpty() ? com.google.android.gms.internal.fido.zzcu.zza : new com.google.android.gms.internal.fido.zzci(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000e, code lost:
    
        if (r4 < 0) goto L7;
     */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        int binarySearch;
        com.google.android.gms.internal.fido.zzcv zzcvVar = this.zzd;
        if (obj != null) {
            try {
                binarySearch = java.util.Collections.binarySearch(zzcvVar.zzd, obj, zzcvVar.zza);
            } catch (java.lang.ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.zze.get(binarySearch);
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzcj headMap(java.lang.Object obj, boolean z) {
        obj.getClass();
        return zzl(0, this.zzd.zzu(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzcj tailMap(java.lang.Object obj, boolean z) {
        obj.getClass();
        return zzl(this.zzd.zzv(obj, z), this.zze.size());
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzcj subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (((com.google.android.gms.internal.fido.zzck) this.zzd).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.fido.zzbo.zza("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: zzd */
    public final /* synthetic */ com.google.android.gms.internal.fido.zzcf keySet() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: zza */
    public final com.google.android.gms.internal.fido.zzby values() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ java.util.Collection values() {
        return this.zze;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ java.util.NavigableSet navigableKeySet() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        return this.zzd;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return ((com.google.android.gms.internal.fido.zzck) this.zzd).zza;
    }

    zzcj(com.google.android.gms.internal.fido.zzcv zzcvVar, com.google.android.gms.internal.fido.zzcc zzccVar, @javax.annotation.CheckForNull com.google.android.gms.internal.fido.zzcj zzcjVar) {
        this.zzd = zzcvVar;
        this.zze = zzccVar;
        this.zzf = zzcjVar;
    }
}
