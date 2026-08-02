package c2;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import u2.C1640q;
import u2.InterfaceC1636m;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class L implements u2.H {

    /* renamed from: A, reason: collision with root package name */
    public C1640q f10185A;

    /* renamed from: C, reason: collision with root package name */
    public V f10187C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10188D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ O f10189E;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10190a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.T f10191b;

    /* renamed from: c, reason: collision with root package name */
    public final C1726n0 f10192c;

    /* renamed from: d, reason: collision with root package name */
    public final O f10193d;

    /* renamed from: e, reason: collision with root package name */
    public final F1.y f10194e;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f10196x;

    /* renamed from: z, reason: collision with root package name */
    public long f10198z;

    /* renamed from: f, reason: collision with root package name */
    public final E4.y f10195f = new E4.y();

    /* renamed from: y, reason: collision with root package name */
    public boolean f10197y = true;

    /* renamed from: B, reason: collision with root package name */
    public long f10186B = -1;

    public L(O o7, Uri uri, InterfaceC1636m interfaceC1636m, C1726n0 c1726n0, O o8, F1.y yVar) {
        this.f10189E = o7;
        this.f10190a = uri;
        this.f10191b = new u2.T(interfaceC1636m);
        this.f10192c = c1726n0;
        this.f10193d = o8;
        this.f10194e = yVar;
        C0814u.f10405a.getAndIncrement();
        this.f10185A = a(0L);
    }

    public final C1640q a(long j) {
        Collections.emptyMap();
        this.f10189E.getClass();
        Map map = O.c0;
        Uri uri = this.f10190a;
        if (uri != null) {
            return new C1640q(uri, 1, null, map, j, -1L, null, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    @Override // u2.H
    public final void l() {
        this.f10196x = true;
    }

    @Override // u2.H
    public final void load() {
        InterfaceC1636m interfaceC1636m;
        int i7;
        int i8 = 0;
        while (i8 == 0 && !this.f10196x) {
            try {
                long j = this.f10195f.f2247a;
                C1640q a2 = a(j);
                this.f10185A = a2;
                long o7 = this.f10191b.o(a2);
                this.f10186B = o7;
                if (o7 != -1) {
                    this.f10186B = o7 + j;
                }
                this.f10189E.f10211H = IcyHeaders.a(this.f10191b.f16753a.k());
                u2.T t7 = this.f10191b;
                IcyHeaders icyHeaders = this.f10189E.f10211H;
                if (icyHeaders == null || (i7 = icyHeaders.f10598f) == -1) {
                    interfaceC1636m = t7;
                } else {
                    interfaceC1636m = new C0813t(t7, i7, this);
                    O o8 = this.f10189E;
                    o8.getClass();
                    V t8 = o8.t(new N(0, true));
                    this.f10187C = t8;
                    t8.a(O.f10203d0);
                }
                long j3 = j;
                this.f10192c.B(interfaceC1636m, this.f10190a, this.f10191b.f16753a.k(), j, this.f10186B, this.f10193d);
                if (this.f10189E.f10211H != null) {
                    F1.k kVar = (F1.k) this.f10192c.f17806c;
                    if (kVar instanceof M1.d) {
                        ((M1.d) kVar).f4563r = true;
                    }
                }
                if (this.f10197y) {
                    C1726n0 c1726n0 = this.f10192c;
                    long j7 = this.f10198z;
                    F1.k kVar2 = (F1.k) c1726n0.f17806c;
                    kVar2.getClass();
                    kVar2.g(j3, j7);
                    this.f10197y = false;
                }
                while (true) {
                    long j8 = j3;
                    while (i8 == 0 && !this.f10196x) {
                        try {
                            F1.y yVar = this.f10194e;
                            synchronized (yVar) {
                                while (!yVar.f2588a) {
                                    yVar.wait();
                                }
                            }
                            C1726n0 c1726n02 = this.f10192c;
                            E4.y yVar2 = this.f10195f;
                            F1.k kVar3 = (F1.k) c1726n02.f17806c;
                            kVar3.getClass();
                            F1.h hVar = (F1.h) c1726n02.f17807d;
                            hVar.getClass();
                            i8 = kVar3.f(hVar, yVar2);
                            j3 = this.f10192c.s();
                            if (j3 > this.f10189E.f10240z + j8) {
                                F1.y yVar3 = this.f10194e;
                                synchronized (yVar3) {
                                    yVar3.f2588a = false;
                                }
                                O o9 = this.f10189E;
                                o9.f10209F.post(o9.f10208E);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (i8 == 1) {
                    i8 = 0;
                } else if (this.f10192c.s() != -1) {
                    this.f10195f.f2247a = this.f10192c.s();
                }
                q6.a.b(this.f10191b);
            } catch (Throwable th) {
                if (i8 != 1 && this.f10192c.s() != -1) {
                    this.f10195f.f2247a = this.f10192c.s();
                }
                q6.a.b(this.f10191b);
                throw th;
            }
        }
    }
}
