package C6;

import W5.AbstractC0486a1;
import f6.C1111d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public int f1582a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1583b;

    /* renamed from: c, reason: collision with root package name */
    public int f1584c;

    /* renamed from: d, reason: collision with root package name */
    public z6.f f1585d;

    /* renamed from: e, reason: collision with root package name */
    public int f1586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f1587f;

    public b(c cVar) {
        this.f1587f = cVar;
        int i7 = cVar.f1589b;
        int length = cVar.f1588a.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 > length) {
            i7 = length;
        }
        this.f1583b = i7;
        this.f1584c = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i7 = this.f1584c;
        if (i7 < 0) {
            this.f1582a = 0;
            this.f1585d = null;
            return;
        }
        c cVar = this.f1587f;
        int i8 = cVar.f1590c;
        String str = cVar.f1588a;
        if (i8 > 0) {
            int i9 = this.f1586e + 1;
            this.f1586e = i9;
        }
        if (i7 <= str.length()) {
            C1111d c1111d = (C1111d) cVar.f1591d.invoke(str, Integer.valueOf(this.f1584c));
            if (c1111d == null) {
                this.f1585d = new z6.f(this.f1583b, o.r0(str), 1);
                this.f1584c = -1;
            } else {
                int intValue = ((Number) c1111d.f13000a).intValue();
                int intValue2 = ((Number) c1111d.f13001b).intValue();
                this.f1585d = q2.g.e(this.f1583b, intValue);
                int i10 = intValue + intValue2;
                this.f1583b = i10;
                this.f1584c = i10 + (intValue2 == 0 ? 1 : 0);
            }
            this.f1582a = 1;
        }
        this.f1585d = new z6.f(this.f1583b, o.r0(str), 1);
        this.f1584c = -1;
        this.f1582a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1582a == -1) {
            a();
        }
        return this.f1582a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1582a == -1) {
            a();
        }
        if (this.f1582a == 0) {
            throw new NoSuchElementException();
        }
        z6.f fVar = this.f1585d;
        t6.h.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f1585d = null;
        this.f1582a = -1;
        return fVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
