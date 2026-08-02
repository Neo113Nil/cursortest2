package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzdl extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzdl zzv;
    private static volatile com.google.android.libraries.places.internal.zzbff zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private float zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;

    static {
        com.google.android.libraries.places.internal.zzdl zzdlVar = new com.google.android.libraries.places.internal.zzdl();
        zzv = zzdlVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzdl.class, zzdlVar);
    }

    private zzdl() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ခ\u0004\u0006င\u0005\u0007င\u0006\bခ\u0007\tင\b\nင\t\u000bခ\n\fင\u000b\rခ\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011င\u0010", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzda.zza(), "zzf", com.google.android.libraries.places.internal.zzdc.zza(), "zzg", com.google.android.libraries.places.internal.zzbhp.zza(), "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzdl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzdk(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzdl.class) {
            zzbffVar = zzw;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzv);
                zzw = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
