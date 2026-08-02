package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzajh extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzajh zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private com.google.android.libraries.places.internal.zzakf zzi;
    private com.google.android.libraries.places.internal.zzajp zzj;
    private com.google.android.libraries.places.internal.zzakd zzk;
    private int zzl;
    private int zzm;

    static {
        com.google.android.libraries.places.internal.zzajh zzajhVar = new com.google.android.libraries.places.internal.zzajh();
        zzn = zzajhVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzajh.class, zzajhVar);
    }

    private zzajh() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b᠌\u0007\t᠌\b", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaje.zza, "zzf", com.google.android.libraries.places.internal.zzajg.zza, "zzg", "zzh", com.google.android.libraries.places.internal.zzajd.zza, "zzi", "zzj", "zzk", "zzl", com.google.android.libraries.places.internal.zzajb.zza, "zzm", com.google.android.libraries.places.internal.zzajf.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzajh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzajc(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzo;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzajh.class) {
            zzbffVar = zzo;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzn);
                zzo = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
