package l0;

import A.B;
import A.v;
import a.AbstractC0444a;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import h0.C1988b;
import h0.C1989c;
import h0.C1991e;
import i0.C;
import i0.C1994A;
import i0.C1995B;
import i0.C2003h;
import i0.D;
import java.util.Locale;
import k0.AbstractC2024d;
import k0.C2022b;
import k0.InterfaceC2025e;
import r.C2322H;
import r.P;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2043d f17665a;
    public Outline f;

    /* renamed from: j, reason: collision with root package name */
    public float f17672j;

    /* renamed from: k, reason: collision with root package name */
    public D f17673k;

    /* renamed from: l, reason: collision with root package name */
    public C2003h f17674l;

    /* renamed from: m, reason: collision with root package name */
    public C2003h f17675m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17676n;

    /* renamed from: o, reason: collision with root package name */
    public C2022b f17677o;

    /* renamed from: p, reason: collision with root package name */
    public J2.b f17678p;

    /* renamed from: q, reason: collision with root package name */
    public int f17679q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17681s;

    /* renamed from: t, reason: collision with root package name */
    public long f17682t;

    /* renamed from: u, reason: collision with root package name */
    public long f17683u;

    /* renamed from: v, reason: collision with root package name */
    public long f17684v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17685w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f17686x;

    /* renamed from: b, reason: collision with root package name */
    public W0.c f17666b = AbstractC2024d.f17545a;

    /* renamed from: c, reason: collision with root package name */
    public W0.m f17667c = W0.m.f6016k;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f17668d = C2040a.f17662m;

    /* renamed from: e, reason: collision with root package name */
    public final B f17669e = new B(25, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f17670g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f17671h = 0;
    public long i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final v f17680r = new v();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e("toLowerCase(...)", lowerCase);
        lowerCase.equals("robolectric");
    }

    public C2041b(InterfaceC2043d interfaceC2043d) {
        this.f17665a = interfaceC2043d;
        interfaceC2043d.u(false);
        this.f17682t = 0L;
        this.f17683u = 0L;
        this.f17684v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f17670g) {
            boolean z3 = this.f17685w;
            InterfaceC2043d interfaceC2043d = this.f17665a;
            Outline outline2 = null;
            if (z3 || interfaceC2043d.F() > 0.0f) {
                C2003h c2003h = this.f17674l;
                if (c2003h != null) {
                    RectF rectF = this.f17686x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f17686x = rectF;
                    }
                    Path path = c2003h.f17279a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f17676n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f17676n = true;
                        outline = null;
                    }
                    this.f17674l = c2003h;
                    if (outline != null) {
                        outline.setAlpha(interfaceC2043d.a());
                        outline2 = outline;
                    }
                    interfaceC2043d.m(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f17676n && this.f17685w) {
                        interfaceC2043d.u(false);
                        interfaceC2043d.r();
                    } else {
                        interfaceC2043d.u(this.f17685w);
                    }
                } else {
                    interfaceC2043d.u(this.f17685w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long d02 = AbstractC0444a.d0(this.f17683u);
                    long j5 = this.f17671h;
                    long j6 = this.i;
                    if (j6 != 9205357640488583168L) {
                        d02 = j6;
                    }
                    int i5 = (int) (j5 >> 32);
                    int i6 = (int) (j5 & 4294967295L);
                    int i7 = (int) (d02 >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i5)), Math.round(Float.intBitsToFloat(i6)), Math.round(Float.intBitsToFloat(i7) + Float.intBitsToFloat(i5)), Math.round(Float.intBitsToFloat((int) (d02 & 4294967295L)) + Float.intBitsToFloat(i6)), this.f17672j);
                    outline5.setAlpha(interfaceC2043d.a());
                    interfaceC2043d.m(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i7)) << 32));
                }
            } else {
                interfaceC2043d.u(false);
                interfaceC2043d.m(null, 0L);
            }
        }
        this.f17670g = false;
    }

    public final void b() {
        if (this.f17681s && this.f17679q == 0) {
            v vVar = this.f17680r;
            C2041b c2041b = (C2041b) vVar.f133b;
            if (c2041b != null) {
                c2041b.e();
                vVar.f133b = null;
            }
            C2322H c2322h = (C2322H) vVar.f135d;
            if (c2322h != null) {
                Object[] objArr = c2322h.f18934b;
                long[] jArr = c2322h.f18933a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j5 = jArr[i];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j5) < 128) {
                                    ((C2041b) objArr[(i << 3) + i6]).e();
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                c2322h.b();
            }
            this.f17665a.r();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [i4.c, kotlin.jvm.internal.m] */
    public final void c(InterfaceC2025e interfaceC2025e) {
        v vVar = this.f17680r;
        vVar.f134c = (C2041b) vVar.f133b;
        C2322H c2322h = (C2322H) vVar.f135d;
        if (c2322h != null && c2322h.h()) {
            C2322H c2322h2 = (C2322H) vVar.f136e;
            if (c2322h2 == null) {
                int i = P.f18958a;
                c2322h2 = new C2322H();
                vVar.f136e = c2322h2;
            }
            c2322h2.j(c2322h);
            c2322h.b();
        }
        vVar.f132a = true;
        this.f17668d.c(interfaceC2025e);
        vVar.f132a = false;
        C2041b c2041b = (C2041b) vVar.f134c;
        if (c2041b != null) {
            c2041b.e();
        }
        C2322H c2322h3 = (C2322H) vVar.f136e;
        if (c2322h3 == null || !c2322h3.h()) {
            return;
        }
        Object[] objArr = c2322h3.f18934b;
        long[] jArr = c2322h3.f18933a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            ((C2041b) objArr[(i5 << 3) + i7]).e();
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        c2322h3.b();
    }

    public final D d() {
        D c1995b;
        D d5 = this.f17673k;
        C2003h c2003h = this.f17674l;
        if (d5 != null) {
            return d5;
        }
        if (c2003h != null) {
            C1994A c1994a = new C1994A(c2003h);
            this.f17673k = c1994a;
            return c1994a;
        }
        long d02 = AbstractC0444a.d0(this.f17683u);
        long j5 = this.f17671h;
        long j6 = this.i;
        if (j6 != 9205357640488583168L) {
            d02 = j6;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d02 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d02 & 4294967295L)) + intBitsToFloat2;
        if (this.f17672j > 0.0f) {
            c1995b = new C(N4.b.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            c1995b = new C1995B(new C1989c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f17673k = c1995b;
        return c1995b;
    }

    public final void e() {
        this.f17679q--;
        b();
    }

    public final void f(float f, long j5, long j6) {
        if (C1988b.b(this.f17671h, j5) && C1991e.a(this.i, j6) && this.f17672j == f && this.f17674l == null) {
            return;
        }
        this.f17673k = null;
        this.f17674l = null;
        this.f17670g = true;
        this.f17676n = false;
        this.f17671h = j5;
        this.i = j6;
        this.f17672j = f;
        a();
    }
}
