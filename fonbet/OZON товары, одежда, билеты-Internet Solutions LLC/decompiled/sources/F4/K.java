package F4;

import F4.F;
import F4.M;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class K<T> extends AbstractList<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f8814a;

    /* renamed from: b, reason: collision with root package name */
    private int f8815b;

    /* renamed from: c, reason: collision with root package name */
    private int f8816c;

    /* renamed from: d, reason: collision with root package name */
    private int f8817d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8818e;

    /* renamed from: f, reason: collision with root package name */
    private int f8819f;

    /* renamed from: g, reason: collision with root package name */
    private int f8820g;

    public K() {
        this.f8814a = new ArrayList();
        this.f8818e = true;
    }

    private final boolean q(int i11, int i12) {
        ArrayList arrayList = this.f8814a;
        return this.f8819f > Integer.MAX_VALUE && arrayList.size() > 2 && this.f8819f - ((M.b.C0187b) arrayList.get(i12)).b().size() >= i11;
    }

    public final void a(@NotNull M.b.C0187b page, C3027g c3027g) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.b().size();
        if (size == 0) {
            return;
        }
        this.f8814a.add(page);
        this.f8819f += size;
        int min = Math.min(this.f8816c, size);
        int i11 = size - min;
        if (min != 0) {
            this.f8816c -= min;
        }
        int i12 = (this.f8815b + this.f8819f) - size;
        c3027g.v(i12, min);
        c3027g.w(i12 + min, i11);
    }

    @NotNull
    public final T b() {
        return (T) C7714v.K(((M.b.C0187b) C7714v.K(this.f8814a)).b());
    }

    @NotNull
    public final T c(int i11) {
        ArrayList arrayList = this.f8814a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int size2 = ((M.b.C0187b) arrayList.get(i12)).b().size();
            if (size2 > i11) {
                break;
            }
            i11 -= size2;
            i12++;
        }
        return (T) ((M.b.C0187b) arrayList.get(i12)).b().get(i11);
    }

    public final int e() {
        return this.f8815b + this.f8820g;
    }

    @NotNull
    public final T f() {
        return (T) C7714v.X(((M.b.C0187b) C7714v.X(this.f8814a)).b());
    }

    public final int g() {
        return (this.f8819f / 2) + this.f8815b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i11) {
        int i12 = i11 - this.f8815b;
        if (i11 < 0 || i11 >= getSize()) {
            StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
            f7.append(getSize());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 < 0 || i12 >= this.f8819f) {
            return null;
        }
        return c(i12);
    }

    public final int getSize() {
        return this.f8815b + this.f8819f + this.f8816c;
    }

    public final Object h() {
        if (!this.f8818e || this.f8816c > 0) {
            return ((M.b.C0187b) C7714v.X(this.f8814a)).e();
        }
        return null;
    }

    public final int i() {
        return this.f8816c;
    }

    public final int k() {
        return this.f8815b;
    }

    public final Object l() {
        if (!this.f8818e || this.f8815b + this.f8817d > 0) {
            return ((M.b.C0187b) C7714v.K(this.f8814a)).f();
        }
        return null;
    }

    public final N<?, T> m(@NotNull F.c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        ArrayList arrayList = this.f8814a;
        if (arrayList.isEmpty()) {
            return null;
        }
        List U02 = C7714v.U0(arrayList);
        Integer valueOf = Integer.valueOf(e());
        int i11 = config.f8788a;
        L l11 = new L();
        if (config.f8790c || config.f8789b != 0) {
            return new N<>(U02, valueOf, l11, this.f8815b);
        }
        throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
    }

    public final int n() {
        return this.f8819f;
    }

    public final void o(int i11, @NotNull M.b.C0187b page, int i12, int i13, @NotNull C3027g callback, boolean z11) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8815b = i11;
        ArrayList arrayList = this.f8814a;
        arrayList.clear();
        arrayList.add(page);
        this.f8816c = i12;
        this.f8817d = i13;
        this.f8819f = page.b().size();
        this.f8818e = z11;
        this.f8820g = page.b().size() / 2;
        callback.J(getSize());
    }

    public final void r(@NotNull M.b.C0187b page, C3027g c3027g) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.b().size();
        if (size == 0) {
            return;
        }
        this.f8814a.add(0, page);
        this.f8819f += size;
        int min = Math.min(this.f8815b, size);
        int i11 = size - min;
        if (min != 0) {
            this.f8815b -= min;
        }
        this.f8817d -= i11;
        c3027g.K(this.f8815b, min, i11);
    }

    public final void s(int i11) {
        this.f8820g = kotlin.ranges.h.e(i11 - this.f8815b, 0, this.f8819f - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final boolean t(int i11, int i12) {
        return this.f8819f + i12 > Integer.MAX_VALUE && this.f8814a.size() > 1 && this.f8819f >= i11;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public final String toString() {
        return "leading " + this.f8815b + ", storage " + this.f8819f + ", trailing " + this.f8816c + ' ' + C7714v.V(this.f8814a, " ", null, null, null, 62);
    }

    @NotNull
    public final K<T> u() {
        return new K<>(this);
    }

    public final boolean v(boolean z11, int i11, @NotNull C3027g callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f8814a;
            if (!q(i11, arrayList.size() - 1)) {
                break;
            }
            int size = ((M.b.C0187b) arrayList.remove(arrayList.size() - 1)).b().size();
            i12 += size;
            this.f8819f -= size;
        }
        int i13 = this.f8820g;
        int i14 = this.f8819f;
        int i15 = i14 - 1;
        if (i13 > i15) {
            i13 = i15;
        }
        this.f8820g = i13;
        if (i12 > 0) {
            int i16 = this.f8815b + i14;
            if (z11) {
                this.f8816c += i12;
                callback.v(i16, i12);
            } else {
                callback.x(i16, i12);
            }
        }
        return i12 > 0;
    }

    public final boolean w(boolean z11, int i11, @NotNull C3027g callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i12 = 0;
        while (q(i11, 0)) {
            int size = ((M.b.C0187b) this.f8814a.remove(0)).b().size();
            i12 += size;
            this.f8819f -= size;
        }
        int i13 = this.f8820g - i12;
        if (i13 < 0) {
            i13 = 0;
        }
        this.f8820g = i13;
        if (i12 > 0) {
            if (z11) {
                int i14 = this.f8815b;
                this.f8815b = i14 + i12;
                callback.v(i14, i12);
            } else {
                this.f8817d += i12;
                callback.x(this.f8815b, i12);
            }
        }
        return i12 > 0;
    }

    private K(K<T> k11) {
        ArrayList arrayList = new ArrayList();
        this.f8814a = arrayList;
        this.f8818e = true;
        arrayList.addAll(k11.f8814a);
        this.f8815b = k11.f8815b;
        this.f8816c = k11.f8816c;
        this.f8817d = k11.f8817d;
        this.f8818e = k11.f8818e;
        this.f8819f = k11.f8819f;
        this.f8820g = k11.f8820g;
    }
}
