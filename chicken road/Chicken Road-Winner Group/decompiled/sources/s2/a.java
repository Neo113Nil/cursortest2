package s2;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements Iterable, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10343a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10345c;

    public a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f10343a = i3;
        if (i5 > 0) {
            if (i3 < i4) {
                int i6 = i4 % i5;
                int i7 = i3 % i5;
                int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                i4 -= i8 < 0 ? i8 + i5 : i8;
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i4) {
                int i9 = -i5;
                int i10 = i3 % i9;
                int i11 = i4 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i4 += i12 < 0 ? i12 + i9 : i12;
            }
        }
        this.f10344b = i4;
        this.f10345c = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f10343a, this.f10344b, this.f10345c);
    }
}
