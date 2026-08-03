package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzihz extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzihz zzb;
    private static volatile com.google.android.gms.internal.ads.zzifx zzc;
    private com.google.android.gms.internal.ads.zzieq zza = zzbM();

    static {
        com.google.android.gms.internal.ads.zzihz zzihzVar = new com.google.android.gms.internal.ads.zzihz();
        zzb = zzihzVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzihz.class, zzihzVar);
    }

    private zzihz() {
    }

    public static com.google.android.gms.internal.ads.zzihy zzc() {
        return (com.google.android.gms.internal.ads.zzihy) zzb.zzbn();
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzihx zzihxVar) {
        zzihxVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zza;
        if (!zzieqVar.zza()) {
            this.zza = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zza.add(zzihxVar);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zza", com.google.android.gms.internal.ads.zzihx.class});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzihz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzihy(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzc;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzihz.class) {
                zzifxVar = zzc;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzb);
                    zzc = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
