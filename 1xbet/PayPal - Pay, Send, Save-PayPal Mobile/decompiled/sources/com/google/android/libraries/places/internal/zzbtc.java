package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbtc extends com.google.android.libraries.places.internal.zzbof {
    private static final com.google.android.libraries.places.internal.zzbkv zza;
    private static final com.google.android.libraries.places.internal.zzbmc zzb;
    private com.google.android.libraries.places.internal.zzbnp zzc;
    private com.google.android.libraries.places.internal.zzbmg zzd;
    private java.nio.charset.Charset zze;
    private boolean zzf;

    static {
        com.google.android.libraries.places.internal.zzbtb zzbtbVar = new com.google.android.libraries.places.internal.zzbtb();
        zza = zzbtbVar;
        zzb = com.google.android.libraries.places.internal.zzbkw.zza(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8, zzbtbVar);
    }

    protected zzbtc(int i, com.google.android.libraries.places.internal.zzcaa zzcaaVar, com.google.android.libraries.places.internal.zzcal zzcalVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        super(i, zzcaaVar, zzcalVar, zzbisVar);
        this.zze = java.nio.charset.StandardCharsets.UTF_8;
    }

    private static java.nio.charset.Charset zzF(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        java.lang.String str = (java.lang.String) zzbmgVar.zzb(com.google.android.libraries.places.internal.zzbsz.zzg);
        if (str != null) {
            try {
                return java.nio.charset.Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (java.lang.Exception unused) {
            }
        }
        return java.nio.charset.StandardCharsets.UTF_8;
    }

    private static void zzG(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzbmgVar.zzd(zzb);
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbky.zzb);
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbky.zza);
    }

    @javax.annotation.Nullable
    private static final com.google.android.libraries.places.internal.zzbnp zzH(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        char charAt;
        java.lang.Integer num = (java.lang.Integer) zzbmgVar.zzb(zzb);
        if (num == null) {
            return com.google.android.libraries.places.internal.zzbnp.zzh.zze("Missing HTTP status code");
        }
        java.lang.String str = (java.lang.String) zzbmgVar.zzb(com.google.android.libraries.places.internal.zzbsz.zzg);
        if (str != null && str.length() >= 16) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
            if (lowerCase.startsWith(com.datadog.android.internal.network.HttpSpec.ContentType.APPLICATION_GRPC) && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return com.google.android.libraries.places.internal.zzbsz.zza(num.intValue()).zzf("invalid content-type: ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Finally extract failed */
    protected final void zzA(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "headers");
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzc;
        if (zzbnpVar != null) {
            this.zzc = zzbnpVar.zzf("headers: ".concat(zzbmgVar.toString()));
            return;
        }
        try {
            if (this.zzf) {
                this.zzc = com.google.android.libraries.places.internal.zzbnp.zzh.zze("Received headers twice");
            } else {
                java.lang.Integer num = (java.lang.Integer) zzbmgVar.zzb(zzb);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.zzf = true;
                    com.google.android.libraries.places.internal.zzbnp zzH = zzH(zzbmgVar);
                    this.zzc = zzH;
                    if (zzH != null) {
                        this.zzc = zzH.zzf("headers: ".concat(zzbmgVar.toString()));
                        this.zzd = zzbmgVar;
                        this.zze = zzF(zzbmgVar);
                        return;
                    }
                    zzG(zzbmgVar);
                    zzd(zzbmgVar);
                }
            }
            com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = this.zzc;
            if (zzbnpVar2 != null) {
                this.zzc = zzbnpVar2.zzf("headers: ".concat(zzbmgVar.toString()));
                this.zzd = zzbmgVar;
                this.zze = zzF(zzbmgVar);
            }
        } catch (java.lang.Throwable th) {
            com.google.android.libraries.places.internal.zzbnp zzbnpVar3 = this.zzc;
            if (zzbnpVar3 != null) {
                this.zzc = zzbnpVar3.zzf("headers: ".concat(zzbmgVar.toString()));
                this.zzd = zzbmgVar;
                this.zze = zzF(zzbmgVar);
            }
            throw th;
        }
    }

    protected final void zzB(com.google.android.libraries.places.internal.zzbxo zzbxoVar, boolean z) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzc;
        if (zzbnpVar != null) {
            java.nio.charset.Charset charset = this.zze;
            com.google.common.base.Preconditions.checkNotNull(charset, io.ktor.http.auth.HttpAuthHeader.Parameters.Charset);
            com.google.common.base.Preconditions.checkNotNull(zzbxoVar, "buffer");
            int zzf = zzbxoVar.zzf();
            byte[] bArr = new byte[zzf];
            zzbxoVar.zzi(bArr, 0, zzf);
            this.zzc = zzbnpVar.zzf("DATA-----------------------------\n".concat(new java.lang.String(bArr, charset)));
            zzbxoVar.close();
            if (this.zzc.zzh().length() > 1000 || z) {
                zzz(this.zzc, false, this.zzd);
                return;
            }
            return;
        }
        if (!this.zzf) {
            zzbxoVar.close();
            zzz(com.google.android.libraries.places.internal.zzbnp.zzh.zze("headers not received before payload"), false, new com.google.android.libraries.places.internal.zzbmg());
            return;
        }
        int zzf2 = zzbxoVar.zzf();
        zze(zzbxoVar);
        if (z) {
            if (zzf2 > 0) {
                this.zzc = com.google.android.libraries.places.internal.zzbnp.zzh.zze("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.zzc = com.google.android.libraries.places.internal.zzbnp.zzh.zze("Received unexpected EOS on empty DATA frame from server");
            }
            com.google.android.libraries.places.internal.zzbmg zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
            this.zzd = zzbmgVar;
            zzg(this.zzc, com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, zzbmgVar);
        }
    }

    protected final void zzC(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.android.libraries.places.internal.zzbnp zzf;
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "trailers");
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzc;
        if (zzbnpVar == null && !this.zzf) {
            zzbnpVar = zzH(zzbmgVar);
            this.zzc = zzbnpVar;
            if (zzbnpVar != null) {
                this.zzd = zzbmgVar;
            }
        }
        if (zzbnpVar != null) {
            com.google.android.libraries.places.internal.zzbnp zzf2 = zzbnpVar.zzf("trailers: ".concat(zzbmgVar.toString()));
            this.zzc = zzf2;
            zzz(zzf2, false, this.zzd);
            return;
        }
        com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = (com.google.android.libraries.places.internal.zzbnp) zzbmgVar.zzb(com.google.android.libraries.places.internal.zzbky.zzb);
        if (zzbnpVar2 != null) {
            zzf = zzbnpVar2.zze((java.lang.String) zzbmgVar.zzb(com.google.android.libraries.places.internal.zzbky.zza));
        } else if (this.zzf) {
            zzf = com.google.android.libraries.places.internal.zzbnp.zzc.zze("missing GRPC status in response");
        } else {
            java.lang.Integer num = (java.lang.Integer) zzbmgVar.zzb(zzb);
            zzf = (num != null ? com.google.android.libraries.places.internal.zzbsz.zza(num.intValue()) : com.google.android.libraries.places.internal.zzbnp.zzh.zze("missing HTTP status code")).zzf("missing GRPC status, inferred error from HTTP status code");
        }
        zzG(zzbmgVar);
        zzf(zzbmgVar, zzf);
    }

    protected abstract void zzz(com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z, com.google.android.libraries.places.internal.zzbmg zzbmgVar);
}
