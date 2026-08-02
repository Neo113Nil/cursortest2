package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$new$0;
        lambda$new$0 = BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
        return lambda$new$0;
    }
}
