package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzgl {
    static final java.lang.String zza;
    static final java.util.Comparator zzb;

    static {
        java.util.Comparator comparator;
        java.lang.String concat = java.lang.String.valueOf(com.google.android.gms.internal.fido.zzgl.class.getName()).concat("$UnsafeComparator");
        zza = concat;
        try {
            comparator = (java.util.Comparator) ((java.lang.Object[]) java.util.Objects.requireNonNull(java.lang.Class.forName(concat).getEnumConstants()))[0];
        } catch (java.lang.Throwable unused) {
            comparator = com.google.android.gms.internal.fido.zzgk.INSTANCE;
        }
        zzb = comparator;
    }

    zzgl() {
    }
}
