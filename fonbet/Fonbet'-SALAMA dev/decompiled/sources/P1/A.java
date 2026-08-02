package P1;

import C0.J;
import C1.C0095a;

/* loaded from: classes.dex */
public final class A implements E {

    /* renamed from: a, reason: collision with root package name */
    public final z f5115a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095a f5116b = new C0095a(32);

    /* renamed from: c, reason: collision with root package name */
    public int f5117c;

    /* renamed from: d, reason: collision with root package name */
    public int f5118d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5120f;

    public A(z zVar) {
        this.f5115a = zVar;
    }

    @Override // P1.E
    public final void a(int i7, C0095a c0095a) {
        boolean z4 = (i7 & 1) != 0;
        int t7 = z4 ? c0095a.f1463a + c0095a.t() : -1;
        if (this.f5120f) {
            if (!z4) {
                return;
            }
            this.f5120f = false;
            c0095a.D(t7);
            this.f5118d = 0;
        }
        while (c0095a.d() > 0) {
            int i8 = this.f5118d;
            C0095a c0095a2 = this.f5116b;
            if (i8 < 3) {
                if (i8 == 0) {
                    int t8 = c0095a.t();
                    c0095a.D(c0095a.f1463a - 1);
                    if (t8 == 255) {
                        this.f5120f = true;
                        return;
                    }
                }
                int min = Math.min(c0095a.d(), 3 - this.f5118d);
                c0095a.f((byte[]) c0095a2.f1465c, this.f5118d, min);
                int i9 = this.f5118d + min;
                this.f5118d = i9;
                if (i9 == 3) {
                    c0095a2.D(0);
                    c0095a2.C(3);
                    c0095a2.E(1);
                    int t9 = c0095a2.t();
                    int t10 = c0095a2.t();
                    this.f5119e = (t9 & 128) != 0;
                    int i10 = (((t9 & 15) << 8) | t10) + 3;
                    this.f5117c = i10;
                    byte[] bArr = (byte[]) c0095a2.f1465c;
                    if (bArr.length < i10) {
                        c0095a2.e(Math.min(4098, Math.max(i10, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c0095a.d(), this.f5117c - this.f5118d);
                c0095a.f((byte[]) c0095a2.f1465c, this.f5118d, min2);
                int i11 = this.f5118d + min2;
                this.f5118d = i11;
                int i12 = this.f5117c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (this.f5119e) {
                        byte[] bArr2 = (byte[]) c0095a2.f1465c;
                        int i13 = v2.t.f17153a;
                        int i14 = -1;
                        for (int i15 = 0; i15 < i12; i15++) {
                            i14 = v2.t.f17164m[((i14 >>> 24) ^ (bArr2[i15] & 255)) & 255] ^ (i14 << 8);
                        }
                        if (i14 != 0) {
                            this.f5120f = true;
                            return;
                        }
                        c0095a2.C(this.f5117c - 4);
                    } else {
                        c0095a2.C(i12);
                    }
                    c0095a2.D(0);
                    this.f5115a.a(c0095a2);
                    this.f5118d = 0;
                }
            }
        }
    }

    @Override // P1.E
    public final void b() {
        this.f5120f = true;
    }

    @Override // P1.E
    public final void c(v2.s sVar, F1.m mVar, J j) {
        this.f5115a.c(sVar, mVar, j);
        this.f5120f = true;
    }
}
