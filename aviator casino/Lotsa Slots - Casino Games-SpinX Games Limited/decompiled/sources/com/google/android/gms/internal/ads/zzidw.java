package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzidw {
    static com.google.android.gms.internal.ads.zzido zzb(java.lang.Class cls) {
        java.lang.ClassLoader classLoader = com.google.android.gms.internal.ads.zzidw.class.getClassLoader();
        if (cls.equals(com.google.android.gms.internal.ads.zzido.class)) {
            try {
                try {
                    return (com.google.android.gms.internal.ads.zzido) cls.cast(((com.google.android.gms.internal.ads.zzidw) java.lang.Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).zza());
                } catch (java.lang.ReflectiveOperationException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        java.util.Iterator it = java.util.ServiceLoader.load(com.google.android.gms.internal.ads.zzidw.class, classLoader).iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((com.google.android.gms.internal.ads.zzido) cls.cast(((com.google.android.gms.internal.ads.zzidw) it.next()).zza()));
            } catch (java.util.ServiceConfigurationError e2) {
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzidj.class.getName());
                java.util.logging.Level level = java.util.logging.Level.SEVERE;
                java.lang.String simpleName = cls.getSimpleName();
                java.lang.String.valueOf(simpleName);
                logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(java.lang.String.valueOf(simpleName)), (java.lang.Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (com.google.android.gms.internal.ads.zzido) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (com.google.android.gms.internal.ads.zzido) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
        } catch (java.lang.ReflectiveOperationException e3) {
            throw new java.lang.IllegalStateException(e3);
        }
    }

    protected abstract com.google.android.gms.internal.ads.zzido zza();
}
