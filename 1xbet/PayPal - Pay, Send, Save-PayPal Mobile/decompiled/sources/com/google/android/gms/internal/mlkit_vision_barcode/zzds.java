package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzds {
    static int zza(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    static boolean zzb(java.util.Set set, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    static boolean zzd(java.util.Set set, java.util.Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean zzc(java.util.Set set, java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdi) {
            collection = ((com.google.android.gms.internal.mlkit_vision_barcode.zzdi) collection).zza();
        }
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            return zzd(set, collection.iterator());
        }
        java.util.Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
