package p122r;

import Q3.d;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15972e;

    public /* synthetic */ a(Object obj, int i7) {
        this.f15971d = i7;
        this.f15972e = obj;
    }

    @Override // Q3.d
    public final void a() {
        switch (this.f15971d) {
            case 0:
                ((b) this.f15972e).clear();
                break;
            default:
                ((c) this.f15972e).clear();
                break;
        }
    }

    @Override // Q3.d
    public final Object b(int i7, int i8) {
        switch (this.f15971d) {
            case 0:
                return ((b) this.f15972e).f16012b[(i7 << 1) + i8];
            default:
                return ((c) this.f15972e).f15981b[i7];
        }
    }

    @Override // Q3.d
    public final Map c() {
        switch (this.f15971d) {
            case 0:
                return (b) this.f15972e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // Q3.d
    public final int d() {
        switch (this.f15971d) {
            case 0:
                return ((b) this.f15972e).f16013c;
            default:
                return ((c) this.f15972e).f15982c;
        }
    }

    @Override // Q3.d
    public final int e(Object obj) {
        switch (this.f15971d) {
            case 0:
                return ((b) this.f15972e).e(obj);
            default:
                return ((c) this.f15972e).indexOf(obj);
        }
    }

    @Override // Q3.d
    public final int f(Object obj) {
        switch (this.f15971d) {
            case 0:
                return ((b) this.f15972e).g(obj);
            default:
                return ((c) this.f15972e).indexOf(obj);
        }
    }

    @Override // Q3.d
    public final void g(Object obj, Object obj2) {
        switch (this.f15971d) {
            case 0:
                ((b) this.f15972e).put(obj, obj2);
                break;
            default:
                ((c) this.f15972e).add(obj);
                break;
        }
    }

    @Override // Q3.d
    public final void h(int i7) {
        switch (this.f15971d) {
            case 0:
                ((b) this.f15972e).i(i7);
                break;
            default:
                ((c) this.f15972e).z(i7);
                break;
        }
    }

    @Override // Q3.d
    public final Object i(int i7, Object obj) {
        switch (this.f15971d) {
            case 0:
                int i8 = (i7 << 1) + 1;
                Object[] objArr = ((b) this.f15972e).f16012b;
                Object obj2 = objArr[i8];
                objArr[i8] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
