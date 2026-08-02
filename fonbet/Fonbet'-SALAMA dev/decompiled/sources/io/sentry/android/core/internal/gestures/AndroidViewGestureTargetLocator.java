package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;

/* loaded from: classes2.dex */
public final class AndroidViewGestureTargetLocator implements GestureTargetLocator {
    private static final String ORIGIN = "old_view_system";
    private final boolean isAndroidXAvailable;

    public AndroidViewGestureTargetLocator(boolean z4) {
        this.isAndroidXAvailable = z4;
    }

    private UiElement createUiElement(View view) {
        try {
            return new UiElement(view, ClassUtil.getClassName(view), ViewUtils.getResourceId(view), null, ORIGIN);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean isJetpackScrollingView(View view, boolean z4) {
        if (z4) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean isViewScrollable(View view, boolean z4) {
        return (isJetpackScrollingView(view, z4) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean isViewTappable(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.GestureTargetLocator
    public UiElement locate(Object obj, float f7, float f8, UiElement.Type type) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (type == UiElement.Type.CLICKABLE && isViewTappable(view)) {
            return createUiElement(view);
        }
        if (type == UiElement.Type.SCROLLABLE && isViewScrollable(view, this.isAndroidXAvailable)) {
            return createUiElement(view);
        }
        return null;
    }
}
