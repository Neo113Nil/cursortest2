package F3;

import F3.InterfaceC3018x;
import j3.AbstractC7252H;
import j3.C7259a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: F3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3000e extends f0 {

    /* renamed from: e, reason: collision with root package name */
    private final long f8647e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8648f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8649g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8650h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8651i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8652j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<C2999d> f8653k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC7252H.c f8654l;

    /* renamed from: m, reason: collision with root package name */
    private b f8655m;

    /* renamed from: n, reason: collision with root package name */
    private c f8656n;

    /* renamed from: o, reason: collision with root package name */
    private long f8657o;

    /* renamed from: p, reason: collision with root package name */
    private long f8658p;

    /* renamed from: F3.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3018x f8659a;

        /* renamed from: b, reason: collision with root package name */
        private long f8660b;

        /* renamed from: c, reason: collision with root package name */
        private long f8661c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8662d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8663e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f8664f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8665g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f8666h;

        public a(InterfaceC3018x interfaceC3018x) {
            interfaceC3018x.getClass();
            this.f8659a = interfaceC3018x;
            this.f8662d = true;
            this.f8661c = Long.MIN_VALUE;
        }

        public final C3000e h() {
            this.f8666h = true;
            return new C3000e(this);
        }

        public final void i(boolean z11) {
            G10.a.h(!this.f8666h);
            this.f8663e = z11;
        }

        public final void j(boolean z11) {
            G10.a.h(!this.f8666h);
            this.f8665g = z11;
        }

        public final void k(boolean z11) {
            G10.a.h(!this.f8666h);
            this.f8662d = z11;
        }

        public final void l(long j11) {
            G10.a.h(!this.f8666h);
            this.f8661c = j11;
        }

        public final void m(boolean z11) {
            G10.a.h(!this.f8666h);
            this.f8664f = z11;
        }

        public final void n(long j11) {
            G10.a.c(j11 >= 0);
            G10.a.h(!this.f8666h);
            this.f8660b = j11;
        }
    }

    /* renamed from: F3.e$b */
    private static final class b extends AbstractC3012q {

        /* renamed from: a, reason: collision with root package name */
        private final long f8667a;

        /* renamed from: b, reason: collision with root package name */
        private final long f8668b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8669c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8670d;

        public b(AbstractC7252H abstractC7252H, long j11, long j12, boolean z11) throws c {
            super(abstractC7252H);
            if (j12 != Long.MIN_VALUE && j12 < j11) {
                throw new c(2, j11, j12);
            }
            boolean z12 = false;
            if (abstractC7252H.getPeriodCount() != 1) {
                throw new c(0);
            }
            AbstractC7252H.c window = abstractC7252H.getWindow(0, new AbstractC7252H.c());
            long max = Math.max(0L, j11);
            if (!z11 && !window.f68956k && max != 0 && !window.f68953h) {
                throw new c(1);
            }
            long max2 = j12 == Long.MIN_VALUE ? window.f68958m : Math.max(0L, j12);
            long j13 = window.f68958m;
            if (j13 != -9223372036854775807L) {
                max2 = max2 > j13 ? j13 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.f8667a = max;
            this.f8668b = max2;
            this.f8669c = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
            if (window.f68954i && (max2 == -9223372036854775807L || (j13 != -9223372036854775807L && max2 == j13))) {
                z12 = true;
            }
            this.f8670d = z12;
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
            this.timeline.getPeriod(0, bVar, z11);
            long j11 = bVar.f68941e - this.f8667a;
            long j12 = this.f8669c;
            bVar.h(bVar.f68937a, bVar.f68938b, 0, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, j11, C7259a.f69046c, false);
            return bVar;
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
            this.timeline.getWindow(0, cVar, 0L);
            long j12 = cVar.f68961p;
            long j13 = this.f8667a;
            cVar.f68961p = j12 + j13;
            cVar.f68958m = this.f8669c;
            cVar.f68954i = this.f8670d;
            long j14 = cVar.f68957l;
            if (j14 != -9223372036854775807L) {
                long max = Math.max(j14, j13);
                cVar.f68957l = max;
                long j15 = this.f8668b;
                if (j15 != -9223372036854775807L) {
                    max = Math.min(max, j15);
                }
                cVar.f68957l = max - j13;
            }
            long g02 = m3.N.g0(j13);
            long j16 = cVar.f68950e;
            if (j16 != -9223372036854775807L) {
                cVar.f68950e = j16 + g02;
            }
            long j17 = cVar.f68951f;
            if (j17 != -9223372036854775807L) {
                cVar.f68951f = j17 + g02;
            }
            return cVar;
        }
    }

    /* renamed from: F3.e$c */
    public static final class c extends IOException {
        public c(int i11) {
            this(i11, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(int i11, long j11, long j12) {
            super(r0.toString());
            String str;
            StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
            if (i11 != 0) {
                if (i11 == 1) {
                    str = "not seekable to start";
                } else if (i11 != 2) {
                    str = "unknown";
                } else {
                    G10.a.h((j11 == -9223372036854775807L || j12 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j11 + ", End time: " + j12;
                }
            } else {
                str = "invalid period count";
            }
            sb2.append(str);
        }
    }

    C3000e(a aVar) {
        super(aVar.f8659a);
        this.f8647e = aVar.f8660b;
        this.f8648f = aVar.f8661c;
        this.f8649g = aVar.f8662d;
        this.f8650h = aVar.f8663e;
        this.f8651i = aVar.f8664f;
        this.f8652j = aVar.f8665g;
        this.f8653k = new ArrayList<>();
        this.f8654l = new AbstractC7252H.c();
    }

    private void k(AbstractC7252H abstractC7252H) {
        long j11;
        long j12;
        long j13;
        AbstractC7252H.c cVar = this.f8654l;
        abstractC7252H.getWindow(0, cVar);
        long j14 = cVar.f68961p;
        b bVar = this.f8655m;
        ArrayList<C2999d> arrayList = this.f8653k;
        long j15 = this.f8648f;
        if (bVar == null || arrayList.isEmpty() || this.f8650h) {
            boolean z11 = this.f8651i;
            j11 = this.f8647e;
            if (z11) {
                long j16 = cVar.f68957l;
                j11 += j16;
                j12 = j16 + j15;
            } else {
                j12 = j15;
            }
            this.f8657o = j14 + j11;
            this.f8658p = j15 == Long.MIN_VALUE ? Long.MIN_VALUE : j14 + j12;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C2999d c2999d = arrayList.get(i11);
                long j17 = this.f8657o;
                long j18 = this.f8658p;
                c2999d.f8637e = j17;
                c2999d.f8638f = j18;
            }
            j13 = j12;
        } else {
            j11 = this.f8657o - j14;
            j13 = j15 != Long.MIN_VALUE ? this.f8658p - j14 : Long.MIN_VALUE;
        }
        try {
            b bVar2 = new b(abstractC7252H, j11, j13, this.f8652j);
            this.f8655m = bVar2;
            refreshSourceInfo(bVar2);
        } catch (c e11) {
            this.f8656n = e11;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList.get(i12).b(this.f8656n);
            }
        }
    }

    @Override // F3.InterfaceC3018x
    public final InterfaceC3017w createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        C2999d c2999d = new C2999d(this.f8673d.createPeriod(bVar, bVar2, j11), this.f8649g, this.f8657o, this.f8658p);
        this.f8653k.add(c2999d);
        return c2999d;
    }

    @Override // F3.f0
    protected final void i(AbstractC7252H abstractC7252H) {
        if (this.f8656n != null) {
            return;
        }
        k(abstractC7252H);
    }

    @Override // F3.AbstractC3002g, F3.InterfaceC3018x
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        c cVar = this.f8656n;
        if (cVar != null) {
            throw cVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // F3.InterfaceC3018x
    public final void releasePeriod(InterfaceC3017w interfaceC3017w) {
        ArrayList<C2999d> arrayList = this.f8653k;
        G10.a.h(arrayList.remove(interfaceC3017w));
        this.f8673d.releasePeriod(((C2999d) interfaceC3017w).f8633a);
        if (!arrayList.isEmpty() || this.f8650h) {
            return;
        }
        b bVar = this.f8655m;
        bVar.getClass();
        k(bVar.timeline);
    }

    @Override // F3.AbstractC3002g, F3.AbstractC2996a
    protected final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f8656n = null;
        this.f8655m = null;
    }
}
