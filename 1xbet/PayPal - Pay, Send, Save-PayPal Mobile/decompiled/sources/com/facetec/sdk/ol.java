package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ol implements java.io.Closeable {
    private static /* synthetic */ boolean C = true;
    private static final java.util.concurrent.ExecutorService s = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.facetec.sdk.nh.c("OkHttp Http2Connection", true));
    private java.net.Socket B;

    /* renamed from: a, reason: collision with root package name */
    final com.facetec.sdk.ol.e f3712a;
    final java.lang.String b;
    final boolean c;
    int d;
    final com.facetec.sdk.op f;
    int g;
    final java.util.concurrent.ScheduledExecutorService h;
    final com.facetec.sdk.oq k;
    public final com.facetec.sdk.or n;

    /* renamed from: o, reason: collision with root package name */
    long f3713o;
    private final java.util.concurrent.ExecutorService p;
    final java.util.Set<java.lang.Integer> q;
    public com.facetec.sdk.ol.d r;
    private boolean t;
    final java.util.Map<java.lang.Integer, com.facetec.sdk.os> e = new java.util.LinkedHashMap();
    private long w = 0;
    private long x = 0;
    long j = 0;
    long i = 0;
    private long y = 0;
    private long u = 0;
    long m = 0;
    private long v = 0;
    public com.facetec.sdk.oq l = new com.facetec.sdk.oq();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public com.facetec.sdk.pr f3720a;
        public java.net.Socket b;
        public java.lang.String c;
        public com.facetec.sdk.pj e;
        public int i;
        public com.facetec.sdk.ol.e d = com.facetec.sdk.ol.e.l;
        com.facetec.sdk.op f = com.facetec.sdk.op.d;
        boolean g = true;
    }

    public static abstract class e {
        public static final com.facetec.sdk.ol.e l = new com.facetec.sdk.ol.e() { // from class: com.facetec.sdk.ol.e.1
            @Override // com.facetec.sdk.ol.e
            public final void d(com.facetec.sdk.os osVar) throws java.io.IOException {
                osVar.c(com.facetec.sdk.og.REFUSED_STREAM);
            }
        };

        public abstract void d(com.facetec.sdk.os osVar) throws java.io.IOException;

        public void e(com.facetec.sdk.ol olVar) {
        }
    }

    static boolean d(int i) {
        return i != 0 && (i & 1) == 0;
    }

    static /* synthetic */ long e(com.facetec.sdk.ol olVar) {
        long j = olVar.w;
        olVar.w = 1 + j;
        return j;
    }

    static /* synthetic */ long f(com.facetec.sdk.ol olVar) {
        long j = olVar.x;
        olVar.x = 1 + j;
        return j;
    }

    static /* synthetic */ long g(com.facetec.sdk.ol olVar) {
        long j = olVar.u;
        olVar.u = 1 + j;
        return j;
    }

    static /* synthetic */ boolean h(com.facetec.sdk.ol olVar) {
        olVar.t = true;
        return true;
    }

    static /* synthetic */ long j(com.facetec.sdk.ol olVar) {
        long j = olVar.i;
        olVar.i = 1 + j;
        return j;
    }

    public ol(com.facetec.sdk.ol.b bVar) {
        com.facetec.sdk.oq oqVar = new com.facetec.sdk.oq();
        this.k = oqVar;
        this.q = new java.util.LinkedHashSet();
        this.f = bVar.f;
        boolean z = bVar.g;
        this.c = z;
        this.f3712a = bVar.d;
        this.g = bVar.g ? 1 : 2;
        if (bVar.g) {
            this.g += 2;
        }
        if (bVar.g) {
            this.l.a(7, 16777216);
        }
        java.lang.String str = bVar.c;
        this.b = str;
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, com.facetec.sdk.nh.c(com.facetec.sdk.nh.c("OkHttp %s Writer", str), false));
        this.h = scheduledThreadPoolExecutor;
        if (bVar.i != 0) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new com.facetec.sdk.ol.a(), bVar.i, bVar.i, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        this.p = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), com.facetec.sdk.nh.c(com.facetec.sdk.nh.c("OkHttp %s Push Observer", str), true));
        oqVar.a(7, 65535);
        oqVar.a(5, 16384);
        this.f3713o = oqVar.e();
        this.B = bVar.b;
        this.n = new com.facetec.sdk.or(bVar.e, z);
        this.r = new com.facetec.sdk.ol.d(new com.facetec.sdk.oo(bVar.f3720a, z));
    }

    final com.facetec.sdk.os c(int i) {
        com.facetec.sdk.os osVar;
        synchronized (this) {
            osVar = this.e.get(java.lang.Integer.valueOf(i));
        }
        return osVar;
    }

    final com.facetec.sdk.os a(int i) {
        com.facetec.sdk.os remove;
        synchronized (this) {
            remove = this.e.remove(java.lang.Integer.valueOf(i));
            notifyAll();
        }
        return remove;
    }

    public final int d() {
        synchronized (this) {
            com.facetec.sdk.oq oqVar = this.k;
            if ((oqVar.e & 16) == 0) {
                return Integer.MAX_VALUE;
            }
            return oqVar.b[4];
        }
    }

    final void c(long j) {
        synchronized (this) {
            long j2 = this.v + j;
            this.v = j2;
            if (j2 >= this.l.e() / 2) {
                d(0, this.v);
                this.v = 0L;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0015, B:11:0x0019, B:13:0x002c, B:15:0x0034, B:19:0x003e, B:21:0x0044, B:22:0x004d, B:30:0x005c, B:31:0x0061), top: B:5:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.facetec.sdk.os d(java.util.List<com.facetec.sdk.of> list, boolean z) throws java.io.IOException {
        int i;
        com.facetec.sdk.os osVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.n) {
            synchronized (this) {
                try {
                    if (this.g > 1073741823) {
                        a(com.facetec.sdk.og.REFUSED_STREAM);
                    }
                    if (this.t) {
                        throw new com.facetec.sdk.oj();
                    }
                    i = this.g;
                    this.g = i + 2;
                    osVar = new com.facetec.sdk.os(i, this, z3, false, null);
                    if (z && this.f3713o != 0 && osVar.e != 0) {
                        z2 = false;
                        if (osVar.d()) {
                            this.e.put(java.lang.Integer.valueOf(i), osVar);
                        }
                    }
                    z2 = true;
                    if (osVar.d()) {
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            this.n.d(z3, i, list);
        }
        if (z2) {
            this.n.b();
        }
        return osVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.n.c);
        r6 = r2;
        r8.f3713o -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z, com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        int min;
        long j2;
        if (j == 0) {
            this.n.a(z, i, pkVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j3 = this.f3713o;
                        if (j3 > 0) {
                            break;
                        } else {
                            if (!this.e.containsKey(java.lang.Integer.valueOf(i))) {
                                throw new java.io.IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException();
                    }
                }
            }
            j -= j2;
            this.n.a(z && j == 0, i, pkVar, min);
        }
    }

    /* renamed from: com.facetec.sdk.ol$1, reason: invalid class name */
    final class AnonymousClass1 extends com.facetec.sdk.ne {
        public static int b;
        public static int e;
        private /* synthetic */ com.facetec.sdk.og c;
        private /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.lang.String str, java.lang.Object[] objArr, int i, com.facetec.sdk.og ogVar) {
            super(str, objArr);
            this.d = i;
            this.c = ogVar;
        }

        @Override // com.facetec.sdk.ne
        public final void c() {
            try {
                com.facetec.sdk.ol.this.c(this.d, this.c);
            } catch (java.io.IOException unused) {
                com.facetec.sdk.ol.this.a();
            }
        }

        public static int a() {
            int i = e;
            e = i + 1;
            if (i % 7803272 != 0) {
                return b;
            }
            int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
            b = maxMemory;
            return maxMemory;
        }
    }

    final void d(int i, com.facetec.sdk.og ogVar) {
        try {
            this.h.execute(new com.facetec.sdk.ol.AnonymousClass1("OkHttp %s stream %d", new java.lang.Object[]{this.b, java.lang.Integer.valueOf(i)}, i, ogVar));
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }

    final void c(int i, com.facetec.sdk.og ogVar) throws java.io.IOException {
        this.n.b(i, ogVar);
    }

    final void d(final int i, final long j) {
        try {
            this.h.execute(new com.facetec.sdk.ne("OkHttp Window Update %s stream %d", new java.lang.Object[]{this.b, java.lang.Integer.valueOf(i)}) { // from class: com.facetec.sdk.ol.2
                @Override // com.facetec.sdk.ne
                public final void c() {
                    try {
                        com.facetec.sdk.ol.this.n.c(i, j);
                    } catch (java.io.IOException unused) {
                        com.facetec.sdk.ol.this.a();
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }

    final class c extends com.facetec.sdk.ne {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3721a;
        private int b;
        private int d;

        c(int i, int i2) {
            super("OkHttp %s ping %08x%08x", com.facetec.sdk.ol.this.b, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            this.f3721a = true;
            this.b = i;
            this.d = i2;
        }

        @Override // com.facetec.sdk.ne
        public final void c() {
            com.facetec.sdk.ol.this.e(this.f3721a, this.b, this.d);
        }
    }

    final class a extends com.facetec.sdk.ne {
        a() {
            super("OkHttp %s ping", com.facetec.sdk.ol.this.b);
        }

        @Override // com.facetec.sdk.ne
        public final void c() {
            boolean z;
            synchronized (com.facetec.sdk.ol.this) {
                if (com.facetec.sdk.ol.this.x < com.facetec.sdk.ol.this.w) {
                    z = true;
                } else {
                    com.facetec.sdk.ol.e(com.facetec.sdk.ol.this);
                    z = false;
                }
            }
            if (z) {
                com.facetec.sdk.ol.this.a();
            } else {
                com.facetec.sdk.ol.this.e(false, 1, 0);
            }
        }
    }

    final void e(boolean z, int i, int i2) {
        try {
            this.n.b(z, i, i2);
        } catch (java.io.IOException unused) {
            a();
        }
    }

    public final void c() throws java.io.IOException {
        this.n.b();
    }

    private void a(com.facetec.sdk.og ogVar) throws java.io.IOException {
        synchronized (this.n) {
            synchronized (this) {
                if (this.t) {
                    return;
                }
                this.t = true;
                this.n.b(this.d, ogVar, com.facetec.sdk.nh.e);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        d(com.facetec.sdk.og.NO_ERROR, com.facetec.sdk.og.CANCEL);
    }

    final void d(com.facetec.sdk.og ogVar, com.facetec.sdk.og ogVar2) throws java.io.IOException {
        if (!C && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError();
        }
        com.facetec.sdk.os[] osVarArr = null;
        try {
            a(ogVar);
            e = null;
        } catch (java.io.IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.e.isEmpty()) {
                osVarArr = (com.facetec.sdk.os[]) this.e.values().toArray(new com.facetec.sdk.os[this.e.size()]);
                this.e.clear();
            }
        }
        if (osVarArr != null) {
            for (com.facetec.sdk.os osVar : osVarArr) {
                try {
                    osVar.c(ogVar2);
                } catch (java.io.IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.n.close();
        } catch (java.io.IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.B.close();
        } catch (java.io.IOException e5) {
            e = e5;
        }
        this.h.shutdown();
        this.p.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            com.facetec.sdk.og ogVar = com.facetec.sdk.og.PROTOCOL_ERROR;
            d(ogVar, ogVar);
        } catch (java.io.IOException unused) {
        }
    }

    public final boolean e(long j) {
        synchronized (this) {
            if (this.t) {
                return false;
            }
            if (this.i < this.j) {
                if (j >= this.m) {
                    return false;
                }
            }
            return true;
        }
    }

    final class d extends com.facetec.sdk.ne implements com.facetec.sdk.oo.b {
        private com.facetec.sdk.oo c;

        d(com.facetec.sdk.oo ooVar) {
            super("OkHttp %s", com.facetec.sdk.ol.this.b);
            this.c = ooVar;
        }

        @Override // com.facetec.sdk.ne
        public final void c() {
            com.facetec.sdk.og ogVar;
            com.facetec.sdk.og ogVar2;
            com.facetec.sdk.og ogVar3 = com.facetec.sdk.og.INTERNAL_ERROR;
            com.facetec.sdk.og ogVar4 = com.facetec.sdk.og.INTERNAL_ERROR;
            try {
                try {
                    com.facetec.sdk.oo ooVar = this.c;
                    if (ooVar.c) {
                        if (!ooVar.e(true, this)) {
                            throw com.facetec.sdk.on.a("Required SETTINGS preface not received", new java.lang.Object[0]);
                        }
                    } else {
                        com.facetec.sdk.pq a2 = ooVar.e.a(com.facetec.sdk.on.e.j());
                        if (com.facetec.sdk.oo.b.isLoggable(java.util.logging.Level.FINE)) {
                            com.facetec.sdk.oo.b.fine(com.facetec.sdk.nh.c("<< CONNECTION %s", a2.a()));
                        }
                        if (!com.facetec.sdk.on.e.equals(a2)) {
                            throw com.facetec.sdk.on.a("Expected a connection header but was %s", a2.e());
                        }
                    }
                    while (this.c.e(false, this)) {
                    }
                    ogVar = com.facetec.sdk.og.NO_ERROR;
                    ogVar2 = com.facetec.sdk.og.CANCEL;
                } catch (java.io.IOException unused) {
                    ogVar = com.facetec.sdk.og.PROTOCOL_ERROR;
                    ogVar2 = com.facetec.sdk.og.PROTOCOL_ERROR;
                }
                try {
                    com.facetec.sdk.ol.this.d(ogVar, ogVar2);
                } catch (java.io.IOException unused2) {
                }
                com.facetec.sdk.nh.c(this.c);
            } catch (java.lang.Throwable th) {
                try {
                    com.facetec.sdk.ol.this.d(ogVar3, ogVar4);
                } catch (java.io.IOException unused3) {
                }
                com.facetec.sdk.nh.c(this.c);
                throw th;
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void b(final boolean z, final int i, com.facetec.sdk.pr prVar, final int i2) throws java.io.IOException {
            boolean z2;
            boolean z3;
            long j;
            if (com.facetec.sdk.ol.d(i)) {
                final com.facetec.sdk.ol olVar = com.facetec.sdk.ol.this;
                final com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
                long j2 = i2;
                prVar.b(j2);
                prVar.b(pkVar, j2);
                if (pkVar.e() != j2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(pkVar.e());
                    sb.append(" != ");
                    sb.append(i2);
                    throw new java.io.IOException(sb.toString());
                }
                olVar.c(new com.facetec.sdk.ne("OkHttp %s Push Data[%s]", new java.lang.Object[]{olVar.b, java.lang.Integer.valueOf(i)}) { // from class: com.facetec.sdk.ol.7
                    @Override // com.facetec.sdk.ne
                    public final void c() {
                        try {
                            com.facetec.sdk.ol.this.f.e(pkVar, i2);
                            com.facetec.sdk.ol.this.n.b(i, com.facetec.sdk.og.CANCEL);
                            synchronized (com.facetec.sdk.ol.this) {
                                com.facetec.sdk.ol.this.q.remove(java.lang.Integer.valueOf(i));
                            }
                        } catch (java.io.IOException unused) {
                        }
                    }
                });
                return;
            }
            com.facetec.sdk.os c = com.facetec.sdk.ol.this.c(i);
            if (c == null) {
                com.facetec.sdk.ol.this.d(i, com.facetec.sdk.og.PROTOCOL_ERROR);
                long j3 = i2;
                com.facetec.sdk.ol.this.c(j3);
                prVar.g(j3);
                return;
            }
            if (!com.facetec.sdk.os.k && java.lang.Thread.holdsLock(c)) {
                throw new java.lang.AssertionError();
            }
            com.facetec.sdk.os.c cVar = c.g;
            long j4 = i2;
            if (!com.facetec.sdk.os.c.g && java.lang.Thread.holdsLock(com.facetec.sdk.os.this)) {
                throw new java.lang.AssertionError();
            }
            while (true) {
                if (j4 <= 0) {
                    break;
                }
                synchronized (com.facetec.sdk.os.this) {
                    z2 = cVar.d;
                    z3 = cVar.c.e() + j4 > cVar.b;
                }
                if (z3) {
                    prVar.g(j4);
                    com.facetec.sdk.os.this.b(com.facetec.sdk.og.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    prVar.g(j4);
                    break;
                }
                long b = prVar.b(cVar.e, j4);
                if (b == -1) {
                    throw new java.io.EOFException();
                }
                j4 -= b;
                synchronized (com.facetec.sdk.os.this) {
                    if (cVar.f3732a) {
                        j = cVar.e.e();
                        cVar.e.q();
                    } else {
                        boolean z4 = cVar.c.e() == 0;
                        cVar.c.e(cVar.e);
                        if (z4) {
                            com.facetec.sdk.os.this.notifyAll();
                        }
                        j = 0;
                    }
                }
                if (j > 0) {
                    cVar.d(j);
                }
            }
            if (z) {
                c.j();
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void a(final boolean z, final int i, final java.util.List<com.facetec.sdk.of> list) {
            boolean d;
            if (com.facetec.sdk.ol.d(i)) {
                final com.facetec.sdk.ol olVar = com.facetec.sdk.ol.this;
                try {
                    olVar.c(new com.facetec.sdk.ne("OkHttp %s Push Headers[%s]", new java.lang.Object[]{olVar.b, java.lang.Integer.valueOf(i)}) { // from class: com.facetec.sdk.ol.4
                        @Override // com.facetec.sdk.ne
                        public final void c() {
                            com.facetec.sdk.op opVar = com.facetec.sdk.ol.this.f;
                            try {
                                com.facetec.sdk.ol.this.n.b(i, com.facetec.sdk.og.CANCEL);
                                synchronized (com.facetec.sdk.ol.this) {
                                    com.facetec.sdk.ol.this.q.remove(java.lang.Integer.valueOf(i));
                                }
                            } catch (java.io.IOException unused) {
                            }
                        }
                    });
                    return;
                } catch (java.util.concurrent.RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (com.facetec.sdk.ol.this) {
                com.facetec.sdk.os c = com.facetec.sdk.ol.this.c(i);
                if (c == null) {
                    if (com.facetec.sdk.ol.this.t) {
                        return;
                    }
                    if (i <= com.facetec.sdk.ol.this.d) {
                        return;
                    }
                    if (i % 2 == com.facetec.sdk.ol.this.g % 2) {
                        return;
                    }
                    final com.facetec.sdk.os osVar = new com.facetec.sdk.os(i, com.facetec.sdk.ol.this, false, z, com.facetec.sdk.nh.a(list));
                    com.facetec.sdk.ol.this.d = i;
                    com.facetec.sdk.ol.this.e.put(java.lang.Integer.valueOf(i), osVar);
                    com.facetec.sdk.ol.s.execute(new com.facetec.sdk.ne("OkHttp %s stream %d", new java.lang.Object[]{com.facetec.sdk.ol.this.b, java.lang.Integer.valueOf(i)}) { // from class: com.facetec.sdk.ol.d.3
                        @Override // com.facetec.sdk.ne
                        public final void c() {
                            try {
                                com.facetec.sdk.ol.this.f3712a.d(osVar);
                            } catch (java.io.IOException e) {
                                com.facetec.sdk.pa d2 = com.facetec.sdk.pa.d();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Http2Connection.Listener failure for ");
                                sb.append(com.facetec.sdk.ol.this.b);
                                d2.d(4, sb.toString(), e);
                                try {
                                    osVar.c(com.facetec.sdk.og.PROTOCOL_ERROR);
                                } catch (java.io.IOException unused2) {
                                }
                            }
                        }
                    });
                    return;
                }
                if (!com.facetec.sdk.os.k && java.lang.Thread.holdsLock(c)) {
                    throw new java.lang.AssertionError();
                }
                synchronized (c) {
                    c.f = true;
                    c.c.add(com.facetec.sdk.nh.a(list));
                    d = c.d();
                    c.notifyAll();
                }
                if (!d) {
                    c.b.a(c.f3729a);
                }
                if (z) {
                    c.j();
                }
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void d(final int i, final com.facetec.sdk.og ogVar) {
            if (com.facetec.sdk.ol.d(i)) {
                final com.facetec.sdk.ol olVar = com.facetec.sdk.ol.this;
                olVar.c(new com.facetec.sdk.ne("OkHttp %s Push Reset[%s]", new java.lang.Object[]{olVar.b, java.lang.Integer.valueOf(i)}) { // from class: com.facetec.sdk.ol.6
                    @Override // com.facetec.sdk.ne
                    public final void c() {
                        com.facetec.sdk.op opVar = com.facetec.sdk.ol.this.f;
                        synchronized (com.facetec.sdk.ol.this) {
                            com.facetec.sdk.ol.this.q.remove(java.lang.Integer.valueOf(i));
                        }
                    }
                });
            } else {
                com.facetec.sdk.os a2 = com.facetec.sdk.ol.this.a(i);
                if (a2 != null) {
                    a2.a(ogVar);
                }
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void a(com.facetec.sdk.oq oqVar) {
            try {
                com.facetec.sdk.ol.this.h.execute(new com.facetec.sdk.ne("OkHttp %s ACK Settings", new java.lang.Object[]{com.facetec.sdk.ol.this.b}, false, oqVar) { // from class: com.facetec.sdk.ol.d.1
                    private /* synthetic */ com.facetec.sdk.oq c;
                    private /* synthetic */ boolean d = false;

                    {
                        this.c = oqVar;
                    }

                    @Override // com.facetec.sdk.ne
                    public final void c() {
                        int i;
                        com.facetec.sdk.os[] osVarArr;
                        long j;
                        final com.facetec.sdk.ol.d dVar = com.facetec.sdk.ol.d.this;
                        boolean z = this.d;
                        com.facetec.sdk.oq oqVar2 = this.c;
                        synchronized (com.facetec.sdk.ol.this.n) {
                            synchronized (com.facetec.sdk.ol.this) {
                                int e = com.facetec.sdk.ol.this.k.e();
                                if (z) {
                                    com.facetec.sdk.oq oqVar3 = com.facetec.sdk.ol.this.k;
                                    oqVar3.e = 0;
                                    java.util.Arrays.fill(oqVar3.b, 0);
                                }
                                com.facetec.sdk.oq oqVar4 = com.facetec.sdk.ol.this.k;
                                for (int i2 = 0; i2 < 10; i2++) {
                                    if (oqVar2.a(i2)) {
                                        oqVar4.a(i2, oqVar2.b(i2));
                                    }
                                }
                                int e2 = com.facetec.sdk.ol.this.k.e();
                                osVarArr = null;
                                if (e2 == -1 || e2 == e) {
                                    j = 0;
                                } else {
                                    j = e2 - e;
                                    if (!com.facetec.sdk.ol.this.e.isEmpty()) {
                                        osVarArr = (com.facetec.sdk.os[]) com.facetec.sdk.ol.this.e.values().toArray(new com.facetec.sdk.os[com.facetec.sdk.ol.this.e.size()]);
                                    }
                                }
                            }
                            try {
                                com.facetec.sdk.ol.this.n.d(com.facetec.sdk.ol.this.k);
                            } catch (java.io.IOException unused) {
                                com.facetec.sdk.ol.this.a();
                            }
                        }
                        if (osVarArr != null) {
                            for (com.facetec.sdk.os osVar : osVarArr) {
                                synchronized (osVar) {
                                    osVar.a(j);
                                }
                            }
                        }
                        com.facetec.sdk.ol.s.execute(new com.facetec.sdk.ne("OkHttp %s settings", com.facetec.sdk.ol.this.b) { // from class: com.facetec.sdk.ol.d.4
                            @Override // com.facetec.sdk.ne
                            public final void c() {
                                com.facetec.sdk.ol.this.f3712a.e(com.facetec.sdk.ol.this);
                            }
                        });
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void d(boolean z, int i, int i2) {
            if (!z) {
                try {
                    com.facetec.sdk.ol.this.h.execute(com.facetec.sdk.ol.this.new c(i, i2));
                    return;
                } catch (java.util.concurrent.RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (com.facetec.sdk.ol.this) {
                try {
                    if (i == 1) {
                        com.facetec.sdk.ol.f(com.facetec.sdk.ol.this);
                    } else if (i == 2) {
                        com.facetec.sdk.ol.j(com.facetec.sdk.ol.this);
                    } else if (i == 3) {
                        com.facetec.sdk.ol.g(com.facetec.sdk.ol.this);
                        com.facetec.sdk.ol.this.notifyAll();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void a(int i, com.facetec.sdk.pq pqVar) {
            com.facetec.sdk.os[] osVarArr;
            pqVar.j();
            synchronized (com.facetec.sdk.ol.this) {
                osVarArr = (com.facetec.sdk.os[]) com.facetec.sdk.ol.this.e.values().toArray(new com.facetec.sdk.os[com.facetec.sdk.ol.this.e.size()]);
                com.facetec.sdk.ol.h(com.facetec.sdk.ol.this);
            }
            for (com.facetec.sdk.os osVar : osVarArr) {
                if (osVar.a() > i && osVar.c()) {
                    osVar.a(com.facetec.sdk.og.REFUSED_STREAM);
                    com.facetec.sdk.ol.this.a(osVar.a());
                }
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void c(int i, long j) {
            if (i == 0) {
                synchronized (com.facetec.sdk.ol.this) {
                    com.facetec.sdk.ol.this.f3713o += j;
                    com.facetec.sdk.ol.this.notifyAll();
                }
                return;
            }
            com.facetec.sdk.os c = com.facetec.sdk.ol.this.c(i);
            if (c != null) {
                synchronized (c) {
                    c.a(j);
                }
            }
        }

        @Override // com.facetec.sdk.oo.b
        public final void c(int i, java.util.List<com.facetec.sdk.of> list) {
            com.facetec.sdk.ol olVar = com.facetec.sdk.ol.this;
            synchronized (olVar) {
                if (olVar.q.contains(java.lang.Integer.valueOf(i))) {
                    olVar.d(i, com.facetec.sdk.og.PROTOCOL_ERROR);
                    return;
                }
                olVar.q.add(java.lang.Integer.valueOf(i));
                try {
                    olVar.c(olVar.new AnonymousClass3("OkHttp %s Push Request[%s]", new java.lang.Object[]{olVar.b, java.lang.Integer.valueOf(i)}, i, list));
                } catch (java.util.concurrent.RejectedExecutionException unused) {
                }
            }
        }
    }

    /* renamed from: com.facetec.sdk.ol$3, reason: invalid class name */
    final class AnonymousClass3 extends com.facetec.sdk.ne {

        /* renamed from: a, reason: collision with root package name */
        public static int f3716a;
        public static int d;
        private /* synthetic */ java.util.List b;
        private /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(java.lang.String str, java.lang.Object[] objArr, int i, java.util.List list) {
            super(str, objArr);
            this.e = i;
            this.b = list;
        }

        @Override // com.facetec.sdk.ne
        public final void c() {
            com.facetec.sdk.op opVar = com.facetec.sdk.ol.this.f;
            try {
                com.facetec.sdk.ol.this.n.b(this.e, com.facetec.sdk.og.CANCEL);
                synchronized (com.facetec.sdk.ol.this) {
                    com.facetec.sdk.ol.this.q.remove(java.lang.Integer.valueOf(this.e));
                }
            } catch (java.io.IOException unused) {
            }
        }

        public static int a() {
            int i = f3716a;
            f3716a = i + 1;
            if (i % 8389510 != 0) {
                return d;
            }
            int myTid = android.os.Process.myTid();
            d = myTid;
            return myTid;
        }
    }

    final void c(com.facetec.sdk.ne neVar) {
        synchronized (this) {
            if (!this.t) {
                this.p.execute(neVar);
            }
        }
    }
}
