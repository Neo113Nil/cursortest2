package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class P implements P1 {

    /* renamed from: k, reason: collision with root package name */
    public final C1617tm f11017k;

    public P(int i) {
        switch (i) {
            case 1:
                this.f11017k = new C1617tm();
                break;
            default:
                this.f11017k = new C1617tm(10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5 a(B b3, C1543s1 c1543s1) {
        J0 j02;
        boolean z3;
        int i = 10;
        C1617tm c1617tm = this.f11017k;
        int i5 = 0;
        C5 c5 = null;
        while (true) {
            try {
                b3.G(c1617tm.f15724a, 0, i, false);
                c1617tm.j(0);
                if (c1617tm.x() != 4801587) {
                    break;
                }
                c1617tm.k(3);
                int u5 = c1617tm.u();
                int i6 = u5 + 10;
                if (c5 == null) {
                    byte[] bArr = new byte[i6];
                    System.arraycopy(c1617tm.f15724a, 0, bArr, 0, i);
                    b3.G(bArr, i, u5, false);
                    ArrayList arrayList = new ArrayList();
                    C1617tm c1617tm2 = new C1617tm(i6, bArr);
                    if (c1617tm2.o() < i) {
                        JB.l("Id3Decoder", "Data too short to be an ID3 tag");
                    } else {
                        int x5 = c1617tm2.x();
                        if (x5 != 4801587) {
                            JB.l("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(x5))));
                        } else {
                            int v4 = c1617tm2.v();
                            c1617tm2.k(1);
                            int v5 = c1617tm2.v();
                            int u6 = c1617tm2.u();
                            if (v4 == 2) {
                                if ((v5 & 64) != 0) {
                                    JB.l("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                }
                                j02 = new J0(v4, u6, v4 >= 4 && (v5 & 128) != 0);
                            } else {
                                if (v4 == 3) {
                                    if ((v5 & 64) != 0) {
                                        int q5 = c1617tm2.q();
                                        c1617tm2.k(q5);
                                        u6 -= q5 + 4;
                                    }
                                } else if (v4 == 4) {
                                    if ((v5 & 64) != 0) {
                                        int u7 = c1617tm2.u();
                                        c1617tm2.k(u7 - 4);
                                        u6 -= u7;
                                    }
                                    if ((v5 & 16) != 0) {
                                        u6 -= 10;
                                    }
                                } else {
                                    AbstractC0467k.y(v4, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                                }
                                j02 = new J0(v4, u6, v4 >= 4 && (v5 & 128) != 0);
                            }
                            if (j02 != null) {
                                int i7 = c1617tm2.f15725b;
                                int i8 = j02.f9660a;
                                int i9 = i8 == 2 ? 6 : 10;
                                boolean z5 = j02.f9661b;
                                int i10 = j02.f9662c;
                                if (z5) {
                                    i10 = AbstractC1561sb.j(i10, c1617tm2);
                                }
                                c1617tm2.i(i7 + i10);
                                if (AbstractC1561sb.o(c1617tm2, i8, i9, false)) {
                                    z3 = false;
                                } else if (i8 == 4 && AbstractC1561sb.o(c1617tm2, 4, i9, true)) {
                                    z3 = true;
                                } else {
                                    AbstractC0467k.y(i8, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                                }
                                while (c1617tm2.o() >= i9) {
                                    K0 p5 = AbstractC1561sb.p(i8, c1617tm2, z3, c1543s1);
                                    if (p5 != null) {
                                        arrayList.add(p5);
                                    }
                                }
                                c5 = new C5(arrayList);
                            }
                            c5 = null;
                        }
                    }
                    j02 = null;
                    if (j02 != null) {
                    }
                    c5 = null;
                } else {
                    b3.g(u5, false);
                }
                i5 += i6;
                i = 10;
            } catch (EOFException unused) {
            }
        }
        b3.f7754p = 0;
        b3.g(i5, false);
        return c5;
    }

    @Override // com.google.android.gms.internal.ads.P1
    public void f(byte[] bArr, int i, int i5, Q1 q12) {
        C1881zg a5;
        C1617tm c1617tm = this.f11017k;
        c1617tm.h(i + i5, bArr);
        c1617tm.j(i);
        ArrayList arrayList = new ArrayList();
        while (c1617tm.o() > 0) {
            AbstractC1668us.W("Incomplete Mp4Webvtt Top Level box header found.", c1617tm.o() >= 8);
            int q5 = c1617tm.q() - 8;
            if (c1617tm.q() == 1987343459) {
                CharSequence charSequence = null;
                C0895dg c0895dg = null;
                while (q5 > 0) {
                    AbstractC1668us.W("Incomplete vtt cue box header found.", q5 >= 8);
                    int q6 = c1617tm.q();
                    int q7 = c1617tm.q();
                    int i6 = q5 - 8;
                    int i7 = q6 - 8;
                    byte[] bArr2 = c1617tm.f15724a;
                    int i8 = c1617tm.f15725b;
                    int i9 = AbstractC1260lo.f14419a;
                    String str = new String(bArr2, i8, i7, StandardCharsets.UTF_8);
                    c1617tm.k(i7);
                    if (q7 == 1937011815) {
                        C1769x2 c1769x2 = new C1769x2();
                        AbstractC1814y2.f(str, c1769x2);
                        c0895dg = c1769x2.a();
                    } else if (q7 == 1885436268) {
                        charSequence = AbstractC1814y2.a(null, str.trim(), Collections.EMPTY_LIST);
                    }
                    q5 = i6 - i7;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c0895dg != null) {
                    c0895dg.f13128a = charSequence;
                    a5 = c0895dg.a();
                } else {
                    C1769x2 c1769x22 = new C1769x2();
                    c1769x22.f16214c = charSequence;
                    a5 = c1769x22.a().a();
                }
                arrayList.add(a5);
            } else {
                c1617tm.k(q5);
            }
        }
        q12.mo11k(new L1(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
