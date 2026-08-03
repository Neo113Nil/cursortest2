package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdh extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhdh zzb;
    private static volatile com.google.android.gms.internal.ads.zzifx zzc;
    private com.google.android.gms.internal.ads.zzieq zza = zzbM();

    static {
        com.google.android.gms.internal.ads.zzhdh zzhdhVar = new com.google.android.gms.internal.ads.zzhdh();
        zzb = zzhdhVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhdh.class, zzhdhVar);
    }

    private zzhdh() {
    }

    public static com.google.android.gms.internal.ads.zzhde zzb() {
        return (com.google.android.gms.internal.ads.zzhde) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzhdg zzhdgVar) {
        zzhdgVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zza;
        if (!zzieqVar.zza()) {
            this.zza = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zza.add(zzhdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zza", com.google.android.gms.internal.ads.zzhdg.class});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhdh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhde(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzc;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhdh.class) {
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
