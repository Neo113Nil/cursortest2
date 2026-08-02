package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzcd implements java.util.Map, java.io.Serializable {
    static final java.util.Map.Entry[] zza = new java.util.Map.Entry[0];

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.fido.zzcf zzb;

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public abstract java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj);

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object getOrDefault(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return com.google.android.gms.internal.fido.zzcy.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
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
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    abstract com.google.android.gms.internal.fido.zzcf zzb();

    @Override // java.util.Map
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzcf entrySet() {
        com.google.android.gms.internal.fido.zzcf zzcfVar = this.zzb;
        if (zzcfVar != null) {
            return zzcfVar;
        }
        com.google.android.gms.internal.fido.zzcf zzb = zzb();
        this.zzb = zzb;
        return zzb;
    }

    @Override // java.util.Map
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.fido.zzcf keySet() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.fido.zzby values() {
        throw null;
    }

    zzcd() {
    }
}
