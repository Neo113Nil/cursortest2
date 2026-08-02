package androidx.media3.exoplayer;

import F3.C3010o;
import F3.InterfaceC3018x;
import N3.C3660k;
import N3.C3662m;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.C5445g;
import androidx.media3.exoplayer.L;
import androidx.media3.exoplayer.image.ImageOutput;
import j3.C7263e;
import m3.C8053F;
import m3.InterfaceC8064f;
import p3.j;
import t3.C9740f;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public interface ExoPlayer extends j3.y {

    public interface a {
        default void q() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Context f43541a;

        /* renamed from: b, reason: collision with root package name */
        C8053F f43542b;

        /* renamed from: c, reason: collision with root package name */
        O7.p<t3.G> f43543c;

        /* renamed from: d, reason: collision with root package name */
        O7.p<InterfaceC3018x.a> f43544d;

        /* renamed from: e, reason: collision with root package name */
        t3.k f43545e;

        /* renamed from: f, reason: collision with root package name */
        O7.p<L> f43546f;

        /* renamed from: g, reason: collision with root package name */
        O7.p<J3.d> f43547g;

        /* renamed from: h, reason: collision with root package name */
        C3660k f43548h;

        /* renamed from: i, reason: collision with root package name */
        Looper f43549i;

        /* renamed from: j, reason: collision with root package name */
        int f43550j;

        /* renamed from: k, reason: collision with root package name */
        C7263e f43551k;

        /* renamed from: l, reason: collision with root package name */
        int f43552l;

        /* renamed from: m, reason: collision with root package name */
        boolean f43553m;

        /* renamed from: n, reason: collision with root package name */
        t3.I f43554n;

        /* renamed from: o, reason: collision with root package name */
        t3.H f43555o;

        /* renamed from: p, reason: collision with root package name */
        long f43556p;

        /* renamed from: q, reason: collision with root package name */
        long f43557q;

        /* renamed from: r, reason: collision with root package name */
        long f43558r;

        /* renamed from: s, reason: collision with root package name */
        C5445g f43559s;

        /* renamed from: t, reason: collision with root package name */
        long f43560t;

        /* renamed from: u, reason: collision with root package name */
        long f43561u;

        /* renamed from: v, reason: collision with root package name */
        boolean f43562v;

        /* renamed from: w, reason: collision with root package name */
        boolean f43563w;

        /* renamed from: x, reason: collision with root package name */
        String f43564x;

        public b(final Context context) {
            O7.p<t3.G> pVar = new O7.p() { // from class: t3.i
                @Override // O7.p
                public final Object get() {
                    return new C9740f(context);
                }
            };
            O7.p<InterfaceC3018x.a> pVar2 = new O7.p() { // from class: t3.j
                @Override // O7.p
                public final Object get() {
                    return new C3010o(new j.a(context), new C3662m());
                }
            };
            t3.k kVar = new t3.k(context);
            C5450l c5450l = new C5450l();
            O7.p<J3.d> pVar3 = new O7.p() { // from class: t3.l
                @Override // O7.p
                public final Object get() {
                    return J3.g.g(context);
                }
            };
            C3660k c3660k = new C3660k();
            context.getClass();
            this.f43541a = context;
            this.f43543c = pVar;
            this.f43544d = pVar2;
            this.f43545e = kVar;
            this.f43546f = c5450l;
            this.f43547g = pVar3;
            this.f43548h = c3660k;
            int i11 = m3.N.f74289a;
            Looper myLooper = Looper.myLooper();
            this.f43549i = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.f43551k = C7263e.f69057b;
            this.f43552l = 1;
            this.f43553m = true;
            this.f43554n = t3.I.f98999c;
            this.f43556p = 5000L;
            this.f43557q = 15000L;
            this.f43558r = 3000L;
            this.f43555o = t3.H.f98988f;
            this.f43559s = new C5445g.a().a();
            this.f43542b = InterfaceC8064f.f74315a;
            this.f43560t = 500L;
            this.f43561u = 2000L;
            this.f43562v = true;
            this.f43564x = "";
            this.f43550j = -1000;
            if (Build.VERSION.SDK_INT >= 35) {
            }
        }

        public final ExoPlayer a() {
            G10.a.h(!this.f43563w);
            this.f43563w = true;
            return new E(this);
        }

        public final void b(final J3.g gVar) {
            G10.a.h(!this.f43563w);
            gVar.getClass();
            this.f43547g = new O7.p() { // from class: t3.o
                @Override // O7.p
                public final Object get() {
                    return J3.g.this;
                }
            };
        }

        public final void c(final L l11) {
            G10.a.h(!this.f43563w);
            l11.getClass();
            this.f43546f = new O7.p() { // from class: t3.n
                @Override // O7.p
                public final Object get() {
                    return L.this;
                }
            };
        }

        public final void d(Looper looper) {
            G10.a.h(!this.f43563w);
            looper.getClass();
            this.f43549i = looper;
        }

        public final void e(final C3010o c3010o) {
            G10.a.h(!this.f43563w);
            this.f43544d = new O7.p() { // from class: t3.m
                @Override // O7.p
                public final Object get() {
                    return C3010o.this;
                }
            };
        }

        public final void f(final C9740f c9740f) {
            G10.a.h(!this.f43563w);
            this.f43543c = new O7.p() { // from class: t3.p
                @Override // O7.p
                public final Object get() {
                    return C9740f.this;
                }
            };
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43565a = new c();
    }

    @Override // 
    /* renamed from: Q */
    C5449k a();

    void X(InterfaceC3018x interfaceC3018x, long j11);

    void c(InterfaceC9928b interfaceC9928b);

    boolean isScrubbingModeEnabled();

    void release();

    void removeAnalyticsListener(InterfaceC9928b interfaceC9928b);

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z11);
}
