package androidx.media3.exoplayer.trackselection;

import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int lambda$static$02;
        switch (this.a) {
            case 0:
                lambda$static$0 = DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
                return lambda$static$0;
            default:
                lambda$static$02 = SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
                return lambda$static$02;
        }
    }
}
