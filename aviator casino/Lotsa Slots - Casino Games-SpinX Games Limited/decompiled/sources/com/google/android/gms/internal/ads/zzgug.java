package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgug {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.Object zzb;

    static {
        java.lang.Object zzc = zzc();
        zzb = zzc;
        if (zzc != null) {
            zze("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
        }
        if (zzc == null) {
            return;
        }
        zzd(zzc);
    }

    public static void zza(java.lang.Throwable th, java.lang.Class cls) throws java.lang.Throwable {
        if (cls.isInstance(th)) {
            throw ((java.lang.Throwable) cls.cast(th));
        }
    }

    public static void zzb(java.lang.Throwable th) {
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
    }

    private static java.lang.Object zzc() {
        try {
            return java.lang.Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method zzd(java.lang.Object obj) {
        try {
            java.lang.reflect.Method zze = zze("getStackTraceDepth", java.lang.Throwable.class);
            if (zze == null) {
                return null;
            }
            zze.invoke(obj, new java.lang.Throwable());
            return zze;
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method zze(java.lang.String str, java.lang.Class... clsArr) throws java.lang.ThreadDeath {
        try {
            return java.lang.Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
