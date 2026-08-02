package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaae extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaae zzt;
    private static volatile com.google.android.libraries.places.internal.zzbff zzu;
    private int zzb;
    private com.google.android.libraries.places.internal.zzaaq zzf;
    private com.google.android.libraries.places.internal.zzaas zzg;
    private com.google.android.libraries.places.internal.zzaut zzh;
    private com.google.android.libraries.places.internal.zzabn zzi;
    private com.google.android.libraries.places.internal.zzaby zzj;
    private com.google.android.libraries.places.internal.zzabp zzk;
    private com.google.android.libraries.places.internal.zzaau zzl;
    private com.google.android.libraries.places.internal.zzaao zzm;
    private com.google.android.libraries.places.internal.zzabh zzn;
    private com.google.android.libraries.places.internal.zzabj zzo;
    private com.google.android.libraries.places.internal.zzaba zzp;
    private com.google.android.libraries.places.internal.zzaai zzq;
    private com.google.android.libraries.places.internal.zzabt zzr;
    private byte zzs = 2;
    private int zze = 1;

    static {
        com.google.android.libraries.places.internal.zzaae zzaaeVar = new com.google.android.libraries.places.internal.zzaae();
        zzt = zzaaeVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaae.class, zzaaeVar);
    }

    private zzaae() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzs);
        }
        if (i2 == 2) {
            return zzbA(zzt, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaad.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaae();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaac(bArr);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            this.zzs = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzu;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaae.class) {
            zzbffVar = zzu;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzt);
                zzu = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
