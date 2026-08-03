package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzly {
    static com.google.android.gms.internal.measurement.zzlq zzb(java.lang.Class cls) {
        java.lang.String format;
        java.lang.ClassLoader classLoader = com.google.android.gms.internal.measurement.zzly.class.getClassLoader();
        if (cls.equals(com.google.android.gms.internal.measurement.zzlq.class)) {
            format = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(com.google.android.gms.internal.measurement.zzly.class.getPackage())) {
                throw new java.lang.IllegalArgumentException(cls.getName());
            }
            format = java.lang.String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (com.google.android.gms.internal.measurement.zzlq) cls.cast(((com.google.android.gms.internal.measurement.zzly) java.lang.Class.forName(format, true, classLoader).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).zza());
                    } catch (java.lang.IllegalAccessException e) {
                        throw new java.lang.IllegalStateException(e);
                    }
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.IllegalStateException(e2);
                }
            } catch (java.lang.InstantiationException e3) {
                throw new java.lang.IllegalStateException(e3);
            } catch (java.lang.NoSuchMethodException e4) {
                throw new java.lang.IllegalStateException(e4);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            java.util.Iterator it = java.util.ServiceLoader.load(com.google.android.gms.internal.measurement.zzly.class, classLoader).iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((com.google.android.gms.internal.measurement.zzlq) cls.cast(((com.google.android.gms.internal.measurement.zzly) it.next()).zza()));
                } catch (java.util.ServiceConfigurationError e5) {
                    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzll.class.getName());
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.String simpleName = cls.getSimpleName();
                    java.lang.String.valueOf(simpleName);
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(java.lang.String.valueOf(simpleName)), (java.lang.Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (com.google.android.gms.internal.measurement.zzlq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (com.google.android.gms.internal.measurement.zzlq) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.IllegalStateException(e6);
            } catch (java.lang.NoSuchMethodException e7) {
                throw new java.lang.IllegalStateException(e7);
            } catch (java.lang.reflect.InvocationTargetException e8) {
                throw new java.lang.IllegalStateException(e8);
            }
        }
    }

    protected abstract com.google.android.gms.internal.measurement.zzlq zza();
}
