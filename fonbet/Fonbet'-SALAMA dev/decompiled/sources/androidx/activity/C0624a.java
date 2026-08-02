package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0624a f8087a = new C0624a();

    public final BackEvent a(float f7, float f8, float f9, int i7) {
        return new BackEvent(f7, f8, f9, i7);
    }

    public final float b(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
