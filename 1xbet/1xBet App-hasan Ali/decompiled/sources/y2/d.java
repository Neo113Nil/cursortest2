package y2;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f21195a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21196b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.e f21197c;

    public d(Drawable drawable, boolean z3, v2.e eVar) {
        this.f21195a = drawable;
        this.f21196b = z3;
        this.f21197c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f21195a, dVar.f21195a) && this.f21196b == dVar.f21196b && this.f21197c == dVar.f21197c;
    }

    public final int hashCode() {
        return this.f21197c.hashCode() + (((this.f21195a.hashCode() * 31) + (this.f21196b ? 1231 : 1237)) * 31);
    }
}
