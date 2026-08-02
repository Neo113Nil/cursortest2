package io.sentry.android.replay.util;

import Y4.D;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import f6.C1111d;
import io.sentry.SentryOptions;
import io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.ArrayList;
import java.util.List;
import t6.h;

/* loaded from: classes2.dex */
public final class ViewsKt {
    public static final void addOnDrawListenerSafe(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        h.e(onDrawListener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(onDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void addOnPreDrawListenerSafe(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        h.e(onPreDrawListener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int getTotalPaddingTopSafe(TextView textView) {
        h.e(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List<Rect> getVisibleRects(TextLayout textLayout, Rect rect, int i7, int i8) {
        h.e(rect, "globalRect");
        if (textLayout == null) {
            return D.D(rect);
        }
        ArrayList arrayList = new ArrayList();
        int lineCount = textLayout.getLineCount();
        for (int i9 = 0; i9 < lineCount; i9++) {
            int primaryHorizontal = (int) textLayout.getPrimaryHorizontal(i9, textLayout.getLineStart(i9));
            int ellipsisCount = textLayout.getEllipsisCount(i9);
            int lineVisibleEnd = textLayout.getLineVisibleEnd(i9);
            int primaryHorizontal2 = (int) textLayout.getPrimaryHorizontal(i9, (lineVisibleEnd - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
            if (primaryHorizontal2 == 0 && lineVisibleEnd > 0) {
                primaryHorizontal2 = ((int) textLayout.getPrimaryHorizontal(i9, lineVisibleEnd - 1)) + 1;
            }
            int lineTop = textLayout.getLineTop(i9);
            int lineBottom = textLayout.getLineBottom(i9);
            Rect rect2 = new Rect();
            int i10 = rect.left + i7 + primaryHorizontal;
            rect2.left = i10;
            rect2.right = (primaryHorizontal2 - primaryHorizontal) + i10;
            int i11 = rect.top + i8 + lineTop;
            rect2.top = i11;
            rect2.bottom = (lineBottom - lineTop) + i11;
            arrayList.add(rect2);
        }
        return arrayList;
    }

    public static final boolean hasSize(View view) {
        h.e(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static final boolean isMaskable(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return false;
        }
        return !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final C1111d isVisibleToUser(View view) {
        h.e(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return new C1111d(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new C1111d(Boolean.FALSE, null);
        }
        Object obj = view;
        while (obj instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) obj).getTransitionAlpha() : 1.0f;
            View view2 = (View) obj;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new C1111d(Boolean.FALSE, null);
            }
            obj = view2.getParent();
        }
        Rect rect = new Rect();
        return new C1111d(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void removeOnDrawListenerSafe(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        h.e(onDrawListener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void removeOnPreDrawListenerSafe(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        h.e(onPreDrawListener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int toOpaque(int i7) {
        return i7 | (-16777216);
    }

    public static final void traverse(View view, ViewHierarchyNode viewHierarchyNode, SentryOptions sentryOptions) {
        h.e(view, "<this>");
        h.e(viewHierarchyNode, "parentNode");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        if ((view instanceof ViewGroup) && !ComposeViewHierarchyNode.INSTANCE.fromView(view, viewHierarchyNode, sentryOptions)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null) {
                    ViewHierarchyNode fromView = ViewHierarchyNode.Companion.fromView(childAt, viewHierarchyNode, viewGroup.indexOfChild(childAt), sentryOptions);
                    arrayList.add(fromView);
                    traverse(childAt, fromView, sentryOptions);
                }
            }
            viewHierarchyNode.setChildren(arrayList);
        }
    }
}
