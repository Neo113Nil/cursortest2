package f6;

import io.sentry.protocol.Request;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1108a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C1108a f12997b = new C1108a();

    /* renamed from: a, reason: collision with root package name */
    public final int f12998a = 131328;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1108a c1108a = (C1108a) obj;
        t6.h.e(c1108a, Request.JsonKeys.OTHER);
        return this.f12998a - c1108a.f12998a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1108a c1108a = obj instanceof C1108a ? (C1108a) obj : null;
        return c1108a != null && this.f12998a == c1108a.f12998a;
    }

    public final int hashCode() {
        return this.f12998a;
    }

    public final String toString() {
        return "2.1.0";
    }
}
