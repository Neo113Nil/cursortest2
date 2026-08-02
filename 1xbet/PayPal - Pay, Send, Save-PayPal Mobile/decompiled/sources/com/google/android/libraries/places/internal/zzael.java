package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzael extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzael zzs;
    private static volatile com.google.android.libraries.places.internal.zzbff zzt;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private com.google.android.libraries.places.internal.zzbdz zzk = zzbF();
    private long zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private long zzr;

    static {
        com.google.android.libraries.places.internal.zzael zzaelVar = new com.google.android.libraries.places.internal.zzael();
        zzs = zzaelVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzael.class, zzaelVar);
    }

    private zzael() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.libraries.places.internal.zzbdw zzbdwVar = com.google.android.libraries.places.internal.zzaei.zza;
            com.google.android.libraries.places.internal.zzbdw zzbdwVar2 = com.google.android.libraries.places.internal.zzaeh.zza;
            com.google.android.libraries.places.internal.zzbdw zzbdwVar3 = com.google.android.libraries.places.internal.zzaef.zza;
            return zzbA(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007\u0014\bဂ\u0006\t᠌\u0007\n᠌\b\u000b᠌\t\fဂ\n\rင\u000b\u000eဂ\f", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", zzbdwVar, "zzh", zzbdwVar2, "zzi", zzbdwVar3, "zzj", "zzk", "zzl", "zzm", zzbdwVar, "zzn", zzbdwVar2, "zzo", zzbdwVar3, "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzael();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaek(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzael.class) {
            zzbffVar = zzt;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzs);
                zzt = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
