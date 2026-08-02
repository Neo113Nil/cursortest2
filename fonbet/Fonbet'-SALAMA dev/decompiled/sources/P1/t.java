package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import C1.I;
import com.google.android.exoplayer2.Format$Builder;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: a, reason: collision with root package name */
    public final C0095a f5347a;

    /* renamed from: b, reason: collision with root package name */
    public final I f5348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5349c;

    /* renamed from: d, reason: collision with root package name */
    public F1.v f5350d;

    /* renamed from: e, reason: collision with root package name */
    public String f5351e;

    /* renamed from: f, reason: collision with root package name */
    public int f5352f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f5353g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5354h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5355i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f5356k;

    /* renamed from: l, reason: collision with root package name */
    public long f5357l;

    public t(String str) {
        C0095a c0095a = new C0095a(4);
        this.f5347a = c0095a;
        ((byte[]) c0095a.f1465c)[0] = -1;
        this.f5348b = new I();
        this.f5357l = -9223372036854775807L;
        this.f5349c = str;
    }

    @Override // P1.h
    public final void a(C0095a c0095a) {
        AbstractC1664a.i(this.f5350d);
        while (c0095a.d() > 0) {
            int i7 = this.f5352f;
            C0095a c0095a2 = this.f5347a;
            if (i7 == 0) {
                byte[] bArr = (byte[]) c0095a.f1465c;
                int i8 = c0095a.f1463a;
                int i9 = c0095a.f1464b;
                while (true) {
                    if (i8 >= i9) {
                        c0095a.D(i9);
                        break;
                    }
                    byte b7 = bArr[i8];
                    boolean z4 = (b7 & 255) == 255;
                    boolean z7 = this.f5355i && (b7 & 224) == 224;
                    this.f5355i = z4;
                    if (z7) {
                        c0095a.D(i8 + 1);
                        this.f5355i = false;
                        ((byte[]) c0095a2.f1465c)[1] = bArr[i8];
                        this.f5353g = 2;
                        this.f5352f = 1;
                        break;
                    }
                    i8++;
                }
            } else if (i7 == 1) {
                int min = Math.min(c0095a.d(), 4 - this.f5353g);
                c0095a.f((byte[]) c0095a2.f1465c, this.f5353g, min);
                int i10 = this.f5353g + min;
                this.f5353g = i10;
                if (i10 >= 4) {
                    c0095a2.D(0);
                    int g3 = c0095a2.g();
                    I i11 = this.f5348b;
                    if (i11.a(g3)) {
                        this.f5356k = i11.f1405b;
                        if (!this.f5354h) {
                            int i12 = i11.f1406c;
                            this.j = (i11.f1409f * 1000000) / i12;
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10528a = this.f5351e;
                            format$Builder.f10537k = (String) i11.f1410g;
                            format$Builder.f10538l = 4096;
                            format$Builder.f10550x = i11.f1407d;
                            format$Builder.f10551y = i12;
                            format$Builder.f10530c = this.f5349c;
                            this.f5350d.a(new X(format$Builder));
                            this.f5354h = true;
                        }
                        c0095a2.D(0);
                        this.f5350d.c(4, c0095a2);
                        this.f5352f = 2;
                    } else {
                        this.f5353g = 0;
                        this.f5352f = 1;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(c0095a.d(), this.f5356k - this.f5353g);
                this.f5350d.c(min2, c0095a);
                int i13 = this.f5353g + min2;
                this.f5353g = i13;
                int i14 = this.f5356k;
                if (i13 >= i14) {
                    long j = this.f5357l;
                    if (j != -9223372036854775807L) {
                        this.f5350d.e(j, 1, i14, 0, null);
                        this.f5357l += this.j;
                    }
                    this.f5353g = 0;
                    this.f5352f = 0;
                }
            }
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5352f = 0;
        this.f5353g = 0;
        this.f5355i = false;
        this.f5357l = -9223372036854775807L;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5351e = (String) j.f1238e;
        j.d();
        this.f5350d = mVar.r(j.f1236c, 1);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5357l = j;
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
