package t;

import java.util.LinkedHashMap;
import k4.AbstractC2036a;

/* renamed from: t.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2383E {

    /* renamed from: b, reason: collision with root package name */
    public static final C2383E f19339b = new C2383E(new N((C2385G) null, (AbstractC2036a) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));

    /* renamed from: a, reason: collision with root package name */
    public final N f19340a;

    public C2383E(N n5) {
        this.f19340a = n5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2383E) && kotlin.jvm.internal.l.a(((C2383E) obj).f19340a, this.f19340a);
    }

    public final int hashCode() {
        return this.f19340a.hashCode();
    }

    public final String toString() {
        if (equals(f19339b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C2385G c2385g = this.f19340a.f19353a;
        sb.append(c2385g != null ? c2385g.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
