package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzkn implements com.google.android.gms.internal.measurement.zzju {
    private static final java.util.Map zza = new androidx.collection.ArrayMap();
    private final android.content.SharedPreferences zzb;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private volatile java.util.Map zze;
    private final java.lang.Object zzd = new java.lang.Object();
    private final java.util.List zzf = new java.util.ArrayList();

    private zzkn(android.content.SharedPreferences sharedPreferences, java.lang.Runnable runnable) {
        this.zzb = sharedPreferences;
    }

    static com.google.android.gms.internal.measurement.zzkn zza(android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        final com.google.android.gms.internal.measurement.zzkn zzknVar;
        android.content.SharedPreferences zza2;
        if (com.google.android.gms.internal.measurement.zzjm.zza() && !str.startsWith("direct_boot:") && !com.google.android.gms.internal.measurement.zzjm.zzc(context)) {
            return null;
        }
        synchronized (com.google.android.gms.internal.measurement.zzkn.class) {
            java.util.Map map = zza;
            zzknVar = (com.google.android.gms.internal.measurement.zzkn) map.get(str);
            if (zzknVar == null) {
                android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (com.google.android.gms.internal.measurement.zzjm.zza()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        zza2 = com.google.android.gms.internal.measurement.zzcf.zza(context, str.substring(12), 0, com.google.android.gms.internal.measurement.zzcb.zza);
                    } else {
                        zza2 = com.google.android.gms.internal.measurement.zzcf.zza(context, str, 0, com.google.android.gms.internal.measurement.zzcb.zza);
                    }
                    zzknVar = new com.google.android.gms.internal.measurement.zzkn(zza2, runnable);
                    android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzkm
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                            com.google.android.gms.internal.measurement.zzkn.this.zzc(sharedPreferences, str2);
                        }
                    };
                    zzknVar.zzc = onSharedPreferenceChangeListener;
                    zzknVar.zzb.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, zzknVar);
                } finally {
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        return zzknVar;
    }

    static synchronized void zzb() {
        synchronized (com.google.android.gms.internal.measurement.zzkn.class) {
            java.util.Map map = zza;
            for (com.google.android.gms.internal.measurement.zzkn zzknVar : map.values()) {
                zzknVar.zzb.unregisterOnSharedPreferenceChangeListener((android.content.SharedPreferences.OnSharedPreferenceChangeListener) com.google.common.base.Preconditions.checkNotNull(zzknVar.zzc));
            }
            map.clear();
        }
    }

    final /* synthetic */ void zzc(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.zzd) {
            this.zze = null;
            com.google.android.gms.internal.measurement.zzkl.zzc();
        }
        synchronized (this) {
            java.util.Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.measurement.zzjr) it.next()).zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    public final java.lang.Object zze(java.lang.String str) {
        java.util.Map<java.lang.String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                map = this.zze;
                if (map == null) {
                    android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        java.util.Map<java.lang.String, ?> all = this.zzb.getAll();
                        this.zze = all;
                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
