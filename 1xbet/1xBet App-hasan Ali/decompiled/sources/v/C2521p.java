package v;

import i0.C1997b;
import i0.C2001f;
import i0.C2003h;
import k0.C2022b;

/* renamed from: v.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2521p {

    /* renamed from: a, reason: collision with root package name */
    public C2001f f20287a = null;

    /* renamed from: b, reason: collision with root package name */
    public C1997b f20288b = null;

    /* renamed from: c, reason: collision with root package name */
    public C2022b f20289c = null;

    /* renamed from: d, reason: collision with root package name */
    public C2003h f20290d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2521p)) {
            return false;
        }
        C2521p c2521p = (C2521p) obj;
        return kotlin.jvm.internal.l.a(this.f20287a, c2521p.f20287a) && kotlin.jvm.internal.l.a(this.f20288b, c2521p.f20288b) && kotlin.jvm.internal.l.a(this.f20289c, c2521p.f20289c) && kotlin.jvm.internal.l.a(this.f20290d, c2521p.f20290d);
    }

    public final int hashCode() {
        C2001f c2001f = this.f20287a;
        int hashCode = (c2001f == null ? 0 : c2001f.hashCode()) * 31;
        C1997b c1997b = this.f20288b;
        int hashCode2 = (hashCode + (c1997b == null ? 0 : c1997b.hashCode())) * 31;
        C2022b c2022b = this.f20289c;
        int hashCode3 = (hashCode2 + (c2022b == null ? 0 : c2022b.hashCode())) * 31;
        C2003h c2003h = this.f20290d;
        return hashCode3 + (c2003h != null ? c2003h.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f20287a + ", canvas=" + this.f20288b + ", canvasDrawScope=" + this.f20289c + ", borderPath=" + this.f20290d + ')';
    }
}
