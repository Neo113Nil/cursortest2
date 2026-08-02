package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzavt extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzavt zzq;
    private static volatile com.google.android.libraries.places.internal.zzbff zzr;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbht zzg;
    private int zzh;
    private com.google.android.libraries.places.internal.zzaua zzi;
    private com.google.android.libraries.places.internal.zzaua zzj;
    private com.google.android.libraries.places.internal.zzbhz zzl;
    private com.google.android.libraries.places.internal.zzavy zzp;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzk = "";
    private com.google.android.libraries.places.internal.zzbea zzm = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzn = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzo = com.google.android.libraries.places.internal.zzbdq.zzbG();

    static {
        com.google.android.libraries.places.internal.zzavt zzavtVar = new com.google.android.libraries.places.internal.zzavt();
        zzq = zzavtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzavt.class, zzavtVar);
    }

    private zzavt() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzq, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bဉ\u0003\t\u001b\u000b\u001b\fȚ\rဉ\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", com.google.android.libraries.places.internal.zzavr.class, "zzn", com.google.android.libraries.places.internal.zzbhv.class, "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzavt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzavs(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzavt.class) {
            zzbffVar = zzr;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzq);
                zzr = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.util.List zzc() {
        return this.zzo;
    }

    public final java.lang.String zza() {
        return this.zzf;
    }
}
