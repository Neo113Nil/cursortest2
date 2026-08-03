package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3920a;
    public int[] b;
    public int[] c;
    public final android.media.MediaCodec.CryptoInfo d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.a e;

    public b() {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        android.media.MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new android.media.MediaCodec.CryptoInfo() : null;
        this.d = cryptoInfo;
        this.e = i >= 24 ? new com.fyber.inneractive.sdk.player.exoplayer2.decoder.a(cryptoInfo) : null;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.b = iArr;
        this.c = iArr2;
        this.f3920a = bArr2;
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        if (i2 >= 16) {
            android.media.MediaCodec.CryptoInfo cryptoInfo = this.d;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i2 >= 24) {
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a.a(this.e);
            }
        }
    }
}
