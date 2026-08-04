package C6;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1582a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z6.f f1585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
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

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void a() {
        p044f6.d dVar;
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
            if (i9 >= i8) {
                this.f1585d = new z6.f(this.f1583b, o.r0(str), 1);
                this.f1584c = -1;
            } else if (i7 > str.length() && (dVar = (p044f6.d) cVar.f1591d.invoke(str, Integer.valueOf(this.f1584c))) != null) {
                int iIntValue = ((Number) dVar.f13006a).intValue();
                int iIntValue2 = ((Number) dVar.f13007b).intValue();
                this.f1585d = p118q2.g.e(this.f1583b, iIntValue);
                int i10 = iIntValue + iIntValue2;
                this.f1583b = i10;
                this.f1584c = i10 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f1585d = new z6.f(this.f1583b, o.r0(str), 1);
                this.f1584c = -1;
            }
        } else if (i7 > str.length()) {
            this.f1585d = new z6.f(this.f1583b, o.r0(str), 1);
            this.f1584c = -1;
        } else {
            int iIntValue3 = ((Number) dVar.f13006a).intValue();
            int iIntValue4 = ((Number) dVar.f13007b).intValue();
            this.f1585d = p118q2.g.e(this.f1583b, iIntValue3);
            int i11 = iIntValue3 + iIntValue4;
            this.f1583b = i11;
            this.f1584c = i11 + (iIntValue4 == 0 ? 1 : 0);
        }
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
