package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzijy extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzijy zzl;
    private static volatile com.google.android.gms.internal.ads.zzifx zzm;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zziiz zzd;
    private com.google.android.gms.internal.ads.zzijd zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.zziem zzg = zzbC();
    private java.lang.String zzh = "";
    private com.google.android.gms.internal.ads.zzieq zzj = zzbM();

    static {
        com.google.android.gms.internal.ads.zzijy zzijyVar = new com.google.android.gms.internal.ads.zzijy();
        zzl = zzijyVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzijy.class, zzijyVar);
    }

    private zzijy() {
    }

    public static com.google.android.gms.internal.ads.zzijx zze() {
        return (com.google.android.gms.internal.ads.zzijx) zzl.zzbn();
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = null;
        switch (zziedVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.gms.internal.ads.zzijv.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzijy();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzijx(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzifx zzifxVar = zzm;
                if (zzifxVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzijy.class) {
                        zzifxVar = zzm;
                        if (zzifxVar == null) {
                            zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzl);
                            zzm = zzifxVar;
                        }
                    }
                }
                return zzifxVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zzg(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zziiz zziizVar) {
        zziizVar.getClass();
        this.zzd = zziizVar;
        this.zza |= 4;
    }

    final /* synthetic */ void zzj(java.lang.String str) {
        str.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzj;
        if (!zzieqVar.zza()) {
            this.zzj = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzj.add(str);
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }
}
