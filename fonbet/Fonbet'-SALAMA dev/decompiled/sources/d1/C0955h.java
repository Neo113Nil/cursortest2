package d1;

import android.app.Notification;

/* renamed from: d1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955h {

    /* renamed from: a, reason: collision with root package name */
    public final int f12358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12359b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f12360c;

    public C0955h(int i7, Notification notification, int i8) {
        this.f12358a = i7;
        this.f12360c = notification;
        this.f12359b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0955h.class != obj.getClass()) {
            return false;
        }
        C0955h c0955h = (C0955h) obj;
        if (this.f12358a == c0955h.f12358a && this.f12359b == c0955h.f12359b) {
            return this.f12360c.equals(c0955h.f12360c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12360c.hashCode() + (((this.f12358a * 31) + this.f12359b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f12358a + ", mForegroundServiceType=" + this.f12359b + ", mNotification=" + this.f12360c + '}';
    }
}
