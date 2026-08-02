package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzapc extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzapc zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private boolean zzk;
    private com.google.android.libraries.places.internal.zzbea zzf = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzj = "";

    static {
        com.google.android.libraries.places.internal.zzapc zzapcVar = new com.google.android.libraries.places.internal.zzapc();
        zzl = zzapcVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzapc.class, zzapcVar);
    }

    private zzapc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004᠌\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzals.zza, "zzf", "zzg", "zzh", com.google.android.libraries.places.internal.zzapf.zza, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzapc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzapb(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzm;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzapc.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
