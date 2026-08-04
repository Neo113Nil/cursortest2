package p023d1;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f12366c;

    public h(int i7, Notification notification, int i8) {
        this.f12364a = i7;
        this.f12366c = notification;
        this.f12365b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f12364a == hVar.f12364a && this.f12365b == hVar.f12365b) {
            return this.f12366c.equals(hVar.f12366c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12366c.hashCode() + (((this.f12364a * 31) + this.f12365b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f12364a + ", mForegroundServiceType=" + this.f12365b + ", mNotification=" + this.f12366c + '}';
    }
}
