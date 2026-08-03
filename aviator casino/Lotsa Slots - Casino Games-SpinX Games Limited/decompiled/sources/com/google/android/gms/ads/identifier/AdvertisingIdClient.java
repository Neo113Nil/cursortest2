package com.google.android.gms.ads.identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class AdvertisingIdClient {
    com.google.android.gms.common.BlockingServiceConnection zza;
    com.google.android.gms.internal.ads_identifier.zzf zzb;
    boolean zzc;
    final java.lang.Object zzd;
    com.google.android.gms.ads.identifier.zzb zze;
    final long zzf;
    private final android.content.Context zzg;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class Info {
        private final java.lang.String zza;
        private final boolean zzb;

        @java.lang.Deprecated
        public Info(java.lang.String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public java.lang.String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public java.lang.String toString() {
            java.lang.String str = this.zza;
            boolean z = this.zzb;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context context) throws java.io.IOException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context context) throws java.io.IOException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        boolean zzd;
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.zzc) {
                    synchronized (advertisingIdClient.zzd) {
                        com.google.android.gms.ads.identifier.zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new java.io.IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (java.lang.Exception e) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                com.google.android.gms.common.internal.Preconditions.checkNotNull(advertisingIdClient.zza);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (android.os.RemoteException e2) {
                    android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new java.io.IOException("Remote exception");
                }
            }
            advertisingIdClient.zze();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzd(int i) throws java.io.IOException {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzc) {
                synchronized (this.zzd) {
                    com.google.android.gms.ads.identifier.zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new java.io.IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (java.lang.Exception e) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb);
            try {
                info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (android.os.RemoteException e2) {
                android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new java.io.IOException("Remote exception");
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            com.google.android.gms.ads.identifier.zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new com.google.android.gms.ads.identifier.zzb(this, j);
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        zza();
        super.finalize();
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() throws java.io.IOException {
        return zzd(-1);
    }

    public void start() throws java.io.IOException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        zzb(true);
    }

    public final void zza() {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg == null || this.zza == null) {
                return;
            }
            try {
                if (this.zzc) {
                    com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                }
            } catch (java.lang.Throwable th) {
                android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.zzc = false;
            this.zzb = null;
            this.zza = null;
        }
    }

    protected final void zzb(boolean z) throws java.io.IOException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            android.content.Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int isGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                    throw new java.io.IOException("Google Play services not available");
                }
                com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
                android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        throw new java.io.IOException("Connection failure");
                    }
                    this.zza = blockingServiceConnection;
                    try {
                        this.zzb = com.google.android.gms.internal.ads_identifier.zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, java.util.concurrent.TimeUnit.MILLISECONDS));
                        this.zzc = true;
                        if (z) {
                            zze();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        throw new java.io.IOException("Interrupted exception");
                    } catch (java.lang.Throwable th) {
                        throw new java.io.IOException(th);
                    }
                } finally {
                    java.io.IOException iOException = new java.io.IOException(th);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    final boolean zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, boolean z, float f, long j, java.lang.String str, java.lang.Throwable th) {
        if (java.lang.Math.random() > 0.0d) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.X3.i.L0, "1");
        if (info != null) {
            hashMap.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            java.lang.String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", java.lang.Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "AdvertisingIdClient");
        hashMap.put("time_spent", java.lang.Long.toString(j));
        new com.google.android.gms.ads.identifier.zza(this, hashMap).start();
        return true;
    }

    public AdvertisingIdClient(android.content.Context context, long j, boolean z, boolean z2) {
        android.content.Context applicationContext;
        this.zzd = new java.lang.Object();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }
}
