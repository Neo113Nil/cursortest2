package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
class zzign extends java.util.AbstractMap {
    private java.lang.Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile com.google.android.gms.internal.ads.zzigm zze;
    private java.util.Map zzc = java.util.Collections.emptyMap();
    private java.util.Map zzf = java.util.Collections.emptyMap();

    private zzign() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object zzg(int i) {
        zzh();
        java.lang.Object value = ((com.google.android.gms.internal.ads.zzigk) this.zza[i]).getValue();
        java.lang.Object[] objArr = this.zza;
        java.lang.System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            java.util.Iterator it = zzo().entrySet().iterator();
            java.lang.Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            objArr2[i2] = new com.google.android.gms.internal.ads.zzigk(this, (java.lang.Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final int zzm(java.lang.Comparable comparable) {
        int i = this.zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((com.google.android.gms.internal.ads.zzigk) this.zza[i2]).zza());
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((com.google.android.gms.internal.ads.zzigk) this.zza[i4]).zza());
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
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap zzo() {
        zzh();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzh();
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
        return zzm(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.ads.zzigm(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzign)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzign zzignVar = (com.google.android.gms.internal.ads.zzign) obj;
        int size = size();
        if (size != zzignVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzignVar.zzb) {
            return entrySet().equals(zzignVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzd(i2).equals(zzignVar.zzd(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzignVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzm = zzm(comparable);
        return zzm >= 0 ? ((com.google.android.gms.internal.ads.zzigk) this.zza[zzm]).getValue() : this.zzc.get(comparable);
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
        zzh();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzm = zzm(comparable);
        if (zzm >= 0) {
            return zzg(zzm);
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

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final java.util.Map.Entry zzd(int i) {
        if (i < this.zzb) {
            return (com.google.android.gms.internal.ads.zzigk) this.zza[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    public final java.lang.Iterable zze() {
        return this.zzc.isEmpty() ? java.util.Collections.emptySet() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        zzh();
        int zzm = zzm(comparable);
        if (zzm >= 0) {
            return ((com.google.android.gms.internal.ads.zzigk) this.zza[zzm]).setValue(obj);
        }
        zzh();
        if (this.zza == null) {
            this.zza = new java.lang.Object[16];
        }
        int i = -(zzm + 1);
        if (i >= 16) {
            return zzo().put(comparable, obj);
        }
        if (this.zzb == 16) {
            com.google.android.gms.internal.ads.zzigk zzigkVar = (com.google.android.gms.internal.ads.zzigk) this.zza[15];
            this.zzb = 15;
            zzo().put(zzigkVar.zza(), zzigkVar.getValue());
        }
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        java.lang.System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.zza[i] = new com.google.android.gms.internal.ads.zzigk(this, comparable, obj);
        this.zzb++;
        return null;
    }

    final /* synthetic */ java.lang.Object[] zzi() {
        return this.zza;
    }

    final /* synthetic */ int zzj() {
        return this.zzb;
    }

    final /* synthetic */ java.util.Map zzk() {
        return this.zzc;
    }

    /* synthetic */ zzign(byte[] bArr) {
    }
}
