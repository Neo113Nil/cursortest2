package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbhz extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbhz zzo;
    private static volatile com.google.android.libraries.places.internal.zzbff zzp;
    private int zzb;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";
    private java.lang.String zzk = "";
    private com.google.android.libraries.places.internal.zzbea zzl = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzm = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzn = "";

    static {
        com.google.android.libraries.places.internal.zzbhz zzbhzVar = new com.google.android.libraries.places.internal.zzbhz();
        zzo = zzbhzVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbhz.class, zzbhzVar);
    }

    private zzbhz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzo, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbhz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbhy(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzp;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbhz.class) {
            zzbffVar = zzp;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzo);
                zzp = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
