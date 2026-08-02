package D6;

import kotlin.jvm.functions.Function1;

/* renamed from: D6.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0139w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1884a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1885b;

    public C0139w(Object obj, Function1 function1) {
        this.f1884a = obj;
        this.f1885b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0139w)) {
            return false;
        }
        C0139w c0139w = (C0139w) obj;
        return t6.h.a(this.f1884a, c0139w.f1884a) && t6.h.a(this.f1885b, c0139w.f1885b);
    }

    public final int hashCode() {
        Object obj = this.f1884a;
        return this.f1885b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1884a + ", onCancellation=" + this.f1885b + ')';
    }
}
