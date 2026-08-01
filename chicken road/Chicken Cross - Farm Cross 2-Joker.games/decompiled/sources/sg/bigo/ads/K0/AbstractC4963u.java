package sg.bigo.ads.K0;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: sg.bigo.ads.K0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4963u {
    public static int a(Context context, int i) {
        return (int) ((context.getResources().getDisplayMetrics().density * i) + 0.5d);
    }

    public static sg.bigo.ads.U.r b(Context context) {
        if (context == null) {
            return new sg.bigo.ads.U.r(0, 0);
        }
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(new Point());
            return new sg.bigo.ads.U.r((int) (r2.x / context.getResources().getDisplayMetrics().density), (int) (r2.y / context.getResources().getDisplayMetrics().density));
        } catch (Throwable unused) {
            return new sg.bigo.ads.U.r(0, 0);
        }
    }

    public static int c(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Point a(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point;
        } catch (Throwable unused) {
            return new Point();
        }
    }

    public static int b(Context context, int i) {
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5d);
    }
}
