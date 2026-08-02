package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ExtractorsFactory {
    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        lambda$static$0 = AmrExtractor.lambda$static$0();
        return lambda$static$0;
    }
}
