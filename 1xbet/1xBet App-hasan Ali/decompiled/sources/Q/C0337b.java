package Q;

import P.AbstractC0285c0;
import P.AbstractC0287d0;
import P.AbstractC0317t;
import P.AbstractC0321v;
import P.C0315s;
import P.Q;
import java.util.ArrayList;

/* renamed from: Q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337b {

    /* renamed from: a, reason: collision with root package name */
    public final C0315s f4814a;

    /* renamed from: b, reason: collision with root package name */
    public C0336a f4815b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4816c;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f4819g;

    /* renamed from: l, reason: collision with root package name */
    public int f4823l;

    /* renamed from: d, reason: collision with root package name */
    public final Q f4817d = new Q();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4818e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4820h = new ArrayList();
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f4821j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4822k = -1;

    public C0337b(C0315s c0315s, C0336a c0336a) {
        this.f4814a = c0315s;
        this.f4815b = c0336a;
    }

    public final void a(AbstractC0285c0 abstractC0285c0, AbstractC0321v abstractC0321v, AbstractC0287d0 abstractC0287d0, AbstractC0287d0 abstractC0287d02) {
        C0336a c0336a = this.f4815b;
        c0336a.getClass();
        C0343h c0343h = C0343h.f4829c;
        K k5 = c0336a.f;
        k5.w0(c0343h);
        int i = k5.f4813k - k5.f[k5.f4810g - 1].f4809b;
        Object[] objArr = k5.f4812j;
        objArr[i] = abstractC0285c0;
        objArr[i + 1] = abstractC0321v;
        objArr[i + 3] = abstractC0287d02;
        objArr[i + 2] = abstractC0287d0;
    }

    public final void b() {
        d();
        ArrayList arrayList = this.f4820h;
        if (arrayList.isEmpty()) {
            this.f4819g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void c() {
        int i = this.f4819g;
        if (i > 0) {
            C0336a c0336a = this.f4815b;
            c0336a.getClass();
            G g5 = G.f4806c;
            K k5 = c0336a.f;
            k5.w0(g5);
            k5.f4811h[k5.i - k5.f[k5.f4810g - 1].f4808a] = i;
            this.f4819g = 0;
        }
        ArrayList arrayList = this.f4820h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0336a c0336a2 = this.f4815b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = arrayList.get(i5);
        }
        c0336a2.getClass();
        if (size != 0) {
            C0346k c0346k = C0346k.f4832c;
            K k6 = c0336a2.f;
            k6.w0(c0346k);
            N4.b.T(k6, 0, objArr);
        }
        arrayList.clear();
    }

    public final void d() {
        int i = this.f4823l;
        if (i > 0) {
            int i5 = this.i;
            if (i5 >= 0) {
                c();
                C0336a c0336a = this.f4815b;
                c0336a.getClass();
                y yVar = y.f4849c;
                K k5 = c0336a.f;
                k5.w0(yVar);
                int i6 = k5.i - k5.f[k5.f4810g - 1].f4808a;
                int[] iArr = k5.f4811h;
                iArr[i6] = i5;
                iArr[i6 + 1] = i;
                this.i = -1;
            } else {
                int i7 = this.f4822k;
                int i8 = this.f4821j;
                c();
                C0336a c0336a2 = this.f4815b;
                c0336a2.getClass();
                v vVar = v.f4846c;
                K k6 = c0336a2.f;
                k6.w0(vVar);
                int i9 = k6.i - k6.f[k6.f4810g - 1].f4808a;
                int[] iArr2 = k6.f4811h;
                iArr2[i9 + 1] = i7;
                iArr2[i9] = i8;
                iArr2[i9 + 2] = i;
                this.f4821j = -1;
                this.f4822k = -1;
            }
            this.f4823l = 0;
        }
    }

    public final void e(boolean z3) {
        C0315s c0315s = this.f4814a;
        int i = z3 ? c0315s.f4520G.i : c0315s.f4520G.f4336g;
        int i5 = i - this.f;
        if (i5 < 0) {
            AbstractC0317t.c("Tried to seek backward");
        }
        if (i5 > 0) {
            C0336a c0336a = this.f4815b;
            c0336a.getClass();
            C0339d c0339d = C0339d.f4825c;
            K k5 = c0336a.f;
            k5.w0(c0339d);
            k5.f4811h[k5.i - k5.f[k5.f4810g - 1].f4808a] = i5;
            this.f = i;
        }
    }

    public final void f(int i, int i5) {
        if (i5 > 0) {
            if (!(i >= 0)) {
                AbstractC0317t.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.f4823l += i5;
                return;
            }
            d();
            this.i = i;
            this.f4823l = i5;
        }
    }
}
