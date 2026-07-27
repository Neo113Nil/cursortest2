package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4041a = new a();

    public final BackEvent a(float f3, float f6, float f7, int i2) {
        return new BackEvent(f3, f6, f7, i2);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
