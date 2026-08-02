package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjs {
    static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbjs.class.getName());
    public static final com.google.android.libraries.places.internal.zzbjs zzb = new com.google.android.libraries.places.internal.zzbjs();

    public static com.google.android.libraries.places.internal.zzbjs zza() {
        com.google.android.libraries.places.internal.zzbjs zzc = com.google.android.libraries.places.internal.zzbjq.zza.zzc();
        return zzc == null ? zzb : zzc;
    }

    static java.lang.Object zze(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException((java.lang.String) obj2);
    }

    public final com.google.android.libraries.places.internal.zzbjs zzb() {
        com.google.android.libraries.places.internal.zzbjs zza2 = com.google.android.libraries.places.internal.zzbjq.zza.zza(this);
        return zza2 == null ? zzb : zza2;
    }

    public final void zzc(com.google.android.libraries.places.internal.zzbjs zzbjsVar) {
        zze(zzbjsVar, "toAttach");
        com.google.android.libraries.places.internal.zzbjq.zza.zzb(this, zzbjsVar);
    }

    public final void zzd(com.google.android.libraries.places.internal.zzbjp zzbjpVar, java.util.concurrent.Executor executor) {
        zze(executor, "executor");
    }

    private zzbjs() {
    }
}
