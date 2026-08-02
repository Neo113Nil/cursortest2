package L4;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class y extends X3.e implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public final C0229l[] f3124k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f3125l;

    public y(C0229l[] c0229lArr, int[] iArr) {
        this.f3124k = c0229lArr;
        this.f3125l = iArr;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f3124k.length;
    }

    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0229l) {
            return super.contains((C0229l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f3124k[i];
    }

    @Override // X3.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0229l) {
            return super.indexOf((C0229l) obj);
        }
        return -1;
    }

    @Override // X3.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0229l) {
            return super.lastIndexOf((C0229l) obj);
        }
        return -1;
    }
}
