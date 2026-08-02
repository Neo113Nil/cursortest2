package androidx.media3.common.audio;

import android.util.Pair;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.exoplayer.source.BundledExtractorsAdapter;
import androidx.media3.extractor.Extractor;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements com.google.common.base.f {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        Float lambda$new$0;
        String lambda$init$0;
        switch (this.a) {
            case 0:
                lambda$new$0 = DefaultGainProvider.Builder.lambda$new$0((Pair) obj);
                return lambda$new$0;
            default:
                lambda$init$0 = BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
                return lambda$init$0;
        }
    }
}
