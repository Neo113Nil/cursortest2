package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgwp<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    private transient com.google.android.gms.internal.ads.zzgww zza;
    private transient com.google.android.gms.internal.ads.zzgww zzb;
    private transient com.google.android.gms.internal.ads.zzgwi zzc;

    zzgwp() {
    }

    public static com.google.android.gms.internal.ads.zzgwp zza() {
        return com.google.android.gms.internal.ads.zzgym.zza;
    }

    public static com.google.android.gms.internal.ads.zzgwp zzb(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzgvi.zza("dialog_not_shown_reason", obj2);
        return com.google.android.gms.internal.ads.zzgym.zzk(1, new java.lang.Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static com.google.android.gms.internal.ads.zzgwp zzc(java.util.Map map) {
        if ((map instanceof com.google.android.gms.internal.ads.zzgwp) && !(map instanceof java.util.SortedMap)) {
            com.google.android.gms.internal.ads.zzgwp zzgwpVar = (com.google.android.gms.internal.ads.zzgwp) map;
            zzgwpVar.zzj();
            return zzgwpVar;
        }
        java.util.Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        com.google.android.gms.internal.ads.zzgwo zzgwoVar = new com.google.android.gms.internal.ads.zzgwo(entrySet instanceof java.util.Collection ? entrySet.size() : 4);
        zzgwoVar.zzb(entrySet);
        return zzgwoVar.zzc();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzgxt.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return com.google.android.gms.internal.ads.zzgyw.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        int size = size();
        com.google.android.gms.internal.ads.zzgvi.zzb(size, "size");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(size * 8, 1073741824L));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(com.ironsource.B5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgww entrySet() {
        com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zza;
        if (zzgwwVar != null) {
            return zzgwwVar;
        }
        com.google.android.gms.internal.ads.zzgww zze = zze();
        this.zza = zze;
        return zze;
    }

    abstract com.google.android.gms.internal.ads.zzgww zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgww keySet() {
        com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zzb;
        if (zzgwwVar != null) {
            return zzgwwVar;
        }
        com.google.android.gms.internal.ads.zzgww zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }

    abstract com.google.android.gms.internal.ads.zzgww zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgwi values() {
        com.google.android.gms.internal.ads.zzgwi zzgwiVar = this.zzc;
        if (zzgwiVar != null) {
            return zzgwiVar;
        }
        com.google.android.gms.internal.ads.zzgwi zzi = zzi();
        this.zzc = zzi;
        return zzi;
    }

    abstract com.google.android.gms.internal.ads.zzgwi zzi();

    abstract boolean zzj();
}
