package com.google.android.exoplayer2.metadata;

import A1.AbstractC0023i;
import A1.C0024i0;
import A1.C0026j0;
import A1.C0042s;
import A1.K;
import A1.N;
import A1.X;
import S1.b;
import S1.c;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import n3.AbstractC1464a;
import r5.C1578c;
import v2.t;
import w1.V0;

/* loaded from: classes.dex */
public final class a extends AbstractC0023i implements Handler.Callback {

    /* renamed from: D, reason: collision with root package name */
    public final b f10563D;

    /* renamed from: E, reason: collision with root package name */
    public final K f10564E;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f10565F;

    /* renamed from: G, reason: collision with root package name */
    public final c f10566G;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC1464a f10567H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f10568I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10569J;

    /* renamed from: K, reason: collision with root package name */
    public long f10570K;

    /* renamed from: L, reason: collision with root package name */
    public long f10571L;

    /* renamed from: M, reason: collision with root package name */
    public Metadata f10572M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(K k7, Looper looper) {
        super(5);
        Handler handler;
        b bVar = b.f6314a;
        this.f10564E = k7;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = t.f17153a;
            handler = new Handler(looper, this);
        }
        this.f10565F = handler;
        this.f10563D = bVar;
        this.f10566G = new c(1);
        this.f10571L = -9223372036854775807L;
    }

    public final void B(Metadata metadata, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (i7 >= entryArr.length) {
                return;
            }
            X f7 = entryArr[i7].f();
            if (f7 != null) {
                b bVar = this.f10563D;
                if (bVar.b(f7)) {
                    AbstractC1464a a2 = bVar.a(f7);
                    byte[] l7 = entryArr[i7].l();
                    l7.getClass();
                    c cVar = this.f10566G;
                    cVar.t();
                    cVar.z(l7.length);
                    cVar.f1697d.put(l7);
                    cVar.A();
                    Metadata n2 = a2.n(cVar);
                    if (n2 != null) {
                        B(n2, arrayList);
                    }
                    i7++;
                }
            }
            arrayList.add(entryArr[i7]);
            i7++;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        Metadata metadata = (Metadata) message.obj;
        K k7 = this.f10564E;
        N n2 = k7.f109a;
        C0024i0 a2 = n2.f152a0.a();
        int i7 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (i7 >= entryArr.length) {
                break;
            }
            entryArr[i7].h(a2);
            i7++;
        }
        n2.f152a0 = new C0026j0(a2);
        C0026j0 r7 = n2.r();
        boolean equals = r7.equals(n2.f137L);
        C1578c c1578c = n2.f164l;
        if (!equals) {
            n2.f137L = r7;
            c1578c.i(14, new C0042s(k7, 5));
        }
        c1578c.i(28, new C0042s(metadata, 6));
        c1578c.g();
        return true;
    }

    @Override // A1.AbstractC0023i
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // A1.AbstractC0023i
    public final boolean l() {
        return this.f10569J;
    }

    @Override // A1.AbstractC0023i
    public final boolean m() {
        return true;
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        this.f10572M = null;
        this.f10571L = -9223372036854775807L;
        this.f10567H = null;
    }

    @Override // A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        this.f10572M = null;
        this.f10571L = -9223372036854775807L;
        this.f10568I = false;
        this.f10569J = false;
    }

    @Override // A1.AbstractC0023i
    public final void t(X[] xArr, long j, long j3) {
        this.f10567H = this.f10563D.a(xArr[0]);
    }

    @Override // A1.AbstractC0023i
    public final void v(long j, long j3) {
        boolean z4 = true;
        while (z4) {
            int i7 = 0;
            if (!this.f10568I && this.f10572M == null) {
                c cVar = this.f10566G;
                cVar.t();
                V0 v02 = this.f376b;
                v02.k();
                int u4 = u(v02, cVar, 0);
                if (u4 == -4) {
                    if (cVar.f(4)) {
                        this.f10568I = true;
                    } else {
                        cVar.f6315z = this.f10570K;
                        cVar.A();
                        AbstractC1464a abstractC1464a = this.f10567H;
                        int i8 = t.f17153a;
                        Metadata n2 = abstractC1464a.n(cVar);
                        if (n2 != null) {
                            ArrayList arrayList = new ArrayList(n2.f10562a.length);
                            B(n2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f10572M = new Metadata(arrayList);
                                this.f10571L = cVar.f1699f;
                            }
                        }
                    }
                } else if (u4 == -5) {
                    X x4 = (X) v02.f17563c;
                    x4.getClass();
                    this.f10570K = x4.f287G;
                }
            }
            Metadata metadata = this.f10572M;
            if (metadata == null || this.f10571L > j) {
                z4 = false;
            } else {
                Handler handler = this.f10565F;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    K k7 = this.f10564E;
                    N n7 = k7.f109a;
                    C0024i0 a2 = n7.f152a0.a();
                    while (true) {
                        Metadata.Entry[] entryArr = metadata.f10562a;
                        if (i7 >= entryArr.length) {
                            break;
                        }
                        entryArr[i7].h(a2);
                        i7++;
                    }
                    n7.f152a0 = new C0026j0(a2);
                    C0026j0 r7 = n7.r();
                    boolean equals = r7.equals(n7.f137L);
                    C1578c c1578c = n7.f164l;
                    if (!equals) {
                        n7.f137L = r7;
                        c1578c.i(14, new C0042s(k7, 5));
                    }
                    c1578c.i(28, new C0042s(metadata, 6));
                    c1578c.g();
                }
                this.f10572M = null;
                this.f10571L = -9223372036854775807L;
                z4 = true;
            }
            if (this.f10568I && this.f10572M == null) {
                this.f10569J = true;
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) {
        if (this.f10563D.b(x4)) {
            return AbstractC0023i.e(x4.f302V == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC0023i.e(0, 0, 0);
    }
}
