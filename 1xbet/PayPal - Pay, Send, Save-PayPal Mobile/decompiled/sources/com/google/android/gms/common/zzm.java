package com.google.android.gms.common;

/* loaded from: classes4.dex */
abstract class zzm extends com.google.android.gms.common.zzj {
    private static final java.lang.ref.WeakReference zzb = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference zza;

    zzm(byte[] bArr) {
        super(bArr);
        this.zza = zzb;
    }

    protected abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    final byte[] zzc() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.zza.get();
            if (bArr == null) {
                bArr = zzb();
                this.zza = new java.lang.ref.WeakReference(bArr);
            }
        }
        return bArr;
    }
}
