package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
class zzfb extends java.util.AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile com.google.android.gms.internal.play_billing.zzez zze;
    private java.util.List zzb = java.util.Collections.emptyList();
    private java.util.Map zzc = java.util.Collections.emptyMap();
    private java.util.Map zzf = java.util.Collections.emptyMap();

    private final int zzk(java.lang.Comparable comparable) {
        int size = this.zzb.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((com.google.android.gms.internal.play_billing.zzev) this.zzb.get(i)).zza());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((com.google.android.gms.internal.play_billing.zzev) this.zzb.get(i3)).zza());
            if (compareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzl(int i) {
        zzn();
        java.lang.Object value = ((com.google.android.gms.internal.play_billing.zzev) this.zzb.remove(i)).getValue();
        if (!this.zzc.isEmpty()) {
            java.util.Iterator it = zzm().entrySet().iterator();
            java.util.List list = this.zzb;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new com.google.android.gms.internal.play_billing.zzev(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final java.util.SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.play_billing.zzez(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzfb)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_billing.zzfb zzfbVar = (com.google.android.gms.internal.play_billing.zzfb) obj;
        int size = size();
        if (size != zzfbVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb != zzfbVar.zzb()) {
            return entrySet().equals(zzfbVar.entrySet());
        }
        for (int i = 0; i < zzb; i++) {
            if (!zzg(i).equals(zzfbVar.zzg(i))) {
                return false;
            }
        }
        if (zzb != size) {
            return this.zzc.equals(zzfbVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? ((com.google.android.gms.internal.play_billing.zzev) this.zzb.get(zzk)).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i = 0;
        for (int i2 = 0; i2 < zzb; i2++) {
            i += ((com.google.android.gms.internal.play_billing.zzev) this.zzb.get(i2)).hashCode();
        }
        return this.zzc.size() > 0 ? i + this.zzc.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzn();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final java.lang.Iterable zzc() {
        return this.zzc.isEmpty() ? com.google.android.gms.internal.play_billing.zzeu.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((com.google.android.gms.internal.play_billing.zzev) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof java.util.ArrayList)) {
            this.zzb = new java.util.ArrayList(this.zza);
        }
        int i = -(zzk + 1);
        if (i >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            com.google.android.gms.internal.play_billing.zzev zzevVar = (com.google.android.gms.internal.play_billing.zzev) this.zzb.remove(i2 - 1);
            zzm().put(zzevVar.zza(), zzevVar.getValue());
        }
        this.zzb.add(i, new com.google.android.gms.internal.play_billing.zzev(this, comparable, obj));
        return null;
    }

    public final java.util.Map.Entry zzg(int i) {
        return (java.util.Map.Entry) this.zzb.get(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
