package org.betup.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import jp.wasabeef.picasso.transformations.internal.FastBlur;

/* loaded from: classes4.dex */
public final class DialogUtil {
    private DialogUtil() {
    }

    public static View getActivityRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup.getChildCount() > 0) {
            return viewGroup.getChildAt(0);
        }
        return null;
    }

    public static BitmapDrawable createBlurredBackground(Activity activity) {
        View activityRootView = getActivityRootView(activity);
        if (activityRootView != null && activityRootView.getWidth() != 0 && activityRootView.getHeight() != 0) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(activityRootView.getWidth(), activityRootView.getHeight(), Bitmap.Config.ARGB_8888);
                activityRootView.draw(new Canvas(createBitmap));
                int pixelsFromDp = DimensionsUtil.getPixelsFromDp(activity, 24);
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, pixelsFromDp, createBitmap.getWidth(), createBitmap.getHeight() - pixelsFromDp);
                createBitmap.recycle();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap2, activityRootView.getWidth() / 4, activityRootView.getHeight() / 4, false);
                createBitmap2.recycle();
                return new BitmapDrawable(activity.getResources(), FastBlur.blur(createScaledBitmap, 10, true));
            } catch (IllegalArgumentException | IllegalStateException unused) {
            }
        }
        return null;
    }
}
