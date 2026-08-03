package com.inmobi.media;

/* renamed from: com.inmobi.media.mo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2600mo {
    public static final boolean a(android.view.View adView, com.inmobi.media.D5 minDimension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (adView.getVisibility() == 0 && adView.getParent() != null && adView.isShown() && adView.getWidth() >= minDimension.f4654a && adView.getHeight() >= minDimension.b) {
            if (adView.getHeight() * adView.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(android.view.View adView, android.graphics.Rect adViewRect, int i, com.inmobi.media.D5 minDimension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (a(adView, minDimension)) {
            return ((long) 100) * (((long) adViewRect.height()) * ((long) adViewRect.width())) >= ((long) (i * (adView.getHeight() * adView.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r3).getColor() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r2).getColor() == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0114, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
    
        if (r2.getForeground() == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
    
        if (r2.getBackground() == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(android.view.View adView, android.graphics.Rect adViewRect, int i, java.util.List friendlyViews) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        float height = (i / 100.0f) * adView.getHeight() * adView.getWidth();
        while (adView.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = adView.getParent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            java.lang.Iterable until = kotlin.ranges.RangesKt.until(viewGroup.indexOfChild(adView) + 1, viewGroup.getChildCount());
            if (!(until instanceof java.util.Collection) || !((java.util.Collection) until).isEmpty()) {
                java.util.Iterator it = until.iterator();
                while (it.hasNext()) {
                    android.view.View childAt = viewGroup.getChildAt(((kotlin.collections.IntIterator) it).nextInt());
                    if (childAt.getVisibility() == 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(childAt);
                        if (friendlyViews.contains(childAt)) {
                            continue;
                        } else {
                            android.graphics.Rect rect = new android.graphics.Rect();
                            childAt.getGlobalVisibleRect(rect);
                            android.graphics.Rect rect2 = new android.graphics.Rect();
                            boolean intersect = rect2.setIntersect(adViewRect, rect);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewRect, "<this>");
                            int i2 = (adViewRect.bottom - adViewRect.top) * (adViewRect.right - adViewRect.left);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect2, "<this>");
                            int i3 = i2 - ((rect2.bottom - rect2.top) * (rect2.right - rect2.left));
                            if (intersect && i3 < height) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childAt, "<this>");
                                if (childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof android.widget.ImageView) || ((android.widget.ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof android.graphics.drawable.ColorDrawable) {
                                            android.graphics.drawable.Drawable background = childAt.getBackground();
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                        }
                                        if (android.os.Build.VERSION.SDK_INT >= 23) {
                                            if (childAt.getForeground() instanceof android.graphics.drawable.ColorDrawable) {
                                                android.graphics.drawable.Drawable foreground = childAt.getForeground();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            }
                                            if (!z && z2) {
                                            }
                                        }
                                        z2 = true;
                                        if (!z) {
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            adView = viewGroup;
        }
        return true;
    }
}
