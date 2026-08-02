package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzbl implements java.util.Map, java.io.Serializable {
    private transient com.google.android.gms.internal.maps.zzbm zza;
    private transient com.google.android.gms.internal.maps.zzbm zzb;
    private transient com.google.android.gms.internal.maps.zzbf zzc;

    public static com.google.android.gms.internal.maps.zzbl zzc(java.lang.Iterable iterable) {
        com.google.android.gms.internal.maps.zzbk zzbkVar = new com.google.android.gms.internal.maps.zzbk(iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : 4);
        zzbkVar.zza(iterable);
        com.google.android.gms.internal.maps.zzbj zzbjVar = zzbkVar.zzc;
        if (zzbjVar != null) {
            throw zzbjVar.zza();
        }
        com.google.android.gms.internal.maps.zzbt zzg = com.google.android.gms.internal.maps.zzbt.zzg(zzbkVar.zzb, zzbkVar.zza, zzbkVar);
        com.google.android.gms.internal.maps.zzbj zzbjVar2 = zzbkVar.zzc;
        if (zzbjVar2 == null) {
            return zzg;
        }
        throw zzbjVar2.zza();
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
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
        return com.google.android.gms.internal.maps.zzbv.zza(entrySet());
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        com.google.android.gms.internal.maps.zzbm zzbmVar = this.zzb;
        if (zzbmVar != null) {
            return zzbmVar;
        }
        com.google.android.gms.internal.maps.zzbm zze = zze();
        this.zzb = zze;
        return zze;
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
        if (size < 0) {
            throw new java.lang.IllegalArgumentException("size cannot be negative but was: " + size);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(size * 8, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (java.util.Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    abstract com.google.android.gms.internal.maps.zzbf zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.maps.zzbf values() {
        com.google.android.gms.internal.maps.zzbf zzbfVar = this.zzc;
        if (zzbfVar != null) {
            return zzbfVar;
        }
        com.google.android.gms.internal.maps.zzbf zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract com.google.android.gms.internal.maps.zzbm zzd();

    abstract com.google.android.gms.internal.maps.zzbm zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.maps.zzbm entrySet() {
        com.google.android.gms.internal.maps.zzbm zzbmVar = this.zza;
        if (zzbmVar != null) {
            return zzbmVar;
        }
        com.google.android.gms.internal.maps.zzbm zzd = zzd();
        this.zza = zzd;
        return zzd;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    zzbl() {
    }
}
