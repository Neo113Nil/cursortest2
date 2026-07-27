package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class nn {
    private static boolean pcc(View view, int i) {
        float pcc = pcc(view);
        return pcc > 0.0f && pcc >= ((float) i) / 100.0f;
    }

    public static float pcc(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long height = r1.height() * r1.width();
                    long height2 = view.getHeight() * view.getWidth();
                    if (height2 <= 0) {
                        return -1.0f;
                    }
                    return height / height2;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean sf(View view) {
        return view != null && view.isShown();
    }

    private static boolean pcc(View view, int i, boolean z) {
        return (i == 1 && z) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= sf(view, i) && view.getHeight() >= gm(view, i);
    }

    private static int sf(View view, int i) {
        if (i == 3) {
            return (int) (rj.gm(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int gm(View view, int i) {
        if (i == 3) {
            return rj.vj(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int sf(View view, int i, int i2, boolean z) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!sf(view)) {
            return 1;
        }
        if (pcc(view, i2, z)) {
            return !pcc(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean pcc(View view, int i, int i2, boolean z) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof com.bytedance.sdk.openadsdk.core.ork.fum) || (view instanceof com.bytedance.sdk.openadsdk.core.oo.oo)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
            if (z) {
                i = 0;
            }
        }
        return sf(view, i, i2, z) == 0;
    }
}
