package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class zzfwn {
    public static Object zza(Iterable iterable, Object obj) {
        zzfyn it = ((zzfyd) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfti zzftiVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzftiVar.getClass();
            return zzd((List) iterable, zzftiVar);
        }
        Iterator it = iterable.iterator();
        zzftiVar.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (zzftiVar.zza(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    private static void zzc(List list, zzfti zzftiVar, int i7, int i8) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i8) {
                break;
            } else if (zzftiVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            } else {
                list.remove(i8);
            }
        }
    }

    private static boolean zzd(List list, zzfti zzftiVar) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            Object obj = list.get(i7);
            if (!zzftiVar.zza(obj)) {
                if (i7 > i8) {
                    try {
                        list.set(i8, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzftiVar, i8, i7);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzftiVar, i8, i7);
                        return true;
                    }
                }
                i8++;
            }
            i7++;
        }
        list.subList(i8, list.size()).clear();
        return i7 != i8;
    }
}
