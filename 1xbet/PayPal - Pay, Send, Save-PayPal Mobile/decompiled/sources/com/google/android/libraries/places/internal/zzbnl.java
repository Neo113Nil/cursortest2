package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbnl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList, java.util.List] */
    public static java.util.List zza(java.lang.Class cls, java.lang.Iterable iterable, java.lang.ClassLoader classLoader, com.google.android.libraries.places.internal.zzbnk zzbnkVar) {
        ?? load;
        java.lang.Object obj;
        if (zzb(classLoader)) {
            load = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                java.lang.Class cls2 = (java.lang.Class) it.next();
                try {
                    obj = cls2.asSubclass(cls).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.ClassCastException unused) {
                    obj = null;
                } catch (java.lang.Throwable th) {
                    throw new java.util.ServiceConfigurationError(java.lang.String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } else {
            load = java.util.ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = java.util.ServiceLoader.load(cls);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : load) {
            zzbnkVar.zzb(obj2);
            arrayList.add(obj2);
        }
        java.util.Collections.sort(arrayList, java.util.Collections.reverseOrder(new com.google.android.libraries.places.internal.zzbnj(zzbnkVar)));
        return java.util.Collections.unmodifiableList(arrayList);
    }

    static boolean zzb(java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
