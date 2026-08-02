package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f45285a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45286b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f45287c;

    public h(int i11, int i12, @NonNull Notification notification) {
        this.f45285a = i11;
        this.f45287c = notification;
        this.f45286b = i12;
    }

    public final int a() {
        return this.f45286b;
    }

    @NonNull
    public final Notification b() {
        return this.f45287c;
    }

    public final int c() {
        return this.f45285a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f45285a == hVar.f45285a && this.f45286b == hVar.f45286b) {
            return this.f45287c.equals(hVar.f45287c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45287c.hashCode() + (((this.f45285a * 31) + this.f45286b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f45285a + ", mForegroundServiceType=" + this.f45286b + ", mNotification=" + this.f45287c + '}';
    }
}
