package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzul {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);

    private final boolean zzf;

    zzul(boolean z, boolean z2) {
        this.zzf = z2;
    }

    final boolean zza() {
        return this.zzf;
    }
}
