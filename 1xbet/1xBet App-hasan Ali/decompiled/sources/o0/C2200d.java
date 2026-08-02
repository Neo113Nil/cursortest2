package o0;

import i0.M;
import java.util.ArrayList;
import w0.AbstractC2540a;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2200d {

    /* renamed from: a, reason: collision with root package name */
    public final String f18529a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18530b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18531c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18532d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18533e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18534g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18535h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C2199c f18536j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18537k;

    public C2200d(String str, boolean z3) {
        long j5 = i0.p.f17293g;
        this.f18529a = str;
        this.f18530b = 24.0f;
        this.f18531c = 24.0f;
        this.f18532d = 24.0f;
        this.f18533e = 24.0f;
        this.f = j5;
        this.f18534g = 5;
        this.f18535h = z3;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        int i = z.f18603a;
        X3.v vVar = X3.v.f6090k;
        ArrayList arrayList2 = new ArrayList();
        C2199c c2199c = new C2199c();
        c2199c.f18527a = vVar;
        c2199c.f18528b = arrayList2;
        this.f18536j = c2199c;
        arrayList.add(c2199c);
    }

    public static void a(C2200d c2200d, ArrayList arrayList, M m5) {
        if (c2200d.f18537k) {
            AbstractC2540a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C2199c) c2200d.i.get(r1.size() - 1)).f18528b.add(new C2196C(arrayList, m5));
    }

    public final C2201e b() {
        if (this.f18537k) {
            AbstractC2540a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                C2199c c2199c = this.f18536j;
                c2199c.getClass();
                C2201e c2201e = new C2201e(this.f18529a, this.f18530b, this.f18531c, this.f18532d, this.f18533e, new y(c2199c.f18527a, c2199c.f18528b), this.f, this.f18534g, this.f18535h);
                this.f18537k = true;
                return c2201e;
            }
            if (this.f18537k) {
                AbstractC2540a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C2199c c2199c2 = (C2199c) arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = ((C2199c) arrayList.get(arrayList.size() - 1)).f18528b;
            c2199c2.getClass();
            arrayList2.add(new y(c2199c2.f18527a, c2199c2.f18528b));
        }
    }
}
