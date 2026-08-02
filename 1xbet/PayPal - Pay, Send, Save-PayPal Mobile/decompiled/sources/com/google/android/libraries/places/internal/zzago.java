package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzago extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzago zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private java.lang.String zze = "";
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private boolean zzl;

    static {
        com.google.android.libraries.places.internal.zzago zzagoVar = new com.google.android.libraries.places.internal.zzago();
        zzm = zzagoVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzago.class, zzagoVar);
    }

    private zzago() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဇ\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzahd.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzago();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzagn(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzn;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzago.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
