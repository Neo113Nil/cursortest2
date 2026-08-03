package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

/* loaded from: classes3.dex */
public abstract class d {
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
        if (com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c.a(bVar, nVar).f4027a != com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("RIFF")) {
            return null;
        }
        bVar.a(nVar.f4112a, 0, 4, false);
        nVar.e(0);
        int b = nVar.b();
        if (b != com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("WAVE")) {
            android.util.Log.e("WavHeaderReader", "Unsupported RIFF format: " + b);
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c.a(bVar, nVar);
        while (a2.f4027a != com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("fmt ")) {
            bVar.a((int) a2.b, false);
            a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c.a(bVar, nVar);
        }
        if (a2.b < 16) {
            throw new java.lang.IllegalStateException();
        }
        bVar.a(nVar.f4112a, 0, 16, false);
        nVar.e(0);
        int f = nVar.f();
        int f2 = nVar.f();
        int d = nVar.d();
        if (d < 0) {
            throw new java.lang.IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", d));
        }
        int d2 = nVar.d();
        if (d2 < 0) {
            throw new java.lang.IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", d2));
        }
        int f3 = nVar.f();
        int f4 = nVar.f();
        int i = (f2 * f4) / 8;
        if (f3 != i) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Expected block alignment: " + i + "; got: " + f3);
        }
        int a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(f4);
        if (a3 == 0) {
            android.util.Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + f4);
            return null;
        }
        if (f == 1 || f == 65534) {
            bVar.a(((int) a2.b) - 16, false);
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.b(f2, d, d2, f3, f4, a3);
        }
        android.util.Log.e("WavHeaderReader", "Unsupported WAV format type: " + f);
        return null;
    }
}
