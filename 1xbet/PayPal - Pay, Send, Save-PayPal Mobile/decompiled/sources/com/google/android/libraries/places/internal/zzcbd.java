package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcbd extends com.google.android.libraries.places.internal.zzbkb {
    static final com.google.android.libraries.places.internal.zzcch zza;
    static final com.google.android.libraries.places.internal.zzbwo zzb;
    public static final /* synthetic */ int zzc = 0;
    private static final com.google.android.libraries.places.internal.zzbzx zzf;
    private final com.google.android.libraries.places.internal.zzbvw zzd;
    private javax.net.ssl.SSLSocketFactory zzi;
    private final com.google.android.libraries.places.internal.zzcaj zze = com.google.android.libraries.places.internal.zzcal.zze();
    private final com.google.android.libraries.places.internal.zzbwo zzg = zzb;
    private final com.google.android.libraries.places.internal.zzbwo zzh = com.google.android.libraries.places.internal.zzbzz.zzc(com.google.android.libraries.places.internal.zzbsz.zzn);
    private final com.google.android.libraries.places.internal.zzcch zzj = zza;
    private int zzl = 1;
    private final long zzk = com.google.android.libraries.places.internal.zzbsz.zzj;

    static {
        java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcbd.class.getName());
        com.google.android.libraries.places.internal.zzccg zzccgVar = new com.google.android.libraries.places.internal.zzccg(com.google.android.libraries.places.internal.zzcch.zza);
        zzccgVar.zza(com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        zzccgVar.zzc(com.google.android.libraries.places.internal.zzcct.TLS_1_2);
        zzccgVar.zze(true);
        zza = zzccgVar.zzf();
        java.util.concurrent.TimeUnit.DAYS.toNanos(1000L);
        com.google.android.libraries.places.internal.zzcay zzcayVar = new com.google.android.libraries.places.internal.zzcay();
        zzf = zzcayVar;
        zzb = com.google.android.libraries.places.internal.zzbzz.zzc(zzcayVar);
        java.util.EnumSet.of(com.google.android.libraries.places.internal.zzbnz.MTLS, com.google.android.libraries.places.internal.zzbnz.CUSTOM_MANAGERS);
    }

    private zzcbd(java.lang.String str) {
        this.zzd = new com.google.android.libraries.places.internal.zzbvw(str, null, null, new com.google.android.libraries.places.internal.zzcba(this, null), new com.google.android.libraries.places.internal.zzcaz(this, null));
    }

    public static com.google.android.libraries.places.internal.zzcbd zze(java.lang.String str, int i) {
        return new com.google.android.libraries.places.internal.zzcbd(com.google.android.libraries.places.internal.zzbsz.zzc(str, 443));
    }

    public final com.google.android.libraries.places.internal.zzcbd zzf() {
        com.google.common.base.Preconditions.checkState(true, "Cannot change security when using ChannelCredentials");
        this.zzl = 1;
        return this;
    }

    final com.google.android.libraries.places.internal.zzcbc zzg() {
        long j = this.zzk;
        com.google.android.libraries.places.internal.zzcch zzcchVar = this.zzj;
        com.google.android.libraries.places.internal.zzcaj zzcajVar = this.zze;
        return new com.google.android.libraries.places.internal.zzcbc(this.zzg, this.zzh, null, zzi(), null, zzcchVar, 4194304, false, Long.MAX_VALUE, j, 65535, false, Integer.MAX_VALUE, zzcajVar, false, null, null);
    }

    final int zzh() {
        int i = this.zzl;
        if (i == 0) {
            throw null;
        }
        if (i - 1 == 0) {
            return 443;
        }
        throw new java.lang.AssertionError("TLS not handled");
    }

    @javax.annotation.Nullable
    final javax.net.ssl.SSLSocketFactory zzi() {
        int i = this.zzl;
        if (i == 0) {
            throw null;
        }
        if (i - 1 != 0) {
            throw new java.lang.RuntimeException("Unknown negotiation type: TLS");
        }
        try {
            if (this.zzi == null) {
                this.zzi = javax.net.ssl.SSLContext.getInstance("Default", com.google.android.libraries.places.internal.zzccr.zze().zzf()).getSocketFactory();
            }
            return this.zzi;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.RuntimeException("TLS Provider failure", e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkb
    protected final com.google.android.libraries.places.internal.zzbly zza() {
        return this.zzd;
    }
}
