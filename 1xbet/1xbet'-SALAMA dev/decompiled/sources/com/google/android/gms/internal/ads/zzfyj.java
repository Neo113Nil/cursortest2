package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzfyj {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static zzfyh zzb(Set set, Set set2) {
        zzfth.zzc(set, "set1");
        zzfth.zzc(set2, "set2");
        return new zzfyd(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzc(Set set, zzfti zzftiVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzfye)) {
                set.getClass();
                return new zzfye(set, zzftiVar);
            }
            zzfye zzfyeVar = (zzfye) set;
            return new zzfye((Set) zzfyeVar.zza, zzftl.zza(zzfyeVar.zzb, zzftiVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzfye)) {
            sortedSet.getClass();
            return new zzfyf(sortedSet, zzftiVar);
        }
        zzfye zzfyeVar2 = (zzfye) sortedSet;
        return new zzfyf((SortedSet) zzfyeVar2.zza, zzftl.zza(zzfyeVar2.zzb, zzftiVar));
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfxp) {
            collection = ((zzfxp) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
