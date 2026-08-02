package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625b {

    /* renamed from: a, reason: collision with root package name */
    public final float f8088a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8089b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8090c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8091d;

    public C0625b(BackEvent backEvent) {
        t6.h.e(backEvent, "backEvent");
        C0624a c0624a = C0624a.f8087a;
        float d7 = c0624a.d(backEvent);
        float e7 = c0624a.e(backEvent);
        float b7 = c0624a.b(backEvent);
        int c3 = c0624a.c(backEvent);
        this.f8088a = d7;
        this.f8089b = e7;
        this.f8090c = b7;
        this.f8091d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f8088a + ", touchY=" + this.f8089b + ", progress=" + this.f8090c + ", swipeEdge=" + this.f8091d + '}';
    }
}
