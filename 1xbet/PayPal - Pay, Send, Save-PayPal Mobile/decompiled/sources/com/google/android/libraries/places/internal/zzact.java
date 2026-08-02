package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzact extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzact zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcy zze;
    private com.google.android.libraries.places.internal.zzacp zzf;
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private int zzh;
    private int zzi;

    static {
        com.google.android.libraries.places.internal.zzact zzactVar = new com.google.android.libraries.places.internal.zzact();
        zzj = zzactVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzact.class, zzactVar);
    }

    private zzact() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0000", new java.lang.Object[]{"zzb", "zzf", "zzg", com.google.android.libraries.places.internal.zzaca.class, "zzh", com.google.android.libraries.places.internal.zzacs.zza, "zzi", com.google.android.libraries.places.internal.zzacr.zza, "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzact();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzacq(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzact.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
