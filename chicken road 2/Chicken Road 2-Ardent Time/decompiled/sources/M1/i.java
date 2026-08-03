package M1;

/* loaded from: classes.dex */
public final class i implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final I1.s f1053a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.v f1054b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.l f1055c;

    /* renamed from: d, reason: collision with root package name */
    public final M1.h f1056d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f1057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1058f;

    /* renamed from: g, reason: collision with root package name */
    public M1.f f1059g;

    /* renamed from: h, reason: collision with root package name */
    public M1.k f1060h;

    /* renamed from: i, reason: collision with root package name */
    public M1.e f1061i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1062j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1063k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1064l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f1065m;

    /* renamed from: n, reason: collision with root package name */
    public volatile M1.e f1066n;

    /* renamed from: o, reason: collision with root package name */
    public volatile M1.k f1067o;

    public i(I1.s client, I1.v originalRequest) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f1053a = client;
        this.f1054b = originalRequest;
        this.f1055c = (M1.l) client.f797b.f88b;
        client.f800e.getClass();
        M1.h hVar = new M1.h(this);
        hVar.g(0, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.f1056d = hVar;
        this.f1057e = new java.util.concurrent.atomic.AtomicBoolean();
        this.f1064l = true;
    }

    public final void a(M1.k kVar) {
        byte[] bArr = J1.b.f932a;
        if (this.f1060h != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f1060h = kVar;
        kVar.f1083p.add(new M1.g(this, this.f1058f));
    }

    public final java.io.IOException b(java.io.IOException iOException) {
        java.io.IOException interruptedIOException;
        java.net.Socket h2;
        byte[] bArr = J1.b.f932a;
        M1.k kVar = this.f1060h;
        if (kVar != null) {
            synchronized (kVar) {
                h2 = h();
            }
            if (this.f1060h == null) {
                if (h2 != null) {
                    J1.b.e(h2);
                }
            } else if (h2 != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        }
        if (this.f1056d.i()) {
            interruptedIOException = new java.io.InterruptedIOException("timeout");
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

    public final I1.y c() {
        if (!this.f1057e.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed");
        }
        this.f1056d.h();
        Q1.n nVar = Q1.n.f1644a;
        this.f1058f = Q1.n.f1644a.g();
        try {
            F.C0014n c0014n = this.f1053a.f796a;
            synchronized (c0014n) {
                ((java.util.ArrayDeque) c0014n.f501d).add(this);
            }
            return e();
        } finally {
            this.f1053a.f796a.c(this);
        }
    }

    public final java.lang.Object clone() {
        return new M1.i(this.f1053a, this.f1054b);
    }

    public final void d(boolean z2) {
        M1.e eVar;
        synchronized (this) {
            if (!this.f1064l) {
                throw new java.lang.IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f1066n) != null) {
            ((N1.e) eVar.f1040d).cancel();
            ((M1.i) eVar.f1038b).f(eVar, true, true, null);
        }
        this.f1061i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I1.y e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List elements = this.f1053a.f798c;
        kotlin.jvm.internal.i.e(elements, "elements");
        arrayList.addAll(elements);
        arrayList.add(new N1.a(this.f1053a));
        arrayList.add(new N1.a(this.f1053a.f805j));
        this.f1053a.getClass();
        arrayList.add(new K1.b());
        arrayList.add(M1.a.f1019a);
        java.util.List elements2 = this.f1053a.f799d;
        kotlin.jvm.internal.i.e(elements2, "elements");
        arrayList.addAll(elements2);
        arrayList.add(new N1.b());
        I1.v vVar = this.f1054b;
        I1.s sVar = this.f1053a;
        boolean z2 = false;
        try {
            I1.y b2 = new N1.g(this, arrayList, 0, null, vVar, sVar.f816v, sVar.f817w, sVar.f818x).b(this.f1054b);
            if (this.f1065m) {
                J1.b.d(b2);
                throw new java.io.IOException("Canceled");
            }
            g(null);
            return b2;
        } catch (java.io.IOException e2) {
            try {
                java.io.IOException g2 = g(e2);
                if (g2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw g2;
            } catch (java.lang.Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    g(null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (!z2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.IOException f(M1.e exchange, boolean z2, boolean z3, java.io.IOException iOException) {
        boolean z4;
        boolean z5;
        boolean z6;
        kotlin.jvm.internal.i.e(exchange, "exchange");
        if (!exchange.equals(this.f1066n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f1062j) {
                    }
                    if (z2) {
                        this.f1062j = false;
                    }
                    if (z3) {
                        this.f1063k = false;
                    }
                    z6 = this.f1062j;
                    boolean z7 = z6 && !this.f1063k;
                    if (!z6 && !this.f1063k) {
                        if (!this.f1064l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f1063k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f1062j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f1064l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f1066n = null;
            M1.k kVar = this.f1060h;
            if (kVar != null) {
                synchronized (kVar) {
                    kVar.f1080m++;
                }
            }
        }
        return z5 ? b(iOException) : iOException;
    }

    public final java.io.IOException g(java.io.IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f1064l) {
                this.f1064l = false;
                if (!this.f1062j) {
                    if (!this.f1063k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? b(iOException) : iOException;
    }

    public final java.net.Socket h() {
        M1.k kVar = this.f1060h;
        kotlin.jvm.internal.i.b(kVar);
        byte[] bArr = J1.b.f932a;
        java.util.ArrayList arrayList = kVar.f1083p;
        java.util.Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (kotlin.jvm.internal.i.a(((java.lang.ref.Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f1060h = null;
        if (arrayList.isEmpty()) {
            kVar.f1084q = java.lang.System.nanoTime();
            M1.l lVar = this.f1055c;
            lVar.getClass();
            byte[] bArr2 = J1.b.f932a;
            boolean z2 = kVar.f1077j;
            L1.c cVar = (L1.c) lVar.f1088b;
            if (z2) {
                kVar.f1077j = true;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) lVar.f1090d;
                concurrentLinkedQueue.remove(kVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                java.net.Socket socket = kVar.f1071d;
                kotlin.jvm.internal.i.b(socket);
                return socket;
            }
            cVar.c((L1.b) lVar.f1089c, 0L);
        }
        return null;
    }
}
