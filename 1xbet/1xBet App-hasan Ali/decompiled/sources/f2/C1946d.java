package f2;

import android.net.Uri;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1946d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16989a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16990b;

    public C1946d(boolean z3, Uri uri) {
        this.f16989a = uri;
        this.f16990b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1946d.class == obj.getClass()) {
            C1946d c1946d = (C1946d) obj;
            if (this.f16990b == c1946d.f16990b && this.f16989a.equals(c1946d.f16989a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16989a.hashCode() * 31) + (this.f16990b ? 1 : 0);
    }
}
