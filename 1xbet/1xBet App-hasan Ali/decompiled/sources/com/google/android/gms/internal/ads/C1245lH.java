package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.lH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245lH implements Y2 {

    /* renamed from: k, reason: collision with root package name */
    public int f14376k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14377l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14378m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14379n;

    /* renamed from: o, reason: collision with root package name */
    public Object f14380o;

    public C1245lH(S s2, C1529ro c1529ro, byte[] bArr, H2.j[] jVarArr, int i) {
        this.f14377l = s2;
        this.f14378m = c1529ro;
        this.f14379n = bArr;
        this.f14380o = jVarArr;
        this.f14376k = i;
    }

    public boolean a(C1245lH c1245lH, int i) {
        return c1245lH != null && Objects.equals(((KE[]) this.f14377l)[i], ((KE[]) c1245lH.f14377l)[i]) && Objects.equals(((InterfaceC1200kH[]) this.f14378m)[i], ((InterfaceC1200kH[]) c1245lH.f14378m)[i]);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x01fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x01fe. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    @Override // com.google.android.gms.internal.ads.Y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(C1617tm c1617tm) {
        int i;
        char c5;
        int i5;
        int i6;
        InterfaceC0874d3 u22;
        InterfaceC0874d3 u23;
        int i7;
        C0826c0 c0826c0;
        if (c1617tm.v() == 2) {
            C0740a3 c0740a3 = (C0740a3) this.f14380o;
            int i8 = 0;
            Kn kn = (Kn) c0740a3.f12619a.get(0);
            if ((c1617tm.v() & 128) != 0) {
                c1617tm.k(1);
                int z3 = c1617tm.z();
                int i9 = 3;
                c1617tm.k(3);
                C0826c0 c0826c02 = (C0826c0) this.f14377l;
                c1617tm.f(c0826c02.f12943b, 0, 2);
                c0826c02.s(0);
                c0826c02.u(3);
                int i10 = 13;
                c0740a3.f12631o = c0826c02.f(13);
                c1617tm.f(c0826c02.f12943b, 0, 2);
                c0826c02.s(0);
                int i11 = 4;
                c0826c02.u(4);
                int i12 = 12;
                c1617tm.k(c0826c02.f(12));
                SparseArray sparseArray = (SparseArray) this.f14378m;
                sparseArray.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14379n;
                sparseIntArray.clear();
                int o5 = c1617tm.o();
                while (true) {
                    SparseBooleanArray sparseBooleanArray = c0740a3.f12624g;
                    if (o5 > 0) {
                        int i13 = 5;
                        c1617tm.f(c0826c02.f12943b, i8, 5);
                        c0826c02.s(i8);
                        int f = c0826c02.f(8);
                        c0826c02.u(i9);
                        int f5 = c0826c02.f(i10);
                        c0826c02.u(i11);
                        int f6 = c0826c02.f(i12);
                        int i14 = c1617tm.f15725b;
                        int i15 = i14 + f6;
                        String str = null;
                        ArrayList arrayList = null;
                        int i16 = -1;
                        int i17 = 0;
                        while (c1617tm.f15725b < i15) {
                            int v4 = c1617tm.v();
                            int v5 = c1617tm.f15725b + c1617tm.v();
                            if (v5 > i15) {
                                C0826c0 c0826c03 = c0826c02;
                                c1617tm.j(i15);
                                G3 g32 = new G3(i16, str, i17, arrayList, Arrays.copyOfRange(c1617tm.f15724a, i14, i15));
                                String str2 = str;
                                if (f != 6 || f == 5) {
                                    f = i16;
                                }
                                o5 -= f6 + 5;
                                if (sparseBooleanArray.get(f5)) {
                                    C1529ro c1529ro = c0740a3.f12622d;
                                    if (f != 2) {
                                        i5 = 3;
                                        i = 4;
                                        if (f == 3 || f == 4) {
                                            c5 = 128;
                                            i6 = 0;
                                            u23 = new U2(new Q2(str2, g32.a()));
                                        } else {
                                            if (f == 21) {
                                                c5 = 128;
                                                i6 = 0;
                                                u22 = new U2(new E2());
                                            } else if (f == 27) {
                                                c5 = 128;
                                                i6 = 0;
                                                u22 = new U2(new M2(new C0905dr(c1529ro.m(g32))));
                                            } else if (f == 36) {
                                                c5 = 128;
                                                i6 = 0;
                                                u22 = new U2(new O2(new C0905dr(c1529ro.m(g32))));
                                            } else if (f == 45) {
                                                c5 = 128;
                                                i6 = 0;
                                                u22 = new U2(new R2());
                                            } else if (f == 89) {
                                                c5 = 128;
                                                i6 = 0;
                                                u22 = new U2(new E2((List) g32.f9166m));
                                            } else if (f == 172) {
                                                c5 = 128;
                                                i6 = 0;
                                                u23 = new U2(new A2(g32.a(), 1, str2));
                                            } else if (f != 257) {
                                                c5 = 128;
                                                if (f != 128) {
                                                    if (f != 129) {
                                                        if (f != 138) {
                                                            if (f != 139) {
                                                                switch (f) {
                                                                    case 15:
                                                                        i6 = 0;
                                                                        u23 = new U2(new C2(g32.a(), str2, false));
                                                                        break;
                                                                    case 16:
                                                                        u22 = new U2(new K2(new C0709Wb(c1529ro.m(g32))));
                                                                        i6 = 0;
                                                                        break;
                                                                    case 17:
                                                                        u22 = new U2(new P2(str2, g32.a()));
                                                                        i6 = 0;
                                                                        break;
                                                                    default:
                                                                        switch (f) {
                                                                            case 134:
                                                                                u22 = new Z2(new C0905dr("application/x-scte35", 4));
                                                                                i6 = 0;
                                                                                break;
                                                                            case 135:
                                                                                break;
                                                                            case 136:
                                                                                break;
                                                                            default:
                                                                                u22 = null;
                                                                                i6 = 0;
                                                                                break;
                                                                        }
                                                                }
                                                            } else {
                                                                i6 = 0;
                                                                u23 = new U2(new D2(g32.a(), 5408, str2));
                                                            }
                                                        }
                                                        i6 = 0;
                                                        u23 = new U2(new D2(g32.a(), 4096, str2));
                                                    }
                                                    i6 = 0;
                                                    u23 = new U2(new A2(g32.a(), 0, str2));
                                                }
                                            } else {
                                                c5 = 128;
                                                i6 = 0;
                                                u22 = new Z2(new C0905dr("application/vnd.dvb.ait", 4));
                                            }
                                            sparseIntArray.put(f5, f5);
                                            sparseArray.put(f5, u22);
                                        }
                                        u22 = u23;
                                        sparseIntArray.put(f5, f5);
                                        sparseArray.put(f5, u22);
                                    } else {
                                        i = 4;
                                        c5 = 128;
                                        i5 = 3;
                                    }
                                    i6 = 0;
                                    u22 = new U2(new H2(new C0709Wb(c1529ro.m(g32))));
                                    sparseIntArray.put(f5, f5);
                                    sparseArray.put(f5, u22);
                                } else {
                                    i = 4;
                                    c5 = 128;
                                    i5 = 3;
                                    i6 = 0;
                                }
                                i9 = i5;
                                i8 = i6;
                                i10 = 13;
                                i12 = 12;
                                i11 = i;
                                c0826c02 = c0826c03;
                            } else {
                                if (v4 == i13) {
                                    long D5 = c1617tm.D();
                                    if (D5 != 1094921523) {
                                        if (D5 != 1161904947) {
                                            if (D5 != 1094921524) {
                                                if (D5 == 1212503619) {
                                                    i7 = v5;
                                                    c0826c0 = c0826c02;
                                                    i16 = 36;
                                                }
                                                i7 = v5;
                                                c0826c0 = c0826c02;
                                            }
                                            i7 = v5;
                                            c0826c0 = c0826c02;
                                            i16 = 172;
                                        }
                                        c0826c0 = c0826c02;
                                        i16 = 135;
                                        i7 = v5;
                                    }
                                    i7 = v5;
                                    c0826c0 = c0826c02;
                                    i16 = 129;
                                } else {
                                    if (v4 != 106) {
                                        if (v4 != 122) {
                                            if (v4 == 127) {
                                                int v6 = c1617tm.v();
                                                if (v6 != 21) {
                                                    if (v6 == 14) {
                                                        i16 = 136;
                                                    } else if (v6 == 33) {
                                                        i7 = v5;
                                                        c0826c0 = c0826c02;
                                                        i16 = 139;
                                                    }
                                                    i7 = v5;
                                                    c0826c0 = c0826c02;
                                                }
                                                i7 = v5;
                                                c0826c0 = c0826c02;
                                                i16 = 172;
                                            } else if (v4 == 123) {
                                                i7 = v5;
                                                c0826c0 = c0826c02;
                                                i16 = 138;
                                            } else if (v4 == 10) {
                                                str = c1617tm.b(3, StandardCharsets.UTF_8).trim();
                                                i17 = c1617tm.v();
                                                i7 = v5;
                                                c0826c0 = c0826c02;
                                            } else if (v4 == 89) {
                                                ArrayList arrayList2 = new ArrayList();
                                                while (c1617tm.f15725b < v5) {
                                                    int i18 = v5;
                                                    String trim = c1617tm.b(3, StandardCharsets.UTF_8).trim();
                                                    c1617tm.v();
                                                    C0826c0 c0826c04 = c0826c02;
                                                    byte[] bArr = new byte[4];
                                                    c1617tm.f(bArr, 0, 4);
                                                    arrayList2.add(new C0785b3(trim, bArr));
                                                    v5 = i18;
                                                    c0826c02 = c0826c04;
                                                }
                                                i7 = v5;
                                                c0826c0 = c0826c02;
                                                arrayList = arrayList2;
                                                i16 = 89;
                                            } else {
                                                i7 = v5;
                                                c0826c0 = c0826c02;
                                                if (v4 == 111) {
                                                    i16 = 257;
                                                }
                                            }
                                        }
                                        c0826c0 = c0826c02;
                                        i16 = 135;
                                        i7 = v5;
                                    }
                                    i7 = v5;
                                    c0826c0 = c0826c02;
                                    i16 = 129;
                                }
                                c1617tm.k(i7 - c1617tm.f15725b);
                                i13 = 5;
                                c0826c02 = c0826c0;
                            }
                        }
                        C0826c0 c0826c032 = c0826c02;
                        c1617tm.j(i15);
                        G3 g322 = new G3(i16, str, i17, arrayList, Arrays.copyOfRange(c1617tm.f15724a, i14, i15));
                        String str22 = str;
                        if (f != 6) {
                        }
                        f = i16;
                        o5 -= f6 + 5;
                        if (sparseBooleanArray.get(f5)) {
                        }
                        i9 = i5;
                        i8 = i6;
                        i10 = 13;
                        i12 = 12;
                        i11 = i;
                        c0826c02 = c0826c032;
                    } else {
                        int size = sparseIntArray.size();
                        while (true) {
                            SparseArray sparseArray2 = c0740a3.f;
                            if (i8 >= size) {
                                sparseArray2.remove(this.f14376k);
                                c0740a3.f12627k.v();
                                c0740a3.f12628l = true;
                                return;
                            }
                            int keyAt = sparseIntArray.keyAt(i8);
                            int valueAt = sparseIntArray.valueAt(i8);
                            sparseBooleanArray.put(keyAt, true);
                            c0740a3.f12625h.put(valueAt, true);
                            InterfaceC0874d3 interfaceC0874d3 = (InterfaceC0874d3) sparseArray.valueAt(i8);
                            if (interfaceC0874d3 != null) {
                                interfaceC0874d3.b(kn, c0740a3.f12627k, new C0829c3(z3, keyAt, 8192));
                                sparseArray2.put(valueAt, interfaceC0874d3);
                            }
                            i8++;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r8 < r0.f12726l) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(long j5, C1617tm c1617tm) {
        int i = this.f14376k;
        if (i != 0) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f14380o;
            if (i != -1 && priorityQueue.size() >= this.f14376k) {
                C0774at c0774at = (C0774at) priorityQueue.peek();
                int i5 = AbstractC1260lo.f14419a;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.f14379n;
            C0774at c0774at2 = arrayDeque.isEmpty() ? new C0774at() : (C0774at) arrayDeque.poll();
            long andIncrement = ((AtomicLong) this.f14378m).getAndIncrement();
            c0774at2.getClass();
            AbstractC1668us.a0(j5 != -9223372036854775807L);
            c0774at2.f12726l = j5;
            c0774at2.f12727m = andIncrement;
            int o5 = c1617tm.o();
            C1617tm c1617tm2 = c0774at2.f12725k;
            c1617tm2.g(o5);
            System.arraycopy(c1617tm.f15724a, c1617tm.f15725b, c1617tm2.f15724a, 0, c1617tm.o());
            priorityQueue.add(c0774at2);
            int i6 = this.f14376k;
            if (i6 != -1) {
                f(i6);
                return;
            }
            return;
        }
        ((Mt) this.f14377l).j(j5, c1617tm);
    }

    public boolean e(int i) {
        return ((KE[]) this.f14377l)[i] != null;
    }

    public void f(int i) {
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f14380o;
            if (priorityQueue.size() <= i) {
                return;
            }
            C0774at c0774at = (C0774at) priorityQueue.poll();
            int i5 = AbstractC1260lo.f14419a;
            ((Mt) this.f14377l).j(c0774at.f12726l, c0774at.f12725k);
            ((ArrayDeque) this.f14379n).push(c0774at);
        }
    }

    public synchronized void g(C1172jq c1172jq) {
        ((ArrayDeque) this.f14379n).add(c1172jq);
    }

    public synchronized void h() {
        InterfaceC1443pr interfaceC1443pr;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.S5)).booleanValue() && !P2.o.f4767B.f4774g.d().t().f7601j) {
            ((ArrayDeque) this.f14379n).clear();
            return;
        }
        if (i()) {
            while (!((ArrayDeque) this.f14379n).isEmpty()) {
                C1172jq c1172jq = (C1172jq) ((ArrayDeque) this.f14379n).pollFirst();
                if (c1172jq == null || ((interfaceC1443pr = c1172jq.f14170g) != null && ((C0905dr) this.f14377l).H(interfaceC1443pr))) {
                    Fs fs = new Fs((C0905dr) this.f14377l, (Dp) this.f14378m, c1172jq);
                    this.f14380o = fs;
                    fs.b(new C1667ur(0, this, c1172jq));
                    return;
                }
            }
        }
    }

    public synchronized boolean i() {
        return ((Fs) this.f14380o) == null;
    }

    public C1245lH(C0740a3 c0740a3, int i) {
        this.f14380o = c0740a3;
        this.f14377l = new C0826c0(5, new byte[5]);
        this.f14378m = new SparseArray();
        this.f14379n = new SparseIntArray();
        this.f14376k = i;
    }

    public C1245lH(C0905dr c0905dr, C1085hr c1085hr, Dp dp) {
        this.f14376k = 1;
        this.f14377l = c0905dr;
        this.f14378m = dp;
        this.f14379n = new ArrayDeque();
        c1085hr.f13810a = new Dp(3, this);
    }

    public C1245lH(Mt mt) {
        this.f14378m = new AtomicLong();
        this.f14377l = mt;
        this.f14379n = new ArrayDeque();
        this.f14380o = new PriorityQueue();
        this.f14376k = -1;
    }

    public C1245lH(KE[] keArr, InterfaceC1200kH[] interfaceC1200kHArr, C0981fd c0981fd, C0375o c0375o) {
        int length = keArr.length;
        AbstractC1668us.S(length == interfaceC1200kHArr.length);
        this.f14377l = keArr;
        this.f14378m = (InterfaceC1200kH[]) interfaceC1200kHArr.clone();
        this.f14379n = c0981fd;
        this.f14380o = c0375o;
        this.f14376k = length;
    }

    @Override // com.google.android.gms.internal.ads.Y2
    public void b(Kn kn, H h3, C0829c3 c0829c3) {
    }
}
