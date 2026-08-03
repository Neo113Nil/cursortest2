package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaww extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzaww zzo;
    private static volatile com.google.android.gms.internal.ads.zzifx zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private java.lang.String zzb = "";
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzi = "";
    private java.lang.String zzk = "";
    private java.lang.String zzl = "";
    private com.google.android.gms.internal.ads.zzieq zzm = zzbM();

    static {
        com.google.android.gms.internal.ads.zzaww zzawwVar = new com.google.android.gms.internal.ads.zzaww();
        zzo = zzawwVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzaww.class, zzawwVar);
    }

    private zzaww() {
    }

    public static com.google.android.gms.internal.ads.zzaws zza() {
        return (com.google.android.gms.internal.ads.zzaws) zzo.zzbn();
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", com.google.android.gms.internal.ads.zzawu.class, "zzn", com.google.android.gms.internal.ads.zzawv.zza});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzaww();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzaws(bArr);
        }
        if (ordinal == 5) {
            return zzo;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzp;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzaww.class) {
                zzifxVar = zzp;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzo);
                    zzp = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }
}
