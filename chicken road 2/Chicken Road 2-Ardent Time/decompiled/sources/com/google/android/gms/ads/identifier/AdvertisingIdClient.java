package com.google.android.gms.ads.identifier;

@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    @javax.annotation.concurrent.GuardedBy("this")
    m0.ServiceConnectionC0929a zza;

    @javax.annotation.concurrent.GuardedBy("this")
    w0.d zzb;

    @javax.annotation.concurrent.GuardedBy("this")
    boolean zzc;
    final java.lang.Object zzd;

    @javax.annotation.concurrent.GuardedBy("mAutoDisconnectTaskLock")
    com.google.android.gms.ads.identifier.b zze;
    final long zzf;

    @javax.annotation.concurrent.GuardedBy("this")
    private final android.content.Context zzg;

    public static final class Info {
        private final java.lang.String zza;
        private final boolean zzb;

        @java.lang.Deprecated
        public Info(java.lang.String str, boolean z2) {
            this.zza = str;
            this.zzb = z2;
        }

        public java.lang.String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public java.lang.String toString() {
            java.lang.String str = this.zza;
            boolean z2 = this.zzb;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z2);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context context) {
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

    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context context) {
        boolean z2;
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            p0.AbstractC0966r.b("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            com.google.android.gms.ads.identifier.b bVar = advertisingIdClient.zze;
                            if (bVar == null || !bVar.f2576d) {
                                throw new java.io.IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (java.lang.Exception e2) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e2);
                        }
                    }
                    p0.AbstractC0966r.c(advertisingIdClient.zza);
                    p0.AbstractC0966r.c(advertisingIdClient.zzb);
                    try {
                        w0.C1007b c1007b = (w0.C1007b) advertisingIdClient.zzb;
                        c1007b.getClass();
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        android.os.Parcel a2 = c1007b.a(obtain, 6);
                        int i2 = w0.AbstractC1006a.f8399a;
                        z2 = a2.readInt() != 0;
                        a2.recycle();
                    } catch (android.os.RemoteException e3) {
                        android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                        throw new java.io.IOException("Remote exception");
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return z2;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z2) {
    }

    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzd(int i2) {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        p0.AbstractC0966r.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        com.google.android.gms.ads.identifier.b bVar = this.zze;
                        if (bVar == null || !bVar.f2576d) {
                            throw new java.io.IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (java.lang.Exception e2) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                p0.AbstractC0966r.c(this.zza);
                p0.AbstractC0966r.c(this.zzb);
                try {
                    w0.C1007b c1007b = (w0.C1007b) this.zzb;
                    c1007b.getClass();
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    android.os.Parcel a2 = c1007b.a(obtain, 1);
                    java.lang.String readString = a2.readString();
                    a2.recycle();
                    w0.C1007b c1007b2 = (w0.C1007b) this.zzb;
                    c1007b2.getClass();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i3 = w0.AbstractC1006a.f8399a;
                    obtain2.writeInt(1);
                    android.os.Parcel a3 = c1007b2.a(obtain2, 2);
                    boolean z2 = a3.readInt() != 0;
                    a3.recycle();
                    info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(readString, z2);
                } catch (android.os.RemoteException e3) {
                    android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new java.io.IOException("Remote exception");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            com.google.android.gms.ads.identifier.b bVar = this.zze;
            if (bVar != null) {
                bVar.f2575c.countDown();
                try {
                    this.zze.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            long j2 = this.zzf;
            if (j2 > 0) {
                this.zze = new com.google.android.gms.ads.identifier.b(this, j2);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        p0.AbstractC0966r.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        s0.C0990a.a().b(this.zzg, this.zza);
                    }
                } catch (java.lang.Throwable th) {
                    android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public final void zzb(boolean z2) {
        p0.AbstractC0966r.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                android.content.Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b2 = m0.g.f8055b.b(context, 12451000);
                    if (b2 != 0 && b2 != 2) {
                        throw new java.io.IOException("Google Play services not available");
                    }
                    m0.ServiceConnectionC0929a serviceConnectionC0929a = new m0.ServiceConnectionC0929a();
                    android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!s0.C0990a.a().c(context, context.getClass().getName(), intent, serviceConnectionC0929a, 1, null)) {
                            throw new java.io.IOException("Connection failure");
                        }
                        this.zza = serviceConnectionC0929a;
                        try {
                            android.os.IBinder a2 = serviceConnectionC0929a.a(java.util.concurrent.TimeUnit.MILLISECONDS);
                            int i2 = w0.c.f8401a;
                            android.os.IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = queryLocalInterface instanceof w0.d ? (w0.d) queryLocalInterface : new w0.C1007b(a2);
                            this.zzc = true;
                            if (z2) {
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
                    throw new m0.h();
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public final boolean zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, boolean z2, float f2, long j2, java.lang.String str, java.lang.Throwable th) {
        if (java.lang.Math.random() > com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("app_context", "1");
        if (info != null) {
            hashMap.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER : "1");
            java.lang.String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", java.lang.Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", java.lang.Long.toString(j2));
        new com.google.android.gms.ads.identifier.a(hashMap).start();
        return true;
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public AdvertisingIdClient(android.content.Context context, long j2, boolean z2, boolean z3) {
        android.content.Context applicationContext;
        this.zzd = new java.lang.Object();
        p0.AbstractC0966r.c(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j2;
    }
}
