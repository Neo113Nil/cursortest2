package p000;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: wz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0858wz {

    /* JADX INFO: renamed from: a */
    public AbstractC0057bc f8722a;

    /* JADX INFO: renamed from: a */
    public static Rect m5462a(Activity activity) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        Point point = new Point();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        rect.top = rect2.top;
        rect.left = rect2.left;
        rect.right = point.x - rect2.right;
        rect.bottom = point.y - rect2.bottom;
        return rect;
    }
}
