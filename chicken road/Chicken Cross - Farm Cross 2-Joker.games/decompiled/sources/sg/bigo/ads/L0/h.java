package sg.bigo.ads.L0;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Rect) obj).left > ((Rect) obj2).left ? 1 : -1;
    }
}
