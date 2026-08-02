package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbkn {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbkn.class.getName());
    private static final com.google.android.libraries.places.internal.zzbkn zzc = new com.google.android.libraries.places.internal.zzbkn();
    private final java.util.concurrent.ConcurrentNavigableMap zzd;
    private final java.util.concurrent.ConcurrentMap zze;
    private final java.util.concurrent.ConcurrentMap zzf;

    public zzbkn() {
        new java.util.concurrent.ConcurrentSkipListMap();
        this.zzd = new java.util.concurrent.ConcurrentSkipListMap();
        this.zze = new java.util.concurrent.ConcurrentHashMap();
        this.zzf = new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentHashMap();
    }

    private static void zzi(java.util.Map map, com.google.android.libraries.places.internal.zzbkt zzbktVar) {
    }

    private static void zzj(java.util.Map map, com.google.android.libraries.places.internal.zzbkt zzbktVar) {
    }

    public final void zzb(com.google.android.libraries.places.internal.zzbkt zzbktVar) {
        zzi(this.zze, zzbktVar);
    }

    public final void zzc(com.google.android.libraries.places.internal.zzbkt zzbktVar) {
        zzi(this.zzd, zzbktVar);
    }

    public final void zzd(com.google.android.libraries.places.internal.zzbkt zzbktVar) {
        zzi(this.zzf, zzbktVar);
    }

    public final void zze(com.google.android.libraries.places.internal.zzbkt zzbktVar) {
        zzj(this.zze, zzbktVar);
    }

    public final void zzf(com.google.android.libraries.places.internal.zzbkt zzbktVar) {
        zzj(this.zzd, zzbktVar);
    }

    public final void zzg(com.google.android.libraries.places.internal.zzbkt zzbktVar) {
        zzj(this.zzf, zzbktVar);
    }

    public static com.google.android.libraries.places.internal.zzbkn zza() {
        return zzc;
    }
}
