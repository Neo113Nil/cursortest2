package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaxv extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaxv zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private int zze;
    private double zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private com.google.android.libraries.places.internal.zzbfw zzj;

    static {
        com.google.android.libraries.places.internal.zzaxv zzaxvVar = new com.google.android.libraries.places.internal.zzaxv();
        zzk = zzaxvVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaxv.class, zzaxvVar);
    }

    private zzaxv() {
    }

    public final com.google.android.libraries.places.internal.zzbfw zzj() {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = this.zzj;
        return zzbfwVar == null ? com.google.android.libraries.places.internal.zzbfw.zzg() : zzbfwVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0004\u0004င\u0000\u0005င\u0001\u0006ဉ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaxv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaxu(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaxv.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzi() {
        return (this.zzb & 4) != 0;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final boolean zzg() {
        return (this.zzb & 2) != 0;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final boolean zze() {
        return (this.zzb & 1) != 0;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final double zzc() {
        return this.zzf;
    }

    public final com.google.android.libraries.places.internal.zzaxz zza() {
        com.google.android.libraries.places.internal.zzaxz zzaxzVar;
        switch (this.zze) {
            case 0:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                zzaxzVar = com.google.android.libraries.places.internal.zzaxz.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                zzaxzVar = null;
                break;
        }
        return zzaxzVar == null ? com.google.android.libraries.places.internal.zzaxz.UNRECOGNIZED : zzaxzVar;
    }
}
