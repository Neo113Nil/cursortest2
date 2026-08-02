package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbjm {
    private static com.google.android.libraries.places.internal.zzbjm zza;
    private final java.util.List zzb = java.util.Collections.emptyList();
    private int zzc = 0;

    zzbjm() {
    }

    public static com.google.android.libraries.places.internal.zzbjm zza() {
        com.google.android.libraries.places.internal.zzbjm zzbjmVar;
        synchronized (com.google.android.libraries.places.internal.zzbjm.class) {
            if (zza == null) {
                zza = new com.google.android.libraries.places.internal.zzbjm();
            }
            zzbjmVar = zza;
        }
        return zzbjmVar;
    }

    public final boolean zzc() {
        synchronized (this) {
        }
        return false;
    }

    public final java.util.List zzb() {
        java.util.List list;
        synchronized (this) {
            this.zzc++;
            list = this.zzb;
        }
        return list;
    }
}
