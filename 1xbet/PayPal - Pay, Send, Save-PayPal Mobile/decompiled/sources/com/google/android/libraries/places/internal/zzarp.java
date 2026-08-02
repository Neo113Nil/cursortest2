package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzarp extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzarp zzJ;
    private static volatile com.google.android.libraries.places.internal.zzbff zzK;
    private double zzA;
    private com.google.android.libraries.places.internal.zzart zzB;
    private com.google.android.libraries.places.internal.zzart zzC;
    private com.google.android.libraries.places.internal.zzart zzD;
    private com.google.android.libraries.places.internal.zzart zzE;
    private com.google.android.libraries.places.internal.zzart zzF;
    private com.google.android.libraries.places.internal.zzart zzG;
    private com.google.android.libraries.places.internal.zzbdy zzH = zzbD();
    private int zzI;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private com.google.android.libraries.places.internal.zzarr zzj;
    private com.google.android.libraries.places.internal.zzarr zzk;
    private com.google.android.libraries.places.internal.zzarr zzl;
    private com.google.android.libraries.places.internal.zzarr zzm;
    private com.google.android.libraries.places.internal.zzarr zzn;
    private com.google.android.libraries.places.internal.zzarr zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;
    private double zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    static {
        com.google.android.libraries.places.internal.zzarp zzarpVar = new com.google.android.libraries.places.internal.zzarp();
        zzJ = zzarpVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzarp.class, zzarpVar);
    }

    private zzarp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzJ, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\r\u0007င\u000e\bခ\u000f\tင\u0010\nက\u0011\u000bင\u0012\fင\u0013\rခ\u0014\u000eဂ\u0015\u000fက\u0016\u0010ဉ\u0005\u0011ဉ\u0006\u0012ဉ\u0007\u0013ဉ\b\u0014ဉ\t\u0015ဉ\n\u0016ဉ\u0017\u0017ဉ\u0018\u0018ဉ\u0019\u0019ဉ\u001a\u001aဉ\u001b\u001bဉ\u001c\u001cင\u000b\u001d'\u001eင\f\u001fင\u001d", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzp", "zzH", "zzq", "zzI"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzarp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaro(bArr);
        }
        if (i2 == 5) {
            return zzJ;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzK;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzarp.class) {
            zzbffVar = zzK;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzJ);
                zzK = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
