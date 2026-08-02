package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaco extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaco zzv;
    private static volatile com.google.android.libraries.places.internal.zzbff zzw;
    private int zzb;
    private java.lang.Object zzf;
    private com.google.android.libraries.places.internal.zzach zzg;
    private com.google.android.libraries.places.internal.zzace zzh;
    private com.google.android.libraries.places.internal.zzacl zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private int zze = 0;
    private com.google.android.libraries.places.internal.zzbdz zzs = zzbF();
    private com.google.android.libraries.places.internal.zzbdz zzt = zzbF();
    private com.google.android.libraries.places.internal.zzbea zzu = zzbG();

    static {
        com.google.android.libraries.places.internal.zzaco zzacoVar = new com.google.android.libraries.places.internal.zzaco();
        zzv = zzacoVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaco.class, zzacoVar);
    }

    private zzaco() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.libraries.places.internal.zzbdw zzbdwVar = com.google.android.libraries.places.internal.zzacs.zza;
            com.google.android.libraries.places.internal.zzbdw zzbdwVar2 = com.google.android.libraries.places.internal.zzacr.zza;
            return zzbA(zzv, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00035\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006\u083f\u0000\u00077\u0000\bဂ\u0005\t᠌\u0006\n᠌\u0007\u000bဂ\b\fင\t\rဂ\n\u000eဂ\u000b\u000f%\u0010%\u0011\u001b\u0012ဉ\u0002", new java.lang.Object[]{"zzf", "zze", "zzb", "zzg", "zzh", "zzj", zzbdwVar, "zzk", zzbdwVar2, com.google.android.libraries.places.internal.zzd.zza(), "zzl", "zzm", zzbdwVar, "zzn", zzbdwVar2, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", com.google.android.libraries.places.internal.zzacn.class, "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaco();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzacc(bArr);
        }
        if (i2 == 5) {
            return zzv;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzw;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaco.class) {
            zzbffVar = zzw;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzv);
                zzw = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
