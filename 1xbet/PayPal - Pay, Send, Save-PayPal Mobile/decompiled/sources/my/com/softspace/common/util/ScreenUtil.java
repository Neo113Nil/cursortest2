package my.com.softspace.common.util;

/* loaded from: classes17.dex */
public class ScreenUtil {
    public static final int DEVICE_SCREEN_INFO_DENSITY = 1100;
    public static final int DEVICE_SCREEN_INFO_DP_HEIGHT = 1200;
    public static final int DEVICE_SCREEN_INFO_DP_WIDTH = 1300;
    public static final int DEVICE_SCREEN_INFO_INCH = 1600;
    public static final int DEVICE_SCREEN_INFO_PX_RES_HEIGHT = 1500;
    public static final int DEVICE_SCREEN_INFO_PX_RES_WIDTH = 1400;

    public static final float dpToPixels(android.content.Context context, float f) {
        return android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final android.graphics.drawable.StateListDrawable getButtonDrawableSelector(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_focused, -16842919}, drawable2);
        stateListDrawable.addState(new int[]{android.R.attr.state_focused, android.R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[]{-16842908, android.R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    public static final float getDeviceScreenInfo(android.content.Context context, int i) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.widthPixels;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = f / f3;
        float f5 = f2 / f3;
        float sqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(f2 / displayMetrics.xdpi, 2.0d) + java.lang.Math.pow(f / displayMetrics.ydpi, 2.0d));
        if (i == 1100) {
            return f3;
        }
        if (i == 1200) {
            return f4;
        }
        if (i == 1300) {
            return f5;
        }
        if (i == 1400) {
            return f2;
        }
        if (i == 1500) {
            return f;
        }
        if (i != 1600) {
            return 0.0f;
        }
        return java.lang.Math.round(sqrt);
    }

    public static final void dismissKeyboard(android.app.Activity activity) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (activity.getCurrentFocus() != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static androidx.core.graphics.drawable.IconCompat drawableToIconCompat(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap());
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(createBitmap);
    }
}
