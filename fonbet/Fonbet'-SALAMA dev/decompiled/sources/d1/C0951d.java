package d1;

import android.net.Uri;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f12351a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12352b;

    public C0951d(boolean z4, Uri uri) {
        this.f12351a = uri;
        this.f12352b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0951d.class != obj.getClass()) {
            return false;
        }
        C0951d c0951d = (C0951d) obj;
        return this.f12352b == c0951d.f12352b && this.f12351a.equals(c0951d.f12351a);
    }

    public final int hashCode() {
        return (this.f12351a.hashCode() * 31) + (this.f12352b ? 1 : 0);
    }
}
