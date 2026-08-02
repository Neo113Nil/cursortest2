package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzann extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzann zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private com.google.android.libraries.places.internal.zzadi zzf;
    private com.google.android.libraries.places.internal.zzamo zzg;
    private byte zzh = 2;
    private java.lang.String zze = "";

    static {
        com.google.android.libraries.places.internal.zzann zzannVar = new com.google.android.libraries.places.internal.zzann();
        zzi = zzannVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzann.class, zzannVar);
    }

    private zzann() {
    }

    public static com.google.android.libraries.places.internal.zzanm zza() {
        return (com.google.android.libraries.places.internal.zzanm) zzi.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzann();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzanm(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzj;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzann.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzamo zzamoVar) {
        this.zzg = zzamoVar;
        this.zzb |= 4;
    }
}
