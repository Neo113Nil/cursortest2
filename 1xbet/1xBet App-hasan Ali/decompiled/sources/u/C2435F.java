package u;

import P.AbstractC0329z;
import P.C0305m0;
import P.d1;

/* renamed from: u.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2435F implements d1 {

    /* renamed from: k, reason: collision with root package name */
    public Number f19661k;

    /* renamed from: l, reason: collision with root package name */
    public Number f19662l;

    /* renamed from: m, reason: collision with root package name */
    public final A0 f19663m;

    /* renamed from: n, reason: collision with root package name */
    public final C0305m0 f19664n;

    /* renamed from: o, reason: collision with root package name */
    public m0 f19665o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19666p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19667q;

    /* renamed from: r, reason: collision with root package name */
    public long f19668r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2438I f19669s;

    public C2435F(C2438I c2438i, Number number, Number number2, A0 a02, C2434E c2434e) {
        this.f19669s = c2438i;
        this.f19661k = number;
        this.f19662l = number2;
        this.f19663m = a02;
        this.f19664n = AbstractC0329z.t(number);
        this.f19665o = new m0(c2434e, a02, this.f19661k, this.f19662l, null);
    }

    @Override // P.d1
    public final Object getValue() {
        return this.f19664n.getValue();
    }
}
