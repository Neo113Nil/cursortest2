package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzife {
    static zziew zzb(Class cls) {
        ClassLoader classLoader = zzife.class.getClassLoader();
        if (cls.equals(zziew.class)) {
            try {
                try {
                    return (zziew) cls.cast(((zzife) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzife.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zziew) cls.cast(((zzife) it.next()).zza()));
            } catch (ServiceConfigurationError e2) {
                Logger logger = Logger.getLogger(zzier.class.getName());
                Level level = Level.SEVERE;
                String simpleName = cls.getSimpleName();
                String.valueOf(simpleName);
                logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(simpleName)), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zziew) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zziew) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    protected abstract zziew zza();
}
