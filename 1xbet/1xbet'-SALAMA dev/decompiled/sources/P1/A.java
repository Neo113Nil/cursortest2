package P1;

import C0.J;
import C1.C0095a;

/* JADX INFO: loaded from: classes.dex */
public final class A implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f5115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0095a f5116b = new C0095a(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5120f;

    public A(z zVar) {
        this.f5115a = zVar;
    }

    @Override // P1.E
    public final void a(int i7, C0095a c0095a) {
        boolean z4 = (i7 & 1) != 0;
        int iT = z4 ? c0095a.f1463a + c0095a.t() : -1;
        if (this.f5120f) {
            if (!z4) {
                return;
            }
            this.f5120f = false;
            c0095a.D(iT);
            this.f5118d = 0;
        }
        while (c0095a.d() > 0) {
            int i8 = this.f5118d;
            C0095a c0095a2 = this.f5116b;
            if (i8 < 3) {
                if (i8 == 0) {
                    int iT2 = c0095a.t();
                    c0095a.D(c0095a.f1463a - 1);
                    if (iT2 == 255) {
                        this.f5120f = true;
                        return;
                    }
                }
                int iMin = Math.min(c0095a.d(), 3 - this.f5118d);
                c0095a.f((byte[]) c0095a2.f1465c, this.f5118d, iMin);
                int i9 = this.f5118d + iMin;
                this.f5118d = i9;
                if (i9 == 3) {
                    c0095a2.D(0);
                    c0095a2.C(3);
                    c0095a2.E(1);
                    int iT3 = c0095a2.t();
                    int iT4 = c0095a2.t();
                    this.f5119e = (iT3 & 128) != 0;
                    int i10 = (((iT3 & 15) << 8) | iT4) + 3;
                    this.f5117c = i10;
                    byte[] bArr = (byte[]) c0095a2.f1465c;
                    if (bArr.length < i10) {
                        c0095a2.e(Math.min(4098, Math.max(i10, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c0095a.d(), this.f5117c - this.f5118d);
                c0095a.f((byte[]) c0095a2.f1465c, this.f5118d, iMin2);
                int i11 = this.f5118d + iMin2;
                this.f5118d = i11;
                int i12 = this.f5117c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (this.f5119e) {
                        byte[] bArr2 = (byte[]) c0095a2.f1465c;
                        int i13 = p151v2.t.f17159a;
                        int i14 = -1;
                        for (int i15 = 0; i15 < i12; i15++) {
                            i14 = p151v2.t.f17170m[((i14 >>> 24) ^ (bArr2[i15] & 255)) & 255] ^ (i14 << 8);
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
    public final void c(p151v2.s sVar, F1.m mVar, J j) {
        this.f5115a.c(sVar, mVar, j);
        this.f5120f = true;
    }
}
