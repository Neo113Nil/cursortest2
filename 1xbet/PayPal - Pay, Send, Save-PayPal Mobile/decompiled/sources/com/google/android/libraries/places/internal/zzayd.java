package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzayd extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzayd zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzbhx zzf;
    private com.google.android.libraries.places.internal.zzbfw zzg;

    static {
        com.google.android.libraries.places.internal.zzayd zzaydVar = new com.google.android.libraries.places.internal.zzayd();
        zzh = zzaydVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzayd.class, zzaydVar);
    }

    private zzayd() {
    }

    public final com.google.android.libraries.places.internal.zzbhx zzc() {
        com.google.android.libraries.places.internal.zzbhx zzbhxVar = this.zzf;
        return zzbhxVar == null ? com.google.android.libraries.places.internal.zzbhx.zzg() : zzbhxVar;
    }

    public final com.google.android.libraries.places.internal.zzbfw zzd() {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = this.zzg;
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
            return zzbA(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzayd();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzayb(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzi;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzayd.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final com.google.android.libraries.places.internal.zzayc zza() {
        com.google.android.libraries.places.internal.zzayc zzaycVar;
        switch (this.zze) {
            case 0:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.FUEL_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.DIESEL;
                break;
            case 2:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.REGULAR_UNLEADED;
                break;
            case 3:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.MIDGRADE;
                break;
            case 4:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.PREMIUM;
                break;
            case 5:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP91;
                break;
            case 6:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP91_E10;
                break;
            case 7:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP92;
                break;
            case 8:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP95;
                break;
            case 9:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP95_E10;
                break;
            case 10:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP98;
                break;
            case 11:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP99;
                break;
            case 12:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.SP100;
                break;
            case 13:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.LPG;
                break;
            case 14:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.E80;
                break;
            case 15:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.E85;
                break;
            case 16:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.METHANE;
                break;
            case 17:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.BIO_DIESEL;
                break;
            case 18:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.TRUCK_DIESEL;
                break;
            case 19:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.DIESEL_PLUS;
                break;
            case 20:
                zzaycVar = com.google.android.libraries.places.internal.zzayc.E100;
                break;
            default:
                zzaycVar = null;
                break;
        }
        return zzaycVar == null ? com.google.android.libraries.places.internal.zzayc.UNRECOGNIZED : zzaycVar;
    }
}
