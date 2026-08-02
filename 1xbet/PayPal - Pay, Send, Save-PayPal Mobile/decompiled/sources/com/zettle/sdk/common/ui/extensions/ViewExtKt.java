package com.zettle.sdk.common.ui.extensions;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0007*\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\r\u0010\t\u001a\u0011\u0010\u000e\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\u000e\u0010\t\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroid/content/Context;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "dpToPx", "(Landroid/content/Context;I)F", "Landroid/view/View;", "", "removeAccessibleTouchTarget", "(Landroid/view/View;)V", "Landroid/widget/Button;", "removeUnderline", "(Landroid/widget/Button;)V", "setAccessibleTouchTarget", "setSelectableItemBackground", "", "isVisible", "setVisibilityVisibleOrGone", "(Landroid/view/View;Z)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ViewExtKt {
    public static final void setVisibilityVisibleOrGone(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void setAccessibleTouchTarget(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: com.zettle.sdk.common.ui.extensions.ViewExtKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.common.ui.extensions.ViewExtKt.$r8$lambda$p1vsLz92ZP3986YV2kRrJWspgpI(view);
            }
        });
    }

    public static final void removeAccessibleTouchTarget(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: com.zettle.sdk.common.ui.extensions.ViewExtKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.common.ui.extensions.ViewExtKt.$r8$lambda$rx5tHfkq8VO1ArdZ5ayrRCaOodk(view);
            }
        });
    }

    public static final float dpToPx(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final void removeUnderline(android.widget.Button button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "");
        button.setPaintFlags(button.getPaintFlags());
    }

    public static final void setSelectableItemBackground(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        view.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static /* synthetic */ void $r8$lambda$p1vsLz92ZP3986YV2kRrJWspgpI(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        float dpToPx = dpToPx(context, 48);
        float f = rect.bottom - rect.top;
        if (dpToPx > f) {
            int i = ((int) ((dpToPx - f) / 2.0f)) + 1;
            rect.top -= i;
            rect.bottom += i;
        }
        float f2 = rect.right - rect.left;
        if (dpToPx > f2) {
            int i2 = ((int) ((dpToPx - f2) / 2.0f)) + 1;
            rect.left -= i2;
            rect.right += i2;
        }
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view2.setTouchDelegate(new android.view.TouchDelegate(rect, view));
        }
    }

    public static /* synthetic */ void $r8$lambda$rx5tHfkq8VO1ArdZ5ayrRCaOodk(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view2.setTouchDelegate(null);
        }
    }
}
