package C4;

import A.v;
import X3.s;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1386of;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import y4.n;
import y4.u;
import y4.z;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public final u f876k;

    /* renamed from: l, reason: collision with root package name */
    public final C0.c f877l;

    /* renamed from: m, reason: collision with root package name */
    public final C1386of f878m;

    /* renamed from: n, reason: collision with root package name */
    public final h f879n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f880o;

    /* renamed from: p, reason: collision with root package name */
    public Object f881p;

    /* renamed from: q, reason: collision with root package name */
    public e f882q;

    /* renamed from: r, reason: collision with root package name */
    public k f883r;

    /* renamed from: s, reason: collision with root package name */
    public v f884s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f885t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f886u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f887v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f888w;

    /* renamed from: x, reason: collision with root package name */
    public volatile v f889x;

    /* renamed from: y, reason: collision with root package name */
    public volatile k f890y;

    public i(u uVar, C0.c cVar) {
        kotlin.jvm.internal.l.f("client", uVar);
        kotlin.jvm.internal.l.f("originalRequest", cVar);
        this.f876k = uVar;
        this.f877l = cVar;
        this.f878m = (C1386of) uVar.f21412l.f18249l;
        uVar.f21415o.getClass();
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f879n = hVar;
        this.f880o = new AtomicBoolean();
        this.f887v = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f888w ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((n) iVar.f877l.f811b).g());
        return sb.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = z4.b.f21979a;
        if (this.f883r != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f883r = kVar;
        kVar.f904p.add(new g(this, this.f881p));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket l5;
        byte[] bArr = z4.b.f21979a;
        k kVar = this.f883r;
        if (kVar != null) {
            synchronized (kVar) {
                l5 = l();
            }
            if (this.f883r == null) {
                if (l5 != null) {
                    z4.b.d(l5);
                }
            } else if (l5 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f879n.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.l.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.f888w) {
            return;
        }
        this.f888w = true;
        v vVar = this.f889x;
        if (vVar != null) {
            ((D4.d) vVar.f135d).cancel();
        }
        k kVar = this.f890y;
        if (kVar == null || (socket = kVar.f893c) == null) {
            return;
        }
        z4.b.d(socket);
    }

    public final Object clone() {
        return new i(this.f876k, this.f877l);
    }

    public final void e(y4.e eVar) {
        f fVar;
        if (!this.f880o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        G4.n nVar = G4.n.f2016a;
        this.f881p = G4.n.f2016a.g();
        C1071hd c1071hd = this.f876k.f21411k;
        f fVar2 = new f(this, eVar);
        c1071hd.getClass();
        synchronized (c1071hd) {
            ((ArrayDeque) c1071hd.f13762m).add(fVar2);
            String str = ((n) this.f877l.f811b).f21365d;
            Iterator it = ((ArrayDeque) c1071hd.f13763n).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) c1071hd.f13762m).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            fVar = null;
                            break;
                        } else {
                            fVar = (f) it2.next();
                            if (kotlin.jvm.internal.l.a(((n) fVar.f873m.f877l.f811b).f21365d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    fVar = (f) it.next();
                    if (kotlin.jvm.internal.l.a(((n) fVar.f873m.f877l.f811b).f21365d, str)) {
                        break;
                    }
                }
            }
            if (fVar != null) {
                fVar2.f872l = fVar.f872l;
            }
        }
        c1071hd.i();
    }

    public final void g(boolean z3) {
        v vVar;
        synchronized (this) {
            if (!this.f887v) {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (vVar = this.f889x) != null) {
            ((D4.d) vVar.f135d).cancel();
            ((i) vVar.f133b).j(vVar, true, true, null);
        }
        this.f884s = null;
    }

    public final z i() {
        ArrayList arrayList = new ArrayList();
        s.U(this.f876k.f21413m, arrayList);
        arrayList.add(new D4.a(this.f876k));
        arrayList.add(new D4.a(this.f876k.f21420t));
        this.f876k.getClass();
        arrayList.add(new A4.b());
        arrayList.add(a.f848a);
        s.U(this.f876k.f21414n, arrayList);
        arrayList.add(new D4.b());
        C0.c cVar = this.f877l;
        u uVar = this.f876k;
        try {
            try {
                z b3 = new D4.f(this, arrayList, 0, null, cVar, uVar.f21407F, uVar.f21408G, uVar.f21409H).b(this.f877l);
                if (this.f888w) {
                    z4.b.c(b3);
                    throw new IOException("Canceled");
                }
                k(null);
                return b3;
            } catch (IOException e3) {
                IOException k5 = k(e3);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Throwable", k5);
                throw k5;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                k(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:41:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001b), top: B:40:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:41:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001b), top: B:40:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException j(v vVar, boolean z3, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        kotlin.jvm.internal.l.f("exchange", vVar);
        if (vVar.equals(this.f889x)) {
            synchronized (this) {
                z6 = false;
                if (z3) {
                    try {
                        if (!this.f885t) {
                        }
                        if (z3) {
                            this.f885t = false;
                        }
                        if (z5) {
                            this.f886u = false;
                        }
                        z8 = this.f885t;
                        boolean z9 = z8 && !this.f886u;
                        if (!z8 && !this.f886u) {
                            if (!this.f887v) {
                                z6 = true;
                            }
                        }
                        z7 = z6;
                        z6 = z9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z5 || !this.f886u) {
                    z7 = false;
                }
                if (z3) {
                }
                if (z5) {
                }
                z8 = this.f885t;
                if (z8) {
                }
                if (!z8) {
                    if (!this.f887v) {
                    }
                }
                z7 = z6;
                z6 = z9;
            }
            if (z6) {
                this.f889x = null;
                k kVar = this.f883r;
                if (kVar != null) {
                    kVar.h();
                }
            }
            if (z7) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException k(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f887v) {
                this.f887v = false;
                if (!this.f885t) {
                    if (!this.f886u) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? c(iOException) : iOException;
    }

    public final Socket l() {
        k kVar = this.f883r;
        kotlin.jvm.internal.l.c(kVar);
        byte[] bArr = z4.b.f21979a;
        ArrayList arrayList = kVar.f904p;
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (kotlin.jvm.internal.l.a(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f883r = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f905q = System.nanoTime();
        C1386of c1386of = this.f878m;
        c1386of.getClass();
        byte[] bArr2 = z4.b.f21979a;
        boolean z3 = kVar.f898j;
        B4.c cVar = (B4.c) c1386of.f14809a;
        if (!z3) {
            cVar.c((B4.b) c1386of.f14810b, 0L);
            return null;
        }
        kVar.f898j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c1386of.f14812d;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = kVar.f894d;
        kotlin.jvm.internal.l.c(socket);
        return socket;
    }
}
