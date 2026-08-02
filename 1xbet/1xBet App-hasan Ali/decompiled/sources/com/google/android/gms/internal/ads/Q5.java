package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Q5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11169b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11170c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11171d;

    /* renamed from: e, reason: collision with root package name */
    public final C2.h f11172e;
    public final C0783b1 f;

    /* renamed from: n, reason: collision with root package name */
    public int f11179n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11173g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11174h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f11175j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f11176k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f11177l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f11178m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f11180o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f11181p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f11182q = "";

    public Q5(int i, int i5, int i6, int i7, int i8, int i9, int i10, boolean z3) {
        this.f11168a = i;
        this.f11169b = i5;
        this.f11170c = i6;
        this.f11171d = z3;
        this.f11172e = new C2.h(i7);
        C0783b1 c0783b1 = new C0783b1();
        c0783b1.f12751k = i8;
        i9 = (i9 > 64 || i9 < 0) ? 64 : i9;
        if (i10 <= 0) {
            c0783b1.f12752l = 1;
        } else {
            c0783b1.f12752l = i10;
        }
        c0783b1.f12753m = new Y5(i9);
        this.f = c0783b1;
    }

    public static final String f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a(String str, boolean z3, float f, float f5, float f6, float f7) {
        e(str, z3, f, f5, f6, f7);
        synchronized (this.f11173g) {
            try {
                if (this.f11178m < 0) {
                    U2.j.d("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f11173g) {
            try {
                int i = this.f11176k;
                int i5 = this.f11177l;
                boolean z3 = this.f11171d;
                int i6 = this.f11169b;
                if (!z3) {
                    i6 = (i5 * i6) + (i * this.f11168a);
                }
                if (i6 > this.f11179n) {
                    this.f11179n = i6;
                    P2.o oVar = P2.o.f4767B;
                    if (!oVar.f4774g.d().k()) {
                        this.f11180o = this.f11172e.k(this.f11174h);
                        this.f11181p = this.f11172e.k(this.i);
                    }
                    if (!oVar.f4774g.d().l()) {
                        this.f11182q = this.f.b(this.i, this.f11175j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f11173g) {
            try {
                int i = this.f11176k;
                int i5 = this.f11177l;
                boolean z3 = this.f11171d;
                int i6 = this.f11169b;
                if (!z3) {
                    i6 = (i5 * i6) + (i * this.f11168a);
                }
                if (i6 > this.f11179n) {
                    this.f11179n = i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f11173g) {
            z3 = this.f11178m == 0;
        }
        return z3;
    }

    public final void e(String str, boolean z3, float f, float f5, float f6, float f7) {
        if (str != null) {
            if (str.length() < this.f11170c) {
                return;
            }
            synchronized (this.f11173g) {
                try {
                    this.f11174h.add(str);
                    this.f11176k += str.length();
                    if (z3) {
                        this.i.add(str);
                        this.f11175j.add(new V5(f, f5, f6, f7, this.i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q5)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((Q5) obj).f11180o;
        return str != null && str.equals(this.f11180o);
    }

    public final int hashCode() {
        return this.f11180o.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f11174h;
        int i = this.f11177l;
        int i5 = this.f11179n;
        int i6 = this.f11176k;
        String f = f(arrayList);
        String f5 = f(this.i);
        String str = this.f11180o;
        String str2 = this.f11181p;
        String str3 = this.f11182q;
        StringBuilder w5 = AbstractC2107A.w("ActivityContent fetchId: ", i, " score:", i5, " total_length:");
        w5.append(i6);
        w5.append("\n text: ");
        w5.append(f);
        w5.append("\n viewableText");
        w5.append(f5);
        w5.append("\n signture: ");
        w5.append(str);
        w5.append("\n viewableSignture: ");
        w5.append(str2);
        w5.append("\n viewableSignatureForVertical: ");
        w5.append(str3);
        return w5.toString();
    }
}
