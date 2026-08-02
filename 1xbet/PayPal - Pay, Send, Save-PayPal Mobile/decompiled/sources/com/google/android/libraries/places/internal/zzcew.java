package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcew {
    public static final /* synthetic */ int zza = 0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    static {
        java.lang.Class<?> cls;
        com.google.android.libraries.places.internal.zzceu zzceuVar;
        try {
            cls = java.lang.Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            cls = null;
        }
        if (cls != null) {
            try {
                zzceuVar = (com.google.android.libraries.places.internal.zzceu) cls.asSubclass(com.google.android.libraries.places.internal.zzceu.class).getConstructor(com.google.android.libraries.places.internal.zzcex.class).newInstance(com.google.android.libraries.places.internal.zzceu.zza);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            if (zzceuVar == null) {
                new com.google.android.libraries.places.internal.zzceu(com.google.android.libraries.places.internal.zzceu.zza);
            }
            if (th == null) {
                try {
                    if (java.lang.Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                        java.lang.Class<?> cls2 = java.lang.Class.forName("java.util.logging.Logger");
                        java.lang.Object invoke = cls2.getMethod("getLogger", java.lang.String.class).invoke(null, com.google.android.libraries.places.internal.zzcew.class.getName());
                        java.lang.Class<?> cls3 = java.lang.Class.forName("java.util.logging.Level");
                        cls2.getMethod("log", cls3, java.lang.String.class, java.lang.Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", th);
                        return;
                    }
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            }
            return;
        }
        zzceuVar = null;
        if (zzceuVar == null) {
        }
        if (th == null) {
        }
    }

    public static com.google.android.libraries.places.internal.zzcev zzb() {
        return com.google.android.libraries.places.internal.zzceu.zzb;
    }

    public static com.google.android.libraries.places.internal.zzcex zza(java.lang.String str) {
        return com.google.android.libraries.places.internal.zzceu.zza;
    }

    private zzcew() {
    }
}
