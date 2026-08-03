package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzdd implements com.google.android.gms.internal.auth.zzcl {
    private static final java.util.Map zza = new androidx.collection.ArrayMap();
    private final android.content.SharedPreferences zzb;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static com.google.android.gms.internal.auth.zzdd zza(android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        com.google.android.gms.internal.auth.zzdd zzddVar;
        if (com.google.android.gms.internal.auth.zzcc.zzb()) {
            throw null;
        }
        synchronized (com.google.android.gms.internal.auth.zzdd.class) {
            zzddVar = (com.google.android.gms.internal.auth.zzdd) zza.get(null);
            if (zzddVar == null) {
                android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (java.lang.Throwable th) {
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzddVar;
    }

    static synchronized void zzc() {
        synchronized (com.google.android.gms.internal.auth.zzdd.class) {
            java.util.Map map = zza;
            java.util.Iterator it = map.values().iterator();
            if (it.hasNext()) {
                com.google.android.gms.internal.auth.zzdd zzddVar = (com.google.android.gms.internal.auth.zzdd) it.next();
                android.content.SharedPreferences sharedPreferences = zzddVar.zzb;
                android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = zzddVar.zzc;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final java.lang.Object zzb(java.lang.String str) {
        throw null;
    }
}
