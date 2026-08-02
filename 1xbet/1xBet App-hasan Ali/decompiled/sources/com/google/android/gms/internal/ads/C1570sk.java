package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1570sk implements Cif {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15590k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1750wk f15591l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0677Re f15592m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1548s6 f15593n;

    public /* synthetic */ C1570sk(C1750wk c1750wk, InterfaceC0677Re interfaceC0677Re, C1548s6 c1548s6, int i) {
        this.f15590k = i;
        this.f15591l = c1750wk;
        this.f15592m = interfaceC0677Re;
        this.f15593n = c1548s6;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void n(String str, int i, String str2, boolean z3) {
        switch (this.f15590k) {
            case 0:
                C1750wk c1750wk = this.f15591l;
                c1750wk.getClass();
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8749Q3)).booleanValue();
                C1548s6 c1548s6 = this.f15593n;
                Wq wq = c1750wk.f16144a;
                InterfaceC0677Re interfaceC0677Re = this.f15592m;
                if (!booleanValue) {
                    Q2.V0 v02 = wq.f12095a;
                    if (v02 != null && interfaceC0677Re.s() != null) {
                        interfaceC0677Re.s().w3(v02);
                    }
                    c1548s6.d();
                    break;
                } else if (!z3) {
                    c1548s6.c(new C0858co("Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2, 1));
                    break;
                } else {
                    Q2.V0 v03 = wq.f12095a;
                    if (v03 != null && interfaceC0677Re.s() != null) {
                        interfaceC0677Re.s().w3(v03);
                    }
                    c1548s6.d();
                    break;
                }
                break;
            default:
                C1548s6 c1548s62 = this.f15593n;
                C1750wk c1750wk2 = this.f15591l;
                if (!z3) {
                    c1750wk2.getClass();
                    c1548s62.c(new C0858co("Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2, 1));
                    break;
                } else {
                    Q2.V0 v04 = c1750wk2.f16144a.f12095a;
                    if (v04 != null) {
                        InterfaceC0677Re interfaceC0677Re2 = this.f15592m;
                        if (interfaceC0677Re2.s() != null) {
                            interfaceC0677Re2.s().w3(v04);
                        }
                    }
                    c1548s62.d();
                    break;
                }
        }
    }
}
