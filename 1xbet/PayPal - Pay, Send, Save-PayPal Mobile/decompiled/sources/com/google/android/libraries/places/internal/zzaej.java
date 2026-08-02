package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaej extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaej zzq;
    private static volatile com.google.android.libraries.places.internal.zzbff zzr;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbdz zze = zzbF();
    private com.google.android.libraries.places.internal.zzbdz zzf = zzbF();
    private com.google.android.libraries.places.internal.zzbdz zzg = zzbF();
    private com.google.android.libraries.places.internal.zzbdz zzh = zzbF();
    private com.google.android.libraries.places.internal.zzbdz zzi = zzbF();
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private com.google.android.libraries.places.internal.zzady zzo;
    private int zzp;

    static {
        com.google.android.libraries.places.internal.zzaej zzaejVar = new com.google.android.libraries.places.internal.zzaej();
        zzq = zzaejVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaej.class, zzaejVar);
    }

    private zzaej() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0000\u0001\u0014\u0002\u0014\u0003\u0014\u0004\u0014\u0005\u0014\u0006င\u0000\u0007᠌\u0001\b᠌\u0002\t᠌\u0003\nင\u0004\u000bဉ\u0005\fင\u0006", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", com.google.android.libraries.places.internal.zzaei.zza, "zzl", com.google.android.libraries.places.internal.zzaeh.zza, "zzm", com.google.android.libraries.places.internal.zzaef.zza, "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaej();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaeg(bArr);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzr;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaej.class) {
            zzbffVar = zzr;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzq);
                zzr = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
