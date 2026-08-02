package f2;

import android.app.Notification;

/* renamed from: f2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1949g {

    /* renamed from: a, reason: collision with root package name */
    public final int f16995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16996b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f16997c;

    public C1949g(int i, Notification notification, int i5) {
        this.f16995a = i;
        this.f16997c = notification;
        this.f16996b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1949g.class != obj.getClass()) {
            return false;
        }
        C1949g c1949g = (C1949g) obj;
        if (this.f16995a == c1949g.f16995a && this.f16996b == c1949g.f16996b) {
            return this.f16997c.equals(c1949g.f16997c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16997c.hashCode() + (((this.f16995a * 31) + this.f16996b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f16995a + ", mForegroundServiceType=" + this.f16996b + ", mNotification=" + this.f16997c + '}';
    }
}
