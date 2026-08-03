package com.google.android.gms.common.config;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public abstract class GservicesValue<T> {
    private static final java.lang.Object zzc = new java.lang.Object();
    protected final java.lang.String zza;
    protected final java.lang.Object zzb;
    private java.lang.Object zzd = null;

    protected GservicesValue(java.lang.String str, java.lang.Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Float> value(java.lang.String str, java.lang.Float f) {
        return new com.google.android.gms.common.config.zzd(str, f);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Integer> value(java.lang.String str, java.lang.Integer num) {
        return new com.google.android.gms.common.config.zzc(str, num);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Long> value(java.lang.String str, java.lang.Long l) {
        return new com.google.android.gms.common.config.zzb(str, l);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.String> value(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.common.config.zze(str, str2);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Boolean> value(java.lang.String str, boolean z) {
        return new com.google.android.gms.common.config.zza(str, java.lang.Boolean.valueOf(z));
    }

    public final T get() {
        T t;
        T t2 = (T) this.zzd;
        if (t2 != null) {
            return t2;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } finally {
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        try {
            t = (T) zza(this.zza);
        } catch (java.lang.SecurityException unused) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                t = (T) zza(this.zza);
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return t;
    }

    @java.lang.Deprecated
    public final T getBinderSafe() {
        return get();
    }

    public void override(T t) {
        android.util.Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = t;
        java.lang.Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    public void resetOverride() {
        this.zzd = null;
    }

    protected abstract java.lang.Object zza(java.lang.String str);
}
