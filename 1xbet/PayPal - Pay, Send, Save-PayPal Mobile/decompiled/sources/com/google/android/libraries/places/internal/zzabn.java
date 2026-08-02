package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzabn extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static volatile com.google.android.libraries.places.internal.zzbff zzA;
    private static final com.google.android.libraries.places.internal.zzabn zzz;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private com.google.android.libraries.places.internal.zzbcl zzv = com.google.android.libraries.places.internal.zzbcl.zza;
    private long zzw;
    private boolean zzx;
    private boolean zzy;

    static {
        com.google.android.libraries.places.internal.zzabn zzabnVar = new com.google.android.libraries.places.internal.zzabn();
        zzz = zzabnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzabn.class, zzabnVar);
    }

    private zzabn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004ဇ\u0005\u0005င\u0006\u0006င\u0007\u0007င\b\bင\t\tဇ\n\nင\u000b\u000bင\f\fင\r\rခ\u000e\u000eခ\u000f\u000fင\u0010\u0010᠌\u0000\u0011ဂ\u0001\u0012ည\u0011\u0013ဂ\u0012\u0014ဇ\u0013\u0015ဇ\u0014", new java.lang.Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", com.google.android.libraries.places.internal.zzaax.zza, "zzf", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzabn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzabm(bArr);
        }
        if (i2 == 5) {
            return zzz;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzA;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzabn.class) {
            zzbffVar = zzA;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzz);
                zzA = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
