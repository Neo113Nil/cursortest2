package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzcu implements java.util.Map, java.io.Serializable {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_vision_barcode.zzcv zza;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_vision_barcode.zzcv zzb;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.mlkit_vision_barcode.zzcn zzc;

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzcu zzc(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzby.zzb("optional-module-barcode", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID);
        return com.google.android.gms.internal.mlkit_vision_barcode.zzdp.zzg(1, new java.lang.Object[]{"optional-module-barcode", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID}, null);
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
        return com.google.android.gms.internal.mlkit_vision_barcode.zzds.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcv zzcvVar = this.zzb;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzcv zze = zze();
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
        com.google.android.gms.internal.mlkit_vision_barcode.zzby.zza(size, io.ktor.http.ContentDisposition.Parameters.Size);
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

    abstract com.google.android.gms.internal.mlkit_vision_barcode.zzcn zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcn values() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcn zzcnVar = this.zzc;
        if (zzcnVar != null) {
            return zzcnVar;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzcn zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract com.google.android.gms.internal.mlkit_vision_barcode.zzcv zzd();

    abstract com.google.android.gms.internal.mlkit_vision_barcode.zzcv zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcv entrySet() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcv zzcvVar = this.zza;
        if (zzcvVar != null) {
            return zzcvVar;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzcv zzd = zzd();
        this.zza = zzd;
        return zzd;
    }

    zzcu() {
    }
}
