package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhtd extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhtd zzc;
    private static volatile com.google.android.gms.internal.ads.zzifx zzd;
    private int zza;
    private com.google.android.gms.internal.ads.zzieq zzb = zzbM();

    static {
        com.google.android.gms.internal.ads.zzhtd zzhtdVar = new com.google.android.gms.internal.ads.zzhtd();
        zzc = zzhtdVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhtd.class, zzhtdVar);
    }

    private zzhtd() {
    }

    public static com.google.android.gms.internal.ads.zzhta zza() {
        return (com.google.android.gms.internal.ads.zzhta) zzc.zzbn();
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzhtc zzhtcVar) {
        zzhtcVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzb;
        if (!zzieqVar.zza()) {
            this.zzb = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzb.add(zzhtcVar);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zzhtc.class});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhtd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhta(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzd;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhtd.class) {
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
