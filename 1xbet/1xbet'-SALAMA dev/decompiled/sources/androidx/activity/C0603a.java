package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0603a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0603a f8087a = new C0603a();

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
