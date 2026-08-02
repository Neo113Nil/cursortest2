package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class os {
    static final /* synthetic */ boolean k = true;

    /* renamed from: a, reason: collision with root package name */
    final int f3729a;
    final com.facetec.sdk.ol b;
    final java.util.Deque<com.facetec.sdk.mm> c;
    long d = 0;
    long e;
    boolean f;
    final com.facetec.sdk.os.c g;
    final com.facetec.sdk.os.e h;
    final com.facetec.sdk.os.a i;
    final com.facetec.sdk.os.e j;
    com.facetec.sdk.og n;

    /* renamed from: o, reason: collision with root package name */
    private com.facetec.sdk.of.c f3730o;

    final class e extends com.facetec.sdk.pn {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static long b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(int i, byte b2, byte b3) {
            int i2;
            int i3 = b2 * 2;
            byte[] bArr = $$a;
            int i4 = 120 - i;
            int i5 = b3 + 4;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i4 += i6;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                i5++;
                i7 = i2 + 1;
                if (i2 == i3) {
                    return new java.lang.String(bArr2, 0);
                }
                i6 = bArr[i5];
                i4 += i6;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                i5++;
                i7 = i2 + 1;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                i5++;
                i7 = i2 + 1;
                if (i2 == i3) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{5, 99, 10, 46};
            $$b = 7;
        }

        private static void k(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] charArray = str != null ? str.toCharArray() : str;
            com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
            hvVar.d = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            hvVar.c = 0;
            while (hvVar.c < charArray.length) {
                int i2 = hvVar.c;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[hvVar.c]), hvVar, hvVar};
                    java.lang.Object d = com.facetec.sdk.al.d(-1009843105);
                    if (d == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        d = com.facetec.sdk.al.c((char) (33463 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 478 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 24, 1679851175, false, $$c(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                    }
                    jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue() ^ (b ^ 2966223176042272838L);
                    java.lang.Object[] objArr3 = {hvVar, hvVar};
                    java.lang.Object d2 = com.facetec.sdk.al.d(95517984);
                    if (d2 == null) {
                        char makeMeasureSpec = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                        byte b4 = (byte) ($$b >>> 2);
                        byte b5 = (byte) (b4 - 1);
                        d2 = com.facetec.sdk.al.c(makeMeasureSpec, (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 590, 24 - absoluteGravity, -1570895912, false, $$c(b4, b5, (byte) (b5 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d2).invoke(null, objArr3);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[length];
            hvVar.c = 0;
            while (hvVar.c < charArray.length) {
                cArr[hvVar.c] = (char) jArr[hvVar.c];
                java.lang.Object[] objArr4 = {hvVar, hvVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
                if (d3 == null) {
                    char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                    float minVolume = android.media.AudioTrack.getMinVolume();
                    byte b6 = (byte) ($$b >>> 2);
                    byte b7 = (byte) (b6 - 1);
                    d3 = com.facetec.sdk.al.c(maximumFlingVelocity, (doubleTapTimeout >> 16) + 591, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 24, -1570895912, false, $$c(b6, b7, (byte) (b7 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        e() {
        }

        @Override // com.facetec.sdk.pn
        public final void a() {
            com.facetec.sdk.os.this.b(com.facetec.sdk.og.CANCEL);
            final com.facetec.sdk.ol olVar = com.facetec.sdk.os.this.b;
            synchronized (olVar) {
                if (olVar.i < olVar.j) {
                    return;
                }
                olVar.j++;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    k("赘淆䱮ⳬ\u0f48\uefb7츭ꥏ觽校䢳⬬\u0bbd\uead7앱ꗤ", 57492 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    k("赜㊜\uf2c2눰牚㉐\uf385돾", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 49104, objArr2);
                    olVar.m = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() + 1000000000;
                    try {
                        olVar.h.execute(new com.facetec.sdk.ne("OkHttp %s ping", olVar.b) { // from class: com.facetec.sdk.ol.5
                            AnonymousClass5(java.lang.String str, java.lang.Object... objArr3) {
                                super(str, objArr3);
                            }

                            @Override // com.facetec.sdk.ne
                            public final void c() {
                                com.facetec.sdk.ol.this.e(false, 2, 0);
                            }
                        });
                    } catch (java.util.concurrent.RejectedExecutionException unused) {
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        @Override // com.facetec.sdk.pn
        public final java.io.IOException b(java.io.IOException iOException) {
            java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void d() throws java.io.IOException {
            if (e()) {
                throw b(null);
            }
        }

        static {
            init$0();
            b = 3304794655472309620L;
        }
    }

    os(int i, com.facetec.sdk.ol olVar, boolean z, boolean z2, @javax.annotation.Nullable com.facetec.sdk.mm mmVar) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.c = arrayDeque;
        this.j = new com.facetec.sdk.os.e();
        this.h = new com.facetec.sdk.os.e();
        this.n = null;
        if (olVar == null) {
            throw new java.lang.NullPointerException("connection == null");
        }
        this.f3729a = i;
        this.b = olVar;
        this.e = olVar.k.e();
        com.facetec.sdk.os.c cVar = new com.facetec.sdk.os.c(olVar.l.e());
        this.g = cVar;
        com.facetec.sdk.os.a aVar = new com.facetec.sdk.os.a();
        this.i = aVar;
        cVar.d = z2;
        aVar.b = z;
        if (mmVar != null) {
            arrayDeque.add(mmVar);
        }
        if (c() && mmVar != null) {
            throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!c() && mmVar == null) {
            throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final int a() {
        return this.f3729a;
    }

    public final boolean d() {
        synchronized (this) {
            if (this.n != null) {
                return false;
            }
            if ((this.g.d || this.g.f3732a) && (this.i.b || this.i.c)) {
                if (this.f) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean c() {
        return this.b.c == ((this.f3729a & 1) == 1);
    }

    public final com.facetec.sdk.mm e() throws java.io.IOException {
        com.facetec.sdk.mm removeFirst;
        synchronized (this) {
            this.j.b();
            while (this.c.isEmpty() && this.n == null) {
                try {
                    f();
                } catch (java.lang.Throwable th) {
                    this.j.d();
                    throw th;
                }
            }
            this.j.d();
            if (!this.c.isEmpty()) {
                removeFirst = this.c.removeFirst();
            } else {
                throw new com.facetec.sdk.ou(this.n);
            }
        }
        return removeFirst;
    }

    public final com.facetec.sdk.qa b() {
        synchronized (this) {
            if (!this.f && !c()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        return this.i;
    }

    public final void c(com.facetec.sdk.og ogVar) throws java.io.IOException {
        if (d(ogVar)) {
            this.b.c(this.f3729a, ogVar);
        }
    }

    public final void b(com.facetec.sdk.og ogVar) {
        if (d(ogVar)) {
            this.b.d(this.f3729a, ogVar);
        }
    }

    private boolean d(com.facetec.sdk.og ogVar) {
        if (!k && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError();
        }
        synchronized (this) {
            if (this.n != null) {
                return false;
            }
            if (this.g.d && this.i.b) {
                return false;
            }
            this.n = ogVar;
            notifyAll();
            this.b.a(this.f3729a);
            return true;
        }
    }

    final void j() {
        boolean d;
        if (!k && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError();
        }
        synchronized (this) {
            this.g.d = true;
            d = d();
            notifyAll();
        }
        if (d) {
            return;
        }
        this.b.a(this.f3729a);
    }

    final void a(com.facetec.sdk.og ogVar) {
        synchronized (this) {
            if (this.n == null) {
                this.n = ogVar;
                notifyAll();
            }
        }
    }

    final class c implements com.facetec.sdk.pz {
        static /* synthetic */ boolean g = true;

        /* renamed from: a, reason: collision with root package name */
        boolean f3732a;
        final long b;
        boolean d;
        final com.facetec.sdk.pk e = new com.facetec.sdk.pk();
        final com.facetec.sdk.pk c = new com.facetec.sdk.pk();

        c(long j) {
            this.b = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
        
            if (r11 == (-1)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
        
            d(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        
            if (r0 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
        
            throw new com.facetec.sdk.ou(r0);
         */
        @Override // com.facetec.sdk.pz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            long b;
            com.facetec.sdk.mm mmVar;
            com.facetec.sdk.of.c cVar;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
            }
            while (true) {
                synchronized (com.facetec.sdk.os.this) {
                    com.facetec.sdk.os.this.j.b();
                    try {
                        com.facetec.sdk.og ogVar = com.facetec.sdk.os.this.n != null ? com.facetec.sdk.os.this.n : null;
                        if (!this.f3732a) {
                            if (com.facetec.sdk.os.this.c.isEmpty() || com.facetec.sdk.os.this.f3730o == null) {
                                if (this.c.e() > 0) {
                                    com.facetec.sdk.pk pkVar2 = this.c;
                                    b = pkVar2.b(pkVar, java.lang.Math.min(j, pkVar2.e()));
                                    com.facetec.sdk.os.this.d += b;
                                    if (ogVar == null && com.facetec.sdk.os.this.d >= com.facetec.sdk.os.this.b.l.e() / 2) {
                                        com.facetec.sdk.os.this.b.d(com.facetec.sdk.os.this.f3729a, com.facetec.sdk.os.this.d);
                                        com.facetec.sdk.os.this.d = 0L;
                                    }
                                } else if (this.d || ogVar != null) {
                                    b = -1;
                                } else {
                                    com.facetec.sdk.os.this.f();
                                }
                                mmVar = null;
                                cVar = null;
                            } else {
                                mmVar = (com.facetec.sdk.mm) com.facetec.sdk.os.this.c.removeFirst();
                                cVar = com.facetec.sdk.os.this.f3730o;
                                b = -1;
                            }
                            if (mmVar == null || cVar == null) {
                                break;
                            }
                        } else {
                            throw new java.io.IOException("stream closed");
                        }
                    } finally {
                        com.facetec.sdk.os.this.j.d();
                    }
                }
            }
        }

        final void d(long j) {
            if (!g && java.lang.Thread.holdsLock(com.facetec.sdk.os.this)) {
                throw new java.lang.AssertionError();
            }
            com.facetec.sdk.os.this.b.c(j);
        }

        @Override // com.facetec.sdk.pz
        public final com.facetec.sdk.qe d() {
            return com.facetec.sdk.os.this.j;
        }

        @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            long e;
            java.util.ArrayList<com.facetec.sdk.mm> arrayList;
            com.facetec.sdk.of.c cVar;
            synchronized (com.facetec.sdk.os.this) {
                this.f3732a = true;
                e = this.c.e();
                this.c.q();
                if (com.facetec.sdk.os.this.c.isEmpty() || com.facetec.sdk.os.this.f3730o == null) {
                    arrayList = null;
                    cVar = null;
                } else {
                    arrayList = new java.util.ArrayList(com.facetec.sdk.os.this.c);
                    com.facetec.sdk.os.this.c.clear();
                    cVar = com.facetec.sdk.os.this.f3730o;
                }
                com.facetec.sdk.os.this.notifyAll();
            }
            if (e > 0) {
                d(e);
            }
            com.facetec.sdk.os.this.i();
            if (cVar != null) {
                for (com.facetec.sdk.mm mmVar : arrayList) {
                }
            }
        }
    }

    final void i() throws java.io.IOException {
        boolean z;
        boolean d;
        if (!k && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError();
        }
        synchronized (this) {
            z = !this.g.d && this.g.f3732a && (this.i.b || this.i.c);
            d = d();
        }
        if (z) {
            c(com.facetec.sdk.og.CANCEL);
        } else {
            if (d) {
                return;
            }
            this.b.a(this.f3729a);
        }
    }

    final class a implements com.facetec.sdk.qa {
        private static /* synthetic */ boolean e = true;

        /* renamed from: a, reason: collision with root package name */
        private final com.facetec.sdk.pk f3731a = new com.facetec.sdk.pk();
        boolean b;
        boolean c;

        a() {
        }

        @Override // com.facetec.sdk.qa
        public final void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            if (!e && java.lang.Thread.holdsLock(com.facetec.sdk.os.this)) {
                throw new java.lang.AssertionError();
            }
            this.f3731a.c(pkVar, j);
            while (this.f3731a.e() >= okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) {
                b(false);
            }
        }

        private void b(boolean z) throws java.io.IOException {
            long min;
            synchronized (com.facetec.sdk.os.this) {
                com.facetec.sdk.os.this.h.b();
                while (com.facetec.sdk.os.this.e <= 0 && !this.b && !this.c && com.facetec.sdk.os.this.n == null) {
                    try {
                        com.facetec.sdk.os.this.f();
                    } finally {
                    }
                }
                com.facetec.sdk.os.this.h.d();
                com.facetec.sdk.os.this.g();
                min = java.lang.Math.min(com.facetec.sdk.os.this.e, this.f3731a.e());
                com.facetec.sdk.os.this.e -= min;
            }
            com.facetec.sdk.os.this.h.b();
            try {
                com.facetec.sdk.os.this.b.d(com.facetec.sdk.os.this.f3729a, z && min == this.f3731a.e(), this.f3731a, min);
            } finally {
            }
        }

        @Override // com.facetec.sdk.qa, java.io.Flushable
        public final void flush() throws java.io.IOException {
            if (!e && java.lang.Thread.holdsLock(com.facetec.sdk.os.this)) {
                throw new java.lang.AssertionError();
            }
            synchronized (com.facetec.sdk.os.this) {
                com.facetec.sdk.os.this.g();
            }
            while (this.f3731a.e() > 0) {
                b(false);
                com.facetec.sdk.os.this.b.c();
            }
        }

        @Override // com.facetec.sdk.qa
        public final com.facetec.sdk.qe d() {
            return com.facetec.sdk.os.this.h;
        }

        @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (!e && java.lang.Thread.holdsLock(com.facetec.sdk.os.this)) {
                throw new java.lang.AssertionError();
            }
            synchronized (com.facetec.sdk.os.this) {
                if (this.c) {
                    return;
                }
                if (!com.facetec.sdk.os.this.i.b) {
                    if (this.f3731a.e() > 0) {
                        while (this.f3731a.e() > 0) {
                            b(true);
                        }
                    } else {
                        com.facetec.sdk.os.this.b.d(com.facetec.sdk.os.this.f3729a, true, null, 0L);
                    }
                }
                synchronized (com.facetec.sdk.os.this) {
                    this.c = true;
                }
                com.facetec.sdk.os.this.b.c();
                com.facetec.sdk.os.this.i();
            }
        }
    }

    final void a(long j) {
        this.e += j;
        if (j > 0) {
            notifyAll();
        }
    }

    final void g() throws java.io.IOException {
        if (this.i.c) {
            throw new java.io.IOException("stream closed");
        }
        if (this.i.b) {
            throw new java.io.IOException("stream finished");
        }
        if (this.n != null) {
            throw new com.facetec.sdk.ou(this.n);
        }
    }

    final void f() throws java.io.InterruptedIOException {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }
}
