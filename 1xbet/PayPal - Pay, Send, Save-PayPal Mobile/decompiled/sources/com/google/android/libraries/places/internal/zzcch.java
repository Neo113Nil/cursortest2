package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcch {
    public static final com.google.android.libraries.places.internal.zzcch zza;
    private static final com.google.android.libraries.places.internal.zzccf[] zzd;
    final boolean zzb;
    final boolean zzc;
    private final java.lang.String[] zze;
    private final java.lang.String[] zzf;

    static {
        com.google.android.libraries.places.internal.zzccf[] zzccfVarArr = {com.google.android.libraries.places.internal.zzccf.TLS_AES_128_GCM_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_AES_256_GCM_SHA384, com.google.android.libraries.places.internal.zzccf.TLS_CHACHA20_POLY1305_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, com.google.android.libraries.places.internal.zzccf.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, com.google.android.libraries.places.internal.zzccf.TLS_RSA_WITH_AES_128_GCM_SHA256, com.google.android.libraries.places.internal.zzccf.TLS_RSA_WITH_AES_256_GCM_SHA384, com.google.android.libraries.places.internal.zzccf.TLS_RSA_WITH_AES_128_CBC_SHA, com.google.android.libraries.places.internal.zzccf.TLS_RSA_WITH_AES_256_CBC_SHA, com.google.android.libraries.places.internal.zzccf.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        zzd = zzccfVarArr;
        com.google.android.libraries.places.internal.zzccg zzccgVar = new com.google.android.libraries.places.internal.zzccg(true);
        zzccgVar.zza(zzccfVarArr);
        zzccgVar.zzc(com.google.android.libraries.places.internal.zzcct.TLS_1_3, com.google.android.libraries.places.internal.zzcct.TLS_1_2);
        zzccgVar.zze(true);
        com.google.android.libraries.places.internal.zzcch zzcchVar = new com.google.android.libraries.places.internal.zzcch(zzccgVar);
        zza = zzcchVar;
        com.google.android.libraries.places.internal.zzccg zzccgVar2 = new com.google.android.libraries.places.internal.zzccg(zzcchVar);
        zzccgVar2.zzc(com.google.android.libraries.places.internal.zzcct.TLS_1_3, com.google.android.libraries.places.internal.zzcct.TLS_1_2, com.google.android.libraries.places.internal.zzcct.TLS_1_1, com.google.android.libraries.places.internal.zzcct.TLS_1_0);
        zzccgVar2.zze(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzcch)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.libraries.places.internal.zzcch zzcchVar = (com.google.android.libraries.places.internal.zzcch) obj;
        boolean z = zzcchVar.zzb;
        return java.util.Arrays.equals(this.zze, zzcchVar.zze) && java.util.Arrays.equals(this.zzf, zzcchVar.zzf) && this.zzc == zzcchVar.zzc;
    }

    public final int hashCode() {
        return ((((java.util.Arrays.hashCode(this.zze) + 527) * 31) + java.util.Arrays.hashCode(this.zzf)) * 31) + (!this.zzc ? 1 : 0);
    }

    public final void zzb(javax.net.ssl.SSLSocket sSLSocket, boolean z) {
        java.lang.String[] strArr = this.zze;
        java.lang.String[] strArr2 = strArr != null ? (java.lang.String[]) com.google.android.libraries.places.internal.zzccu.zzb(java.lang.String.class, strArr, sSLSocket.getEnabledCipherSuites()) : null;
        java.lang.String[] strArr3 = (java.lang.String[]) com.google.android.libraries.places.internal.zzccu.zzb(java.lang.String.class, this.zzf, sSLSocket.getEnabledProtocols());
        com.google.android.libraries.places.internal.zzccg zzccgVar = new com.google.android.libraries.places.internal.zzccg(this);
        zzccgVar.zzb(strArr2);
        zzccgVar.zzd(strArr3);
        com.google.android.libraries.places.internal.zzcch zzcchVar = new com.google.android.libraries.places.internal.zzcch(zzccgVar);
        sSLSocket.setEnabledProtocols(zzcchVar.zzf);
        java.lang.String[] strArr4 = zzcchVar.zze;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }

    public final java.lang.String toString() {
        java.util.List zza2;
        com.google.android.libraries.places.internal.zzcct zzcctVar;
        java.lang.String[] strArr = this.zze;
        if (strArr == null) {
            zza2 = null;
        } else {
            com.google.android.libraries.places.internal.zzccf[] zzccfVarArr = new com.google.android.libraries.places.internal.zzccf[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                java.lang.String str = strArr[i];
                zzccfVarArr[i] = str.startsWith("SSL_") ? com.google.android.libraries.places.internal.zzccf.zza("TLS_".concat(java.lang.String.valueOf(str.substring(4)))) : com.google.android.libraries.places.internal.zzccf.zza(str);
            }
            zza2 = com.google.android.libraries.places.internal.zzccu.zza(zzccfVarArr);
        }
        java.lang.String obj = zza2 == null ? "[use default]" : zza2.toString();
        java.lang.String[] strArr2 = this.zzf;
        com.google.android.libraries.places.internal.zzcct[] zzcctVarArr = new com.google.android.libraries.places.internal.zzcct[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            java.lang.String str2 = strArr2[i2];
            if ("TLSv1.3".equals(str2)) {
                zzcctVar = com.google.android.libraries.places.internal.zzcct.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                zzcctVar = com.google.android.libraries.places.internal.zzcct.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                zzcctVar = com.google.android.libraries.places.internal.zzcct.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                zzcctVar = com.google.android.libraries.places.internal.zzcct.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(java.lang.String.valueOf(str2)));
                }
                zzcctVar = com.google.android.libraries.places.internal.zzcct.SSL_3_0;
            }
            zzcctVarArr[i2] = zzcctVar;
        }
        java.lang.String valueOf = java.lang.String.valueOf(com.google.android.libraries.places.internal.zzccu.zza(zzcctVarArr));
        boolean z = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 42 + java.lang.String.valueOf(valueOf).length() + 24 + java.lang.String.valueOf(z).length() + 1);
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(obj);
        sb.append(", tlsVersions=");
        sb.append(valueOf);
        sb.append(", supportsTlsExtensions=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    final /* synthetic */ java.lang.String[] zzd() {
        return this.zzf;
    }

    final /* synthetic */ java.lang.String[] zzc() {
        return this.zze;
    }

    public final boolean zza() {
        return this.zzc;
    }

    /* synthetic */ zzcch(com.google.android.libraries.places.internal.zzccg zzccgVar, byte[] bArr) {
        this(zzccgVar);
    }

    private zzcch(com.google.android.libraries.places.internal.zzccg zzccgVar) {
        this.zzb = true;
        this.zze = zzccgVar.zzg();
        this.zzf = zzccgVar.zzh();
        this.zzc = zzccgVar.zzi();
    }
}
