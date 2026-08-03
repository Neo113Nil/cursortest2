package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f3933a;
    public final byte[] b;
    public final byte[] c;
    public javax.crypto.CipherInputStream d;

    public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, byte[] bArr, byte[] bArr2) {
        this.f3933a = hVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new javax.crypto.spec.SecretKeySpec(this.b, "AES"), new javax.crypto.spec.IvParameterSpec(this.c));
                this.d = new javax.crypto.CipherInputStream(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(this.f3933a, kVar), cipher);
                return -1L;
            } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e) {
                throw new java.lang.RuntimeException(e);
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.d = null;
        this.f3933a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        javax.crypto.CipherInputStream cipherInputStream = this.d;
        if (cipherInputStream == null) {
            throw new java.lang.IllegalStateException();
        }
        int read = cipherInputStream.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final android.net.Uri a() {
        return this.f3933a.a();
    }
}
