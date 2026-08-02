package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w01 extends sc0 {

    /* JADX INFO: renamed from: r */
    public static final Object[] f8327r;

    /* JADX INFO: renamed from: s */
    public static final w01 f8328s;

    /* JADX INFO: renamed from: m */
    public final transient Object[] f8329m;

    /* JADX INFO: renamed from: n */
    public final transient int f8330n;

    /* JADX INFO: renamed from: o */
    public final transient Object[] f8331o;

    /* JADX INFO: renamed from: p */
    public final transient int f8332p;

    /* JADX INFO: renamed from: q */
    public final transient int f8333q;

    static {
        Object[] objArr = new Object[0];
        f8327r = objArr;
        f8328s = new w01(0, 0, 0, objArr, objArr);
    }

    public w01(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f8329m = objArr;
        this.f8330n = i;
        this.f8331o = objArr2;
        this.f8332p = i2;
        this.f8333q = i3;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public final int mo3203c(int i, Object[] objArr) {
        Object[] objArr2 = this.f8329m;
        int i2 = this.f8333q;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8331o;
            if (objArr.length != 0) {
                int iM3014n = kd0.m3014n(obj.hashCode());
                while (true) {
                    int i = iM3014n & this.f8332p;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM3014n = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: d */
    public final Object[] mo3204d() {
        return this.f8329m;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: e */
    public final int mo3205e() {
        return this.f8333q;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: f */
    public final int mo3206f() {
        return 0;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return false;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: h */
    public final sf1 iterator() {
        return mo3202b().listIterator(0);
    }

    @Override // p000.sc0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8330n;
    }

    @Override // p000.sc0
    /* JADX INFO: renamed from: q */
    public final qc0 mo4467q() {
        return qc0.m4055j(this.f8333q, this.f8329m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8333q;
    }
}
