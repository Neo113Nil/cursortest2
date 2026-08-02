package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 {

    /* JADX INFO: renamed from: b */
    public final int f8670b;

    /* JADX INFO: renamed from: c */
    public int f8671c;

    /* JADX INFO: renamed from: d */
    public int f8672d;

    /* JADX INFO: renamed from: e */
    public final kt0 f8673e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ g92 f8675g;

    /* JADX INFO: renamed from: a */
    public final C0539oc f8669a = new C0539oc();

    /* JADX INFO: renamed from: f */
    public boolean f8674f = false;

    public wu0(g92 g92Var, int i, int i2, kt0 kt0Var) {
        this.f8675g = g92Var;
        this.f8670b = i;
        this.f8671c = i2;
        this.f8673e = kt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m5416a(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.f8671c) {
            C0042ay.m528e("Window size overflow for stream: ", this.f8670b);
            return 0;
        }
        int i2 = this.f8671c + i;
        this.f8671c = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m5417b(int i, C0539oc c0539oc, boolean z) {
        boolean zM3083i;
        do {
            int iMin = Math.min(i, ((C0597px) this.f8675g.f2673l).f6281k.f4998j.f5358m);
            int i2 = -iMin;
            ((wu0) this.f8675g.f2674m).m5416a(i2);
            m5416a(i2);
            try {
                boolean z2 = false;
                ((C0597px) this.f8675g.f2673l).m4000a(c0539oc.f5698k == ((long) iMin) && z, this.f8670b, c0539oc, iMin);
                kt0 kt0Var = this.f8673e;
                synchronized (kt0Var.f4525b) {
                    a90.m132p("onStreamAllocated was not called, but it seems the stream is active", kt0Var.f4529f);
                    int i3 = kt0Var.f4528e;
                    boolean z3 = i3 < 32768;
                    int i4 = i3 - iMin;
                    kt0Var.f4528e = i4;
                    boolean z4 = i4 < 32768;
                    if (!z3 && z4) {
                        z2 = true;
                    }
                }
                if (z2) {
                    synchronized (kt0Var.f4525b) {
                        zM3083i = kt0Var.m3083i();
                    }
                    if (zM3083i) {
                        kt0Var.f4533j.mo1033d();
                    }
                }
                i -= iMin;
            } catch (IOException e) {
                dd0.m1163h(e);
                return;
            }
        } while (i > 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m5418c(int i, xu0 xu0Var) {
        int i2 = this.f8671c;
        g92 g92Var = this.f8675g;
        int iMin = Math.min(i, Math.min(i2, ((wu0) g92Var.f2674m).f8671c));
        int i3 = 0;
        while (true) {
            C0539oc c0539oc = this.f8669a;
            long j = c0539oc.f5698k;
            if (j <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j) {
                int i4 = (int) j;
                i3 += i4;
                m5417b(i4, c0539oc, this.f8674f);
            } else {
                i3 += iMin;
                m5417b(iMin, c0539oc, false);
            }
            xu0Var.f9057j++;
            iMin = Math.min(i - i3, Math.min(this.f8671c, ((wu0) g92Var.f2674m).f8671c));
        }
    }
}
