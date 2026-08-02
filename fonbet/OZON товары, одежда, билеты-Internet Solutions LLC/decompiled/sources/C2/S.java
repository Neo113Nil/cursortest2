package C2;

import android.text.GraphemeClusterSegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.RemoveSpaceGesture;

/* loaded from: classes8.dex */
public final /* synthetic */ class S {
    public static /* synthetic */ GraphemeClusterSegmentFinder b(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean e(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }
}
