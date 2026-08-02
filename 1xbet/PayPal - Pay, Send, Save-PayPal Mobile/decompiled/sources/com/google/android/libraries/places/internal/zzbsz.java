package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbsz {
    public static final com.google.android.libraries.places.internal.zzbmc zza;
    public static final com.google.android.libraries.places.internal.zzbmc zzb;
    public static final com.google.android.libraries.places.internal.zzbmc zzc;
    public static final com.google.android.libraries.places.internal.zzbmc zzd;
    public static final com.google.android.libraries.places.internal.zzbmc zze;
    static final com.google.android.libraries.places.internal.zzbmc zzf;
    public static final com.google.android.libraries.places.internal.zzbmc zzg;
    public static final com.google.android.libraries.places.internal.zzbmc zzh;
    public static final com.google.android.libraries.places.internal.zzbmc zzi;
    public static final long zzj;
    public static final com.google.android.libraries.places.internal.zzbnh zzk;
    public static final com.google.android.libraries.places.internal.zzbir zzl;
    public static final com.google.android.libraries.places.internal.zzbzx zzm;
    public static final com.google.android.libraries.places.internal.zzbzx zzn;
    public static final com.google.common.base.Supplier zzo;
    private static final java.util.logging.Logger zzp = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbsz.class.getName());
    private static final java.util.Set zzq = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(com.google.android.libraries.places.internal.zzbnm.OK, com.google.android.libraries.places.internal.zzbnm.INVALID_ARGUMENT, com.google.android.libraries.places.internal.zzbnm.NOT_FOUND, com.google.android.libraries.places.internal.zzbnm.ALREADY_EXISTS, com.google.android.libraries.places.internal.zzbnm.FAILED_PRECONDITION, com.google.android.libraries.places.internal.zzbnm.ABORTED, com.google.android.libraries.places.internal.zzbnm.OUT_OF_RANGE, com.google.android.libraries.places.internal.zzbnm.DATA_LOSS));
    private static final com.google.android.libraries.places.internal.zzbje zzr;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        zza = com.google.android.libraries.places.internal.zzbmc.zzc("grpc-timeout", new com.google.android.libraries.places.internal.zzbsy());
        zzb = com.google.android.libraries.places.internal.zzbmc.zzc("grpc-encoding", com.google.android.libraries.places.internal.zzbmg.zza);
        zzc = com.google.android.libraries.places.internal.zzbkw.zza("grpc-accept-encoding", new com.google.android.libraries.places.internal.zzbsw(null));
        zzd = com.google.android.libraries.places.internal.zzbmc.zzc("content-encoding", com.google.android.libraries.places.internal.zzbmg.zza);
        zze = com.google.android.libraries.places.internal.zzbkw.zza("accept-encoding", new com.google.android.libraries.places.internal.zzbsw(null));
        zzf = com.google.android.libraries.places.internal.zzbmc.zzc("content-length", com.google.android.libraries.places.internal.zzbmg.zza);
        zzg = com.google.android.libraries.places.internal.zzbmc.zzc("content-type", com.google.android.libraries.places.internal.zzbmg.zza);
        zzh = com.google.android.libraries.places.internal.zzbmc.zzc("te", com.google.android.libraries.places.internal.zzbmg.zza);
        zzi = com.google.android.libraries.places.internal.zzbmc.zzc("user-agent", com.google.android.libraries.places.internal.zzbmg.zza);
        com.google.common.base.Splitter.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).trimResults();
        zzj = java.util.concurrent.TimeUnit.SECONDS.toNanos(20L);
        java.util.concurrent.TimeUnit.HOURS.toNanos(2L);
        java.util.concurrent.TimeUnit.SECONDS.toNanos(20L);
        zzk = new com.google.android.libraries.places.internal.zzbxn();
        zzl = com.google.android.libraries.places.internal.zzbir.zza("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        zzr = new com.google.android.libraries.places.internal.zzbss();
        zzm = new com.google.android.libraries.places.internal.zzbst();
        zzn = new com.google.android.libraries.places.internal.zzbsu();
        zzo = new com.google.android.libraries.places.internal.zzbsv();
    }

    public static java.net.URI zzb(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str, "authority");
        try {
            return new java.net.URI(null, str, null, null, null);
        } catch (java.net.URISyntaxException e) {
            throw new java.lang.IllegalArgumentException("Invalid authority: ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    public static java.lang.String zzc(java.lang.String str, int i) {
        try {
            return new java.net.URI(null, null, str, 443, null, null, null).getAuthority();
        } catch (java.net.URISyntaxException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 26);
            sb.append("Invalid host or port: ");
            sb.append(str);
            sb.append(" 443");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }

    public static java.util.concurrent.ThreadFactory zzd(java.lang.String str, boolean z) {
        return new com.google.common.util.concurrent.ThreadFactoryBuilder().setDaemon(true).setNameFormat(str).build();
    }

    @javax.annotation.Nullable
    static com.google.android.libraries.places.internal.zzbpo zze(com.google.android.libraries.places.internal.zzbli zzbliVar, boolean z) {
        com.google.android.libraries.places.internal.zzblm zze2 = zzbliVar.zze();
        com.google.android.libraries.places.internal.zzbpo zza2 = zze2 != null ? ((com.google.android.libraries.places.internal.zzcai) zze2.zze()).zza() : null;
        if (zza2 != null) {
            return zza2;
        }
        if (!zzbliVar.zzf().zzj()) {
            if (zzbliVar.zzg()) {
                return new com.google.android.libraries.places.internal.zzbsj(zzi(zzbliVar.zzf()), com.google.android.libraries.places.internal.zzbpm.DROPPED);
            }
            if (!z) {
                return new com.google.android.libraries.places.internal.zzbsj(zzi(zzbliVar.zzf()), com.google.android.libraries.places.internal.zzbpm.PROCESSED);
            }
        }
        return null;
    }

    public static com.google.android.libraries.places.internal.zzbje[] zzf(com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, int i, boolean z, boolean z2) {
        java.util.List zzg2 = zzbisVar.zzg();
        int size = zzg2.size();
        com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr = new com.google.android.libraries.places.internal.zzbje[size + 1];
        com.google.android.libraries.places.internal.zzbjc zza2 = com.google.android.libraries.places.internal.zzbjd.zza();
        zza2.zza(zzbisVar);
        zza2.zzb(i);
        zza2.zzc(z);
        zza2.zzd(z2);
        com.google.android.libraries.places.internal.zzbjd zze2 = zza2.zze();
        for (int i2 = 0; i2 < zzg2.size(); i2++) {
            zzbjeVarArr[i2] = ((com.google.android.libraries.places.internal.zzbjb) zzg2.get(i2)).zza(zze2, zzbmgVar);
        }
        zzbjeVarArr[size] = zzr;
        return zzbjeVarArr;
    }

    static void zzg(com.google.android.libraries.places.internal.zzcac zzcacVar) {
        while (true) {
            java.io.InputStream zza2 = zzcacVar.zza();
            if (zza2 == null) {
                return;
            } else {
                zzh(zza2);
            }
        }
    }

    public static void zzh(@javax.annotation.Nullable java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            zzp.logp(java.util.logging.Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (java.lang.Throwable) e);
        }
    }

    public static com.google.android.libraries.places.internal.zzbnp zzi(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkArgument(zzbnpVar != null);
        if (!zzq.contains(zzbnpVar.zzg())) {
            return zzbnpVar;
        }
        com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = com.google.android.libraries.places.internal.zzbnp.zzh;
        java.lang.String valueOf = java.lang.String.valueOf(zzbnpVar.zzg());
        java.lang.String zzh2 = zzbnpVar.zzh();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47 + java.lang.String.valueOf(zzh2).length());
        sb.append("Inappropriate status code from control plane: ");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(zzh2);
        return zzbnpVar2.zze(sb.toString()).zzd(zzbnpVar.zzi());
    }

    public static boolean zzj(java.lang.String str, boolean z) {
        java.lang.String str2 = java.lang.System.getenv(str);
        if (str2 == null) {
            str2 = java.lang.System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        return z ? com.google.common.base.Strings.isNullOrEmpty(str2) || java.lang.Boolean.parseBoolean(str2) : !com.google.common.base.Strings.isNullOrEmpty(str2) && java.lang.Boolean.parseBoolean(str2);
    }

    public static com.google.android.libraries.places.internal.zzbnp zza(int i) {
        com.google.android.libraries.places.internal.zzbnm zzbnmVar;
        if ((i < 100 || i >= 200) && i != 400) {
            if (i == 401) {
                zzbnmVar = com.google.android.libraries.places.internal.zzbnm.UNAUTHENTICATED;
            } else if (i == 403) {
                zzbnmVar = com.google.android.libraries.places.internal.zzbnm.PERMISSION_DENIED;
            } else if (i != 404) {
                if (i != 429) {
                    if (i != 431) {
                        switch (i) {
                            case 502:
                            case 503:
                            case 504:
                                break;
                            default:
                                zzbnmVar = com.google.android.libraries.places.internal.zzbnm.UNKNOWN;
                                break;
                        }
                    }
                }
                zzbnmVar = com.google.android.libraries.places.internal.zzbnm.UNAVAILABLE;
            } else {
                zzbnmVar = com.google.android.libraries.places.internal.zzbnm.UNIMPLEMENTED;
            }
            com.google.android.libraries.places.internal.zzbnp zzb2 = zzbnmVar.zzb();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 17);
            sb.append("HTTP status code ");
            sb.append(i);
            return zzb2.zze(sb.toString());
        }
        zzbnmVar = com.google.android.libraries.places.internal.zzbnm.INTERNAL;
        com.google.android.libraries.places.internal.zzbnp zzb22 = zzbnmVar.zzb();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 17);
        sb2.append("HTTP status code ");
        sb2.append(i);
        return zzb22.zze(sb2.toString());
    }

    private zzbsz() {
    }
}
