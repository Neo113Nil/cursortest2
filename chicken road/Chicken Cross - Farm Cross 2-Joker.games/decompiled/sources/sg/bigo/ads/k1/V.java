package sg.bigo.ads.k1;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class V implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return (rect.height() * rect.width()) - (rect2.height() * rect2.width());
    }
}
