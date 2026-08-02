package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC1117ie extends AbstractC0690Td implements TextureView.SurfaceTextureListener, InterfaceC0718Xd {

    /* renamed from: A, reason: collision with root package name */
    public int f13941A;

    /* renamed from: B, reason: collision with root package name */
    public int f13942B;

    /* renamed from: C, reason: collision with root package name */
    public float f13943C;

    /* renamed from: m, reason: collision with root package name */
    public final C0733Ze f13944m;

    /* renamed from: n, reason: collision with root package name */
    public final C0848ce f13945n;

    /* renamed from: o, reason: collision with root package name */
    public final C0804be f13946o;

    /* renamed from: p, reason: collision with root package name */
    public C0711Wd f13947p;

    /* renamed from: q, reason: collision with root package name */
    public Surface f13948q;

    /* renamed from: r, reason: collision with root package name */
    public C0614Ie f13949r;

    /* renamed from: s, reason: collision with root package name */
    public String f13950s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f13951t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13952u;

    /* renamed from: v, reason: collision with root package name */
    public int f13953v;

    /* renamed from: w, reason: collision with root package name */
    public C0759ae f13954w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13955x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13956y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13957z;

    public TextureViewSurfaceTextureListenerC1117ie(Context context, C0848ce c0848ce, C0733Ze c0733Ze, boolean z3, C0804be c0804be) {
        super(context);
        this.f13953v = 1;
        this.f13944m = c0733Ze;
        this.f13945n = c0848ce;
        this.f13955x = z3;
        this.f13946o = c0804be;
        setSurfaceTextureListener(this);
        c0848ce.a(this);
    }

    public static String E(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final Integer A() {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            return c0614Ie.f9547A;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void B(int i) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            C0577De c0577De = c0614Ie.f9552l;
            synchronized (c0577De) {
                c0577De.f8211d = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void C(int i) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            C0577De c0577De = c0614Ie.f9552l;
            synchronized (c0577De) {
                c0577De.f8212e = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void D(int i) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            C0577De c0577De = c0614Ie.f9552l;
            synchronized (c0577De) {
                c0577De.f8210c = i * 1000;
            }
        }
    }

    public final void F() {
        if (this.f13956y) {
            return;
        }
        this.f13956y = true;
        T2.L.f5672l.post(new RunnableC0982fe(this, 7));
        m();
        C0848ce c0848ce = this.f13945n;
        if (c0848ce.i && !c0848ce.f13013j) {
            AbstractC1803xs.m(c0848ce.f13010e, c0848ce.f13009d, "vfr2");
            c0848ce.f13013j = true;
        }
        if (this.f13957z) {
            t();
        }
    }

    public final void G(boolean z3, Integer num) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null && !z3) {
            c0614Ie.f9547A = num;
            return;
        }
        if (this.f13950s == null || this.f13948q == null) {
            return;
        }
        if (z3) {
            if (!K()) {
                U2.j.i("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            ME me = c0614Ie.f9557q;
            me.f10609n.d();
            me.f10608m.w();
            H();
        }
        if (this.f13950s.startsWith("cache:")) {
            AbstractC1744we a12 = this.f13944m.f12501k.a1(this.f13950s);
            if (a12 instanceof C0553Ae) {
                C0553Ae c0553Ae = (C0553Ae) a12;
                synchronized (c0553Ae) {
                    c0553Ae.f7605q = true;
                    c0553Ae.notify();
                }
                C0614Ie c0614Ie2 = c0553Ae.f7602n;
                c0614Ie2.f9560t = null;
                c0553Ae.f7602n = null;
                this.f13949r = c0614Ie2;
                c0614Ie2.f9547A = num;
                if (c0614Ie2.f9557q == null) {
                    U2.j.i("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(a12 instanceof C1879ze)) {
                    U2.j.i("Stream cache miss: ".concat(String.valueOf(this.f13950s)));
                    return;
                }
                C1879ze c1879ze = (C1879ze) a12;
                T2.L l5 = P2.o.f4767B.f4771c;
                C0733Ze c0733Ze = this.f13944m;
                l5.x(c0733Ze.getContext(), c0733Ze.f12501k.f12885o.f5852k);
                ByteBuffer t5 = c1879ze.t();
                boolean z5 = c1879ze.f16630x;
                String str = c1879ze.f16620n;
                if (str == null) {
                    U2.j.i("Stream cache URL is null.");
                    return;
                }
                C0733Ze c0733Ze2 = this.f13944m;
                C0614Ie c0614Ie3 = new C0614Ie(c0733Ze2.getContext(), this.f13946o, c0733Ze2, num);
                U2.j.h("ExoPlayerAdapter initialized.");
                this.f13949r = c0614Ie3;
                c0614Ie3.p(new Uri[]{Uri.parse(str)}, t5, z5);
            }
        } else {
            C0733Ze c0733Ze3 = this.f13944m;
            C0614Ie c0614Ie4 = new C0614Ie(c0733Ze3.getContext(), this.f13946o, c0733Ze3, num);
            U2.j.h("ExoPlayerAdapter initialized.");
            this.f13949r = c0614Ie4;
            T2.L l6 = P2.o.f4767B.f4771c;
            C0733Ze c0733Ze4 = this.f13944m;
            l6.x(c0733Ze4.getContext(), c0733Ze4.f12501k.f12885o.f5852k);
            Uri[] uriArr = new Uri[this.f13951t.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f13951t;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            C0614Ie c0614Ie5 = this.f13949r;
            c0614Ie5.getClass();
            c0614Ie5.p(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f13949r.f9560t = this;
        I(this.f13948q);
        ME me2 = this.f13949r.f9557q;
        if (me2 != null) {
            int c5 = me2.c();
            this.f13953v = c5;
            if (c5 == 3) {
                F();
            }
        }
    }

    public final void H() {
        if (this.f13949r != null) {
            I(null);
            C0614Ie c0614Ie = this.f13949r;
            if (c0614Ie != null) {
                c0614Ie.f9560t = null;
                ME me = c0614Ie.f9557q;
                if (me != null) {
                    me.f10609n.d();
                    me.f10608m.p1(c0614Ie);
                    ME me2 = c0614Ie.f9557q;
                    me2.f10609n.d();
                    me2.f10608m.J1();
                    c0614Ie.f9557q = null;
                    C0614Ie.f9546F.decrementAndGet();
                }
                this.f13949r = null;
            }
            this.f13953v = 1;
            this.f13952u = false;
            this.f13956y = false;
            this.f13957z = false;
        }
    }

    public final void I(Surface surface) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie == null) {
            U2.j.i("Trying to set surface before player is initialized.");
            return;
        }
        try {
            ME me = c0614Ie.f9557q;
            if (me != null) {
                me.f10609n.d();
                C1109iE c1109iE = me.f10608m;
                c1109iE.t0();
                c1109iE.z1(surface);
                int i = surface == null ? 0 : -1;
                c1109iE.x1(i, i);
            }
        } catch (IOException e3) {
            U2.j.j("", e3);
        }
    }

    public final boolean J() {
        return K() && this.f13953v != 1;
    }

    public final boolean K() {
        C0614Ie c0614Ie = this.f13949r;
        return (c0614Ie == null || c0614Ie.f9557q == null || this.f13952u) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void a(int i) {
        C0614Ie c0614Ie;
        if (this.f13953v != i) {
            this.f13953v = i;
            if (i == 3) {
                F();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f13946o.f12836a && (c0614Ie = this.f13949r) != null) {
                c0614Ie.q(false);
            }
            this.f13945n.f13016m = false;
            C0937ee c0937ee = this.f11653l;
            c0937ee.f13320d = false;
            c0937ee.a();
            T2.L.f5672l.post(new RunnableC0982fe(this, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void b(int i, int i5) {
        this.f13941A = i;
        this.f13942B = i5;
        float f = i5 > 0 ? i / i5 : 1.0f;
        if (this.f13943C != f) {
            this.f13943C = f;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void c(int i) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            C0577De c0577De = c0614Ie.f9552l;
            synchronized (c0577De) {
                c0577De.f8209b = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void d(long j5, boolean z3) {
        if (this.f13944m != null) {
            AbstractC0613Id.f.execute(new RunnableC1027ge(this, z3, j5, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void e(IOException iOException) {
        String E5 = E("onLoadException", iOException);
        U2.j.i("ExoPlayerAdapter exception: ".concat(E5));
        P2.o.f4767B.f4774g.h("AdExoPlayerView.onException", iOException);
        T2.L.f5672l.post(new RunnableC1072he(this, E5, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void f(int i) {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            Iterator it = c0614Ie.f9550D.iterator();
            while (it.hasNext()) {
                C0569Ce c0569Ce = (C0569Ce) ((WeakReference) it.next()).get();
                if (c0569Ce != null) {
                    c0569Ce.f8025B = i;
                    Iterator it2 = c0569Ce.f8026C.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c0569Ce.f8025B);
                            } catch (SocketException e3) {
                                U2.j.j("Failed to update receive buffer size.", e3);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void g(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f13951t = new String[]{str};
        } else {
            this.f13951t = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f13950s;
        boolean z3 = false;
        if (this.f13946o.f12844k && str2 != null && !str.equals(str2) && this.f13953v == 4) {
            z3 = true;
        }
        this.f13950s = str;
        G(z3, num);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void h(String str, Exception exc) {
        C0614Ie c0614Ie;
        String E5 = E(str, exc);
        U2.j.i("ExoPlayerAdapter error: ".concat(E5));
        this.f13952u = true;
        if (this.f13946o.f12836a && (c0614Ie = this.f13949r) != null) {
            c0614Ie.q(false);
        }
        T2.L.f5672l.post(new RunnableC1072he(this, E5, 1));
        P2.o.f4767B.f4774g.h("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int i() {
        if (J()) {
            return (int) this.f13949r.f9557q.s1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int j() {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            return c0614Ie.f9562v;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int k() {
        if (J()) {
            return (int) this.f13949r.f9557q.u1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int l() {
        return this.f13942B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0893de
    public final void m() {
        T2.L.f5672l.post(new RunnableC0982fe(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int n() {
        return this.f13941A;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long o() {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            return c0614Ie.s();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f13943C;
        if (f != 0.0f && this.f13954w == null) {
            float f5 = measuredWidth;
            float f6 = f5 / measuredHeight;
            if (f > f6) {
                measuredHeight = (int) (f5 / f);
            }
            if (f < f6) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C0759ae c0759ae = this.f13954w;
        if (c0759ae != null) {
            c0759ae.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i5) {
        C0614Ie c0614Ie;
        float f;
        int i6;
        SurfaceTexture surfaceTexture2;
        if (this.f13955x) {
            C0759ae c0759ae = new C0759ae(getContext());
            this.f13954w = c0759ae;
            c0759ae.f12684w = i;
            c0759ae.f12683v = i5;
            c0759ae.f12686y = surfaceTexture;
            c0759ae.start();
            C0759ae c0759ae2 = this.f13954w;
            if (c0759ae2.f12686y == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c0759ae2.f12666D.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c0759ae2.f12685x;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f13954w.c();
                this.f13954w = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f13948q = surface;
        if (this.f13949r == null) {
            G(false, null);
        } else {
            I(surface);
            if (!this.f13946o.f12836a && (c0614Ie = this.f13949r) != null) {
                c0614Ie.q(true);
            }
        }
        int i7 = this.f13941A;
        if (i7 == 0 || (i6 = this.f13942B) == 0) {
            f = i5 > 0 ? i / i5 : 1.0f;
            if (this.f13943C != f) {
                this.f13943C = f;
                requestLayout();
            }
        } else {
            f = i6 > 0 ? i7 / i6 : 1.0f;
            if (this.f13943C != f) {
                this.f13943C = f;
                requestLayout();
            }
        }
        T2.L.f5672l.post(new RunnableC0982fe(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        s();
        C0759ae c0759ae = this.f13954w;
        if (c0759ae != null) {
            c0759ae.c();
            this.f13954w = null;
        }
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            if (c0614Ie != null) {
                c0614Ie.q(false);
            }
            Surface surface = this.f13948q;
            if (surface != null) {
                surface.release();
            }
            this.f13948q = null;
            I(null);
        }
        T2.L.f5672l.post(new RunnableC0982fe(this, 3));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i5) {
        C0759ae c0759ae = this.f13954w;
        if (c0759ae != null) {
            c0759ae.b(i, i5);
        }
        T2.L.f5672l.post(new RunnableC0676Rd(this, i, i5, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13945n.d(this);
        this.f11652k.a(surfaceTexture, this.f13947p);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        T2.G.m("AdExoPlayerView3 window visibility changed to " + i);
        T2.L.f5672l.post(new RunnableC0920e5(i, 3, this));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long p() {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie == null) {
            return -1L;
        }
        if (c0614Ie.f9549C == null || !c0614Ie.f9549C.f8534y) {
            return c0614Ie.f9561u;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long q() {
        C0614Ie c0614Ie = this.f13949r;
        if (c0614Ie != null) {
            return c0614Ie.o();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final String r() {
        return "ExoPlayer/2".concat(true != this.f13955x ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void s() {
        C0614Ie c0614Ie;
        if (J()) {
            if (this.f13946o.f12836a && (c0614Ie = this.f13949r) != null) {
                c0614Ie.q(false);
            }
            ME me = this.f13949r.f9557q;
            me.f10609n.d();
            me.f10608m.F1(false);
            this.f13945n.f13016m = false;
            C0937ee c0937ee = this.f11653l;
            c0937ee.f13320d = false;
            c0937ee.a();
            T2.L.f5672l.post(new RunnableC0982fe(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void t() {
        C0614Ie c0614Ie;
        if (!J()) {
            this.f13957z = true;
            return;
        }
        if (this.f13946o.f12836a && (c0614Ie = this.f13949r) != null) {
            c0614Ie.q(true);
        }
        ME me = this.f13949r.f9557q;
        me.f10609n.d();
        me.f10608m.F1(true);
        this.f13945n.b();
        C0937ee c0937ee = this.f11653l;
        c0937ee.f13320d = true;
        c0937ee.a();
        this.f11652k.f12348c = true;
        T2.L.f5672l.post(new RunnableC0982fe(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void u(int i) {
        if (J()) {
            long j5 = i;
            ME me = this.f13949r.f9557q;
            me.Y0(me.b1(), j5);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void v(C0711Wd c0711Wd) {
        this.f13947p = c0711Wd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void w(String str) {
        if (str != null) {
            g(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void x() {
        if (K()) {
            ME me = this.f13949r.f9557q;
            me.f10609n.d();
            me.f10608m.w();
            H();
        }
        C0848ce c0848ce = this.f13945n;
        c0848ce.f13016m = false;
        C0937ee c0937ee = this.f11653l;
        c0937ee.f13320d = false;
        c0937ee.a();
        c0848ce.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void y() {
        T2.L.f5672l.post(new RunnableC0982fe(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void z(float f, float f5) {
        C0759ae c0759ae = this.f13954w;
        if (c0759ae != null) {
            c0759ae.d(f, f5);
        }
    }
}
