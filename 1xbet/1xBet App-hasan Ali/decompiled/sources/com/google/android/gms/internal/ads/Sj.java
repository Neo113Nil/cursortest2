package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class Sj implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final Cj f11579a;

    /* renamed from: b, reason: collision with root package name */
    public final Oj f11580b;

    public Sj(Cj cj, Oj oj) {
        this.f11579a = cj;
        this.f11580b = oj;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:9:0x0008, B:13:0x001c, B:14:0x0064, B:16:0x006c, B:22:0x0030, B:26:0x0044, B:29:0x0057), top: B:2:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f5) {
        int y5;
        try {
            if (this.f11579a != null) {
                int i = -1;
                if (Math.abs(f) > Math.abs(f5)) {
                    if (f > 0.0f) {
                        y5 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                        i = 1;
                    } else {
                        if (f < 0.0f) {
                            y5 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                            i = 2;
                        }
                        y5 = 0;
                    }
                    if (i == this.f11579a.p()) {
                        this.f11579a.d(this.f11580b.f10961n, y5);
                        return false;
                    }
                } else {
                    if (f5 > 0.0f) {
                        y5 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f5) * 1000.0f);
                        i = 8;
                    } else {
                        if (f5 < 0.0f) {
                            y5 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f5) * 1000.0f);
                            i = 4;
                        }
                        y5 = 0;
                    }
                    if (i == this.f11579a.p()) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f5) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
