package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ix implements Jw, Ei {

    /* renamed from: m, reason: collision with root package name */
    public static final Ix f9644m;

    /* renamed from: n, reason: collision with root package name */
    public static final Ix f9645n;

    /* renamed from: o, reason: collision with root package name */
    public static final Ix f9646o;

    /* renamed from: p, reason: collision with root package name */
    public static final Ix f9647p;

    /* renamed from: q, reason: collision with root package name */
    public static final Ix f9648q;

    /* renamed from: r, reason: collision with root package name */
    public static final Ix f9649r;

    /* renamed from: s, reason: collision with root package name */
    public static final Ix f9650s;

    /* renamed from: t, reason: collision with root package name */
    public static final Ix f9651t;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9652k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9653l;

    static {
        int i = 0;
        f9644m = new Ix("TINK", i);
        f9645n = new Ix("CRUNCHY", i);
        f9646o = new Ix("NO_PREFIX", i);
        int i5 = 1;
        f9647p = new Ix("TINK", i5);
        f9648q = new Ix("NO_PREFIX", i5);
        int i6 = 2;
        f9649r = new Ix("TINK", i6);
        f9650s = new Ix("CRUNCHY", i6);
        f9651t = new Ix("NO_PREFIX", i6);
    }

    public /* synthetic */ Ix(String str, int i) {
        this.f9652k = i;
        this.f9653l = str;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f9652k) {
            case 5:
                ((Ji) obj).H(this.f9653l);
                break;
            default:
                ((InterfaceC0764aj) obj).a(this.f9653l);
                break;
        }
    }

    public String toString() {
        switch (this.f9652k) {
            case 0:
                return this.f9653l;
            case 1:
                return this.f9653l;
            case 2:
                return this.f9653l;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        P2.o.f4767B.f4774g.i(this.f9653l, th);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
    }
}
