package f;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public f f1002a;

    /* renamed from: b, reason: collision with root package name */
    public f f1003b;

    /* renamed from: c, reason: collision with root package name */
    public h f1004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1006e;

    public /* synthetic */ a(int i2, Object obj) {
        this.f1005d = i2;
        this.f1006e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.f1005d) {
            case 0:
                ((b) this.f1006e).clear();
                break;
            default:
                ((c) this.f1006e).clear();
                break;
        }
    }

    public final Object b(int i2, int i3) {
        switch (this.f1005d) {
            case 0:
                return ((b) this.f1006e).f1037b[(i2 << 1) + i3];
            default:
                return ((c) this.f1006e).f1015b[i2];
        }
    }

    public final Map c() {
        switch (this.f1005d) {
            case 0:
                return (b) this.f1006e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f1005d) {
            case 0:
                return ((b) this.f1006e).f1038c;
            default:
                return ((c) this.f1006e).f1016c;
        }
    }

    public final int e(Object obj) {
        switch (this.f1005d) {
            case 0:
                return ((b) this.f1006e).d(obj);
            default:
                return ((c) this.f1006e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f1005d) {
            case 0:
                return ((b) this.f1006e).f(obj);
            default:
                return ((c) this.f1006e).indexOf(obj);
        }
    }

    public final void g(int i2) {
        switch (this.f1005d) {
            case 0:
                ((b) this.f1006e).g(i2);
                break;
            default:
                ((c) this.f1006e).e(i2);
                break;
        }
    }

    public final Object[] i(Object[] objArr, int i2) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
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
