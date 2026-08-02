package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzamt extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzamt zzp;
    private static volatile com.google.android.libraries.places.internal.zzbff zzq;
    private int zzb;
    private com.google.android.libraries.places.internal.zzamo zzg;
    private com.google.android.libraries.places.internal.zzadi zzh;
    private int zzk;
    private int zzl;
    private int zzn;
    private byte zzo = 2;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private int zzi = 1;
    private java.lang.String zzj = "";
    private java.lang.String zzm = "";

    static {
        com.google.android.libraries.places.internal.zzamt zzamtVar = new com.google.android.libraries.places.internal.zzamt();
        zzp = zzamtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzamt.class, zzamtVar);
    }

    private zzamt() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzo);
        }
        if (i2 == 2) {
            return zzbA(zzp, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\bင\u0007\tဈ\b\n᠌\t", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.libraries.places.internal.zzamq.zza, "zzj", "zzk", com.google.android.libraries.places.internal.zzams.zza, "zzl", "zzm", "zzn", com.google.android.libraries.places.internal.zzamr.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzamt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzamp(bArr);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            this.zzo = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzq;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzamt.class) {
            zzbffVar = zzq;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzp);
                zzq = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
