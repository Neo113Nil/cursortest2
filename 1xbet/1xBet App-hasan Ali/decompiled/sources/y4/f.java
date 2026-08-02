package y4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f21316c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f21317a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2425d f21318b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    static {
        ArrayList arrayList = new ArrayList();
        X3.x xVar = X3.x.f6092k;
        int size = arrayList.size();
        X3.x xVar2 = xVar;
        if (size != 0) {
            if (size != 1) {
                ?? linkedHashSet = new LinkedHashSet(X3.z.R(arrayList.size()));
                X3.m.l0(arrayList, linkedHashSet);
                xVar2 = linkedHashSet;
            } else {
                ?? singleton = Collections.singleton(arrayList.get(0));
                kotlin.jvm.internal.l.e("singleton(...)", singleton);
                xVar2 = singleton;
            }
        }
        f21316c = new f(xVar2, null);
    }

    public f(Set set, AbstractC2425d abstractC2425d) {
        this.f21317a = set;
        this.f21318b = abstractC2425d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(fVar.f21317a, this.f21317a) && kotlin.jvm.internal.l.a(fVar.f21318b, this.f21318b);
    }

    public final int hashCode() {
        int hashCode = (this.f21317a.hashCode() + 1517) * 41;
        AbstractC2425d abstractC2425d = this.f21318b;
        return hashCode + (abstractC2425d != null ? abstractC2425d.hashCode() : 0);
    }
}
