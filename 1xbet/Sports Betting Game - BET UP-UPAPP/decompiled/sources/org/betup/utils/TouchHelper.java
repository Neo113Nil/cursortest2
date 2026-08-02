package org.betup.utils;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class TouchHelper {
    private TouchHelper() {
    }

    public static boolean isTouchWithinBounds(MotionEvent event, View view) {
        return event != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && event.getX() >= 0.0f && event.getY() >= 0.0f && event.getX() <= ((float) view.getMeasuredWidth()) && event.getY() <= ((float) view.getMeasuredHeight());
    }
}
