package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class g implements java.lang.AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6966a;
    public final java.lang.Object b;
    public final net.idrnd.face.iad.capture.internal.n0 c;
    public final net.idrnd.face.iad.capture.internal.m0 d;
    public final kotlin.Lazy e;
    public final net.idrnd.face.iad.capture.internal.b f;
    public final net.idrnd.face.iad.capture.internal.d3 g;
    public final java.lang.Object h;
    public final net.idrnd.face.iad.capture.internal.p2 i;
    public final java.lang.Object j;
    public final java.util.concurrent.ExecutorService k;
    public final java.lang.Object l;
    public final java.util.Map m;
    public final java.lang.Object n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6967o;
    public final java.lang.Object p;
    public boolean q;

    public g(android.content.Context context, net.idrnd.face.iad.capture.internal.p2 p2Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2Var, "");
        this.b = new java.lang.Object();
        this.e = kotlin.LazyKt.lazy(net.idrnd.face.iad.capture.internal.e.f6963a);
        this.h = new java.lang.Object();
        this.j = new java.lang.Object();
        this.k = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.l = new java.lang.Object();
        this.m = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.d.f6960a, -1L), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.d.b, -1L));
        this.n = new java.lang.Object();
        this.f6967o = true;
        this.p = new java.lang.Object();
        p2Var.c();
        this.i = p2Var;
        this.f = new net.idrnd.face.iad.capture.internal.b(context);
        net.idrnd.face.iad.capture.internal.n0 n0Var = new net.idrnd.face.iad.capture.internal.n0();
        this.c = n0Var;
        this.d = new net.idrnd.face.iad.capture.internal.m0(n0Var);
        this.g = new net.idrnd.face.iad.capture.internal.d3();
        c();
    }

    public final void c() {
        this.g.a(new net.idrnd.face.iad.capture.internal.y2() { // from class: net.idrnd.face.iad.capture.internal.g$$ExternalSyntheticLambda0
            public final void onHighQualityPhotoWithGridDetected(net.idrnd.face.iad.capture.internal.u2 u2Var, net.idrnd.face.iad.capture.internal.u2 u2Var2) {
                net.idrnd.face.iad.capture.internal.g.a(net.idrnd.face.iad.capture.internal.g.this, u2Var, u2Var2);
            }
        });
    }

    public final boolean f() {
        synchronized (this.p) {
            if (!this.q) {
                return false;
            }
            this.q = false;
            b();
            return true;
        }
    }

    public final void a(net.idrnd.face.iad.capture.internal.u2 u2Var) {
        synchronized (this.l) {
            net.idrnd.face.iad.capture.internal.u2 u2Var2 = (net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).a(u2Var.b());
            if (u2Var2 == null) {
                return;
            }
            if (u2Var2.c()) {
                return;
            }
            if (u2Var.c()) {
                return;
            }
            net.idrnd.face.iad.capture.internal.u2 a2 = u2Var2.a();
            kotlin.jvm.internal.Intrinsics.checkNotNull(a2);
            net.idrnd.face.iad.capture.internal.u2 a3 = u2Var.a();
            kotlin.jvm.internal.Intrinsics.checkNotNull(a3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            this.g.a(a2, a3);
        }
    }

    public final void b() {
        synchronized (this.b) {
            if (this.f6966a) {
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            this.m.put(net.idrnd.face.iad.capture.internal.d.f6960a, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (!a()) {
                synchronized (this.p) {
                    this.q = true;
                }
                return;
            }
            e();
        }
    }

    public final void e() {
        synchronized (this.l) {
            net.idrnd.face.iad.capture.internal.u2 u2Var = (net.idrnd.face.iad.capture.internal.u2) kotlin.collections.CollectionsKt.last(((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).d());
            net.idrnd.face.iad.capture.internal.u2 u2Var2 = (net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).b();
            if (u2Var2 == null) {
                return;
            }
            net.idrnd.face.iad.capture.internal.u2 a2 = u2Var.a();
            kotlin.jvm.internal.Intrinsics.checkNotNull(a2);
            net.idrnd.face.iad.capture.internal.u2 a3 = u2Var2.a();
            kotlin.jvm.internal.Intrinsics.checkNotNull(a3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            a(net.idrnd.face.iad.capture.internal.d.f6960a, a3, a2, null);
        }
    }

    public final net.idrnd.face.iad.capture.internal.o3 b(byte[] bArr, long j) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(a(bArr, j));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl == null) {
            return new net.idrnd.face.iad.capture.internal.n3(new net.idrnd.face.iad.capture.internal.o(new net.idrnd.face.iad.capture.internal.z2(((net.idrnd.face.iad.capture.internal.z2) m23436constructorimpl).f7015a)));
        }
        if (m23439exceptionOrNullimpl instanceof net.idrnd.face.iad.capture.internal.w2) {
            obj = net.idrnd.face.iad.capture.internal.h.f6969a;
        } else if (m23439exceptionOrNullimpl instanceof net.idrnd.face.iad.capture.internal.v2) {
            obj = net.idrnd.face.iad.capture.internal.k.f6977a;
        } else if (m23439exceptionOrNullimpl instanceof net.idrnd.face.iad.capture.internal.w) {
            obj = net.idrnd.face.iad.capture.internal.i.f6972a;
        } else if (m23439exceptionOrNullimpl instanceof net.idrnd.face.iad.capture.internal.b0) {
            obj = net.idrnd.face.iad.capture.internal.j.f6975a;
        } else if (m23439exceptionOrNullimpl instanceof net.idrnd.face.iad.capture.internal.e3) {
            obj = net.idrnd.face.iad.capture.internal.l.f6980a;
        } else {
            obj = net.idrnd.face.iad.capture.internal.m.f6984a;
        }
        return new net.idrnd.face.iad.capture.internal.m3(obj);
    }

    public final boolean a() {
        int c;
        net.idrnd.face.iad.capture.internal.u2 u2Var;
        synchronized (this.l) {
            c = ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).c();
        }
        if (c < 2) {
            return false;
        }
        synchronized (this.l) {
            u2Var = (net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).b();
        }
        return u2Var != null;
    }

    public final net.idrnd.face.iad.capture.internal.z2 c(byte[] bArr, long j) {
        java.lang.Object obj;
        net.idrnd.face.iad.capture.internal.u2 u2Var;
        net.idrnd.face.iad.capture.internal.u2 a2;
        net.idrnd.face.iad.capture.internal.u2 a3;
        synchronized (this.l) {
            java.util.Iterator it = ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((net.idrnd.face.iad.capture.internal.u2) obj).d.f6964a.getImageInfoTimestamp() - j == 0) {
                    break;
                }
            }
            net.idrnd.face.iad.capture.internal.u2 u2Var2 = (net.idrnd.face.iad.capture.internal.u2) obj;
            if (u2Var2 != null) {
                synchronized (this.l) {
                    u2Var = (net.idrnd.face.iad.capture.internal.u2) ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).a(u2Var2.b());
                }
                if (u2Var != null) {
                    a2 = u2Var2.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(a2);
                    a3 = u2Var.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(a3);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    throw new net.idrnd.face.iad.capture.internal.v2();
                }
            } else {
                throw new net.idrnd.face.iad.capture.internal.e3();
            }
        }
        return a(net.idrnd.face.iad.capture.internal.d.f6960a, a3, a2, bArr);
    }

    public final void d() {
        synchronized (this.b) {
            if (this.f6966a) {
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            this.g.a();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.f6966a) {
                return;
            }
            synchronized (this.j) {
                this.k.shutdown();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            this.g.close();
            synchronized (this.l) {
                ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).a();
            }
            this.f6966a = true;
        }
    }

    public final net.idrnd.face.iad.capture.internal.z2 a(byte[] bArr, long j) {
        synchronized (this.b) {
            if (!this.f6966a) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                throw new net.idrnd.face.iad.capture.internal.w2();
            }
        }
        this.m.put(net.idrnd.face.iad.capture.internal.d.f6960a, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (a()) {
            return c(bArr, j);
        }
        synchronized (this.p) {
            this.q = true;
        }
        throw new net.idrnd.face.iad.capture.internal.v2();
    }

    public static final void a(net.idrnd.face.iad.capture.internal.g gVar, net.idrnd.face.iad.capture.internal.u2 u2Var, net.idrnd.face.iad.capture.internal.u2 u2Var2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var2, "");
        synchronized (gVar.n) {
            if (!gVar.f6967o) {
                u2Var.close();
                u2Var2.close();
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.Map map = gVar.m;
            net.idrnd.face.iad.capture.internal.d dVar = net.idrnd.face.iad.capture.internal.d.b;
            map.put(dVar, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gVar.a(dVar, u2Var, u2Var2, null);
        }
    }

    public final net.idrnd.face.iad.capture.internal.o3 a(android.graphics.YuvImage yuvImage, net.idrnd.face.iad.capture.internal.f fVar) {
        net.idrnd.face.iad.capture.internal.l3 l3Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yuvImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
        if (yuvImage.getHeight() <= 0 || yuvImage.getWidth() <= 0) {
            return new net.idrnd.face.iad.capture.internal.m3(net.idrnd.face.iad.capture.internal.g3.f6968a);
        }
        if (fVar.f6964a.getImageInfoTimestamp() < 0) {
            return new net.idrnd.face.iad.capture.internal.m3(net.idrnd.face.iad.capture.internal.h3.f6971a);
        }
        synchronized (this.b) {
            if (this.f6966a) {
                return new net.idrnd.face.iad.capture.internal.m3(net.idrnd.face.iad.capture.internal.f3.f6965a);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yuvImage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
            byte[] yuvData = yuvImage.getYuvData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yuvData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yuvData, "");
            b(new net.idrnd.face.iad.capture.internal.u2(new net.idrnd.face.iad.capture.internal.s2(net.idrnd.face.iad.capture.NativeImageProcessor.f6950a.copyJavaByteArrayToNativeMemory(yuvData), yuvData.length), yuvImage.getWidth(), yuvImage.getHeight(), fVar));
            if (a()) {
                l3Var = net.idrnd.face.iad.capture.internal.l3.f6983a;
            } else {
                l3Var = net.idrnd.face.iad.capture.internal.l3.b;
            }
            return new net.idrnd.face.iad.capture.internal.n3(new net.idrnd.face.iad.capture.internal.j3(l3Var));
        }
    }

    public final void b(net.idrnd.face.iad.capture.internal.u2 u2Var) {
        synchronized (this.l) {
            ((net.idrnd.face.iad.capture.internal.c3) this.e.getValue()).a(u2Var);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (!a() || f()) {
            return;
        }
        a(u2Var);
    }

    public final net.idrnd.face.iad.capture.internal.z2 a(net.idrnd.face.iad.capture.internal.d dVar, net.idrnd.face.iad.capture.internal.u2 u2Var, net.idrnd.face.iad.capture.internal.u2 u2Var2, byte[] bArr) {
        net.idrnd.face.iad.capture.internal.p a2;
        net.idrnd.face.iad.capture.internal.p a3;
        byte[] a4;
        net.idrnd.face.iad.capture.internal.p a5;
        d();
        synchronized (this.h) {
            net.idrnd.face.iad.capture.internal.b3 b3Var = this.i.e;
            java.util.List list = b3Var.f6957a;
            int a6 = b3Var.a();
            int i = net.idrnd.face.iad.capture.internal.r2.f7000a;
            if (bArr != null) {
                a2 = new net.idrnd.face.iad.capture.internal.p(net.idrnd.face.iad.capture.ImageFormat.JPEG, bArr, new android.util.Size(u2Var2.b, u2Var2.c), u2Var2.d, java.lang.System.currentTimeMillis());
            } else {
                net.idrnd.face.iad.capture.internal.p0 p0Var = (net.idrnd.face.iad.capture.internal.p0) list.get(a6);
                int ordinal = p0Var.f6995a.ordinal();
                if (ordinal == 0) {
                    net.idrnd.face.iad.capture.internal.n0 n0Var = this.c;
                    net.idrnd.face.iad.capture.internal.f fVar = u2Var2.d;
                    java.lang.Integer num = p0Var.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                    a2 = n0Var.a(u2Var2, fVar, num.intValue());
                } else if (ordinal == 1) {
                    a2 = this.c.a(u2Var2);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            net.idrnd.face.iad.capture.internal.p pVar = a2;
            pVar.d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                if (i2 != a6) {
                    arrayList.add(obj);
                }
                i2++;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                net.idrnd.face.iad.capture.internal.p0 p0Var2 = (net.idrnd.face.iad.capture.internal.p0) it.next();
                int ordinal2 = p0Var2.f6995a.ordinal();
                if (ordinal2 == 0) {
                    net.idrnd.face.iad.capture.internal.n0 n0Var2 = this.c;
                    net.idrnd.face.iad.capture.internal.f fVar2 = u2Var2.d;
                    java.lang.Integer num2 = p0Var2.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
                    a5 = n0Var2.a(u2Var2, fVar2, num2.intValue());
                } else if (ordinal2 == 1) {
                    a5 = this.c.a(u2Var2);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrayList2.add(a5);
            }
            int i3 = net.idrnd.face.iad.capture.internal.r2.f7000a;
            net.idrnd.face.iad.capture.internal.v vVar = this.i.e.c;
            java.util.ArrayList a7 = vVar != null ? this.d.a(u2Var2, vVar.b, vVar.d) : null;
            u2Var2.close();
            net.idrnd.face.iad.capture.internal.p0 p0Var3 = this.i.e.b;
            int ordinal3 = p0Var3.f6995a.ordinal();
            if (ordinal3 == 0) {
                net.idrnd.face.iad.capture.internal.n0 n0Var3 = this.c;
                net.idrnd.face.iad.capture.internal.f fVar3 = u2Var.d;
                java.lang.Integer num3 = p0Var3.b;
                kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
                a3 = n0Var3.a(u2Var, fVar3, num3.intValue());
            } else if (ordinal3 == 1) {
                a3 = this.c.a(u2Var);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            net.idrnd.face.iad.capture.internal.p pVar2 = a3;
            u2Var.close();
            a4 = this.f.a(pVar2, pVar, a7, arrayList2, this.i, ((java.lang.Number) kotlin.collections.MapsKt.getValue(this.m, dVar)).longValue());
        }
        return new net.idrnd.face.iad.capture.internal.z2(a4);
    }
}
