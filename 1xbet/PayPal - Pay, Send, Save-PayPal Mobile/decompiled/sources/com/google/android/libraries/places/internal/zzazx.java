package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazx extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazx zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private boolean zze;
    private int zzh;
    private com.google.android.libraries.places.internal.zzbfw zzj;
    private com.google.android.libraries.places.internal.zzbfw zzk;
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzg = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzi = zzbG();

    static {
        com.google.android.libraries.places.internal.zzazx zzazxVar = new com.google.android.libraries.places.internal.zzazx();
        zzl = zzazxVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazx.class, zzazxVar);
    }

    private zzazx() {
    }

    public final com.google.android.libraries.places.internal.zzbfw zzi() {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = this.zzj;
        return zzbfwVar == null ? com.google.android.libraries.places.internal.zzbfw.zzg() : zzbfwVar;
    }

    public final com.google.android.libraries.places.internal.zzbfw zzk() {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = this.zzk;
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
            return zzbA(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b\u0006ဉ\u0001\u0007ဉ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzazt.class, "zzg", "zzh", "zzi", com.google.android.libraries.places.internal.zzazw.class, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazp(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzazx.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzj() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzb & 2) != 0;
    }

    public final java.util.List zzg() {
        return this.zzi;
    }

    public final com.google.android.libraries.places.internal.zzazu zzf() {
        com.google.android.libraries.places.internal.zzazu zzazuVar;
        switch (this.zzh) {
            case 0:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.DRIVE_THROUGH;
                break;
            case 2:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.HAPPY_HOUR;
                break;
            case 3:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.DELIVERY;
                break;
            case 4:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.TAKEOUT;
                break;
            case 5:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.KITCHEN;
                break;
            case 6:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.BREAKFAST;
                break;
            case 7:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.LUNCH;
                break;
            case 8:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.DINNER;
                break;
            case 9:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.BRUNCH;
                break;
            case 10:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.PICKUP;
                break;
            case 11:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.ACCESS;
                break;
            case 12:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.SENIOR_HOURS;
                break;
            case 13:
                zzazuVar = com.google.android.libraries.places.internal.zzazu.ONLINE_SERVICE_HOURS;
                break;
            default:
                zzazuVar = null;
                break;
        }
        return zzazuVar == null ? com.google.android.libraries.places.internal.zzazu.UNRECOGNIZED : zzazuVar;
    }

    public final java.util.List zze() {
        return this.zzg;
    }

    public final java.util.List zzd() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public static com.google.android.libraries.places.internal.zzazx zzl() {
        return zzl;
    }
}
