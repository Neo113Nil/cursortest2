package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q7 {

    /* renamed from: a, reason: collision with root package name */
    public long f6796a;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r5).getColor() == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r9).getColor() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        if (r9 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (r9.getForeground() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r9.getBackground() == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(View rootView, View adView, int i) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(adView, "adView");
        ViewParent parent = rootView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z3 = viewGroup == null || a(viewGroup, adView, i);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int indexOfChild = viewGroup.indexOfChild(rootView) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = viewGroup.getChildAt(indexOfChild);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (adView instanceof Ej) {
                        if (childAt instanceof C3793id) {
                            continue;
                        } else if (!(childAt instanceof Mj)) {
                            Map<View, FriendlyObstructionPurpose> friendlyViews = ((Ej) adView).getFriendlyViews();
                            if (friendlyViews != null ? friendlyViews.containsKey(childAt) : false) {
                                continue;
                            } else {
                                Rect rect = new Rect();
                                adView.getGlobalVisibleRect(rect);
                                Rect rect2 = new Rect();
                                childAt.getGlobalVisibleRect(rect2);
                                Rect rect3 = new Rect();
                                boolean intersect = rect3.setIntersect(rect, rect2);
                                Intrinsics.checkNotNullParameter(rect, "<this>");
                                int i2 = (rect.bottom - rect.top) * (rect.right - rect.left);
                                Intrinsics.checkNotNullParameter(rect3, "<this>");
                                int i3 = i2 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                float configuredArea = (i / 100) * r10.getConfiguredArea();
                                if (intersect && i3 < configuredArea) {
                                    if (childAt.getAlpha() > 0.3f) {
                                        if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                            if (childAt.getBackground() instanceof ColorDrawable) {
                                                Drawable background = childAt.getBackground();
                                                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            }
                                            if (childAt.getForeground() instanceof ColorDrawable) {
                                                Drawable foreground = childAt.getForeground();
                                                Intrinsics.checkNotNull(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            }
                                            if (z2) {
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                    }
                                    z = true;
                                    if (z) {
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

    public final boolean b(View view, View view2, int i) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                Ej ej = view2 instanceof Ej ? (Ej) view2 : null;
                if (ej == null) {
                    return false;
                }
                if (ej.getPlacementType() != 1 && (ej.getHeight() <= 0 || ej.getWidth() <= 0)) {
                    return false;
                }
                if (!ej.getGlobalVisibleRect(new Rect())) {
                    return false;
                }
                this.f6796a = r9.height() * r9.width();
                if (ej.getPlacementType() == 1) {
                    ej.setConfiguredArea(ej.getHeight() * ej.getWidth());
                }
                if (ej.getArea() > 0) {
                    if (100 * this.f6796a >= ej.getConfiguredArea() * i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
