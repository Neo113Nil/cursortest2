package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements com.google.common.base.f {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        Track lambda$processMoovAtom$2;
        switch (this.a) {
            case 0:
                return ((TrackGroupArray) obj).toBundle();
            default:
                lambda$processMoovAtom$2 = Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
                return lambda$processMoovAtom$2;
        }
    }
}
