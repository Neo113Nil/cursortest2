package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
class zzsi extends java.util.AbstractMap {
    private java.lang.Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile com.google.android.gms.internal.consent_sdk.zzsg zze;
    private java.util.Map zzc = java.util.Collections.emptyMap();
    private java.util.Map zzf = java.util.Collections.emptyMap();

    private zzsi() {
    }

    private final int zzl(java.lang.Comparable comparable) {
        int i = this.zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((com.google.android.gms.internal.consent_sdk.zzse) this.zza[i2]).zza());
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((com.google.android.gms.internal.consent_sdk.zzse) this.zza[i4]).zza());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzm(int i) {
        zzo();
        java.lang.Object value = ((com.google.android.gms.internal.consent_sdk.zzse) this.zza[i]).getValue();
        java.lang.Object[] objArr = this.zza;
        java.lang.System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            java.util.Iterator it = zzn().entrySet().iterator();
            java.lang.Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            objArr2[i2] = new com.google.android.gms.internal.consent_sdk.zzse(this, (java.lang.Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final java.util.SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.consent_sdk.zzsg(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzsi)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = (com.google.android.gms.internal.consent_sdk.zzsi) obj;
        int size = size();
        if (size != zzsiVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzsiVar.zzb) {
            return entrySet().equals(zzsiVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzg(i2).equals(zzsiVar.zzg(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzsiVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzl = zzl(comparable);
        return zzl >= 0 ? ((com.google.android.gms.internal.consent_sdk.zzse) this.zza[zzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? i2 + this.zzc.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzo();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final java.lang.Iterable zzd() {
        return this.zzc.isEmpty() ? java.util.Collections.emptySet() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((com.google.android.gms.internal.consent_sdk.zzse) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new java.lang.Object[16];
        }
        int i = -(zzl + 1);
        if (i >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            com.google.android.gms.internal.consent_sdk.zzse zzseVar = (com.google.android.gms.internal.consent_sdk.zzse) this.zza[15];
            this.zzb = 15;
            zzn().put(zzseVar.zza(), zzseVar.getValue());
        }
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        java.lang.System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.zza[i] = new com.google.android.gms.internal.consent_sdk.zzse(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final java.util.Map.Entry zzg(int i) {
        if (i < this.zzb) {
            return (com.google.android.gms.internal.consent_sdk.zzse) this.zza[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    /* synthetic */ zzsi(com.google.android.gms.internal.consent_sdk.zzsh zzshVar) {
    }
}
