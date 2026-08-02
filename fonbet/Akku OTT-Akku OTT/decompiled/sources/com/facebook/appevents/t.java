package com.facebook.appevents;

import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements C0715k.a, ChunkExtractor.Factory {
    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.e eVar = com.facebook.appevents.integrity.e.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.e.class)) {
                return;
            }
            try {
                com.facebook.appevents.integrity.e.b = true;
                com.facebook.appevents.integrity.e.a.a();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.integrity.e.class);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        ChunkExtractor lambda$static$0;
        lambda$static$0 = BundledChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
        return lambda$static$0;
    }
}
