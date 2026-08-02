package x;

import a.AbstractC0444a;
import p4.AbstractC2279t;
import p4.C2268h;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2582h {

    /* renamed from: a, reason: collision with root package name */
    public final C.e f20767a;

    /* renamed from: b, reason: collision with root package name */
    public final C2268h f20768b;

    public C2582h(C.e eVar, C2268h c2268h) {
        this.f20767a = eVar;
        this.f20768b = c2268h;
    }

    public final String toString() {
        C2268h c2268h = this.f20768b;
        if (c2268h.f18796o.l(AbstractC2279t.f18820l) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        AbstractC0444a.k(16);
        String num = Integer.toString(hashCode, 16);
        kotlin.jvm.internal.l.e("toString(this, checkRadix(radix))", num);
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f20767a.invoke());
        sb.append(", continuation=");
        sb.append(c2268h);
        sb.append(')');
        return sb.toString();
    }
}
