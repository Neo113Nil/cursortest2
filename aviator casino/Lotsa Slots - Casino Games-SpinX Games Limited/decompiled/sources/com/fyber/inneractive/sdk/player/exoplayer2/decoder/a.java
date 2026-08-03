package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.MediaCodec.CryptoInfo f3919a;
    public final android.media.MediaCodec.CryptoInfo.Pattern b = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);

    public a(android.media.MediaCodec.CryptoInfo cryptoInfo) {
        this.f3919a = cryptoInfo;
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar) {
        aVar.b.set(0, 0);
        aVar.f3919a.setPattern(aVar.b);
    }
}
