package x0;

import java.util.Map;
import r.C2321G;

/* loaded from: classes.dex */
public final class F implements P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f20930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f20931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f20933e;

    public /* synthetic */ F(P p5, K k5, int i, P p6, int i5) {
        this.f20929a = i5;
        this.f20931c = k5;
        this.f20932d = i;
        this.f20933e = p6;
        this.f20930b = p5;
    }

    @Override // x0.P
    public final Map a() {
        switch (this.f20929a) {
        }
        return this.f20930b.a();
    }

    @Override // x0.P
    public final void b() {
        switch (this.f20929a) {
            case 0:
                K k5 = this.f20931c;
                k5.f20945o = this.f20932d;
                this.f20933e.b();
                C2321G c2321g = k5.f20952v;
                long[] jArr = c2321g.f18928a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j5 = jArr[i];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j5) < 128) {
                                    int i7 = (i << 3) + i6;
                                    Object obj = c2321g.f18929b[i7];
                                    g0 g0Var = (g0) c2321g.f18930c[i7];
                                    int j6 = k5.f20953w.j(obj);
                                    if (j6 < 0 || j6 >= k5.f20945o) {
                                        g0Var.a();
                                        c2321g.l(i7);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                break;
            default:
                K k6 = this.f20931c;
                k6.f20944n = this.f20932d;
                this.f20933e.b();
                k6.a(k6.f20944n);
                break;
        }
    }

    @Override // x0.P
    public final int c() {
        switch (this.f20929a) {
        }
        return this.f20930b.c();
    }

    @Override // x0.P
    public final i4.c d() {
        switch (this.f20929a) {
        }
        return this.f20930b.d();
    }

    @Override // x0.P
    public final int getWidth() {
        switch (this.f20929a) {
        }
        return this.f20930b.getWidth();
    }
}
