package P1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final F1.v f5271a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5272b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5273c;

    /* renamed from: f, reason: collision with root package name */
    public final F1.x f5276f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f5277g;

    /* renamed from: h, reason: collision with root package name */
    public int f5278h;

    /* renamed from: i, reason: collision with root package name */
    public int f5279i;
    public long j;

    /* renamed from: l, reason: collision with root package name */
    public long f5281l;

    /* renamed from: p, reason: collision with root package name */
    public long f5285p;

    /* renamed from: q, reason: collision with root package name */
    public long f5286q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5287r;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f5274d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f5275e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public n f5282m = new n();

    /* renamed from: n, reason: collision with root package name */
    public n f5283n = new n();

    /* renamed from: k, reason: collision with root package name */
    public boolean f5280k = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5284o = false;

    public o(F1.v vVar, boolean z4, boolean z7) {
        this.f5271a = vVar;
        this.f5272b = z4;
        this.f5273c = z7;
        byte[] bArr = new byte[128];
        this.f5277g = bArr;
        this.f5276f = new F1.x(bArr, 0, 0);
        n nVar = this.f5283n;
        nVar.f5257b = false;
        nVar.f5256a = false;
    }
}
