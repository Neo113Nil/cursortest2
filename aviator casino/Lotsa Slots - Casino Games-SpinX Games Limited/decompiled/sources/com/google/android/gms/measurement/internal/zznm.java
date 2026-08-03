package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zznm extends com.google.android.gms.measurement.internal.zzor {
    public final com.google.android.gms.measurement.internal.zzhd zza;
    public final com.google.android.gms.measurement.internal.zzhd zzb;
    public final com.google.android.gms.measurement.internal.zzhd zzc;
    public final com.google.android.gms.measurement.internal.zzhd zzd;
    public final com.google.android.gms.measurement.internal.zzhd zze;
    public final com.google.android.gms.measurement.internal.zzhd zzf;
    private final java.util.Map zzh;

    zznm(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
        this.zzh = new java.util.HashMap();
        com.google.android.gms.measurement.internal.zzhg zzd = this.zzu.zzd();
        java.util.Objects.requireNonNull(zzd);
        this.zza = new com.google.android.gms.measurement.internal.zzhd(zzd, "last_delete_stale", 0L);
        com.google.android.gms.measurement.internal.zzhg zzd2 = this.zzu.zzd();
        java.util.Objects.requireNonNull(zzd2);
        this.zzb = new com.google.android.gms.measurement.internal.zzhd(zzd2, "last_delete_stale_batch", 0L);
        com.google.android.gms.measurement.internal.zzhg zzd3 = this.zzu.zzd();
        java.util.Objects.requireNonNull(zzd3);
        this.zzc = new com.google.android.gms.measurement.internal.zzhd(zzd3, "backoff", 0L);
        com.google.android.gms.measurement.internal.zzhg zzd4 = this.zzu.zzd();
        java.util.Objects.requireNonNull(zzd4);
        this.zzd = new com.google.android.gms.measurement.internal.zzhd(zzd4, "last_upload", 0L);
        com.google.android.gms.measurement.internal.zzhg zzd5 = this.zzu.zzd();
        java.util.Objects.requireNonNull(zzd5);
        this.zze = new com.google.android.gms.measurement.internal.zzhd(zzd5, "last_upload_attempt", 0L);
        com.google.android.gms.measurement.internal.zzhg zzd6 = this.zzu.zzd();
        java.util.Objects.requireNonNull(zzd6);
        this.zzf = new com.google.android.gms.measurement.internal.zzhd(zzd6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }

    final android.util.Pair zzc(java.lang.String str, com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        return zzjkVar.zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE) ? zzd(str) : new android.util.Pair("", false);
    }

    @java.lang.Deprecated
    final android.util.Pair zzd(java.lang.String str) {
        com.google.android.gms.measurement.internal.zznl zznlVar;
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long elapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
        com.google.android.gms.measurement.internal.zznl zznlVar2 = (com.google.android.gms.measurement.internal.zznl) this.zzh.get(str);
        if (zznlVar2 != null && elapsedRealtime < zznlVar2.zzc) {
            return new android.util.Pair(zznlVar2.zza, java.lang.Boolean.valueOf(zznlVar2.zzb));
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzl = zzibVar.zzc().zzl(str, com.google.android.gms.measurement.internal.zzfx.zza) + elapsedRealtime;
        try {
            try {
                info = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(zzibVar.zzaY());
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                info = null;
                if (zznlVar2 != null && elapsedRealtime < zznlVar2.zzc + this.zzu.zzc().zzl(str, com.google.android.gms.measurement.internal.zzfx.zzb)) {
                    return new android.util.Pair(zznlVar2.zza, java.lang.Boolean.valueOf(zznlVar2.zzb));
                }
            }
        } catch (java.lang.Exception e) {
            this.zzu.zzaV().zzj().zzb("Unable to get advertising id", e);
            zznlVar = new com.google.android.gms.measurement.internal.zznl("", false, zzl);
        }
        if (info == null) {
            return new android.util.Pair("00000000-0000-0000-0000-000000000000", false);
        }
        java.lang.String id = info.getId();
        zznlVar = id != null ? new com.google.android.gms.measurement.internal.zznl(id, info.isLimitAdTrackingEnabled(), zzl) : new com.google.android.gms.measurement.internal.zznl("", info.isLimitAdTrackingEnabled(), zzl);
        this.zzh.put(str, zznlVar);
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new android.util.Pair(zznlVar.zza, java.lang.Boolean.valueOf(zznlVar.zzb));
    }

    @java.lang.Deprecated
    final java.lang.String zzf(java.lang.String str, boolean z) {
        zzg();
        java.lang.String str2 = z ? (java.lang.String) zzd(str).first : "00000000-0000-0000-0000-000000000000";
        java.security.MessageDigest zzO = com.google.android.gms.measurement.internal.zzpo.zzO();
        if (zzO == null) {
            return null;
        }
        return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, zzO.digest(str2.getBytes())));
    }
}
