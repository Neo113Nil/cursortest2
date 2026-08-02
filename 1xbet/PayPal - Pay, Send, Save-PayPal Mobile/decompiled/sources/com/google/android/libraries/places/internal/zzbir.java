package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbir {
    private final java.lang.String zza;

    public static com.google.android.libraries.places.internal.zzbir zza(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str, "debugString");
        return new com.google.android.libraries.places.internal.zzbir(str, null);
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    private zzbir(java.lang.String str, java.lang.Object obj) {
        this.zza = str;
    }
}
