package X4;

import T4.C0151a;
import b2.AbstractC0279e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T4.u f3589a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.e f3590b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3591c;

    /* renamed from: d, reason: collision with root package name */
    public final q f3592d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3593e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3594f;

    /* renamed from: g, reason: collision with root package name */
    public j f3595g;

    /* renamed from: h, reason: collision with root package name */
    public s f3596h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3597i;

    /* renamed from: j, reason: collision with root package name */
    public i f3598j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3599k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3600l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3601m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f3602n;

    /* renamed from: o, reason: collision with root package name */
    public volatile i f3603o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f3604p;

    public r(T4.u client, M0.e eVar) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f3589a = client;
        this.f3590b = eVar;
        this.f3591c = (t) client.f2959B.f215b;
        client.f2963d.getClass();
        q qVar = new q(this);
        qVar.g(client.f2981v, TimeUnit.MILLISECONDS);
        this.f3592d = qVar;
        this.f3593e = new AtomicBoolean();
        this.f3601m = true;
        this.f3604p = new CopyOnWriteArrayList();
    }

    public static final String a(r rVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(rVar.f3602n ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((T4.q) rVar.f3590b.f1783c).f());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket i2;
        TimeZone timeZone = U4.e.f3179a;
        s sVar = this.f3596h;
        if (sVar != null) {
            synchronized (sVar) {
                i2 = i();
            }
            if (this.f3596h == null) {
                if (i2 != null) {
                    U4.e.c(i2);
                }
            } else if (i2 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f3597i && this.f3592d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.i.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void c() {
        if (this.f3602n) {
            return;
        }
        this.f3602n = true;
        i iVar = this.f3603o;
        if (iVar != null) {
            ((Y4.g) iVar.f3573e).cancel();
        }
        Iterator it = this.f3604p.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((x) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new r(this.f3589a, this.f3590b);
    }

    public final T4.z d() {
        if (!this.f3593e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f3592d.h();
        d5.e eVar = d5.e.f5492a;
        this.f3594f = d5.e.f5492a.h();
        try {
            T4.l lVar = this.f3589a.f2960a;
            synchronized (lVar) {
                ((ArrayDeque) lVar.f2906f).add(this);
            }
            return f();
        } finally {
            T4.l lVar2 = this.f3589a.f2960a;
            lVar2.getClass();
            T4.l.d(lVar2, null, this, null, 5);
        }
    }

    public final void e(boolean z) {
        i iVar;
        synchronized (this) {
            if (!this.f3601m) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (iVar = this.f3603o) != null) {
            ((Y4.g) iVar.f3573e).cancel();
            ((r) iVar.f3571c).g(iVar, true, true, null);
        }
        this.f3598j = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T4.z f() {
        ArrayList arrayList = new ArrayList();
        List elements = this.f3589a.f2961b;
        kotlin.jvm.internal.i.e(elements, "elements");
        arrayList.addAll(elements);
        arrayList.add(new Y4.a(this.f3589a));
        arrayList.add(new Y4.a(this.f3589a.f2969j));
        this.f3589a.getClass();
        arrayList.add(new V4.a());
        arrayList.add(b.f3526a);
        List elements2 = this.f3589a.f2962c;
        kotlin.jvm.internal.i.e(elements2, "elements");
        arrayList.addAll(elements2);
        arrayList.add(Y4.c.f3709a);
        M0.e eVar = this.f3590b;
        T4.u uVar = this.f3589a;
        boolean z = false;
        try {
            T4.z b6 = new Y4.i(this, arrayList, 0, null, eVar, uVar.f2982w, uVar.f2983x, uVar.f2984y).b(this.f3590b);
            if (this.f3602n) {
                U4.c.b(b6);
                throw new IOException("Canceled");
            }
            h(null);
            return b6;
        } catch (IOException e3) {
            try {
                IOException h3 = h(e3);
                kotlin.jvm.internal.i.c(h3, "null cannot be cast to non-null type kotlin.Throwable");
                throw h3;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    h(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException g(i exchange, boolean z, boolean z5, IOException iOException) {
        boolean z6;
        boolean z7;
        boolean z8;
        kotlin.jvm.internal.i.e(exchange, "exchange");
        if (!exchange.equals(this.f3603o)) {
            return iOException;
        }
        synchronized (this) {
            z6 = false;
            if (z) {
                try {
                    if (!this.f3599k) {
                    }
                    if (z) {
                        this.f3599k = false;
                    }
                    if (z5) {
                        this.f3600l = false;
                    }
                    z8 = this.f3599k;
                    boolean z9 = z8 && !this.f3600l;
                    if (!z8 && !this.f3600l) {
                        if (!this.f3601m) {
                            z6 = true;
                        }
                    }
                    z7 = z6;
                    z6 = z9;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z5 || !this.f3600l) {
                z7 = false;
            }
            if (z) {
            }
            if (z5) {
            }
            z8 = this.f3599k;
            if (z8) {
            }
            if (!z8) {
                if (!this.f3601m) {
                }
            }
            z7 = z6;
            z6 = z9;
        }
        if (z6) {
            this.f3603o = null;
            s sVar = this.f3596h;
            if (sVar != null) {
                synchronized (sVar) {
                    sVar.f3619p++;
                }
            }
        }
        return z7 ? b(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f3601m) {
                this.f3601m = false;
                if (!this.f3599k) {
                    if (!this.f3600l) {
                        z = true;
                    }
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket i() {
        s sVar = this.f3596h;
        kotlin.jvm.internal.i.b(sVar);
        TimeZone timeZone = U4.e.f3179a;
        ArrayList arrayList = sVar.f3622s;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (kotlin.jvm.internal.i.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f3596h = null;
        if (arrayList.isEmpty()) {
            sVar.f3623t = System.nanoTime();
            t tVar = this.f3591c;
            tVar.getClass();
            TimeZone timeZone2 = U4.e.f3179a;
            if (sVar.f3616m || tVar.f3624a == 0) {
                sVar.f3616m = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = tVar.f3630g;
                concurrentLinkedQueue.remove(sVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    tVar.f3628e.a();
                }
                C0151a address = sVar.f3607d.f2805a;
                kotlin.jvm.internal.i.e(address, "address");
                AbstractC0279e.o(tVar.f3627d.get(address));
                return sVar.f3609f;
            }
            tVar.f3628e.d(tVar.f3629f, 0L);
        }
        return null;
    }
}
