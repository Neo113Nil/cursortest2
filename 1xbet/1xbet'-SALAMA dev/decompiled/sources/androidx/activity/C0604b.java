package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0604b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8091d;

    public C0604b(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        C0603a c0603a = C0603a.f8087a;
        float fD = c0603a.d(backEvent);
        float fE = c0603a.e(backEvent);
        float fB = c0603a.b(backEvent);
        int iC = c0603a.c(backEvent);
        this.f8088a = fD;
        this.f8089b = fE;
        this.f8090c = fB;
        this.f8091d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f8088a + ", touchY=" + this.f8089b + ", progress=" + this.f8090c + ", swipeEdge=" + this.f8091d + '}';
    }
}
