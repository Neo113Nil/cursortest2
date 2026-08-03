package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhsz extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhsz zzc;
    private static volatile com.google.android.gms.internal.ads.zzifx zzd;
    private int zza;
    private com.google.android.gms.internal.ads.zzieq zzb = zzbM();

    static {
        com.google.android.gms.internal.ads.zzhsz zzhszVar = new com.google.android.gms.internal.ads.zzhsz();
        zzc = zzhszVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhsz.class, zzhszVar);
    }

    private zzhsz() {
    }

    public static com.google.android.gms.internal.ads.zzhsz zze(byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhsz) com.google.android.gms.internal.ads.zziee.zzbV(zzc, bArr, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhsz zzg(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        return (com.google.android.gms.internal.ads.zzhsz) com.google.android.gms.internal.ads.zziee.zzbX(zzc, inputStream, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhsw zzh() {
        return (com.google.android.gms.internal.ads.zzhsw) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final java.util.List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.internal.ads.zzhsy zzd(int i) {
        return (com.google.android.gms.internal.ads.zzhsy) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zzhsy.class});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhsz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhsw(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzd;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhsz.class) {
                zzifxVar = zzd;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzc);
                    zzd = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzi(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzhsy zzhsyVar) {
        zzhsyVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzb;
        if (!zzieqVar.zza()) {
            this.zzb = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzb.add(zzhsyVar);
    }
}
