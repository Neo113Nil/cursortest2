package l;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923a {

    /* renamed from: a, reason: collision with root package name */
    public l.h f7962a;

    /* renamed from: b, reason: collision with root package name */
    public l.h f7963b;

    /* renamed from: c, reason: collision with root package name */
    public l.j f7964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7966e;

    public /* synthetic */ C0923a(int i2, java.lang.Object obj) {
        this.f7965d = i2;
        this.f7966e = obj;
    }

    public static boolean h(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.f7965d) {
            case 0:
                ((l.C0924b) this.f7966e).clear();
                break;
            default:
                ((l.C0925c) this.f7966e).clear();
                break;
        }
    }

    public final java.lang.Object b(int i2, int i3) {
        switch (this.f7965d) {
            case 0:
                return ((l.C0924b) this.f7966e).f8007b[(i2 << 1) + i3];
            default:
                return ((l.C0925c) this.f7966e).f7975b[i2];
        }
    }

    public final java.util.Map c() {
        switch (this.f7965d) {
            case 0:
                return (l.C0924b) this.f7966e;
            default:
                throw new java.lang.UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f7965d) {
            case 0:
                return ((l.C0924b) this.f7966e).f8008c;
            default:
                return ((l.C0925c) this.f7966e).f7976c;
        }
    }

    public final int e(java.lang.Object obj) {
        switch (this.f7965d) {
            case 0:
                return ((l.C0924b) this.f7966e).d(obj);
            default:
                return ((l.C0925c) this.f7966e).indexOf(obj);
        }
    }

    public final int f(java.lang.Object obj) {
        switch (this.f7965d) {
            case 0:
                return ((l.C0924b) this.f7966e).f(obj);
            default:
                return ((l.C0925c) this.f7966e).indexOf(obj);
        }
    }

    public final void g(int i2) {
        switch (this.f7965d) {
            case 0:
                ((l.C0924b) this.f7966e).h(i2);
                break;
            default:
                ((l.C0925c) this.f7966e).e(i2);
                break;
        }
    }

    public final java.lang.Object[] i(int i2, java.lang.Object[] objArr) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
