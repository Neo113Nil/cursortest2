package p118q2;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15840e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15846l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f15849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f15850p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f15852r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15841f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15842g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15843h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15844i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15847m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15848n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15851q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15853s = Float.MAX_VALUE;

    public final void a(h hVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (hVar != null) {
            if (!this.f15838c && hVar.f15838c) {
                this.f15837b = hVar.f15837b;
                this.f15838c = true;
            }
            if (this.f15843h == -1) {
                this.f15843h = hVar.f15843h;
            }
            if (this.f15844i == -1) {
                this.f15844i = hVar.f15844i;
            }
            if (this.f15836a == null && (str = hVar.f15836a) != null) {
                this.f15836a = str;
            }
            if (this.f15841f == -1) {
                this.f15841f = hVar.f15841f;
            }
            if (this.f15842g == -1) {
                this.f15842g = hVar.f15842g;
            }
            if (this.f15848n == -1) {
                this.f15848n = hVar.f15848n;
            }
            if (this.f15849o == null && (alignment2 = hVar.f15849o) != null) {
                this.f15849o = alignment2;
            }
            if (this.f15850p == null && (alignment = hVar.f15850p) != null) {
                this.f15850p = alignment;
            }
            if (this.f15851q == -1) {
                this.f15851q = hVar.f15851q;
            }
            if (this.j == -1) {
                this.j = hVar.j;
                this.f15845k = hVar.f15845k;
            }
            if (this.f15852r == null) {
                this.f15852r = hVar.f15852r;
            }
            if (this.f15853s == Float.MAX_VALUE) {
                this.f15853s = hVar.f15853s;
            }
            if (!this.f15840e && hVar.f15840e) {
                this.f15839d = hVar.f15839d;
                this.f15840e = true;
            }
            if (this.f15847m != -1 || (i7 = hVar.f15847m) == -1) {
                return;
            }
            this.f15847m = i7;
        }
    }
}
