package C4;

import F4.C0121a;
import com.google.android.gms.internal.ads.C1386of;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import y4.C;
import y4.C2673a;
import y4.n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C1386of f864a;

    /* renamed from: b, reason: collision with root package name */
    public final C2673a f865b;

    /* renamed from: c, reason: collision with root package name */
    public final i f866c;

    /* renamed from: d, reason: collision with root package name */
    public C2.h f867d;

    /* renamed from: e, reason: collision with root package name */
    public m f868e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f869g;

    /* renamed from: h, reason: collision with root package name */
    public int f870h;
    public C i;

    public e(C1386of c1386of, C2673a c2673a, i iVar) {
        kotlin.jvm.internal.l.f("connectionPool", c1386of);
        kotlin.jvm.internal.l.f("call", iVar);
        this.f864a = c1386of;
        this.f865b = c2673a;
        this.f866c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k a(int i, int i5, int i6, boolean z3, boolean z5) {
        ArrayList arrayList;
        boolean z6;
        Socket l5;
        while (!this.f866c.f888w) {
            k kVar = this.f866c.f883r;
            if (kVar != null) {
                synchronized (kVar) {
                    try {
                        if (!kVar.f898j && b(kVar.f892b.f21282a.f21298h)) {
                            l5 = null;
                        }
                        l5 = this.f866c.l();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f866c.f883r != null) {
                    if (l5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z6 = z5;
                    if (kVar.j(z6)) {
                        return kVar;
                    }
                    kVar.l();
                    if (this.i == null) {
                        C2.h hVar = this.f867d;
                        if (hVar != null ? hVar.h() : true) {
                            continue;
                        } else {
                            m mVar = this.f868e;
                            if (!(mVar != null ? mVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (l5 != null) {
                        z4.b.d(l5);
                    }
                    kotlin.jvm.internal.l.f("call", this.f866c);
                }
            }
            this.f = 0;
            this.f869g = 0;
            this.f870h = 0;
            if (this.f864a.a(this.f865b, this.f866c, null, false)) {
                kVar = this.f866c.f883r;
                kotlin.jvm.internal.l.c(kVar);
                kotlin.jvm.internal.l.f("call", this.f866c);
            } else {
                C c5 = this.i;
                try {
                    if (c5 != null) {
                        this.i = null;
                    } else {
                        C2.h hVar2 = this.f867d;
                        if (hVar2 == null || !hVar2.h()) {
                            m mVar2 = this.f868e;
                            if (mVar2 == null) {
                                C2673a c2673a = this.f865b;
                                i iVar = this.f866c;
                                mVar2 = new m(c2673a, iVar.f876k.f21410I, iVar);
                                this.f868e = mVar2;
                            }
                            C2.h k5 = mVar2.k();
                            this.f867d = k5;
                            arrayList = (ArrayList) k5.f834m;
                            if (this.f866c.f888w) {
                                throw new IOException("Canceled");
                            }
                            if (this.f864a.a(this.f865b, this.f866c, arrayList, false)) {
                                kVar = this.f866c.f883r;
                                kotlin.jvm.internal.l.c(kVar);
                                kotlin.jvm.internal.l.f("call", this.f866c);
                            } else {
                                if (!k5.h()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = k5.f833l;
                                k5.f833l = i7 + 1;
                                c5 = (C) ((ArrayList) k5.f834m).get(i7);
                                k kVar2 = new k(this.f864a, c5);
                                this.f866c.f890y = kVar2;
                                kVar2.c(i, i5, i6, z3, this.f866c);
                                this.f866c.f890y = null;
                                this.f866c.f876k.f21410I.b(c5);
                                if (this.f864a.a(this.f865b, this.f866c, arrayList, true)) {
                                    synchronized (kVar2) {
                                        C1386of c1386of = this.f864a;
                                        c1386of.getClass();
                                        byte[] bArr = z4.b.f21979a;
                                        ((ConcurrentLinkedQueue) c1386of.f14812d).add(kVar2);
                                        ((B4.c) c1386of.f14809a).c((B4.b) c1386of.f14810b, 0L);
                                        this.f866c.b(kVar2);
                                    }
                                    kotlin.jvm.internal.l.f("call", this.f866c);
                                    z6 = z5;
                                    kVar = kVar2;
                                    if (kVar.j(z6)) {
                                    }
                                } else {
                                    kVar = this.f866c.f883r;
                                    kotlin.jvm.internal.l.c(kVar);
                                    this.i = c5;
                                    Socket socket = kVar2.f894d;
                                    kotlin.jvm.internal.l.c(socket);
                                    z4.b.d(socket);
                                    kotlin.jvm.internal.l.f("call", this.f866c);
                                }
                            }
                        } else {
                            C2.h hVar3 = this.f867d;
                            kotlin.jvm.internal.l.c(hVar3);
                            if (!hVar3.h()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = hVar3.f833l;
                            hVar3.f833l = i8 + 1;
                            c5 = (C) ((ArrayList) hVar3.f834m).get(i8);
                        }
                    }
                    kVar2.c(i, i5, i6, z3, this.f866c);
                    this.f866c.f890y = null;
                    this.f866c.f876k.f21410I.b(c5);
                    if (this.f864a.a(this.f865b, this.f866c, arrayList, true)) {
                    }
                } catch (Throwable th2) {
                    this.f866c.f890y = null;
                    throw th2;
                }
                arrayList = null;
                k kVar22 = new k(this.f864a, c5);
                this.f866c.f890y = kVar22;
            }
            z6 = z5;
            if (kVar.j(z6)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(n nVar) {
        kotlin.jvm.internal.l.f("url", nVar);
        n nVar2 = this.f865b.f21298h;
        return nVar.f21366e == nVar2.f21366e && kotlin.jvm.internal.l.a(nVar.f21365d, nVar2.f21365d);
    }

    public final void c(IOException iOException) {
        kotlin.jvm.internal.l.f("e", iOException);
        this.i = null;
        if ((iOException instanceof F4.C) && ((F4.C) iOException).f1567k == 8) {
            this.f++;
        } else if (iOException instanceof C0121a) {
            this.f869g++;
        } else {
            this.f870h++;
        }
    }
}
