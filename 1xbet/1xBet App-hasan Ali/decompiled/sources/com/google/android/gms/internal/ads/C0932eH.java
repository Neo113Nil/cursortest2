package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932eH extends AbstractC1022gH implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final int f13248o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13249p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13250q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13251r;

    /* renamed from: s, reason: collision with root package name */
    public final int f13252s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13253t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13254u;

    /* renamed from: v, reason: collision with root package name */
    public final int f13255v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13256w;

    public C0932eH(int i, C1292mb c1292mb, int i5, C0843cH c0843cH, int i6, String str) {
        super(i, c1292mb, i5);
        int i7;
        int i8 = 0;
        this.f13249p = AbstractC1400ot.p(i6, false);
        int i9 = this.f13586n.f14898e;
        c0843cH.getClass();
        this.f13250q = 1 == (i9 & 1);
        this.f13251r = (i9 & 2) != 0;
        C1761wv c1761wv = c0843cH.f16306h;
        C1761wv n5 = c1761wv.isEmpty() ? AbstractC1044gv.n("") : c1761wv;
        int i10 = 0;
        while (true) {
            if (i10 >= n5.f16186n) {
                i7 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            } else {
                i7 = C1112iH.b(this.f13586n, (String) n5.get(i10), false);
                if (i7 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f13252s = i10;
        this.f13253t = i7;
        int i11 = this.f13586n.f;
        int i12 = c0843cH.i;
        int bitCount = (i11 == 0 || i11 != i12) ? Integer.bitCount(i11 & i12) : Integer.MAX_VALUE;
        this.f13254u = bitCount;
        this.f13256w = (this.f13586n.f & 1088) != 0;
        int b3 = C1112iH.b(this.f13586n, str, C1112iH.c(str) == null);
        this.f13255v = b3;
        boolean z3 = i7 > 0 || (c1761wv.isEmpty() && bitCount > 0) || this.f13250q || (this.f13251r && b3 > 0);
        if (AbstractC1400ot.p(i6, c0843cH.f12993q) && z3) {
            i8 = 1;
        }
        this.f13248o = i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final int a() {
        return this.f13248o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1022gH abstractC1022gH) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0932eH c0932eH) {
        Zu d5 = Zu.f12539a.d(this.f13249p, c0932eH.f13249p);
        Integer valueOf = Integer.valueOf(this.f13252s);
        Integer valueOf2 = Integer.valueOf(c0932eH.f13252s);
        C1671uv c1671uv = C1671uv.f15932m;
        Zu c5 = d5.c(valueOf, valueOf2, c1671uv);
        int i = this.f13253t;
        Zu b3 = c5.b(i, c0932eH.f13253t);
        int i5 = this.f13254u;
        Zu d6 = b3.b(i5, c0932eH.f13254u).d(this.f13250q, c0932eH.f13250q);
        Boolean valueOf3 = Boolean.valueOf(this.f13251r);
        Boolean valueOf4 = Boolean.valueOf(c0932eH.f13251r);
        if (i == 0) {
            c1671uv = C1671uv.f15931l;
        }
        Zu b5 = d6.c(valueOf3, valueOf4, c1671uv).b(this.f13255v, c0932eH.f13255v);
        if (i5 == 0) {
            b5 = b5.e(this.f13256w, c0932eH.f13256w);
        }
        return b5.a();
    }
}
