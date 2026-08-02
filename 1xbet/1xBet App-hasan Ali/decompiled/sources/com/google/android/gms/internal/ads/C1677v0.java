package com.google.android.gms.internal.ads;

import B.C0072a;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.gms.internal.ads.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677v0 implements F {

    /* renamed from: b, reason: collision with root package name */
    public HG f15946b;

    /* renamed from: c, reason: collision with root package name */
    public int f15947c;

    /* renamed from: d, reason: collision with root package name */
    public int f15948d;

    /* renamed from: e, reason: collision with root package name */
    public int f15949e;

    /* renamed from: g, reason: collision with root package name */
    public R0 f15950g;

    /* renamed from: h, reason: collision with root package name */
    public B f15951h;
    public E4.a i;

    /* renamed from: j, reason: collision with root package name */
    public C1633u1 f15952j;

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f15945a = new C1617tm(6);
    public long f = -1;

    public final int a(B b3) {
        C1617tm c1617tm = this.f15945a;
        c1617tm.g(2);
        b3.G(c1617tm.f15724a, 0, 2, false);
        return c1617tm.z();
    }

    public final void b() {
        HG hg = this.f15946b;
        hg.getClass();
        hg.v();
        this.f15946b.x(new J(-9223372036854775807L, 0L));
        this.f15947c = 6;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        if (j5 == 0) {
            this.f15947c = 0;
            this.f15952j = null;
        } else if (this.f15947c == 5) {
            C1633u1 c1633u1 = this.f15952j;
            c1633u1.getClass();
            c1633u1.d(j5, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        B b3 = (B) g5;
        if (a(b3) == 65496) {
            int a5 = a(b3);
            this.f15948d = a5;
            C1617tm c1617tm = this.f15945a;
            if (a5 == 65504) {
                c1617tm.g(2);
                B b5 = (B) g5;
                b5.G(c1617tm.f15724a, 0, 2, false);
                b5.g(c1617tm.z() - 2, false);
                a5 = a(b3);
                this.f15948d = a5;
            }
            if (a5 == 65505) {
                B b6 = (B) g5;
                b6.g(2, false);
                c1617tm.g(6);
                b6.G(c1617tm.f15724a, 0, 6, false);
                if (c1617tm.D() == 1165519206 && c1617tm.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0197, code lost:
    
        if (r2 == r17) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0199, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0236  */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        String G5;
        long j5;
        E4.a aVar;
        C1761wv c1761wv;
        int i;
        int i5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        XmlPullParser newPullParser;
        long j11;
        C1761wv c1761wv2;
        long j12;
        int i6 = this.f15947c;
        C1617tm c1617tm = this.f15945a;
        long j13 = -1;
        if (i6 == 0) {
            c1617tm.g(2);
            ((B) g5).F(c1617tm.f15724a, 0, 2, false);
            int z3 = c1617tm.z();
            this.f15948d = z3;
            if (z3 == 65498) {
                if (this.f != -1) {
                    this.f15947c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((z3 < 65488 || z3 > 65497) && z3 != 65281) {
                this.f15947c = 1;
            }
            return 0;
        }
        if (i6 == 1) {
            c1617tm.g(2);
            ((B) g5).F(c1617tm.f15724a, 0, 2, false);
            this.f15949e = c1617tm.z() - 2;
            this.f15947c = 2;
            return 0;
        }
        long j14 = -9223372036854775807L;
        if (i6 != 2) {
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || g5 != this.f15951h) {
                    B b3 = (B) g5;
                    this.f15951h = b3;
                    this.i = new E4.a(b3, this.f);
                }
                C1633u1 c1633u1 = this.f15952j;
                c1633u1.getClass();
                int f = c1633u1.f(this.i, c0072a);
                if (f == 1) {
                    c0072a.f658a += this.f;
                }
                return f;
            }
            long j15 = ((B) g5).f7752n;
            long j16 = this.f;
            if (j15 != j16) {
                c0072a.f658a = j16;
                return 1;
            }
            B b5 = (B) g5;
            if (!b5.G(c1617tm.f15724a, 0, 1, true)) {
                b();
                return 0;
            }
            b5.f7754p = 0;
            if (this.f15952j == null) {
                this.f15952j = new C1633u1(O1.f, 8);
            }
            E4.a aVar2 = new E4.a(b5, this.f);
            this.i = aVar2;
            if (!this.f15952j.e(aVar2)) {
                b();
                return 0;
            }
            C1633u1 c1633u12 = this.f15952j;
            long j17 = this.f;
            HG hg = this.f15946b;
            hg.getClass();
            c1633u12.h(new E4.a(j17, hg));
            R0 r02 = this.f15950g;
            r02.getClass();
            HG hg2 = this.f15946b;
            hg2.getClass();
            InterfaceC0737a0 w5 = hg2.w(1024, 4);
            C1649uH c1649uH = new C1649uH();
            c1649uH.f15847k = AbstractC1593t6.e("image/jpeg");
            c1649uH.f15846j = new C5(-9223372036854775807L, r02);
            w5.e(new C1407p(c1649uH));
            this.f15947c = 5;
            return 0;
        }
        if (this.f15948d == 65505) {
            C1617tm c1617tm2 = new C1617tm(this.f15949e);
            ((B) g5).F(c1617tm2.f15724a, 0, this.f15949e, false);
            if (this.f15950g == null && "http://ns.adobe.com/xap/1.0/".equals(c1617tm2.G()) && (G5 = c1617tm2.G()) != null) {
                long j18 = ((B) g5).f7751m;
                R0 r03 = null;
                if (j18 != -1) {
                    try {
                        newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                    } catch (B7 | NumberFormatException | XmlPullParserException unused) {
                    }
                    try {
                        newPullParser.setInput(new StringReader(G5));
                        newPullParser.next();
                    } catch (B7 | NumberFormatException | XmlPullParserException unused2) {
                        j5 = j13;
                        JB.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        aVar = null;
                        if (aVar != null) {
                            boolean z5 = false;
                            j6 = j5;
                            j7 = j6;
                            j8 = j7;
                            j9 = j8;
                            while (i5 >= 0) {
                            }
                            if (j8 != j5) {
                                r03 = new R0(j6, j7, aVar.f1485k, j8, j9);
                            }
                        }
                        this.f15950g = r03;
                        if (r03 != null) {
                        }
                        this.f15947c = 0;
                        return 0;
                    }
                    try {
                    } catch (B7 | NumberFormatException | XmlPullParserException unused3) {
                        JB.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        aVar = null;
                        if (aVar != null) {
                        }
                        this.f15950g = r03;
                        if (r03 != null) {
                        }
                        this.f15947c = 0;
                        return 0;
                    }
                    if (!AbstractC1803xs.H(newPullParser, "x:xmpmeta")) {
                        throw B7.a(null, "Couldn't find xmp metadata");
                    }
                    C0954ev c0954ev = AbstractC1044gv.f13676l;
                    C1761wv c1761wv3 = C1761wv.f16184o;
                    long j19 = -9223372036854775807L;
                    loop0: while (true) {
                        newPullParser.next();
                        if (AbstractC1803xs.H(newPullParser, "rdf:Description")) {
                            String[] strArr = JB.f9903p;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= 4) {
                                    j5 = j13;
                                    break loop0;
                                }
                                j5 = j13;
                                String h3 = AbstractC1803xs.h(newPullParser, strArr[i7]);
                                if (h3 == null) {
                                    i7++;
                                    j13 = j5;
                                    j14 = -9223372036854775807L;
                                } else {
                                    if (Integer.parseInt(h3) != 1) {
                                        break;
                                    }
                                    String[] strArr2 = JB.f9904q;
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= 4) {
                                            break;
                                        }
                                        String h4 = AbstractC1803xs.h(newPullParser, strArr2[i8]);
                                        if (h4 != null) {
                                            j11 = Long.parseLong(h4);
                                        } else {
                                            i8++;
                                        }
                                    }
                                    String[] strArr3 = JB.f9905r;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= 2) {
                                            c1761wv2 = C1761wv.f16184o;
                                            break;
                                        }
                                        String h5 = AbstractC1803xs.h(newPullParser, strArr3[i9]);
                                        if (h5 != null) {
                                            c1761wv2 = AbstractC1044gv.o(new C1722w0(0L, 0L, "image/jpeg"), new C1722w0(Long.parseLong(h5), 0L, "video/mp4"));
                                            break;
                                        }
                                        i9++;
                                    }
                                    j12 = j11;
                                    c1761wv3 = c1761wv2;
                                }
                            }
                        } else {
                            if (AbstractC1803xs.H(newPullParser, "Container:Directory")) {
                                c1761wv3 = JB.b(newPullParser, "Container", "Item");
                            } else if (AbstractC1803xs.H(newPullParser, "GContainer:Directory")) {
                                c1761wv3 = JB.b(newPullParser, "GContainer", "GContainerItem");
                            }
                            j12 = j19;
                            j5 = j13;
                        }
                        long j20 = j12;
                        if (!AbstractC1803xs.z(newPullParser, "x:xmpmeta")) {
                            long j21 = j5;
                            j19 = j20;
                            j13 = j21;
                            j14 = -9223372036854775807L;
                        } else if (!c1761wv3.isEmpty()) {
                            aVar = new E4.a(j20, c1761wv3);
                        }
                    }
                    aVar = null;
                    if (aVar != null && (i = (c1761wv = (C1761wv) aVar.f1486l).f16186n) >= 2) {
                        boolean z52 = false;
                        j6 = j5;
                        j7 = j6;
                        j8 = j7;
                        j9 = j8;
                        for (i5 = i - 1; i5 >= 0; i5--) {
                            C1722w0 c1722w0 = (C1722w0) c1761wv.get(i5);
                            z52 |= "video/mp4".equals(c1722w0.f16080a);
                            if (i5 == 0) {
                                j18 -= c1722w0.f16082c;
                                j10 = 0;
                            } else {
                                j10 = j18 - c1722w0.f16081b;
                            }
                            long j22 = j18;
                            j18 = j10;
                            if (z52 && j18 != j22) {
                                j9 = j22 - j18;
                                z52 = false;
                                j8 = j18;
                            }
                            if (i5 == 0) {
                                j7 = j22;
                            }
                            if (i5 == 0) {
                                j6 = j18;
                            }
                        }
                        if (j8 != j5 && j9 != j5 && j6 != j5 && j7 != j5) {
                            r03 = new R0(j6, j7, aVar.f1485k, j8, j9);
                        }
                    }
                }
                this.f15950g = r03;
                if (r03 != null) {
                    this.f = r03.f11299n;
                }
            }
        } else {
            ((B) g5).k(this.f15949e);
        }
        this.f15947c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        this.f15946b = (HG) h3;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
