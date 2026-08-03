package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhtc extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhtc zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private java.lang.String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        com.google.android.gms.internal.ads.zzhtc zzhtcVar = new com.google.android.gms.internal.ads.zzhtc();
        zze = zzhtcVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhtc.class, zzhtcVar);
    }

    private zzhtc() {
    }

    public static com.google.android.gms.internal.ads.zzhtb zza() {
        return (com.google.android.gms.internal.ads.zzhtb) zze.zzbn();
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzc = i;
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzhtm zzhtmVar) {
        this.zzd = zzhtmVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhtc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtb(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhtc.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = com.google.android.gms.internal.ads.zzhsr.zza(i);
    }
}
