package t;

import java.util.LinkedHashMap;
import java.util.Map;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final C2385G f19353a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19354b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f19355c;

    public N(C2385G c2385g, AbstractC2036a abstractC2036a, boolean z3, Map map) {
        this.f19353a = c2385g;
        this.f19354b = z3;
        this.f19355c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n5 = (N) obj;
        return kotlin.jvm.internal.l.a(this.f19353a, n5.f19353a) && kotlin.jvm.internal.l.a(null, null) && this.f19354b == n5.f19354b && kotlin.jvm.internal.l.a(this.f19355c, n5.f19355c);
    }

    public final int hashCode() {
        C2385G c2385g = this.f19353a;
        return this.f19355c.hashCode() + ((((((c2385g == null ? 0 : c2385g.hashCode()) * 29791) + 0) * 31) + (this.f19354b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f19353a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", hold=" + this.f19354b + ", effectsMap=" + this.f19355c + ')';
    }

    public /* synthetic */ N(C2385G c2385g, AbstractC2036a abstractC2036a, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c2385g, (i & 8) != 0 ? null : abstractC2036a, (i & 16) == 0, (i & 32) != 0 ? X3.w.f6091k : linkedHashMap);
    }
}
