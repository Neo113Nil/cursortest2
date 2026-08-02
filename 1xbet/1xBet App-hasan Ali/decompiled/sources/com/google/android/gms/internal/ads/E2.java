package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class E2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8450a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8451b;

    /* renamed from: c, reason: collision with root package name */
    public long f8452c;

    /* renamed from: d, reason: collision with root package name */
    public int f8453d;

    /* renamed from: e, reason: collision with root package name */
    public int f8454e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8455g;

    public E2() {
        this.f8450a = 1;
        this.f = new C1617tm(10);
        this.f8452c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        switch (this.f8450a) {
            case 0:
                this.f8451b = false;
                this.f8452c = -9223372036854775807L;
                break;
            default:
                this.f8451b = false;
                this.f8452c = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void c(C1617tm c1617tm) {
        boolean z3;
        boolean z5;
        switch (this.f8450a) {
            case 0:
                if (this.f8451b) {
                    int i = 0;
                    if (this.f8453d == 2) {
                        if (c1617tm.o() == 0) {
                            z5 = false;
                        } else {
                            if (c1617tm.v() != 32) {
                                this.f8451b = false;
                            }
                            this.f8453d--;
                            z5 = this.f8451b;
                        }
                        if (!z5) {
                        }
                    }
                    if (this.f8453d == 1) {
                        if (c1617tm.o() == 0) {
                            z3 = false;
                        } else {
                            if (c1617tm.v() != 0) {
                                this.f8451b = false;
                            }
                            this.f8453d--;
                            z3 = this.f8451b;
                        }
                        if (!z3) {
                        }
                    }
                    int i5 = c1617tm.f15725b;
                    int o5 = c1617tm.o();
                    while (true) {
                        InterfaceC0737a0[] interfaceC0737a0Arr = (InterfaceC0737a0[]) this.f8455g;
                        if (i >= interfaceC0737a0Arr.length) {
                            this.f8454e += o5;
                            break;
                        } else {
                            InterfaceC0737a0 interfaceC0737a0 = interfaceC0737a0Arr[i];
                            c1617tm.j(i5);
                            interfaceC0737a0.c(o5, c1617tm);
                            i++;
                        }
                    }
                }
                break;
            default:
                AbstractC1668us.F((InterfaceC0737a0) this.f8455g);
                if (this.f8451b) {
                    int o6 = c1617tm.o();
                    int i6 = this.f8454e;
                    if (i6 < 10) {
                        int min = Math.min(o6, 10 - i6);
                        byte[] bArr = c1617tm.f15724a;
                        int i7 = c1617tm.f15725b;
                        C1617tm c1617tm2 = (C1617tm) this.f;
                        System.arraycopy(bArr, i7, c1617tm2.f15724a, this.f8454e, min);
                        if (this.f8454e + min == 10) {
                            c1617tm2.j(0);
                            if (c1617tm2.v() != 73 || c1617tm2.v() != 68 || c1617tm2.v() != 51) {
                                JB.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f8451b = false;
                                break;
                            } else {
                                c1617tm2.k(3);
                                this.f8453d = c1617tm2.u() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(o6, this.f8453d - this.f8454e);
                    ((InterfaceC0737a0) this.f8455g).c(min2, c1617tm);
                    this.f8454e += min2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
        int i;
        switch (this.f8450a) {
            case 0:
                if (this.f8451b) {
                    AbstractC1668us.a0(this.f8452c != -9223372036854775807L);
                    int i5 = 0;
                    while (true) {
                        InterfaceC0737a0[] interfaceC0737a0Arr = (InterfaceC0737a0[]) this.f8455g;
                        if (i5 >= interfaceC0737a0Arr.length) {
                            this.f8451b = false;
                            break;
                        } else {
                            interfaceC0737a0Arr[i5].d(this.f8452c, 1, this.f8454e, 0, null);
                            i5++;
                        }
                    }
                }
                break;
            default:
                AbstractC1668us.F((InterfaceC0737a0) this.f8455g);
                if (this.f8451b && (i = this.f8453d) != 0 && this.f8454e == i) {
                    AbstractC1668us.a0(this.f8452c != -9223372036854775807L);
                    ((InterfaceC0737a0) this.f8455g).d(this.f8452c, 1, this.f8453d, 0, null);
                    this.f8451b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        switch (this.f8450a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC0737a0[] interfaceC0737a0Arr = (InterfaceC0737a0[]) this.f8455g;
                    if (i >= interfaceC0737a0Arr.length) {
                        break;
                    } else {
                        C0785b3 c0785b3 = (C0785b3) ((List) this.f).get(i);
                        c0829c3.a();
                        c0829c3.b();
                        InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 3);
                        C1649uH c1649uH = new C1649uH();
                        c0829c3.b();
                        c1649uH.f15839a = c0829c3.f12966e;
                        c1649uH.c("application/dvbsubs");
                        c1649uH.f15851o = Collections.singletonList(c0785b3.f12760b);
                        c1649uH.f15842d = c0785b3.f12759a;
                        w5.e(new C1407p(c1649uH));
                        interfaceC0737a0Arr[i] = w5;
                        i++;
                    }
                }
            default:
                c0829c3.a();
                c0829c3.b();
                InterfaceC0737a0 w6 = h3.w(c0829c3.f12965d, 5);
                this.f8455g = w6;
                C1649uH c1649uH2 = new C1649uH();
                c0829c3.b();
                c1649uH2.f15839a = c0829c3.f12966e;
                c1649uH2.c("application/id3");
                w6.e(new C1407p(c1649uH2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        switch (this.f8450a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f8451b = true;
                    this.f8452c = j5;
                    this.f8454e = 0;
                    this.f8453d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f8451b = true;
                    this.f8452c = j5;
                    this.f8453d = 0;
                    this.f8454e = 0;
                    break;
                }
                break;
        }
    }

    public E2(List list) {
        this.f8450a = 0;
        this.f = list;
        this.f8455g = new InterfaceC0737a0[list.size()];
        this.f8452c = -9223372036854775807L;
    }
}
