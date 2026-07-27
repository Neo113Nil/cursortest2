package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.cq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC3637cq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7057a;
    public final ArrayList b;
    public final ArrayList c;
    public final WeakReference d;

    public RunnableC3637cq(AbstractC3749gq visibilityTracker, AtomicBoolean isPaused) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(isPaused, "isPaused");
        this.f7057a = isPaused;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new WeakReference(visibilityTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7057a.get()) {
            String str = "runnable is pause " + this;
            return;
        }
        AbstractC3749gq abstractC3749gq = (AbstractC3749gq) this.d.get();
        if (abstractC3749gq != null) {
            abstractC3749gq.j = false;
            for (Map.Entry entry : abstractC3749gq.f7131a.entrySet()) {
                View view = (View) entry.getKey();
                C3693eq c3693eq = (C3693eq) entry.getValue();
                int i = c3693eq.f7094a;
                View view2 = c3693eq.c;
                byte b = abstractC3749gq.c;
                boolean z = true;
                if (b == 1) {
                    Q7 q7 = T7.k;
                    if (q7.b(view2, view, i) && q7.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else if (b == 2) {
                    String str2 = "viewability type PIXEL " + this;
                    Q7 q72 = T7.k;
                    Intrinsics.checkNotNull(q72, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    boolean b2 = q72.b(view2, view, i);
                    boolean a2 = q72.a(view, view, i);
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (view instanceof Ej) {
                        Rect rect = new Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            Ej ej = (Ej) view;
                            int[] iArr = new int[2];
                            ej.getLocationInWindow(iArr);
                            int[] viewableFrameArray = ej.getViewableFrameArray();
                            int i2 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                            int i3 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                            if (rect.intersect(new Rect(i2, i3, i2 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i3))) {
                                Bitmap createBitmap = Bitmap.createBitmap(ej.getWidth(), ej.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                                ej.draw(canvas);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, AbstractC3727g4.b(ej.getWidth() / AbstractC3841k6.b()), AbstractC3727g4.b(ej.getHeight() / AbstractC3841k6.b()), true);
                                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                                int[] viewableFrameArray2 = ej.getViewableFrameArray();
                                int min = Math.min(createScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                                int min2 = Math.min(createScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                                int min3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, createScaledBitmap.getWidth() - min);
                                int min4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, createScaledBitmap.getHeight() - min2);
                                Bitmap createBitmap2 = (min3 <= 0 || min4 <= 0) ? null : Bitmap.createBitmap(createScaledBitmap, min, min2, min3, min4);
                                if (createBitmap2 != null) {
                                    int height = createBitmap2.getHeight() * createBitmap2.getWidth();
                                    int[] iArr2 = new int[height];
                                    createBitmap2.getPixels(iArr2, 0, createBitmap2.getWidth(), 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                                    int i4 = 0;
                                    for (int i5 = 0; i5 < height; i5++) {
                                        int i6 = iArr2[i5];
                                        if (i6 > -16777216 && i6 < 0 && (i4 = i4 + 1) >= ej.getMinimumPixelsPainted()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    String str3 = b2 + ServerSentEventKt.SPACE + a2 + ServerSentEventKt.SPACE + z;
                    if (b2 && a2 && z) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else {
                    Q7 q73 = T7.k;
                    if (q73.b(view2, view, i) && q73.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                }
            }
        }
        InterfaceC3664dq interfaceC3664dq = abstractC3749gq != null ? abstractC3749gq.h : null;
        if (interfaceC3664dq != null) {
            interfaceC3664dq.a(this.b, this.c);
        }
        this.b.clear();
        this.c.clear();
        if (abstractC3749gq != null) {
            abstractC3749gq.d();
        }
    }
}
