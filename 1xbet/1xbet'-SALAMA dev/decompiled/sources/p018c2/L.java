package p018c2;

import F1.h;
import F1.k;
import F1.y;
import M1.d;
import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import p146u2.C0958q;
import p146u2.H;
import p146u2.InterfaceC0954m;
import p146u2.T;
import p155w1.C1017n0;
import q6.a;

/* JADX INFO: loaded from: classes.dex */
public final class L implements H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0958q f10185A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public V f10187C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10188D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ O f10189E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f10190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f10191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1017n0 f10192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O f10193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f10194e;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f10196x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10198z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E4.y f10195f = new E4.y();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10197y = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f10186B = -1;

    public L(O o7, Uri uri, InterfaceC0954m interfaceC0954m, C1017n0 c1017n0, O o8, y yVar) {
        this.f10189E = o7;
        this.f10190a = uri;
        this.f10191b = new T(interfaceC0954m);
        this.f10192c = c1017n0;
        this.f10193d = o8;
        this.f10194e = yVar;
        C0774u.f10405a.getAndIncrement();
        this.f10185A = a(0L);
    }

    public final C0958q a(long j) {
        Collections.emptyMap();
        this.f10189E.getClass();
        Map map = O.c0;
        Uri uri = this.f10190a;
        if (uri != null) {
            return new C0958q(uri, 1, null, map, j, -1L, null, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    @Override // p146u2.H
    public final void l() {
        this.f10196x = true;
    }

    @Override // p146u2.H
    public final void load() {
        InterfaceC0954m c0773t;
        int i7;
        int iF = 0;
        while (iF == 0 && !this.f10196x) {
            try {
                long j = this.f10195f.f2247a;
                C0958q c0958qA = a(j);
                this.f10185A = c0958qA;
                long jO = this.f10191b.o(c0958qA);
                this.f10186B = jO;
                if (jO != -1) {
                    this.f10186B = jO + j;
                }
                this.f10189E.f10211H = IcyHeaders.a(this.f10191b.f16759a.k());
                T t7 = this.f10191b;
                IcyHeaders icyHeaders = this.f10189E.f10211H;
                if (icyHeaders == null || (i7 = icyHeaders.f10598f) == -1) {
                    c0773t = t7;
                } else {
                    c0773t = new C0773t(t7, i7, this);
                    O o7 = this.f10189E;
                    o7.getClass();
                    V vT = o7.t(new N(0, true));
                    this.f10187C = vT;
                    vT.a(O.f10203d0);
                }
                long jS = j;
                this.f10192c.B(c0773t, this.f10190a, this.f10191b.f16759a.k(), j, this.f10186B, this.f10193d);
                if (this.f10189E.f10211H != null) {
                    k kVar = (k) this.f10192c.f17812c;
                    if (kVar instanceof d) {
                        ((d) kVar).f4563r = true;
                    }
                }
                if (this.f10197y) {
                    C1017n0 c1017n0 = this.f10192c;
                    long j3 = this.f10198z;
                    k kVar2 = (k) c1017n0.f17812c;
                    kVar2.getClass();
                    kVar2.g(jS, j3);
                    this.f10197y = false;
                }
                while (true) {
                    long j7 = jS;
                    while (true) {
                        if (iF != 0 || this.f10196x) {
                            break;
                        }
                        try {
                            y yVar = this.f10194e;
                            synchronized (yVar) {
                                while (!yVar.f2588a) {
                                    try {
                                        yVar.wait();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            C1017n0 c1017n1 = this.f10192c;
                            E4.y yVar2 = this.f10195f;
                            k kVar3 = (k) c1017n1.f17812c;
                            kVar3.getClass();
                            h hVar = (h) c1017n1.f17813d;
                            hVar.getClass();
                            iF = kVar3.f(hVar, yVar2);
                            jS = this.f10192c.s();
                            if (jS > this.f10189E.f10240z + j7) {
                                y yVar3 = this.f10194e;
                                synchronized (yVar3) {
                                    yVar3.f2588a = false;
                                }
                                O o8 = this.f10189E;
                                o8.f10209F.post(o8.f10208E);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iF == 1) {
                    iF = 0;
                } else if (this.f10192c.s() != -1) {
                    this.f10195f.f2247a = this.f10192c.s();
                }
                a.b(this.f10191b);
            } catch (Throwable th2) {
                if (iF != 1 && this.f10192c.s() != -1) {
                    this.f10195f.f2247a = this.f10192c.s();
                }
                a.b(this.f10191b);
                throw th2;
            }
        }
    }
}
