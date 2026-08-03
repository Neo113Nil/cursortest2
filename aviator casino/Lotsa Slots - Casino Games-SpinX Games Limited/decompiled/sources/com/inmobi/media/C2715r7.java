package com.inmobi.media;

/* renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2715r7 {

    /* renamed from: a, reason: collision with root package name */
    public long f5421a;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r5).getColor() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r9).getColor() == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if (r9.getForeground() == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
    
        if (r9.getBackground() == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(android.view.View rootView, android.view.View adView, int i) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        android.view.ViewParent parent = rootView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        boolean z3 = viewGroup == null || a(viewGroup, adView, i);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int indexOfChild = viewGroup.indexOfChild(rootView) + 1; indexOfChild < childCount; indexOfChild++) {
                android.view.View childAt = viewGroup.getChildAt(indexOfChild);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (adView instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                        if (childAt instanceof com.inmobi.media.C2695qc) {
                            continue;
                        } else if (!(childAt instanceof com.inmobi.media.C2886xi)) {
                            java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) adView).getFriendlyViews();
                            if (friendlyViews == null || !friendlyViews.containsKey(childAt)) {
                                android.graphics.Rect rect = new android.graphics.Rect();
                                adView.getGlobalVisibleRect(rect);
                                android.graphics.Rect rect2 = new android.graphics.Rect();
                                childAt.getGlobalVisibleRect(rect2);
                                android.graphics.Rect rect3 = new android.graphics.Rect();
                                boolean intersect = rect3.setIntersect(rect, rect2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
                                int i2 = (rect.bottom - rect.top) * (rect.right - rect.left);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect3, "<this>");
                                int i3 = i2 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                float configuredArea = (i / 100) * r10.getConfiguredArea();
                                if (intersect && i3 < configuredArea && childAt.getAlpha() > 0.3f) {
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
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return z3;
    }

    public final boolean b(android.view.View view, android.view.View view2, int i) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = view2 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi ? (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) view2 : null;
                if (gestureDetectorOnGestureListenerC2675pi == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC2675pi.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC2675pi.getHeight() <= 0 || gestureDetectorOnGestureListenerC2675pi.getWidth() <= 0)) {
                    return false;
                }
                if (!gestureDetectorOnGestureListenerC2675pi.getGlobalVisibleRect(new android.graphics.Rect())) {
                    return false;
                }
                this.f5421a = r9.height() * r9.width();
                if (gestureDetectorOnGestureListenerC2675pi.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC2675pi.setConfiguredArea(gestureDetectorOnGestureListenerC2675pi.getHeight() * gestureDetectorOnGestureListenerC2675pi.getWidth());
                }
                if (gestureDetectorOnGestureListenerC2675pi.getArea() > 0) {
                    if (100 * this.f5421a >= gestureDetectorOnGestureListenerC2675pi.getConfiguredArea() * i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
