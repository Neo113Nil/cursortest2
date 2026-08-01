package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgya {
    public static boolean zza(Iterable iterable, zzgul zzgulVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgulVar.getClass();
            return zzc((List) iterable, zzgulVar);
        }
        Iterator it = iterable.iterator();
        zzgulVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzgulVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzhaa it = ((zzgzr) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgul zzgulVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzgulVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgulVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgulVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static void zzd(List list, zzgul zzgulVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzgulVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}
