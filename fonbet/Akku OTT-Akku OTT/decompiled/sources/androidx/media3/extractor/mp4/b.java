package androidx.media3.extractor.mp4;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ExtractorsFactory {
    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$static$1;
        lambda$static$1 = FragmentedMp4Extractor.lambda$static$1();
        return lambda$static$1;
    }
}
