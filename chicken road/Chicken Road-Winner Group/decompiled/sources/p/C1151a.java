package p;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151a {

    /* renamed from: a, reason: collision with root package name */
    public C1158h f10180a;

    /* renamed from: b, reason: collision with root package name */
    public C1158h f10181b;

    /* renamed from: c, reason: collision with root package name */
    public C1160j f10182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10184e;

    public /* synthetic */ C1151a(int i3, Object obj) {
        this.f10183d = i3;
        this.f10184e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void a() {
        switch (this.f10183d) {
            case 0:
                ((C1152b) this.f10184e).clear();
                break;
            default:
                ((C1153c) this.f10184e).clear();
                break;
        }
    }

    public final Object b(int i3, int i4) {
        switch (this.f10183d) {
            case 0:
                return ((C1152b) this.f10184e).f10223b[(i3 << 1) + i4];
            default:
                return ((C1153c) this.f10184e).f10192b[i3];
        }
    }

    public final Map c() {
        switch (this.f10183d) {
            case 0:
                return (C1152b) this.f10184e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f10183d) {
            case 0:
                return ((C1152b) this.f10184e).f10224c;
            default:
                return ((C1153c) this.f10184e).f10193c;
        }
    }

    public final int e(Object obj) {
        switch (this.f10183d) {
            case 0:
                return ((C1152b) this.f10184e).d(obj);
            default:
                C1153c c1153c = (C1153c) this.f10184e;
                return obj == null ? c1153c.e() : c1153c.d(obj.hashCode(), obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f10183d) {
            case 0:
                return ((C1152b) this.f10184e).f(obj);
            default:
                C1153c c1153c = (C1153c) this.f10184e;
                return obj == null ? c1153c.e() : c1153c.d(obj.hashCode(), obj);
        }
    }

    public final void g(int i3) {
        switch (this.f10183d) {
            case 0:
                ((C1152b) this.f10184e).h(i3);
                break;
            default:
                ((C1153c) this.f10184e).f(i3);
                break;
        }
    }

    public final Object[] i(int i3, Object[] objArr) {
        int d3 = d();
        if (objArr.length < d3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d3);
        }
        for (int i4 = 0; i4 < d3; i4++) {
            objArr[i4] = b(i4, i3);
        }
        if (objArr.length > d3) {
            objArr[d3] = null;
        }
        return objArr;
    }
}
