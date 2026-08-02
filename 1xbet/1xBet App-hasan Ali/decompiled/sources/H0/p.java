package H0;

import A0.F;
import K0.C0203h;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import c0.C0533b;
import c0.C0534c;
import e2.C1930k;
import r.C2316B;
import r.C2343v;
import z0.C2731G;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final C2731G f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2120b;

    /* renamed from: c, reason: collision with root package name */
    public final C2343v f2121c;

    /* renamed from: d, reason: collision with root package name */
    public final C2316B f2122d = new C2316B(2);

    public p(C2731G c2731g, d dVar, C2343v c2343v) {
        this.f2119a = c2731g;
        this.f2120b = dVar;
        this.f2121c = c2343v;
    }

    public final n a() {
        return new n(this.f2120b, false, this.f2119a, new j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r5.f2103k.b(H0.s.f2171q) == true) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C2731G c2731g, j jVar) {
        String str;
        boolean z3;
        boolean z5;
        AutofillValue forText;
        C2316B c2316b = this.f2122d;
        Object[] objArr = c2316b.f18904a;
        int i = c2316b.f18905b;
        for (int i5 = 0; i5 < i; i5++) {
            C0533b c0533b = (C0533b) objArr[i5];
            c0533b.getClass();
            j w5 = c2731g.w();
            int i6 = c2731g.f21625l;
            String str2 = null;
            if (jVar != null) {
                Object g5 = jVar.f2103k.g(s.f2147D);
                if (g5 == null) {
                    g5 = null;
                }
                C0203h c0203h = (C0203h) g5;
                if (c0203h != null) {
                    str = c0203h.f2829l;
                    if (w5 != null) {
                        Object g6 = w5.f2103k.g(s.f2147D);
                        if (g6 == null) {
                            g6 = null;
                        }
                        C0203h c0203h2 = (C0203h) g6;
                        if (c0203h2 != null) {
                            str2 = c0203h2.f2829l;
                        }
                    }
                    z3 = true;
                    if (str != str2) {
                        F f = c0533b.f7380c;
                        C1930k c1930k = c0533b.f7378a;
                        if (str == null) {
                            c1930k.l(f, i6, true);
                        } else if (str2 == null) {
                            c1930k.l(f, i6, false);
                        } else if (kotlin.jvm.internal.l.a((C0534c) q.d(w5, s.f2172r), c0.i.f7388a)) {
                            forText = AutofillValue.forText(str2.toString());
                            ((AutofillManager) c1930k.f16910l).notifyValueChanged(f, i6, forText);
                        }
                    }
                    if (jVar != null) {
                        if (jVar.f2103k.b(s.f2171q)) {
                            z5 = true;
                            if (w5 != null) {
                            }
                            z3 = false;
                            if (z5 != z3) {
                                r.w wVar = c0533b.f7383g;
                                if (z3) {
                                    wVar.a(i6);
                                } else {
                                    wVar.e(i6);
                                }
                            }
                        }
                    }
                    z5 = false;
                    if (w5 != null) {
                    }
                    z3 = false;
                    if (z5 != z3) {
                    }
                }
            }
            str = null;
            if (w5 != null) {
            }
            z3 = true;
            if (str != str2) {
            }
            if (jVar != null) {
            }
            z5 = false;
            if (w5 != null) {
            }
            z3 = false;
            if (z5 != z3) {
            }
        }
    }
}
