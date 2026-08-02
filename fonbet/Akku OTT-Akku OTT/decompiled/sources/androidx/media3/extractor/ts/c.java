package androidx.media3.extractor.ts;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ExtractorsFactory {
    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        lambda$static$0 = AdtsExtractor.lambda$static$0();
        return lambda$static$0;
    }
}
