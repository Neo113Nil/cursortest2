package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgdx extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgdx zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private float zzc;
    private java.lang.String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        com.google.android.gms.internal.ads.zzgdx zzgdxVar = new com.google.android.gms.internal.ads.zzgdx();
        zzf = zzgdxVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgdx.class, zzgdxVar);
    }

    private zzgdx() {
    }

    public static com.google.android.gms.internal.ads.zzgdw zze() {
        return (com.google.android.gms.internal.ads.zzgdw) zzf.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzgdx zzg() {
        return zzf;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final float zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgdx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgdw(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgdx.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzh(float f) {
        this.zza |= 2;
        this.zzc = f;
    }
}
