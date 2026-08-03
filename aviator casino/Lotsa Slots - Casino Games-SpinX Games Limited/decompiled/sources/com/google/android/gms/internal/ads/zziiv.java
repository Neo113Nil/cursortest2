package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziiv extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zziiv zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private com.google.android.gms.internal.ads.zzida zzb;
    private com.google.android.gms.internal.ads.zzida zzc;
    private byte zzd = 2;

    static {
        com.google.android.gms.internal.ads.zziiv zziivVar = new com.google.android.gms.internal.ads.zziiv();
        zze = zziivVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zziiv.class, zziivVar);
    }

    private zziiv() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzb = zzidaVar;
        this.zzc = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zziiu zzc() {
        return (com.google.android.gms.internal.ads.zziiu) zze.zzbn();
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 1;
        this.zzb = zzidaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = null;
        switch (zziedVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new java.lang.Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zziiv();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zziiu(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
                if (zzifxVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zziiv.class) {
                        zzifxVar = zzf;
                        if (zzifxVar == null) {
                            zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                            zzf = zzifxVar;
                        }
                    }
                }
                return zzifxVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 2;
        this.zzc = zzidaVar;
    }
}
