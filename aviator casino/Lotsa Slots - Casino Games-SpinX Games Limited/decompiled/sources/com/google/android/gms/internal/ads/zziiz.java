package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziiz extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zziiz zzh;
    private static volatile com.google.android.gms.internal.ads.zzifx zzi;
    private int zza;
    private com.google.android.gms.internal.ads.zziiy zzb;
    private com.google.android.gms.internal.ads.zzida zzd;
    private com.google.android.gms.internal.ads.zzida zze;
    private int zzf;
    private byte zzg = 2;
    private com.google.android.gms.internal.ads.zzieq zzc = zzbM();

    static {
        com.google.android.gms.internal.ads.zziiz zziizVar = new com.google.android.gms.internal.ads.zziiz();
        zzh = zziizVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zziiz.class, zziizVar);
    }

    private zziiz() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzd = zzidaVar;
        this.zze = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zziiw zzc() {
        return (com.google.android.gms.internal.ads.zziiw) zzh.zzbn();
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zziiv zziivVar) {
        zziivVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzc;
        if (!zzieqVar.zza()) {
            this.zzc = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzc.add(zziivVar);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = null;
        switch (zziedVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new java.lang.Object[]{"zza", "zzb", "zzc", com.google.android.gms.internal.ads.zziiv.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zziiz();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zziiw(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzifx zzifxVar = zzi;
                if (zzifxVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zziiz.class) {
                        zzifxVar = zzi;
                        if (zzifxVar == null) {
                            zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzh);
                            zzi = zzifxVar;
                        }
                    }
                }
                return zzifxVar;
            default:
                throw null;
        }
    }
}
