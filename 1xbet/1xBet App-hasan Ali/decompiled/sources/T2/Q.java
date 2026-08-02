package T2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C0568Cd;
import com.google.android.gms.internal.ads.F7;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Q extends O {
    @Override // Q1.j
    public final int p(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // Q1.j
    public final void q(final Activity activity) {
        boolean isInMultiWindowMode;
        int i;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8824f1)).booleanValue() && P2.o.f4767B.f4774g.d().u() == null) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return;
            }
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i = attributes.layoutInDisplayCutoutMode;
            if (1 != i) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: T2.P
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i5;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    P2.o oVar = P2.o.f4767B;
                    if (oVar.f4774g.d().u() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        C0568Cd c0568Cd = oVar.f4774g;
                        String str = "";
                        if (displayCutout != null) {
                            I d5 = c0568Cd.d();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                String str2 = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("|");
                                }
                                str = str.concat(str2);
                            }
                            d5.D(str);
                        } else {
                            c0568Cd.d().D("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i5 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i5) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}
