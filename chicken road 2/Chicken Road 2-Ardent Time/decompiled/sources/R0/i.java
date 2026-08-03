package R0;

/* loaded from: classes.dex */
public final class i implements a1.f, R0.j {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterJNI f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f1678b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f1679c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1680d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f1681e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f1682f;

    /* renamed from: g, reason: collision with root package name */
    public int f1683g;

    /* renamed from: h, reason: collision with root package name */
    public final R0.k f1684h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.WeakHashMap f1685i;

    /* renamed from: j, reason: collision with root package name */
    public final C.j f1686j;

    public i(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        C.j jVar = new C.j(21);
        jVar.f88b = (java.util.concurrent.ExecutorService) I0.b.F().f659d;
        this.f1678b = new java.util.HashMap();
        this.f1679c = new java.util.HashMap();
        this.f1680d = new java.lang.Object();
        this.f1681e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f1682f = new java.util.HashMap();
        this.f1683g = 1;
        this.f1684h = new R0.k();
        this.f1685i = new java.util.WeakHashMap();
        this.f1677a = flutterJNI;
        this.f1686j = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [R0.c] */
    public final void a(final java.lang.String str, final R0.f fVar, final java.nio.ByteBuffer byteBuffer, final int i2, final long j2) {
        R0.e eVar = fVar != null ? fVar.f1670b : null;
        java.lang.String a2 = g1.AbstractC0130a.a("PlatformChannel ScheduleHandler on " + str);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            S.a.a(i2, Q1.l.A(a2));
        } else {
            java.lang.String A2 = Q1.l.A(a2);
            try {
                if (Q1.l.f1636c == null) {
                    Q1.l.f1636c = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                }
                Q1.l.f1636c.invoke(null, java.lang.Long.valueOf(Q1.l.f1634a), A2, java.lang.Integer.valueOf(i2));
            } catch (java.lang.Exception e2) {
                Q1.l.o("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new java.lang.Runnable() { // from class: R0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                io.flutter.embedding.engine.FlutterJNI flutterJNI = R0.i.this.f1677a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformChannel ScheduleHandler on ");
                java.lang.String str2 = str;
                sb.append(str2);
                java.lang.String a3 = g1.AbstractC0130a.a(sb.toString());
                int i3 = android.os.Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    S.a.b(i4, Q1.l.A(a3));
                } else {
                    java.lang.String A3 = Q1.l.A(a3);
                    try {
                        if (Q1.l.f1637d == null) {
                            Q1.l.f1637d = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                        }
                        Q1.l.f1637d.invoke(null, java.lang.Long.valueOf(Q1.l.f1634a), A3, java.lang.Integer.valueOf(i4));
                    } catch (java.lang.Exception e3) {
                        Q1.l.o("asyncTraceEnd", e3);
                    }
                }
                try {
                    g1.AbstractC0130a.b("DartMessenger#handleMessageFromDart on " + str2);
                    R0.f fVar2 = fVar;
                    java.nio.ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f1669a.b(byteBuffer2, new R0.g(flutterJNI, i4));
                                } catch (java.lang.Exception e4) {
                                    android.util.Log.e("DartMessenger", "Uncaught exception in binary message listener", e4);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                                }
                            } catch (java.lang.Error e5) {
                                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e5;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e5);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        android.os.Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j3);
                }
            }
        };
        R0.e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f1684h;
        }
        eVar2.a(r02);
    }

    @Override // a1.f
    public final void c(java.lang.String str, java.nio.ByteBuffer byteBuffer, a1.e eVar) {
        g1.AbstractC0130a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f1683g;
            this.f1683g = i2 + 1;
            if (eVar != null) {
                this.f1682f.put(java.lang.Integer.valueOf(i2), eVar);
            }
            io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f1677a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // a1.f
    public final m0.j f(a1.i iVar) {
        C.j jVar = this.f1686j;
        jVar.getClass();
        R0.h hVar = new R0.h((java.util.concurrent.ExecutorService) jVar.f88b);
        m0.j jVar2 = new m0.j(20, false);
        this.f1685i.put(jVar2, hVar);
        return jVar2;
    }

    @Override // a1.f
    public final void h(java.lang.String str, a1.InterfaceC0064d interfaceC0064d) {
        j(str, interfaceC0064d, null);
    }

    @Override // a1.f
    public final void j(java.lang.String str, a1.InterfaceC0064d interfaceC0064d, m0.j jVar) {
        R0.e eVar;
        if (interfaceC0064d == null) {
            synchronized (this.f1680d) {
                this.f1678b.remove(str);
            }
            return;
        }
        if (jVar != null) {
            eVar = (R0.e) this.f1685i.get(jVar);
            if (eVar == null) {
                throw new java.lang.IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f1680d) {
            try {
                this.f1678b.put(str, new R0.f(interfaceC0064d, eVar));
                java.util.List<R0.d> list = (java.util.List) this.f1679c.remove(str);
                if (list == null) {
                    return;
                }
                for (R0.d dVar : list) {
                    a(str, (R0.f) this.f1678b.get(str), dVar.f1666a, dVar.f1667b, dVar.f1668c);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
