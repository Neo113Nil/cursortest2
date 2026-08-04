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
import java.util.ArrayList;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0023i implements Handler.Callback {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final b f10563D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final K f10564E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Handler f10565F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final c f10566G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p097n3.a f10567H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10568I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f10569J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f10570K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10571L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Metadata f10572M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(K k7, Looper looper) {
        Handler handler;
        super(5);
        b bVar = b.f6314a;
        this.f10564E = k7;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = t.f17159a;
            handler = new Handler(looper, this);
        }
        this.f10565F = handler;
        this.f10563D = bVar;
        this.f10566G = new c(1);
        this.f10571L = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void B(Metadata metadata, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (i7 >= entryArr.length) {
                return;
            }
            X xF = entryArr[i7].f();
            if (xF != null) {
                b bVar = this.f10563D;
                if (bVar.b(xF)) {
                    p097n3.a aVarA = bVar.a(xF);
                    byte[] bArrL = entryArr[i7].l();
                    bArrL.getClass();
                    c cVar = this.f10566G;
                    cVar.t();
                    cVar.z(bArrL.length);
                    cVar.f1697d.put(bArrL);
                    cVar.A();
                    Metadata metadataN = aVarA.n(cVar);
                    if (metadataN != null) {
                        B(metadataN, arrayList);
                    }
                } else {
                    arrayList.add(entryArr[i7]);
                }
            } else {
                arrayList.add(entryArr[i7]);
            }
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
        C0024i0 c0024i0A = n2.f152a0.a();
        int i7 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (i7 >= entryArr.length) {
                break;
            }
            entryArr[i7].h(c0024i0A);
            i7++;
        }
        n2.f152a0 = new C0026j0(c0024i0A);
        C0026j0 c0026j0R = n2.r();
        boolean zEquals = c0026j0R.equals(n2.f137L);
        p128r5.c cVar = n2.f164l;
        if (!zEquals) {
            n2.f137L = c0026j0R;
            cVar.i(14, new C0042s(k7, 5));
        }
        cVar.i(28, new C0042s(metadata, 6));
        cVar.g();
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
                V0 v6 = this.f376b;
                v6.k();
                int iU = u(v6, cVar, 0);
                if (iU == -4) {
                    if (cVar.f(4)) {
                        this.f10568I = true;
                    } else {
                        cVar.f6315z = this.f10570K;
                        cVar.A();
                        p097n3.a aVar = this.f10567H;
                        int i8 = t.f17159a;
                        Metadata metadataN = aVar.n(cVar);
                        if (metadataN != null) {
                            ArrayList arrayList = new ArrayList(metadataN.f10562a.length);
                            B(metadataN, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f10572M = new Metadata(arrayList);
                                this.f10571L = cVar.f1699f;
                            }
                        }
                    }
                } else if (iU == -5) {
                    X x4 = (X) v6.f17569c;
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
                    N n2 = k7.f109a;
                    C0024i0 c0024i0A = n2.f152a0.a();
                    while (true) {
                        Metadata.Entry[] entryArr = metadata.f10562a;
                        if (i7 >= entryArr.length) {
                            break;
                        }
                        entryArr[i7].h(c0024i0A);
                        i7++;
                    }
                    n2.f152a0 = new C0026j0(c0024i0A);
                    C0026j0 c0026j0R = n2.r();
                    boolean zEquals = c0026j0R.equals(n2.f137L);
                    p128r5.c cVar2 = n2.f164l;
                    if (!zEquals) {
                        n2.f137L = c0026j0R;
                        cVar2.i(14, new C0042s(k7, 5));
                    }
                    cVar2.i(28, new C0042s(metadata, 6));
                    cVar2.g();
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
