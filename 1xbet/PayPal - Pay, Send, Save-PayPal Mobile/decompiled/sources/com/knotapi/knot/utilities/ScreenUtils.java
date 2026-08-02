package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class ScreenUtils {
    public static int getScreenHeight(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (windowManager == null) {
            return 0;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void hideKeyboard(android.app.Activity activity) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        android.view.View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new android.view.View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }
}
