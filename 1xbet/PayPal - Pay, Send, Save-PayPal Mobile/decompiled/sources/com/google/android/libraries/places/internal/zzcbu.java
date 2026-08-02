package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
class zzcbu {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcbu.class.getName());
    private static final com.google.android.libraries.places.internal.zzccr zzc = com.google.android.libraries.places.internal.zzccr.zze();
    private static final com.google.android.libraries.places.internal.zzcbu zzd;
    protected final com.google.android.libraries.places.internal.zzccr zza;

    static {
        com.google.android.libraries.places.internal.zzcbu zzcbuVar;
        java.lang.ClassLoader classLoader = com.google.android.libraries.places.internal.zzcbu.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (java.lang.ClassNotFoundException e) {
            zzb.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (java.lang.Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (java.lang.ClassNotFoundException e2) {
                zzb.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (java.lang.Throwable) e2);
                zzcbuVar = new com.google.android.libraries.places.internal.zzcbu(zzc);
            }
        }
        zzcbuVar = new com.google.android.libraries.places.internal.zzcbt(zzc);
        zzd = zzcbuVar;
    }

    zzcbu(com.google.android.libraries.places.internal.zzccr zzccrVar) {
        this.zza = (com.google.android.libraries.places.internal.zzccr) com.google.common.base.Preconditions.checkNotNull(zzccrVar, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT);
    }

    public java.lang.String zza(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, @javax.annotation.Nullable java.util.List list) throws java.io.IOException {
        if (list != null) {
            zzb(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            java.lang.String zzc2 = zzc(sSLSocket);
            if (zzc2 != null) {
                return zzc2;
            }
            java.lang.String valueOf = java.lang.String.valueOf(list);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(valueOf);
            throw new java.lang.RuntimeException(sb.toString());
        } finally {
            this.zza.zzd(sSLSocket);
        }
    }

    protected void zzb(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        this.zza.zza(sSLSocket, str, list);
    }

    public java.lang.String zzc(javax.net.ssl.SSLSocket sSLSocket) {
        return this.zza.zzb(sSLSocket);
    }

    public static com.google.android.libraries.places.internal.zzcbu zzd() {
        return zzd;
    }
}
