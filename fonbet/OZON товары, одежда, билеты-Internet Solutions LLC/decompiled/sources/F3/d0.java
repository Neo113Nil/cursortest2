package F3;

import com.google.common.collect.AbstractC5880y;
import j3.C7253I;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f8643d = new d0(new C7253I[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f8644a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5880y<C7253I> f8645b;

    /* renamed from: c, reason: collision with root package name */
    private int f8646c;

    static {
        m3.N.L(0);
    }

    public d0(C7253I... c7253iArr) {
        this.f8645b = AbstractC5880y.s(c7253iArr);
        this.f8644a = c7253iArr.length;
        int i11 = 0;
        while (true) {
            AbstractC5880y<C7253I> abstractC5880y = this.f8645b;
            if (i11 >= abstractC5880y.size()) {
                return;
            }
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < abstractC5880y.size(); i13++) {
                if (abstractC5880y.get(i11).equals(abstractC5880y.get(i13))) {
                    m3.s.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    public final C7253I a(int i11) {
        return this.f8645b.get(i11);
    }

    public final AbstractC5880y<Integer> b() {
        return AbstractC5880y.n(com.google.common.collect.G.a(this.f8645b, new Ak.b()));
    }

    public final int c(C7253I c7253i) {
        int indexOf = this.f8645b.indexOf(c7253i);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f8644a == d0Var.f8644a && this.f8645b.equals(d0Var.f8645b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8646c == 0) {
            this.f8646c = this.f8645b.hashCode();
        }
        return this.f8646c;
    }

    public final String toString() {
        return this.f8645b.toString();
    }
}
