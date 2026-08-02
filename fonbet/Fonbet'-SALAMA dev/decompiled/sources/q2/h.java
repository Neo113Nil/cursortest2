package q2;

import android.text.Layout;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f15830a;

    /* renamed from: b, reason: collision with root package name */
    public int f15831b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15832c;

    /* renamed from: d, reason: collision with root package name */
    public int f15833d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15834e;

    /* renamed from: k, reason: collision with root package name */
    public float f15839k;

    /* renamed from: l, reason: collision with root package name */
    public String f15840l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f15843o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f15844p;

    /* renamed from: r, reason: collision with root package name */
    public C1550b f15846r;

    /* renamed from: f, reason: collision with root package name */
    public int f15835f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f15836g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f15837h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f15838i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f15841m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f15842n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f15845q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f15847s = Float.MAX_VALUE;

    public final void a(h hVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (hVar != null) {
            if (!this.f15832c && hVar.f15832c) {
                this.f15831b = hVar.f15831b;
                this.f15832c = true;
            }
            if (this.f15837h == -1) {
                this.f15837h = hVar.f15837h;
            }
            if (this.f15838i == -1) {
                this.f15838i = hVar.f15838i;
            }
            if (this.f15830a == null && (str = hVar.f15830a) != null) {
                this.f15830a = str;
            }
            if (this.f15835f == -1) {
                this.f15835f = hVar.f15835f;
            }
            if (this.f15836g == -1) {
                this.f15836g = hVar.f15836g;
            }
            if (this.f15842n == -1) {
                this.f15842n = hVar.f15842n;
            }
            if (this.f15843o == null && (alignment2 = hVar.f15843o) != null) {
                this.f15843o = alignment2;
            }
            if (this.f15844p == null && (alignment = hVar.f15844p) != null) {
                this.f15844p = alignment;
            }
            if (this.f15845q == -1) {
                this.f15845q = hVar.f15845q;
            }
            if (this.j == -1) {
                this.j = hVar.j;
                this.f15839k = hVar.f15839k;
            }
            if (this.f15846r == null) {
                this.f15846r = hVar.f15846r;
            }
            if (this.f15847s == Float.MAX_VALUE) {
                this.f15847s = hVar.f15847s;
            }
            if (!this.f15834e && hVar.f15834e) {
                this.f15833d = hVar.f15833d;
                this.f15834e = true;
            }
            if (this.f15841m != -1 || (i7 = hVar.f15841m) == -1) {
                return;
            }
            this.f15841m = i7;
        }
    }
}
