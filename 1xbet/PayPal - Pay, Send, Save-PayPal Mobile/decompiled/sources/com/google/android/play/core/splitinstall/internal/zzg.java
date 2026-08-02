package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzg extends com.google.android.play.core.splitinstall.internal.zzh {
    private final byte[] zza;

    public zzg(java.security.cert.X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return this.zza;
    }
}
