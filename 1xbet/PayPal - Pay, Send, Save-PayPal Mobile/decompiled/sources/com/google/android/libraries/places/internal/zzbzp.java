package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzp extends com.google.android.libraries.places.internal.zzbzn {
    @Override // com.google.android.libraries.places.internal.zzbzn
    public final boolean zza(com.google.android.libraries.places.internal.zzbzq zzbzqVar, int i, int i2) {
        synchronized (zzbzqVar) {
            if (zzbzqVar.zza() != 0) {
                return false;
            }
            zzbzqVar.zzb(-1);
            return true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzn
    public final void zzb(com.google.android.libraries.places.internal.zzbzq zzbzqVar, int i) {
        synchronized (zzbzqVar) {
            zzbzqVar.zzb(0);
        }
    }

    /* synthetic */ zzbzp(byte[] bArr) {
        super(null);
    }

    private zzbzp() {
        throw null;
    }
}
