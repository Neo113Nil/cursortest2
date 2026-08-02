package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzvk {
    private static final com.google.android.libraries.places.internal.zzvk zza = new com.google.android.libraries.places.internal.zzve();

    public abstract void zza(com.google.android.libraries.places.internal.zzva zzvaVar, java.lang.Object obj);

    public abstract int zzb();

    public abstract java.util.Set zzc();

    public static com.google.android.libraries.places.internal.zzvk zzh(com.google.android.libraries.places.internal.zzut zzutVar, com.google.android.libraries.places.internal.zzut zzutVar2) {
        int zza2 = zzutVar2.zza();
        if (zza2 == 0) {
            return zza;
        }
        byte[] bArr = null;
        return zza2 <= 28 ? new com.google.android.libraries.places.internal.zzvi(zzutVar, zzutVar2, bArr) : new com.google.android.libraries.places.internal.zzvj(zzutVar, zzutVar2, bArr);
    }

    /* synthetic */ zzvk(byte[] bArr) {
    }
}
