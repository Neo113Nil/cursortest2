package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(android.content.Context context, int i) {
        if (context != null) {
            return (int) android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i;
    }

    public static java.lang.String getScreenSizeParams(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        float min = java.lang.Math.min(displayMetrics.widthPixels / f2, f / f2);
        float f3 = displayMetrics.xdpi;
        float f4 = displayMetrics.widthPixels / f3;
        float f5 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return "smallestWidth = " + min + " diagonalInches = " + java.lang.Math.sqrt((f4 * f4) + (f5 * f5)) + " smallScreenDpApi =  " + context.getResources().getConfiguration().smallestScreenWidthDp;
    }

    public static boolean isLargeScreen(android.content.Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }
}
