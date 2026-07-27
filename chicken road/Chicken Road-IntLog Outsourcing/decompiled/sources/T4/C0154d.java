package T4;

import a.AbstractC0169a;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: T4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0154d f2844c = new C0154d(AbstractC0465j.X0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f2845a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0169a f2846b;

    public C0154d(Set set, AbstractC0169a abstractC0169a) {
        this.f2845a = set;
        this.f2846b = abstractC0169a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0154d) {
            C0154d c0154d = (C0154d) obj;
            if (kotlin.jvm.internal.i.a(c0154d.f2845a, this.f2845a) && kotlin.jvm.internal.i.a(c0154d.f2846b, this.f2846b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2845a.hashCode() + 1517) * 41;
        AbstractC0169a abstractC0169a = this.f2846b;
        return hashCode + (abstractC0169a != null ? abstractC0169a.hashCode() : 0);
    }
}
