package v2;

import a.AbstractC0086a;
import d2.C0274d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f10418a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f10419b;

    /* renamed from: c, reason: collision with root package name */
    public int f10420c;

    /* renamed from: d, reason: collision with root package name */
    public s2.c f10421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f10422e;

    public b(c cVar) {
        this.f10422e = cVar;
        cVar.getClass();
        int length = cVar.f10423a.length();
        if (length < 0) {
            throw new IllegalArgumentException(B0.c.i(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f10419b = length;
        this.f10420c = length;
    }

    public final void a() {
        int i3 = this.f10420c;
        if (i3 < 0) {
            this.f10418a = 0;
            this.f10421d = null;
            return;
        }
        c cVar = this.f10422e;
        cVar.getClass();
        String str = cVar.f10423a;
        if (i3 > str.length()) {
            this.f10421d = new s2.c(this.f10419b, m.l0(str), 1);
            this.f10420c = -1;
        } else {
            C0274d c0274d = (C0274d) cVar.f10424b.invoke(str, Integer.valueOf(this.f10420c));
            if (c0274d == null) {
                this.f10421d = new s2.c(this.f10419b, m.l0(str), 1);
                this.f10420c = -1;
            } else {
                int intValue = ((Number) c0274d.f4845a).intValue();
                int intValue2 = ((Number) c0274d.f4846b).intValue();
                this.f10421d = AbstractC0086a.c0(this.f10419b, intValue);
                int i4 = intValue + intValue2;
                this.f10419b = i4;
                this.f10420c = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f10418a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10418a == -1) {
            a();
        }
        return this.f10418a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10418a == -1) {
            a();
        }
        if (this.f10418a == 0) {
            throw new NoSuchElementException();
        }
        s2.c cVar = this.f10421d;
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f10421d = null;
        this.f10418a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
