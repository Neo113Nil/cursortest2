package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzahh extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzahh zzs;
    private static volatile com.google.android.libraries.places.internal.zzbff zzt;
    private int zzb;
    private long zze;
    private com.google.android.libraries.places.internal.zzagw zzf;
    private com.google.android.libraries.places.internal.zzagw zzg;
    private com.google.android.libraries.places.internal.zzahq zzh;
    private com.google.android.libraries.places.internal.zzahc zzi;
    private com.google.android.libraries.places.internal.zzagm zzj;
    private com.google.android.libraries.places.internal.zzaht zzk;
    private com.google.android.libraries.places.internal.zzahv zzl;
    private com.google.android.libraries.places.internal.zzahj zzm;
    private com.google.android.libraries.places.internal.zzagi zzn;
    private com.google.android.libraries.places.internal.zzago zzo;
    private com.google.android.libraries.places.internal.zzahf zzp;
    private com.google.android.libraries.places.internal.zzahl zzq;
    private com.google.android.libraries.places.internal.zzahn zzr;

    static {
        com.google.android.libraries.places.internal.zzahh zzahhVar = new com.google.android.libraries.places.internal.zzahh();
        zzs = zzahhVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzahh.class, zzahhVar);
    }

    private zzahh() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzahh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzahg(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzahh.class) {
            zzbffVar = zzt;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzs);
                zzt = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
