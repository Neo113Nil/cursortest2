package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgxa {
    public static boolean zza(java.lang.Iterable iterable, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        if ((iterable instanceof java.util.RandomAccess) && (iterable instanceof java.util.List)) {
            zzgtkVar.getClass();
            return zzc((java.util.List) iterable, zzgtkVar);
        }
        java.util.Iterator it = iterable.iterator();
        zzgtkVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzgtkVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static java.lang.Object zzb(java.lang.Iterable iterable, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgza it = ((com.google.android.gms.internal.ads.zzgyr) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(java.util.List list, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            java.lang.Object obj = list.get(i);
            if (!zzgtkVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (java.lang.IllegalArgumentException unused) {
                        zzd(list, zzgtkVar, i2, i);
                        return true;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        zzd(list, zzgtkVar, i2, i);
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

    private static void zzd(java.util.List list, com.google.android.gms.internal.ads.zzgtk zzgtkVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzgtkVar.zza(list.get(size))) {
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
