package org.betup.utils;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.tooltip.Tooltip;
import org.betup.R;

/* loaded from: classes4.dex */
public final class TooltipUtil {
    private static final long DEFAULT_TOOLTIP_DELAY = 2000;

    private TooltipUtil() {
    }

    public static void displayToast(Context context, String text) {
        SnackbarHelper.showShort(context, text);
    }

    public static void displayTooltip(View view, String text, int backgroundRes, long delay) {
        Handler handler = new Handler();
        final Tooltip show = new Tooltip.Builder(view).setCancelable(true).setDismissOnClick(true).setBackgroundColor(ContextCompat.getColor(view.getContext(), backgroundRes)).setText(text).show();
        handler.postDelayed(new Runnable() { // from class: org.betup.utils.TooltipUtil.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Tooltip.this.dismiss();
                } catch (Exception unused) {
                }
            }
        }, delay);
    }

    public static void displayTooltip(View view, String text, long delay) {
        displayTooltip(view, text, R.color.blackCyan, delay);
    }

    public static void displayTooltip(View view, String text) {
        displayTooltip(view, text, 2000L);
    }
}
