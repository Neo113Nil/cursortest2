package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
final class zzaoe extends zzaof {
    private final byte[] zza;

    public zzaoe(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaof, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
