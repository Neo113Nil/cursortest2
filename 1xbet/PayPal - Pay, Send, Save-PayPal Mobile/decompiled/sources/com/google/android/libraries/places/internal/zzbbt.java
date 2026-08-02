package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbt extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbt zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private com.google.android.libraries.places.internal.zzban zze;
    private int zzf;
    private com.google.android.libraries.places.internal.zzbcy zzg;
    private com.google.android.libraries.places.internal.zzbcy zzh;
    private com.google.android.libraries.places.internal.zzbcy zzi;
    private int zzj;

    static {
        com.google.android.libraries.places.internal.zzbbt zzbbtVar = new com.google.android.libraries.places.internal.zzbbt();
        zzk = zzbbtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbt.class, zzbbtVar);
    }

    private zzbbt() {
    }

    public static com.google.android.libraries.places.internal.zzbbs zza() {
        return (com.google.android.libraries.places.internal.zzbbs) zzk.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzban zzbanVar) {
        this.zze = zzbanVar;
        this.zzb |= 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005င\u0005\u0006ဉ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbbs(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbbt.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
