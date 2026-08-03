package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzal implements java.util.Map, java.io.Serializable {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.play_billing.zzam zza;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.play_billing.zzam zzb;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.play_billing.zzaf zzc;

    zzal() {
    }

    public static com.google.android.gms.internal.play_billing.zzal zzc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        com.google.android.gms.internal.play_billing.zzad.zza("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        com.google.android.gms.internal.play_billing.zzad.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        com.google.android.gms.internal.play_billing.zzad.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return com.google.android.gms.internal.play_billing.zzat.zzg(3, new java.lang.Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

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
        return com.google.android.gms.internal.play_billing.zzau.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        com.google.android.gms.internal.play_billing.zzam zzamVar = this.zzb;
        if (zzamVar != null) {
            return zzamVar;
        }
        com.google.android.gms.internal.play_billing.zzam zze = zze();
        this.zzb = zze;
        return zze;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(size * 8, 1073741824L));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (java.util.Map.Entry entry : entrySet()) {
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

    abstract com.google.android.gms.internal.play_billing.zzaf zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzaf values() {
        com.google.android.gms.internal.play_billing.zzaf zzafVar = this.zzc;
        if (zzafVar != null) {
            return zzafVar;
        }
        com.google.android.gms.internal.play_billing.zzaf zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract com.google.android.gms.internal.play_billing.zzam zzd();

    abstract com.google.android.gms.internal.play_billing.zzam zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzam entrySet() {
        com.google.android.gms.internal.play_billing.zzam zzamVar = this.zza;
        if (zzamVar != null) {
            return zzamVar;
        }
        com.google.android.gms.internal.play_billing.zzam zzd = zzd();
        this.zza = zzd;
        return zzd;
    }
}
