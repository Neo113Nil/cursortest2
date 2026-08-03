package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Constructor f3927a;

    static {
        java.lang.reflect.Constructor constructor = null;
        try {
            constructor = java.lang.Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i.class).getConstructor(null);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
        }
        f3927a = constructor;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.k
    public final synchronized com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] a() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr;
        java.lang.reflect.Constructor constructor = f3927a;
        iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[constructor == null ? 11 : 12];
        iVarArr[0] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e();
        iVarArr[1] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m(null);
        iVarArr[2] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.p();
        iVarArr[3] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(-9223372036854775807L);
        iVarArr[4] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(0L);
        iVarArr[5] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(0L);
        iVarArr[6] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0(1, new com.fyber.inneractive.sdk.player.exoplayer2.util.v(0L), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e(0, java.util.Collections.emptyList()));
        iVarArr[7] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.b();
        iVarArr[8] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.e();
        iVarArr[9] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u();
        iVarArr[10] = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.a();
        if (constructor != null) {
            try {
                iVarArr[11] = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.i) constructor.newInstance(null);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return iVarArr;
    }
}
