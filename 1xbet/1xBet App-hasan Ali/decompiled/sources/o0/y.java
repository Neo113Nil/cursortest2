package o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class y extends AbstractC2194A implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final List f18601k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18602l;

    public y(List list, ArrayList arrayList) {
        this.f18601k = list;
        this.f18602l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.l.a(this.f18601k, yVar.f18601k) && this.f18602l.equals(yVar.f18602l);
    }

    public final int hashCode() {
        return this.f18602l.hashCode() + ((this.f18601k.hashCode() + AbstractC2107A.n(0.0f, AbstractC2107A.n(0.0f, AbstractC2107A.n(1.0f, AbstractC2107A.n(1.0f, AbstractC2107A.n(0.0f, AbstractC2107A.n(0.0f, Float.floatToIntBits(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new U.h(this);
    }
}
