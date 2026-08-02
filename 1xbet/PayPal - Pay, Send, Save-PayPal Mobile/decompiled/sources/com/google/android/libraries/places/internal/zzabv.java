package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzabv extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzabv zzo;
    private static volatile com.google.android.libraries.places.internal.zzbff zzp;
    private int zzb;
    private int zzf;
    private long zzg;
    private float zzh;
    private int zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private java.lang.String zze = "";
    private java.lang.String zzj = "";
    private com.google.android.libraries.places.internal.zzbcl zzk = com.google.android.libraries.places.internal.zzbcl.zza;

    static {
        com.google.android.libraries.places.internal.zzabv zzabvVar = new com.google.android.libraries.places.internal.zzabv();
        zzo = zzabvVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzabv.class, zzabvVar);
    }

    private zzabv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ည\u0006\bဇ\u0007\tဇ\b\n᠌\t", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", com.google.android.libraries.places.internal.zzabx.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzabv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzabu(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzp;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzabv.class) {
            zzbffVar = zzp;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzo);
                zzp = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
