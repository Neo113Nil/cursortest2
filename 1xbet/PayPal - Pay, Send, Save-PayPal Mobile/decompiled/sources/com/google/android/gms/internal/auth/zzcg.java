package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzcg implements com.google.android.gms.internal.auth.zzcl {
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final java.lang.Runnable zze;
    private final android.database.ContentObserver zzf;
    private final java.lang.Object zzg;
    private volatile java.util.Map zzh;
    private final java.util.List zzi;
    private static final java.util.Map zzb = new androidx.collection.ArrayMap();
    public static final java.lang.String[] zza = {"key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE};

    private zzcg(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.android.gms.internal.auth.zzcf zzcfVar = new com.google.android.gms.internal.auth.zzcf(this, null);
        this.zzf = zzcfVar;
        this.zzg = new java.lang.Object();
        this.zzi = new java.util.ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzcfVar);
    }

    public static com.google.android.gms.internal.auth.zzcg zza(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.android.gms.internal.auth.zzcg zzcgVar;
        synchronized (com.google.android.gms.internal.auth.zzcg.class) {
            java.util.Map map = zzb;
            zzcgVar = (com.google.android.gms.internal.auth.zzcg) map.get(uri);
            if (zzcgVar == null) {
                try {
                    com.google.android.gms.internal.auth.zzcg zzcgVar2 = new com.google.android.gms.internal.auth.zzcg(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzcgVar2);
                    } catch (java.lang.SecurityException unused) {
                    }
                    zzcgVar = zzcgVar2;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return zzcgVar;
    }

    static void zzd() {
        synchronized (com.google.android.gms.internal.auth.zzcg.class) {
            for (com.google.android.gms.internal.auth.zzcg zzcgVar : zzb.values()) {
                zzcgVar.zzc.unregisterContentObserver(zzcgVar.zzf);
            }
            zzb.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* synthetic */ java.lang.Object zzb(java.lang.String str) {
        java.util.Map map;
        java.util.Map map2 = this.zzh;
        if (map2 == null) {
            synchronized (this.zzg) {
                map2 = this.zzh;
                if (map2 == null) {
                    android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (java.util.Map) com.google.android.gms.internal.auth.zzcj.zza(new com.google.android.gms.internal.auth.zzck() { // from class: com.google.android.gms.internal.auth.zzce
                                @Override // com.google.android.gms.internal.auth.zzck
                                public final java.lang.Object zza() {
                                    return com.google.android.gms.internal.auth.zzcg.this.zzc();
                                }
                            });
                        } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException unused) {
                            android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.zzh = map;
                        map2 = map;
                    } finally {
                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
        }
        if (map2 == null) {
            map2 = java.util.Collections.emptyMap();
        }
        return (java.lang.String) map2.get(str);
    }

    final /* synthetic */ java.util.Map zzc() {
        android.database.Cursor query = this.zzc.query(this.zzd, zza, null, null, null);
        if (query == null) {
            return java.util.Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return java.util.Collections.emptyMap();
            }
            java.util.Map arrayMap = count <= 256 ? new androidx.collection.ArrayMap(count) : new java.util.HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            return arrayMap;
        } finally {
            query.close();
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzh = null;
            com.google.android.gms.internal.auth.zzdc.zzc();
        }
        synchronized (this) {
            java.util.Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.auth.zzch) it.next()).zza();
            }
        }
    }
}
