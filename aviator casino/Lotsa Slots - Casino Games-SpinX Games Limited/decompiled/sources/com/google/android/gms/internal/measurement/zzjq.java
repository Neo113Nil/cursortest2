package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjq implements com.google.android.gms.internal.measurement.zzju {
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final java.lang.Runnable zze;
    private final android.database.ContentObserver zzf;
    private volatile java.util.Map zzh;
    private static final java.util.Map zzb = new androidx.collection.ArrayMap();
    public static final java.lang.String[] zza = {com.ironsource.X3.i.W, "value"};
    private final java.lang.Object zzg = new java.lang.Object();
    private final java.util.List zzi = new java.util.ArrayList();

    private zzjq(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(contentResolver);
        com.google.common.base.Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        this.zzf = new com.google.android.gms.internal.measurement.zzjo(this, null);
    }

    public static com.google.android.gms.internal.measurement.zzjq zza(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.android.gms.internal.measurement.zzjq zzjqVar;
        synchronized (com.google.android.gms.internal.measurement.zzjq.class) {
            java.util.Map map = zzb;
            zzjqVar = (com.google.android.gms.internal.measurement.zzjq) map.get(uri);
            if (zzjqVar == null) {
                try {
                    com.google.android.gms.internal.measurement.zzjq zzjqVar2 = new com.google.android.gms.internal.measurement.zzjq(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, zzjqVar2.zzf);
                        map.put(uri, zzjqVar2);
                    } catch (java.lang.SecurityException unused) {
                    }
                    zzjqVar = zzjqVar2;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return zzjqVar;
    }

    static synchronized void zzd() {
        synchronized (com.google.android.gms.internal.measurement.zzjq.class) {
            java.util.Map map = zzb;
            for (com.google.android.gms.internal.measurement.zzjq zzjqVar : map.values()) {
                zzjqVar.zzc.unregisterContentObserver(zzjqVar.zzf);
            }
            map.clear();
        }
    }

    public final java.util.Map zzb() {
        java.util.Map emptyMap;
        java.util.Map map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            emptyMap = (java.util.Map) com.google.android.gms.internal.measurement.zzju.CC.zzg(new com.google.android.gms.internal.measurement.zzjt() { // from class: com.google.android.gms.internal.measurement.zzjp
                                @Override // com.google.android.gms.internal.measurement.zzjt
                                public final /* synthetic */ java.lang.Object zza() {
                                    return com.google.android.gms.internal.measurement.zzjq.this.zzf();
                                }
                            });
                        } finally {
                            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException e) {
                        android.util.Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                        emptyMap = java.util.Collections.emptyMap();
                    }
                    this.zzh = emptyMap;
                    map = emptyMap;
                }
            }
        }
        return map != null ? map : java.util.Collections.emptyMap();
    }

    public final void zzc() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            java.util.Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.measurement.zzjr) it.next()).zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    public final /* bridge */ /* synthetic */ java.lang.Object zze(java.lang.String str) {
        return (java.lang.String) zzb().get(str);
    }

    final /* synthetic */ java.util.Map zzf() {
        java.util.Map emptyMap;
        android.database.Cursor query;
        java.util.Map emptyMap2;
        android.content.ContentResolver contentResolver = this.zzc;
        android.net.Uri uri = this.zzd;
        android.content.ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return java.util.Collections.emptyMap();
            }
            try {
                query = acquireUnstableContentProviderClient.query(uri, zza, null, null, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                emptyMap = java.util.Collections.emptyMap();
            }
            try {
                if (query == null) {
                    android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    emptyMap = java.util.Collections.emptyMap();
                    acquireUnstableContentProviderClient.release();
                    return emptyMap;
                }
                int count = query.getCount();
                if (count == 0) {
                    emptyMap2 = java.util.Collections.emptyMap();
                } else {
                    java.util.Map arrayMap = count <= 256 ? new androidx.collection.ArrayMap(count) : new java.util.HashMap(count, 1.0f);
                    while (query.moveToNext()) {
                        arrayMap.put(query.getString(0), query.getString(1));
                    }
                    if (query.isAfterLast()) {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return arrayMap;
                    }
                    android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    emptyMap2 = java.util.Collections.emptyMap();
                }
                query.close();
                acquireUnstableContentProviderClient.release();
                return emptyMap2;
            } catch (java.lang.Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            acquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
