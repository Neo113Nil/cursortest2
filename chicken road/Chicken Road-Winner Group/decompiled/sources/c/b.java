package c;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f2479a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2480b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2482d;

    public b(BackEvent backEvent) {
        C0167a c0167a = C0167a.f2478a;
        float d3 = c0167a.d(backEvent);
        float e3 = c0167a.e(backEvent);
        float b3 = c0167a.b(backEvent);
        int c3 = c0167a.c(backEvent);
        this.f2479a = d3;
        this.f2480b = e3;
        this.f2481c = b3;
        this.f2482d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2479a + ", touchY=" + this.f2480b + ", progress=" + this.f2481c + ", swipeEdge=" + this.f2482d + '}';
    }
}
