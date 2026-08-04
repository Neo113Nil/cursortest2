package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgwy {
    public static zzgwq zzb(Class cls) {
        String strO;
        ClassLoader classLoader = zzgwy.class.getClassLoader();
        if (cls.equals(zzgwq.class)) {
            strO = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzgwy.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            strO = p150v0.a.o(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzgwq) cls.cast(((zzgwy) Class.forName(strO, true, classLoader).getConstructor(null).newInstance(null)).zza());
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
            Iterator it = ServiceLoader.load(zzgwy.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzgwq) cls.cast(((zzgwy) it.next()).zza()));
                } catch (ServiceConfigurationError e11) {
                    Logger.getLogger(zzgwl.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgwq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgwq) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(e14);
            }
        }
    }

    public abstract zzgwq zza();
}
