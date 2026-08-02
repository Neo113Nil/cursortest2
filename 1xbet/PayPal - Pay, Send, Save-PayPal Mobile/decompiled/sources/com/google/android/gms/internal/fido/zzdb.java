package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzdb {
    public static boolean zza(java.util.Comparator comparator, java.lang.Iterable iterable) {
        java.util.Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof java.util.SortedSet) {
            comparator2 = ((java.util.SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = com.google.android.gms.internal.fido.zzcq.zza;
            }
        } else {
            if (!(iterable instanceof com.google.android.gms.internal.fido.zzda)) {
                return false;
            }
            comparator2 = ((com.google.android.gms.internal.fido.zzda) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
