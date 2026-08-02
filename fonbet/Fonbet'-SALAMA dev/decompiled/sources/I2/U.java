package I2;

import F2.C0254t;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbyq;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class U extends S {
    @Override // I2.AbstractC0293a
    public final int e(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // I2.AbstractC0293a
    public final void f(final Activity activity) {
        int i7;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbr)).booleanValue() && ((M) E2.o.f1952C.f1961g.zzi()).o() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i7 = attributes.layoutInDisplayCutoutMode;
            if (1 != i7) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: I2.T
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i8;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    E2.o oVar = E2.o.f1952C;
                    if (((M) oVar.f1961g.zzi()).o() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        zzbyq zzbyqVar = oVar.f1961g;
                        String str = "";
                        if (displayCutout != null) {
                            L zzi = zzbyqVar.zzi();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                String str2 = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("|");
                                }
                                str = str.concat(str2);
                            }
                            ((M) zzi).s(str);
                        } else {
                            ((M) zzbyqVar.zzi()).s("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i8 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i8) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}
