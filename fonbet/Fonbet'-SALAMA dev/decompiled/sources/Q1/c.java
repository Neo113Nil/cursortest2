package Q1;

import A1.C0045t0;
import A1.X;
import F1.h;
import F1.m;
import F1.v;
import com.google.android.exoplayer2.Format$Builder;
import v2.t;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final m f5770a;

    /* renamed from: b, reason: collision with root package name */
    public final v f5771b;

    /* renamed from: c, reason: collision with root package name */
    public final N1.e f5772c;

    /* renamed from: d, reason: collision with root package name */
    public final X f5773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5774e;

    /* renamed from: f, reason: collision with root package name */
    public long f5775f;

    /* renamed from: g, reason: collision with root package name */
    public int f5776g;

    /* renamed from: h, reason: collision with root package name */
    public long f5777h;

    public c(m mVar, v vVar, N1.e eVar, String str, int i7) {
        this.f5770a = mVar;
        this.f5771b = vVar;
        this.f5772c = eVar;
        int i8 = eVar.f4649d;
        int i9 = eVar.f4646a;
        int i10 = (i8 * i9) / 8;
        int i11 = eVar.f4648c;
        if (i11 != i10) {
            throw C0045t0.a(null, "Expected block size: " + i10 + "; got: " + i11);
        }
        int i12 = eVar.f4647b;
        int i13 = i12 * i10;
        int i14 = i13 * 8;
        int max = Math.max(i10, i13 / 10);
        this.f5774e = max;
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = str;
        format$Builder.f10533f = i14;
        format$Builder.f10534g = i14;
        format$Builder.f10538l = max;
        format$Builder.f10550x = i9;
        format$Builder.f10551y = i12;
        format$Builder.f10552z = i7;
        this.f5773d = new X(format$Builder);
    }

    @Override // Q1.b
    public final void a(long j) {
        this.f5775f = j;
        this.f5776g = 0;
        this.f5777h = 0L;
    }

    @Override // Q1.b
    public final boolean b(h hVar, long j) {
        int i7;
        int i8;
        long j3 = j;
        while (j3 > 0 && (i7 = this.f5776g) < (i8 = this.f5774e)) {
            int d7 = this.f5771b.d(hVar, (int) Math.min(i8 - i7, j3), true);
            if (d7 == -1) {
                j3 = 0;
            } else {
                this.f5776g += d7;
                j3 -= d7;
            }
        }
        N1.e eVar = this.f5772c;
        int i9 = this.f5776g;
        int i10 = eVar.f4648c;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long K7 = this.f5775f + t.K(this.f5777h, 1000000L, eVar.f4647b);
            int i12 = i11 * i10;
            int i13 = this.f5776g - i12;
            this.f5771b.e(K7, 1, i12, i13, null);
            this.f5777h += i11;
            this.f5776g = i13;
        }
        return j3 <= 0;
    }

    @Override // Q1.b
    public final void c(int i7, long j) {
        this.f5770a.m(new f(this.f5772c, 1, i7, j));
        this.f5771b.a(this.f5773d);
    }
}
