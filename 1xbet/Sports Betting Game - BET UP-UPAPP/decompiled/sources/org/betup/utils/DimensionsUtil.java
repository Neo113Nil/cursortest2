package org.betup.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class DimensionsUtil {
    private DimensionsUtil() {
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int getPixelsFromDp(Context context, int dp) {
        return (int) TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    public static float getPixelsFromSp(Context context, float sp) {
        return TypedValue.applyDimension(2, sp, context.getResources().getDisplayMetrics());
    }
}
