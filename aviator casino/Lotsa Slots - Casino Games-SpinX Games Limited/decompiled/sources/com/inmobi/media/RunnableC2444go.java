package com.inmobi.media;

/* renamed from: com.inmobi.media.go, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2444go implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f5228a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.lang.ref.WeakReference d;

    public RunnableC2444go(com.inmobi.media.AbstractC2547ko visibilityTracker, java.util.concurrent.atomic.AtomicBoolean isPaused) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isPaused, "isPaused");
        this.f5228a = isPaused;
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.d = new java.lang.ref.WeakReference(visibilityTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5228a.get()) {
            toString();
            return;
        }
        com.inmobi.media.AbstractC2547ko abstractC2547ko = (com.inmobi.media.AbstractC2547ko) this.d.get();
        if (abstractC2547ko != null) {
            abstractC2547ko.k = false;
            for (java.util.Map.Entry entry : abstractC2547ko.f5302a.entrySet()) {
                android.view.View view = (android.view.View) entry.getKey();
                com.inmobi.media.C2495io c2495io = (com.inmobi.media.C2495io) entry.getValue();
                int i = c2495io.f5265a;
                android.view.View view2 = c2495io.c;
                byte b = abstractC2547ko.c;
                boolean z = true;
                if (b == 1) {
                    com.inmobi.media.C2715r7 c2715r7 = com.inmobi.media.C2797u7.k;
                    if (c2715r7.b(view2, view, i) && c2715r7.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else if (b == 2) {
                    toString();
                    com.inmobi.media.C2715r7 c2715r72 = com.inmobi.media.C2797u7.k;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(c2715r72, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    boolean b2 = c2715r72.b(view2, view, i);
                    boolean a2 = c2715r72.a(view, view, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                    if (view instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) view;
                            int[] iArr = new int[2];
                            gestureDetectorOnGestureListenerC2675pi.getLocationInWindow(iArr);
                            int[] viewableFrameArray = gestureDetectorOnGestureListenerC2675pi.getViewableFrameArray();
                            int i2 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                            int i3 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                            if (rect.intersect(new android.graphics.Rect(i2, i3, i2 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i3))) {
                                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(gestureDetectorOnGestureListenerC2675pi.getWidth(), gestureDetectorOnGestureListenerC2675pi.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new android.graphics.Paint());
                                gestureDetectorOnGestureListenerC2675pi.draw(canvas);
                                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, com.inmobi.media.J3.b(gestureDetectorOnGestureListenerC2675pi.getWidth() / com.inmobi.media.N5.b()), com.inmobi.media.J3.b(gestureDetectorOnGestureListenerC2675pi.getHeight() / com.inmobi.media.N5.b()), true);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                                int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC2675pi.getViewableFrameArray();
                                int min = java.lang.Math.min(createScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                                int min2 = java.lang.Math.min(createScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                                int min3 = java.lang.Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, createScaledBitmap.getWidth() - min);
                                int min4 = java.lang.Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, createScaledBitmap.getHeight() - min2);
                                android.graphics.Bitmap createBitmap2 = (min3 <= 0 || min4 <= 0) ? null : android.graphics.Bitmap.createBitmap(createScaledBitmap, min, min2, min3, min4);
                                if (createBitmap2 != null) {
                                    int height = createBitmap2.getHeight() * createBitmap2.getWidth();
                                    int[] iArr2 = new int[height];
                                    createBitmap2.getPixels(iArr2, 0, createBitmap2.getWidth(), 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                                    int i4 = 0;
                                    for (int i5 = 0; i5 < height; i5++) {
                                        int i6 = iArr2[i5];
                                        if (i6 > -16777216 && i6 < 0 && (i4 = i4 + 1) >= gestureDetectorOnGestureListenerC2675pi.getMinimumPixelsPainted()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (b2 && a2 && z) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else {
                    com.inmobi.media.C2715r7 c2715r73 = com.inmobi.media.C2797u7.k;
                    if (c2715r73.b(view2, view, i) && c2715r73.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                }
            }
        }
        com.inmobi.media.InterfaceC2470ho interfaceC2470ho = abstractC2547ko != null ? abstractC2547ko.h : null;
        if (interfaceC2470ho != null) {
            interfaceC2470ho.a(this.b, this.c);
        }
        this.b.clear();
        this.c.clear();
        if (abstractC2547ko != null) {
            abstractC2547ko.d();
        }
    }
}
