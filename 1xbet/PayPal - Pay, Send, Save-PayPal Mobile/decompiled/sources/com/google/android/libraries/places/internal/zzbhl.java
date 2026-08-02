package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbhl extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbhl zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zzb;
    private long zze;
    private com.google.android.libraries.places.internal.zzavl zzh;
    private com.google.android.libraries.places.internal.zzbcl zzf = com.google.android.libraries.places.internal.zzbcl.zza;
    private java.lang.String zzg = "";
    private java.lang.String zzi = "";

    static {
        com.google.android.libraries.places.internal.zzbhl zzbhlVar = new com.google.android.libraries.places.internal.zzbhl();
        zzj = zzbhlVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbhl.class, zzbhlVar);
    }

    private zzbhl() {
    }

    public static com.google.android.libraries.places.internal.zzbhk zzc() {
        return (com.google.android.libraries.places.internal.zzbhk) zzj.zzbv();
    }

    final /* synthetic */ void zze(java.lang.String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ည\u0001\u0005ဈ\u0004", new java.lang.Object[]{"zzb", "zze", "zzg", "zzh", "zzf", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbhl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbhk(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzk;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbhl.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
