package N1;

import C1.C0095a;
import F1.v;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final v f4659a;

    /* renamed from: d, reason: collision with root package name */
    public t f4662d;

    /* renamed from: e, reason: collision with root package name */
    public g f4663e;

    /* renamed from: f, reason: collision with root package name */
    public int f4664f;

    /* renamed from: g, reason: collision with root package name */
    public int f4665g;

    /* renamed from: h, reason: collision with root package name */
    public int f4666h;

    /* renamed from: i, reason: collision with root package name */
    public int f4667i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4669l;

    /* renamed from: b, reason: collision with root package name */
    public final s f4660b = new s();

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f4661c = new C0095a(4, false);
    public final C0095a j = new C0095a(1);

    /* renamed from: k, reason: collision with root package name */
    public final C0095a f4668k = new C0095a(4, false);

    public i(v vVar, t tVar, g gVar) {
        this.f4659a = vVar;
        this.f4662d = tVar;
        this.f4663e = gVar;
        this.f4662d = tVar;
        this.f4663e = gVar;
        vVar.a(tVar.f4770a.f4744f);
        d();
    }

    public final r a() {
        if (!this.f4669l) {
            return null;
        }
        s sVar = this.f4660b;
        g gVar = sVar.f4754a;
        int i7 = v2.t.f17153a;
        int i8 = gVar.f4652a;
        r rVar = sVar.f4765m;
        if (rVar == null) {
            rVar = this.f4662d.f4770a.f4748k[i8];
        }
        if (rVar == null || !rVar.f4749a) {
            return null;
        }
        return rVar;
    }

    public final boolean b() {
        this.f4664f++;
        if (!this.f4669l) {
            return false;
        }
        int i7 = this.f4665g + 1;
        this.f4665g = i7;
        int[] iArr = this.f4660b.f4760g;
        int i8 = this.f4666h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.f4666h = i8 + 1;
        this.f4665g = 0;
        return false;
    }

    public final int c(int i7, int i8) {
        C0095a c0095a;
        r a2 = a();
        if (a2 == null) {
            return 0;
        }
        s sVar = this.f4660b;
        int i9 = a2.f4752d;
        if (i9 != 0) {
            c0095a = sVar.f4766n;
        } else {
            int i10 = v2.t.f17153a;
            byte[] bArr = a2.f4753e;
            int length = bArr.length;
            C0095a c0095a2 = this.f4668k;
            c0095a2.B(length, bArr);
            i9 = bArr.length;
            c0095a = c0095a2;
        }
        boolean z4 = sVar.f4763k && sVar.f4764l[this.f4664f];
        boolean z7 = z4 || i8 != 0;
        C0095a c0095a3 = this.j;
        ((byte[]) c0095a3.f1465c)[0] = (byte) ((z7 ? 128 : 0) | i9);
        c0095a3.D(0);
        v vVar = this.f4659a;
        vVar.c(1, c0095a3);
        vVar.c(i9, c0095a);
        if (!z7) {
            return i9 + 1;
        }
        C0095a c0095a4 = this.f4661c;
        if (!z4) {
            c0095a4.A(8);
            byte[] bArr2 = (byte[]) c0095a4.f1465c;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i8 & 255);
            bArr2[4] = (byte) ((i7 >> 24) & 255);
            bArr2[5] = (byte) ((i7 >> 16) & 255);
            bArr2[6] = (byte) ((i7 >> 8) & 255);
            bArr2[7] = (byte) (i7 & 255);
            vVar.c(8, c0095a4);
            return i9 + 9;
        }
        C0095a c0095a5 = sVar.f4766n;
        int y4 = c0095a5.y();
        c0095a5.E(-2);
        int i11 = (y4 * 6) + 2;
        if (i8 != 0) {
            c0095a4.A(i11);
            byte[] bArr3 = (byte[]) c0095a4.f1465c;
            c0095a5.f(bArr3, 0, i11);
            int i12 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i8;
            bArr3[2] = (byte) ((i12 >> 8) & 255);
            bArr3[3] = (byte) (i12 & 255);
        } else {
            c0095a4 = c0095a5;
        }
        vVar.c(i11, c0095a4);
        return i9 + 1 + i11;
    }

    public final void d() {
        s sVar = this.f4660b;
        sVar.f4757d = 0;
        sVar.f4768p = 0L;
        sVar.f4769q = false;
        sVar.f4763k = false;
        sVar.f4767o = false;
        sVar.f4765m = null;
        this.f4664f = 0;
        this.f4666h = 0;
        this.f4665g = 0;
        this.f4667i = 0;
        this.f4669l = false;
    }
}
