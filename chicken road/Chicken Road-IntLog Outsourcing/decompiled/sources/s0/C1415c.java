package s0;

import android.net.Uri;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11759a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11760b;

    public C1415c(boolean z, Uri uri) {
        this.f11759a = uri;
        this.f11760b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1415c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C1415c c1415c = (C1415c) obj;
        return kotlin.jvm.internal.i.a(this.f11759a, c1415c.f11759a) && this.f11760b == c1415c.f11760b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11760b) + (this.f11759a.hashCode() * 31);
    }
}
