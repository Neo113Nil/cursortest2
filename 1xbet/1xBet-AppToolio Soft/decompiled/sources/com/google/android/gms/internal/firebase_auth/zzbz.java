package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
final class zzbz {
    private final byte[] buffer;
    private final zzci zzmo;

    private zzbz(int i) {
        this.buffer = new byte[i];
        this.zzmo = zzci.zzb(this.buffer);
    }

    /* synthetic */ zzbz(int i, zzbv zzbvVar) {
        this(i);
    }

    public final zzbu zzca() {
        if (this.zzmo.zzdc() == 0) {
            return new zzcb(this.buffer);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zzci zzcb() {
        return this.zzmo;
    }
}
