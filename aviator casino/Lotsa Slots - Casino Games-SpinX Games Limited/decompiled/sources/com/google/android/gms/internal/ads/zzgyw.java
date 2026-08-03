package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgyw {
    public static com.google.android.gms.internal.ads.zzgyv zza(java.util.Set set, java.util.Set set2) {
        com.google.android.gms.internal.ads.zzgtj.zzk(set, "set1");
        com.google.android.gms.internal.ads.zzgtj.zzk(set2, "set2");
        return new com.google.android.gms.internal.ads.zzgyr(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Set zzb(java.util.Set set, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        if (!(set instanceof java.util.SortedSet)) {
            if (!(set instanceof com.google.android.gms.internal.ads.zzgys)) {
                set.getClass();
                return new com.google.android.gms.internal.ads.zzgys(set, zzgtkVar);
            }
            com.google.android.gms.internal.ads.zzgys zzgysVar = (com.google.android.gms.internal.ads.zzgys) set;
            return new com.google.android.gms.internal.ads.zzgys((java.util.Set) zzgysVar.zza, com.google.android.gms.internal.ads.zzgtn.zzb(zzgysVar.zzb, zzgtkVar));
        }
        java.util.SortedSet sortedSet = (java.util.SortedSet) set;
        if (!(sortedSet instanceof com.google.android.gms.internal.ads.zzgys)) {
            sortedSet.getClass();
            return new com.google.android.gms.internal.ads.zzgyt(sortedSet, zzgtkVar);
        }
        com.google.android.gms.internal.ads.zzgys zzgysVar2 = (com.google.android.gms.internal.ads.zzgys) sortedSet;
        return new com.google.android.gms.internal.ads.zzgyt((java.util.SortedSet) zzgysVar2.zza, com.google.android.gms.internal.ads.zzgtn.zzb(zzgysVar2.zzb, zzgtkVar));
    }

    static int zzc(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    static boolean zzd(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(java.util.Set set, java.util.Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean zzf(java.util.Set set, java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof com.google.android.gms.internal.ads.zzgyd) {
            collection = ((com.google.android.gms.internal.ads.zzgyd) collection).zza();
        }
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        java.util.Iterator it = set.iterator();
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
