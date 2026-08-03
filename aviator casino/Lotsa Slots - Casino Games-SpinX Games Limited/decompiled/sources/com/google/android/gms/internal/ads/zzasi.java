package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzasi extends com.google.android.gms.internal.ads.zzasj {
    private final byte[] zza;

    public zzasi(java.security.cert.X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasj, java.security.cert.Certificate
    public final byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return this.zza;
    }
}
