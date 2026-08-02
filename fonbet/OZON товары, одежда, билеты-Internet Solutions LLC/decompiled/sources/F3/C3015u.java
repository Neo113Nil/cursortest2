package F3;

import F3.InterfaceC3018x;
import android.util.Pair;
import j3.AbstractC7252H;
import j3.C7259a;
import j3.C7275q;
import java.util.Objects;

/* renamed from: F3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3015u extends f0 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8732e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC7252H.c f8733f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC7252H.b f8734g;

    /* renamed from: h, reason: collision with root package name */
    private a f8735h;

    /* renamed from: i, reason: collision with root package name */
    private C3014t f8736i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8737j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8738k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8739l;

    /* renamed from: F3.u$a */
    private static final class a extends AbstractC3012q {

        /* renamed from: c, reason: collision with root package name */
        public static final Object f8740c = new Object();

        /* renamed from: a, reason: collision with root package name */
        private final Object f8741a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f8742b;

        private a(AbstractC7252H abstractC7252H, Object obj, Object obj2) {
            super(abstractC7252H);
            this.f8741a = obj;
            this.f8742b = obj2;
        }

        public static a c(C7275q c7275q) {
            return new a(new b(c7275q), AbstractC7252H.c.f68944q, f8740c);
        }

        public static a d(AbstractC7252H abstractC7252H, Object obj, Object obj2) {
            return new a(abstractC7252H, obj, obj2);
        }

        public final a b(AbstractC7252H abstractC7252H) {
            return new a(abstractC7252H, this.f8741a, this.f8742b);
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final int getIndexOfPeriod(Object obj) {
            Object obj2;
            AbstractC7252H abstractC7252H = this.timeline;
            if (f8740c.equals(obj) && (obj2 = this.f8742b) != null) {
                obj = obj2;
            }
            return abstractC7252H.getIndexOfPeriod(obj);
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
            this.timeline.getPeriod(i11, bVar, z11);
            if (Objects.equals(bVar.f68938b, this.f8742b) && z11) {
                bVar.f68938b = f8740c;
            }
            return bVar;
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final Object getUidOfPeriod(int i11) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i11);
            return Objects.equals(uidOfPeriod, this.f8742b) ? f8740c : uidOfPeriod;
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
            this.timeline.getWindow(i11, cVar, j11);
            if (Objects.equals(cVar.f68946a, this.f8741a)) {
                cVar.f68946a = AbstractC7252H.c.f68944q;
            }
            return cVar;
        }
    }

    /* renamed from: F3.u$b */
    public static final class b extends AbstractC7252H {

        /* renamed from: a, reason: collision with root package name */
        private final C7275q f8743a;

        public b(C7275q c7275q) {
            this.f8743a = c7275q;
        }

        @Override // j3.AbstractC7252H
        public final int getIndexOfPeriod(Object obj) {
            return obj == a.f8740c ? 0 : -1;
        }

        @Override // j3.AbstractC7252H
        public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
            bVar.h(z11 ? 0 : null, z11 ? a.f8740c : null, 0, -9223372036854775807L, 0L, C7259a.f69046c, true);
            return bVar;
        }

        @Override // j3.AbstractC7252H
        public final int getPeriodCount() {
            return 1;
        }

        @Override // j3.AbstractC7252H
        public final Object getUidOfPeriod(int i11) {
            return a.f8740c;
        }

        @Override // j3.AbstractC7252H
        public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
            Object obj = AbstractC7252H.c.f68944q;
            cVar.b(this.f8743a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
            cVar.f68956k = true;
            return cVar;
        }

        @Override // j3.AbstractC7252H
        public final int getWindowCount() {
            return 1;
        }
    }

    public C3015u(InterfaceC3018x interfaceC3018x, boolean z11) {
        super(interfaceC3018x);
        this.f8732e = z11 && interfaceC3018x.b();
        this.f8733f = new AbstractC7252H.c();
        this.f8734g = new AbstractC7252H.b();
        AbstractC7252H a11 = interfaceC3018x.a();
        if (a11 == null) {
            this.f8735h = a.c(interfaceC3018x.getMediaItem());
        } else {
            this.f8735h = a.d(a11, null, null);
            this.f8739l = true;
        }
    }

    private boolean m(long j11) {
        C3014t c3014t = this.f8736i;
        int indexOfPeriod = this.f8735h.getIndexOfPeriod(c3014t.f8724a.f8751a);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j12 = this.f8735h.getPeriod(indexOfPeriod, this.f8734g).f68940d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        c3014t.g(j11);
        return true;
    }

    @Override // F3.f0
    protected final InterfaceC3018x.b h(InterfaceC3018x.b bVar) {
        Object obj = bVar.f8751a;
        if (this.f8735h.f8742b != null && this.f8735h.f8742b.equals(obj)) {
            obj = a.f8740c;
        }
        return bVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c2  */
    @Override // F3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void i(AbstractC7252H abstractC7252H) {
        long j11;
        C3014t c3014t;
        Object obj;
        Object obj2;
        InterfaceC3018x.b a11;
        if (this.f8738k) {
            this.f8735h = this.f8735h.b(abstractC7252H);
            C3014t c3014t2 = this.f8736i;
            if (c3014t2 != null) {
                m(c3014t2.b());
            }
        } else if (abstractC7252H.isEmpty()) {
            this.f8735h = this.f8739l ? this.f8735h.b(abstractC7252H) : a.d(abstractC7252H, AbstractC7252H.c.f68944q, a.f8740c);
        } else {
            AbstractC7252H.c cVar = this.f8733f;
            abstractC7252H.getWindow(0, cVar);
            long j12 = cVar.f68957l;
            Object obj3 = cVar.f68946a;
            C3014t c3014t3 = this.f8736i;
            if (c3014t3 != null) {
                long f7 = c3014t3.f();
                a aVar = this.f8735h;
                Object obj4 = this.f8736i.f8724a.f8751a;
                AbstractC7252H.b bVar = this.f8734g;
                aVar.getPeriodByUid(obj4, bVar);
                long j13 = bVar.f68941e + f7;
                if (j13 != this.f8735h.getWindow(0, cVar).f68957l) {
                    j11 = j13;
                    Pair<Object, Long> periodPositionUs = abstractC7252H.getPeriodPositionUs(this.f8733f, this.f8734g, 0, j11);
                    Object obj5 = periodPositionUs.first;
                    long longValue = ((Long) periodPositionUs.second).longValue();
                    this.f8735h = !this.f8739l ? this.f8735h.b(abstractC7252H) : a.d(abstractC7252H, obj3, obj5);
                    c3014t = this.f8736i;
                    if (c3014t != null && m(longValue)) {
                        InterfaceC3018x.b bVar2 = c3014t.f8724a;
                        obj = this.f8735h.f8742b;
                        obj2 = bVar2.f8751a;
                        if (obj != null && obj2.equals(a.f8740c)) {
                            obj2 = this.f8735h.f8742b;
                        }
                        a11 = bVar2.a(obj2);
                        this.f8739l = true;
                        this.f8738k = true;
                        refreshSourceInfo(this.f8735h);
                        if (a11 != null) {
                            C3014t c3014t4 = this.f8736i;
                            c3014t4.getClass();
                            c3014t4.a(a11);
                            return;
                        }
                        return;
                    }
                }
            }
            j11 = j12;
            Pair<Object, Long> periodPositionUs2 = abstractC7252H.getPeriodPositionUs(this.f8733f, this.f8734g, 0, j11);
            Object obj52 = periodPositionUs2.first;
            long longValue2 = ((Long) periodPositionUs2.second).longValue();
            this.f8735h = !this.f8739l ? this.f8735h.b(abstractC7252H) : a.d(abstractC7252H, obj3, obj52);
            c3014t = this.f8736i;
            if (c3014t != null) {
                InterfaceC3018x.b bVar22 = c3014t.f8724a;
                obj = this.f8735h.f8742b;
                obj2 = bVar22.f8751a;
                if (obj != null) {
                    obj2 = this.f8735h.f8742b;
                }
                a11 = bVar22.a(obj2);
                this.f8739l = true;
                this.f8738k = true;
                refreshSourceInfo(this.f8735h);
                if (a11 != null) {
                }
            }
        }
        a11 = null;
        this.f8739l = true;
        this.f8738k = true;
        refreshSourceInfo(this.f8735h);
        if (a11 != null) {
        }
    }

    @Override // F3.f0
    public final void j() {
        if (this.f8732e) {
            return;
        }
        this.f8737j = true;
        g(null, this.f8673d);
    }

    @Override // F3.InterfaceC3018x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C3014t createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        C3014t c3014t = new C3014t(bVar, bVar2, j11);
        InterfaceC3018x interfaceC3018x = this.f8673d;
        c3014t.i(interfaceC3018x);
        if (!this.f8738k) {
            this.f8736i = c3014t;
            if (!this.f8737j) {
                this.f8737j = true;
                g(null, interfaceC3018x);
            }
            return c3014t;
        }
        Object obj = this.f8735h.f8742b;
        Object obj2 = bVar.f8751a;
        if (obj != null && obj2.equals(a.f8740c)) {
            obj2 = this.f8735h.f8742b;
        }
        c3014t.a(bVar.a(obj2));
        return c3014t;
    }

    public final AbstractC7252H l() {
        return this.f8735h;
    }

    @Override // F3.InterfaceC3018x
    public final void releasePeriod(InterfaceC3017w interfaceC3017w) {
        ((C3014t) interfaceC3017w).h();
        if (interfaceC3017w == this.f8736i) {
            this.f8736i = null;
        }
    }

    @Override // F3.AbstractC3002g, F3.AbstractC2996a
    public final void releaseSourceInternal() {
        this.f8738k = false;
        this.f8737j = false;
        super.releaseSourceInternal();
    }

    @Override // F3.f0, F3.InterfaceC3018x
    public final void updateMediaItem(C7275q c7275q) {
        if (this.f8739l) {
            this.f8735h = this.f8735h.b(new c0(this.f8735h.timeline, c7275q));
        } else {
            this.f8735h = a.c(c7275q);
        }
        this.f8673d.updateMediaItem(c7275q);
    }
}
