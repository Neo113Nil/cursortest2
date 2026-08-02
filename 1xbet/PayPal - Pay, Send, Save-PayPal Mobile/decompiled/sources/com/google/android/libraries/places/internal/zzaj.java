package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaj extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaj zzo;
    private static volatile com.google.android.libraries.places.internal.zzbff zzp;
    private int zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;

    static {
        com.google.android.libraries.places.internal.zzaj zzajVar = new com.google.android.libraries.places.internal.zzaj();
        zzo = zzajVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaj.class, zzajVar);
    }

    private zzaj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzai.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzah(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaj.class) {
            zzbffVar = zzp;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzo);
                zzp = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
