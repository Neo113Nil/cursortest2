package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfqq extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfqq zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private com.google.android.gms.internal.ads.zzieq zzb = zzbM();
    private com.google.android.gms.internal.ads.zzihr zzc;

    static {
        com.google.android.gms.internal.ads.zzfqq zzfqqVar = new com.google.android.gms.internal.ads.zzfqq();
        zzd = zzfqqVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfqq.class, zzfqqVar);
    }

    private zzfqq() {
    }

    public static com.google.android.gms.internal.ads.zzfqn zzb() {
        return (com.google.android.gms.internal.ads.zzfqn) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb.size();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfqp zzfqpVar) {
        zzfqpVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzb;
        if (!zzieqVar.zza()) {
            this.zzb = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzb.add(zzfqpVar);
    }

    final /* synthetic */ void zzd() {
        this.zzb = zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zzfqp.class, "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfqq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfqn(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfqq.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
