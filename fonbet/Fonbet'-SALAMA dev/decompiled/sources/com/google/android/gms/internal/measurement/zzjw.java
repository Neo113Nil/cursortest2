package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
abstract class zzjw {
    private static final Logger zza = Logger.getLogger(zzjj.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzjo zzb(Class cls) {
        String o7;
        ClassLoader classLoader = zzjw.class.getClassLoader();
        if (cls.equals(zzjo.class)) {
            o7 = zzb;
        } else {
            if (!cls.getPackage().equals(zzjw.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            o7 = AbstractC1663a.o(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzjo) cls.cast(((zzjw) Class.forName(o7, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (InvocationTargetException e7) {
                        throw new IllegalStateException(e7);
                    }
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException(e9);
            } catch (InstantiationException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzjw.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzjw) it.next()).zza()));
                } catch (ServiceConfigurationError e11) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (zzjo) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzjo) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(e14);
            }
        }
    }

    public abstract zzjo zza();
}
