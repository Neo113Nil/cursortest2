package r;

import java.util.Map;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1566a extends Q3.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15966e;

    public /* synthetic */ C1566a(Object obj, int i7) {
        this.f15965d = i7;
        this.f15966e = obj;
    }

    @Override // Q3.d
    public final void a() {
        switch (this.f15965d) {
            case 0:
                ((b) this.f15966e).clear();
                break;
            default:
                ((c) this.f15966e).clear();
                break;
        }
    }

    @Override // Q3.d
    public final Object b(int i7, int i8) {
        switch (this.f15965d) {
            case 0:
                return ((b) this.f15966e).f16006b[(i7 << 1) + i8];
            default:
                return ((c) this.f15966e).f15975b[i7];
        }
    }

    @Override // Q3.d
    public final Map c() {
        switch (this.f15965d) {
            case 0:
                return (b) this.f15966e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // Q3.d
    public final int d() {
        switch (this.f15965d) {
            case 0:
                return ((b) this.f15966e).f16007c;
            default:
                return ((c) this.f15966e).f15976c;
        }
    }

    @Override // Q3.d
    public final int e(Object obj) {
        switch (this.f15965d) {
            case 0:
                return ((b) this.f15966e).e(obj);
            default:
                return ((c) this.f15966e).indexOf(obj);
        }
    }

    @Override // Q3.d
    public final int f(Object obj) {
        switch (this.f15965d) {
            case 0:
                return ((b) this.f15966e).g(obj);
            default:
                return ((c) this.f15966e).indexOf(obj);
        }
    }

    @Override // Q3.d
    public final void g(Object obj, Object obj2) {
        switch (this.f15965d) {
            case 0:
                ((b) this.f15966e).put(obj, obj2);
                break;
            default:
                ((c) this.f15966e).add(obj);
                break;
        }
    }

    @Override // Q3.d
    public final void h(int i7) {
        switch (this.f15965d) {
            case 0:
                ((b) this.f15966e).i(i7);
                break;
            default:
                ((c) this.f15966e).z(i7);
                break;
        }
    }

    @Override // Q3.d
    public final Object i(int i7, Object obj) {
        switch (this.f15965d) {
            case 0:
                int i8 = (i7 << 1) + 1;
                Object[] objArr = ((b) this.f15966e).f16006b;
                Object obj2 = objArr[i8];
                objArr[i8] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
