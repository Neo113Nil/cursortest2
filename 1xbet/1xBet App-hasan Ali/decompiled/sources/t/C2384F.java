package t;

import java.util.LinkedHashMap;
import k4.AbstractC2036a;

/* renamed from: t.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384F {

    /* renamed from: b, reason: collision with root package name */
    public static final C2384F f19341b = new C2384F(new N((C2385G) null, (AbstractC2036a) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));

    /* renamed from: c, reason: collision with root package name */
    public static final C2384F f19342c = new C2384F(new N((C2385G) (0 == true ? 1 : 0), (AbstractC2036a) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 47));

    /* renamed from: a, reason: collision with root package name */
    public final N f19343a;

    public C2384F(N n5) {
        this.f19343a = n5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2384F) && kotlin.jvm.internal.l.a(((C2384F) obj).f19343a, this.f19343a);
    }

    public final int hashCode() {
        return this.f19343a.hashCode();
    }

    public final String toString() {
        if (equals(f19341b)) {
            return "ExitTransition.None";
        }
        if (equals(f19342c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        N n5 = this.f19343a;
        C2385G c2385g = n5.f19353a;
        sb.append(c2385g != null ? c2385g.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(n5.f19354b);
        return sb.toString();
    }
}
