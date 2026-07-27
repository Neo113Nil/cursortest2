package sg.bigo.ads.api;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.U.r;

/* loaded from: classes3.dex */
public final class AdSize extends r {
    public static final String ADAPTIVE = "adaptive";
    public static r d;
    public final String c;
    public static final AdSize BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250");
    public static final AdSize LARGE_BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, "320x90");
    public static final AdSize MOBILE_LARGE_LEADERBOARD = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90");

    public AdSize(int i, int i2, String str) {
        super(i, i2);
        this.c = str;
    }

    public static int dp2px(Context context, int i) {
        if (context == null) {
            return 0;
        }
        return AbstractC4963u.a(context, i);
    }

    public static AdSize getAdaptiveAdSize(Context context, int i) {
        float f;
        float f2;
        int i2;
        if (context == null || i == 0) {
            return BANNER;
        }
        if (d == null) {
            d = AbstractC4963u.b(context);
        }
        int height = d.getHeight();
        if (height <= 0) {
            return BANNER;
        }
        int min = Math.min(90, Math.round(height * 0.15f));
        if (i < 0) {
            i = d.getWidth();
        }
        if (i <= 655) {
            if (i > 632) {
                i2 = 81;
            } else if (i > 526) {
                f = i / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                i2 = 68;
            } else {
                f = i / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(i2, min), 50), ADAPTIVE);
        }
        f = i / 728.0f;
        f2 = 90.0f;
        i2 = Math.round(f * f2);
        return new AdSize(i, Math.max(Math.min(i2, min), 50), ADAPTIVE);
    }

    @Override // sg.bigo.ads.U.r
    public int getHeight() {
        return this.b;
    }

    @Override // sg.bigo.ads.U.r
    public int getWidth() {
        return this.f12567a;
    }
}
