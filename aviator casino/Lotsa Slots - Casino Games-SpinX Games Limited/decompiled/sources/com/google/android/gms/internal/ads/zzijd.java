package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzijd extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzijd zzi;
    private static volatile com.google.android.gms.internal.ads.zzifx zzj;
    private int zza;
    private com.google.android.gms.internal.ads.zzijc zzb;
    private com.google.android.gms.internal.ads.zzida zzd;
    private com.google.android.gms.internal.ads.zzida zze;
    private int zzf;
    private com.google.android.gms.internal.ads.zzida zzg;
    private byte zzh = 2;
    private com.google.android.gms.internal.ads.zzieq zzc = zzbM();

    static {
        com.google.android.gms.internal.ads.zzijd zzijdVar = new com.google.android.gms.internal.ads.zzijd();
        zzi = zzijdVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzijd.class, zzijdVar);
    }

    private zzijd() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzd = zzidaVar;
        this.zze = zzidaVar;
        this.zzg = zzidaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = null;
        switch (zziedVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new java.lang.Object[]{"zza", "zzb", "zzc", com.google.android.gms.internal.ads.zziiv.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzijd();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzija(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzifx zzifxVar = zzj;
                if (zzifxVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzijd.class) {
                        zzifxVar = zzj;
                        if (zzifxVar == null) {
                            zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzi);
                            zzj = zzifxVar;
                        }
                    }
                }
                return zzifxVar;
            default:
                throw null;
        }
    }
}
