package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzf extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzf zzq;
    private static volatile com.google.android.libraries.places.internal.zzbff zzr;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcy zze;
    private com.google.android.libraries.places.internal.zzaj zzf;
    private com.google.android.libraries.places.internal.zzm zzg;
    private com.google.android.libraries.places.internal.zzo zzh;
    private com.google.android.libraries.places.internal.zzj zzi;
    private com.google.android.libraries.places.internal.zzx zzj;
    private com.google.android.libraries.places.internal.zzh zzk;
    private com.google.android.libraries.places.internal.zzs zzl;
    private com.google.android.libraries.places.internal.zzad zzm;
    private com.google.android.libraries.places.internal.zzab zzn;
    private com.google.android.libraries.places.internal.zzu zzo;
    private com.google.android.libraries.places.internal.zzz zzp;

    static {
        com.google.android.libraries.places.internal.zzf zzfVar = new com.google.android.libraries.places.internal.zzf();
        zzq = zzfVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzf.class, zzfVar);
    }

    private zzf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0000\u000bဉ\n\fဉ\u000b", new java.lang.Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zze", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zze(bArr);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzr;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzf.class) {
            zzbffVar = zzr;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzq);
                zzr = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
