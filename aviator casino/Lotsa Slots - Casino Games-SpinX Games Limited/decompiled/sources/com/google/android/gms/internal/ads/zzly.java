package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public interface zzly {

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    /* renamed from: com.google.android.gms.internal.ads.zzly$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$zza(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzqf zzqfVar) {
            throw new java.lang.IllegalStateException("onPrepared not implemented");
        }

        public static void $default$zzb(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzlx zzlxVar, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzaba[] zzabaVarArr) {
            throw new java.lang.IllegalStateException("onTracksSelected not implemented");
        }

        public static void $default$zzc(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzqf zzqfVar) {
            throw new java.lang.IllegalStateException("onStopped not implemented");
        }

        public static void $default$zzd(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzqf zzqfVar) {
            throw new java.lang.IllegalStateException("onReleased not implemented");
        }

        public static long $default$zzf(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzqf zzqfVar) {
            throw new java.lang.IllegalStateException("getBackBufferDurationUs not implemented");
        }

        public static boolean $default$zzg(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzqf zzqfVar) {
            throw new java.lang.IllegalStateException("retainBackBufferFromKeyframe not implemented");
        }

        public static boolean $default$zzh(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzlx zzlxVar) {
            long j = zzlxVar.zzd;
            throw null;
        }

        public static boolean $default$zzi(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzlx zzlxVar) {
            com.google.android.gms.internal.ads.zzbf zzbfVar = zzlxVar.zzb;
            throw null;
        }

        public static boolean $default$zzj(com.google.android.gms.internal.ads.zzly _this, com.google.android.gms.internal.ads.zzqf zzqfVar, com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, long j) {
            com.google.android.gms.internal.ads.zzeg.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
            return false;
        }
    }

    void zza(com.google.android.gms.internal.ads.zzqf zzqfVar);

    void zzb(com.google.android.gms.internal.ads.zzlx zzlxVar, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzaba[] zzabaVarArr);

    void zzc(com.google.android.gms.internal.ads.zzqf zzqfVar);

    void zzd(com.google.android.gms.internal.ads.zzqf zzqfVar);

    com.google.android.gms.internal.ads.zzabl zze(com.google.android.gms.internal.ads.zzqf zzqfVar);

    long zzf(com.google.android.gms.internal.ads.zzqf zzqfVar);

    boolean zzg(com.google.android.gms.internal.ads.zzqf zzqfVar);

    boolean zzh(com.google.android.gms.internal.ads.zzlx zzlxVar);

    boolean zzi(com.google.android.gms.internal.ads.zzlx zzlxVar);

    boolean zzj(com.google.android.gms.internal.ads.zzqf zzqfVar, com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, long j);
}
