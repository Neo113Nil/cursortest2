package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfrd extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfrd zzc;
    private static volatile com.google.android.gms.internal.ads.zzifx zzd;
    private com.google.android.gms.internal.ads.zzieq zza = zzbM();
    private long zzb;

    static {
        com.google.android.gms.internal.ads.zzfrd zzfrdVar = new com.google.android.gms.internal.ads.zzfrd();
        zzc = zzfrdVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfrd.class, zzfrdVar);
    }

    private zzfrd() {
    }

    public static com.google.android.gms.internal.ads.zzfrc zza() {
        return (com.google.android.gms.internal.ads.zzfrc) zzc.zzbn();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzfpv zzfpvVar) {
        zzfpvVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zza;
        if (!zzieqVar.zza()) {
            this.zza = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zza.add(zzfpvVar);
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new java.lang.Object[]{"zza", com.google.android.gms.internal.ads.zzfpv.class, "zzb"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfrd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfrc(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzd;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfrd.class) {
                zzifxVar = zzd;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzc);
                    zzd = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
