package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzbed extends java.io.IOException {
    private boolean zza;

    public zzbed(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzbed(java.lang.String str) {
        super(str);
    }

    final boolean zzb() {
        return this.zza;
    }

    final void zza() {
        this.zza = true;
    }
}
