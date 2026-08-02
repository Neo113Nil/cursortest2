package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.UUID;
import t3.AbstractC2425d;
import u0.C2479a;
import u0.EnumC2480b;
import w0.AbstractC2540a;

/* renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1036gn {

    /* renamed from: a, reason: collision with root package name */
    public final int f13648a;

    /* renamed from: b, reason: collision with root package name */
    public int f13649b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13650c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f13651d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f13652e;
    public final Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13653g;

    public /* synthetic */ C1036gn(String str, String str2, String str3, int i, WebView webView, String str4, int i5) {
        this.f13650c = str;
        this.f13651d = str2;
        this.f13652e = str3;
        this.f13648a = i;
        this.f13653g = webView;
        this.f = str4;
        this.f13649b = i5;
    }

    public void a(float f, long j5) {
        int i = (this.f13649b + 1) % 20;
        this.f13649b = i;
        C2479a[] c2479aArr = (C2479a[]) this.f13651d;
        C2479a c2479a = c2479aArr[i];
        if (c2479a != null) {
            c2479a.f19975a = j5;
            c2479a.f19976b = f;
        } else {
            C2479a c2479a2 = new C2479a();
            c2479a2.f19975a = j5;
            c2479a2.f19976b = f;
            c2479aArr[i] = c2479a2;
        }
    }

    public float b(float f) {
        EnumC2480b enumC2480b;
        float[] fArr;
        float[] fArr2;
        float f5;
        int i;
        float f6;
        float f7 = f;
        float f8 = 0.0f;
        if (f7 <= 0.0f) {
            AbstractC2540a.b("maximumVelocity should be a positive value. You specified=" + f7);
        }
        int i5 = this.f13649b;
        C2479a[] c2479aArr = (C2479a[]) this.f13651d;
        C2479a c2479a = c2479aArr[i5];
        if (c2479a == null) {
            f5 = 0.0f;
        } else {
            int i6 = 0;
            C2479a c2479a2 = c2479a;
            while (true) {
                C2479a c2479a3 = c2479aArr[i5];
                enumC2480b = (EnumC2480b) this.f13650c;
                fArr = (float[]) this.f13652e;
                fArr2 = (float[]) this.f;
                if (c2479a3 != null) {
                    long j5 = c2479a.f19975a;
                    f5 = f8;
                    int i7 = i5;
                    long j6 = c2479a3.f19975a;
                    float f9 = j5 - j6;
                    i = 1;
                    float abs = Math.abs(j6 - c2479a2.f19975a);
                    enumC2480b = enumC2480b;
                    c2479a2 = enumC2480b != EnumC2480b.f19977k ? c2479a : c2479a3;
                    if (f9 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i6] = c2479a3.f19976b;
                    fArr2[i6] = -f9;
                    i5 = (i7 == 0 ? 20 : i7) - 1;
                    i6++;
                    if (i6 >= 20) {
                        break;
                    }
                    f8 = f5;
                } else {
                    f5 = f8;
                    i = 1;
                    break;
                }
            }
            if (i6 >= this.f13648a) {
                int ordinal = enumC2480b.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = (float[]) this.f13653g;
                        AbstractC2425d.C(fArr2, fArr, i6, fArr3);
                        f6 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f6 = f5;
                    }
                } else {
                    if (ordinal != i) {
                        throw new D2.e();
                    }
                    int i8 = i6 - i;
                    float f10 = fArr2[i8];
                    int i9 = i8;
                    float f11 = f5;
                    while (i9 > 0) {
                        int i10 = i9 - 1;
                        float f12 = fArr2[i10];
                        if (f10 != f12) {
                            float f13 = (fArr[i9] - fArr[i10]) / (f10 - f12);
                            f11 += Math.abs(f13) * (f13 - (Math.signum(f11) * ((float) Math.sqrt(Math.abs(f11) * 2))));
                            if (i9 == i8) {
                                f11 *= 0.5f;
                            }
                        }
                        i9--;
                        f10 = f12;
                    }
                    f6 = Math.signum(f11) * ((float) Math.sqrt(Math.abs(f11) * 2));
                }
                f8 = f6 * 1000;
            } else {
                f8 = f5;
            }
        }
        if (f8 == f5 || Float.isNaN(f8)) {
            return f5;
        }
        if (f8 <= f5) {
            f7 = -f7;
            if (f8 >= f7) {
                return f8;
            }
        } else if (f8 <= f7) {
            f7 = f8;
        }
        return f7;
    }

    public Object c() {
        C1748wi a5 = C1748wi.a((String) this.f13650c, (String) this.f13651d);
        Ds n5 = Oi.n("javascript");
        String str = (String) this.f13652e;
        Ds n6 = Oi.n(str);
        int i = this.f13648a;
        As l5 = Oi.l(AbstractC0467k.p(i));
        Ds ds = Ds.f8406n;
        if (n5 == ds) {
            U2.j.i("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (l5 == null) {
            U2.j.i("Omid js session error; Unable to parse creative type: ".concat(AbstractC0467k.D(i)));
            return null;
        }
        if (l5 == As.f7734o && n6 == ds) {
            U2.j.i("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str)));
            return null;
        }
        Z1 z12 = new Z1(a5, (WebView) this.f13653g, (String) this.f, "", EnumC1848ys.f16494m);
        C1894zt a6 = C1894zt.a(l5, Oi.m(AbstractC0467k.q(this.f13649b)), n5, n6, true);
        if (AbstractC1803xs.f16343b.f2300l) {
            return new C1169jn(new C1893zs(a6, z12, UUID.randomUUID().toString()), z12);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, u0.a[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [float[], java.io.Serializable] */
    public C1036gn() {
        int i;
        EnumC2480b enumC2480b = EnumC2480b.f19977k;
        this.f13650c = enumC2480b;
        int ordinal = enumC2480b.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                throw new D2.e();
            }
            i = 2;
        }
        this.f13648a = i;
        this.f13651d = new C2479a[20];
        this.f13652e = new float[20];
        this.f = new float[20];
        this.f13653g = new float[3];
    }
}
