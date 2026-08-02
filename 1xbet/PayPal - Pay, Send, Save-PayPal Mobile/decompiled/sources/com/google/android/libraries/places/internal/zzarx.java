package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzarx extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzarx zzs;
    private static volatile com.google.android.libraries.places.internal.zzbff zzt;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private com.google.android.libraries.places.internal.zzbcl zzn;
    private com.google.android.libraries.places.internal.zzbcl zzo;
    private float zzp;
    private int zzq;
    private int zzr;

    static {
        com.google.android.libraries.places.internal.zzarx zzarxVar = new com.google.android.libraries.places.internal.zzarx();
        zzs = zzarxVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzarx.class, zzarxVar);
    }

    private zzarx() {
        com.google.android.libraries.places.internal.zzbcl zzbclVar = com.google.android.libraries.places.internal.zzbcl.zza;
        this.zzn = zzbclVar;
        this.zzo = zzbclVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0007\u0004င\b\u0005ဂ\u0002\u0006ည\t\u0007ဂ\u0003\bည\n\tင\u0004\nင\u0005\u000bခ\u000b\fင\f\rင\u0006\u000eင\r", new java.lang.Object[]{"zzb", "zze", "zzf", "zzl", "zzm", "zzg", "zzn", "zzh", "zzo", "zzi", "zzj", "zzp", "zzq", "zzk", "zzr"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzarx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzarw(bArr);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzt;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzarx.class) {
            zzbffVar = zzt;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzs);
                zzt = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
