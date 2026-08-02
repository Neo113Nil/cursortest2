package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ViewUtils {
    private static final int[] coordinates = new int[2];

    public static UiElement findTarget(SentryAndroidOptions sentryAndroidOptions, View view, float f7, float f8, UiElement.Type type) {
        List<GestureTargetLocator> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (touchWithinBounds(view2, f7, f8)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                        linkedList.add(viewGroup.getChildAt(i7));
                    }
                }
                for (int i8 = 0; i8 < gestureTargetLocators.size(); i8++) {
                    UiElement locate = gestureTargetLocators.get(i8).locate(view2, f7, f8, type);
                    if (locate != null) {
                        if (type == UiElement.Type.CLICKABLE) {
                            uiElement = locate;
                        } else if (type == UiElement.Type.SCROLLABLE) {
                            return locate;
                        }
                    }
                }
            }
        }
        return uiElement;
    }

    public static String getResourceId(View view) {
        int id = view.getId();
        if (id == -1 || isViewIdGenerated(id)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static String getResourceIdWithFallback(View view) {
        try {
            return getResourceId(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(view.getId(), 16);
        }
    }

    private static boolean isViewIdGenerated(int i7) {
        return ((-16777216) & i7) == 0 && (i7 & 16777215) != 0;
    }

    private static boolean touchWithinBounds(View view, float f7, float f8) {
        if (view == null) {
            return false;
        }
        int[] iArr = coordinates;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        return f7 >= ((float) i7) && f7 <= ((float) (i7 + view.getWidth())) && f8 >= ((float) i8) && f8 <= ((float) (i8 + view.getHeight()));
    }
}
