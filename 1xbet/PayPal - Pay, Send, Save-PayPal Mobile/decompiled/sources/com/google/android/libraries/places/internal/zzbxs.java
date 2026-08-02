package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbxs implements com.google.android.libraries.places.internal.zzbug {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbxs.class.getName());
    private static final java.lang.reflect.Constructor zzb;
    private static final java.lang.reflect.Method zzc;
    private static final java.lang.RuntimeException zzd;
    private static final java.lang.Object[] zzf;
    private final java.lang.Object zze;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        java.lang.Class<?> cls;
        int i;
        try {
            cls = java.lang.Class.forName("java.util.concurrent.atomic.LongAdder");
            i = 0;
            method2 = cls.getMethod(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, java.lang.Long.TYPE);
        } catch (java.lang.Throwable th) {
            th = th;
            method = null;
        }
        try {
            cls.getMethod("sum", new java.lang.Class[0]);
            java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            th = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            method = method2;
            zza.logp(java.util.logging.Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            method2 = method;
            if (th == null) {
            }
            zzb = null;
            zzc = null;
            zzd = new java.lang.RuntimeException(th);
            zzf = new java.lang.Object[]{1L};
        }
        if (th == null || constructor == null) {
            zzb = null;
            zzc = null;
            zzd = new java.lang.RuntimeException(th);
        } else {
            zzb = constructor;
            zzc = method2;
            zzd = null;
        }
        zzf = new java.lang.Object[]{1L};
    }

    zzbxs() {
        java.lang.RuntimeException runtimeException = zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.zze = zzb.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbug
    public final void zza(long j) {
        try {
            zzc.invoke(this.zze, zzf);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    static boolean zzb() {
        return zzd == null;
    }
}
