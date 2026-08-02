package X5;

import W5.AbstractC0484a;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final int f7628b;

    /* renamed from: c, reason: collision with root package name */
    public int f7629c;

    /* renamed from: d, reason: collision with root package name */
    public int f7630d;

    /* renamed from: e, reason: collision with root package name */
    public final u f7631e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v2.n f7633g;

    /* renamed from: a, reason: collision with root package name */
    public final N6.d f7627a = new N6.d();

    /* renamed from: f, reason: collision with root package name */
    public boolean f7632f = false;

    public v(v2.n nVar, int i7, int i8, u uVar) {
        this.f7633g = nVar;
        this.f7628b = i7;
        this.f7629c = i8;
        this.f7631e = uVar;
    }

    public final int a(int i7) {
        if (i7 <= 0 || com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i7 >= this.f7629c) {
            int i8 = this.f7629c + i7;
            this.f7629c = i8;
            return i8;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f7628b);
    }

    public final void b(int i7, N6.d dVar, boolean z4) {
        boolean e7;
        do {
            int min = Math.min(i7, ((d) this.f7633g.f17138c).f7498b.f7481a.f7915d);
            int i8 = -min;
            ((v) this.f7633g.f17139d).a(i8);
            a(i8);
            try {
                boolean z7 = false;
                ((d) this.f7633g.f17138c).a(dVar.f4797b == ((long) min) && z4, this.f7628b, dVar, min);
                AbstractC0484a abstractC0484a = (AbstractC0484a) this.f7631e;
                synchronized (abstractC0484a.f7106b) {
                    p3.f.q("onStreamAllocated was not called, but it seems the stream is active", abstractC0484a.f7110f);
                    int i9 = abstractC0484a.f7109e;
                    boolean z8 = i9 < 32768;
                    int i10 = i9 - min;
                    abstractC0484a.f7109e = i10;
                    boolean z9 = i10 < 32768;
                    if (!z8 && z9) {
                        z7 = true;
                    }
                }
                if (z7) {
                    synchronized (abstractC0484a.f7106b) {
                        e7 = abstractC0484a.e();
                    }
                    if (e7) {
                        abstractC0484a.j.u();
                    }
                }
                i7 -= min;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        } while (i7 > 0);
    }

    public final void c(int i7, d1.n nVar) {
        int i8 = this.f7629c;
        v2.n nVar2 = this.f7633g;
        int min = Math.min(i7, Math.min(i8, ((v) nVar2.f17139d).f7629c));
        int i9 = 0;
        while (true) {
            N6.d dVar = this.f7627a;
            long j = dVar.f4797b;
            if (j <= 0 || min <= 0) {
                return;
            }
            if (min >= j) {
                int i10 = (int) j;
                i9 += i10;
                b(i10, dVar, this.f7632f);
            } else {
                i9 += min;
                b(min, dVar, false);
            }
            nVar.f12365a++;
            min = Math.min(i7 - i9, Math.min(this.f7629c, ((v) nVar2.f17139d).f7629c));
        }
    }
}
