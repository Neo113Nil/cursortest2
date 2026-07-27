package sg.bigo.ads.J0;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.X;

/* loaded from: classes3.dex */
public abstract class a {
    public static boolean a(Rect rect, View view) {
        if (view == null || !X.b(view) || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return false;
        }
        return view.getGlobalVisibleRect(rect);
    }
}
