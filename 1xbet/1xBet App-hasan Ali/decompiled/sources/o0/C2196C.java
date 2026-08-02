package o0;

import i0.M;
import java.util.ArrayList;
import n.AbstractC2107A;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2196C extends AbstractC2194A {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f18509k;

    /* renamed from: l, reason: collision with root package name */
    public final M f18510l;

    public C2196C(ArrayList arrayList, M m5) {
        this.f18509k = arrayList;
        this.f18510l = m5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2196C.class != obj.getClass()) {
            return false;
        }
        C2196C c2196c = (C2196C) obj;
        return this.f18510l.equals(c2196c.f18510l) && kotlin.jvm.internal.l.a(this.f18509k, c2196c.f18509k);
    }

    public final int hashCode() {
        return AbstractC2107A.n(0.0f, AbstractC2107A.n(1.0f, AbstractC2107A.n(0.0f, AbstractC2107A.n(1.0f, (((Float.floatToIntBits(1.0f) + AbstractC2107A.n(1.0f, AbstractC2107A.n(1.0f, AbstractC2107A.o(this.f18509k.hashCode() * 31, 31, this.f18510l.f17262e), 961), 31)) * 961) + 2) * 31, 31), 31), 31), 31);
    }
}
