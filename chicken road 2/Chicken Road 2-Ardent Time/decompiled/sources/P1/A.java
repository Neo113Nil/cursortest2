package P1;

/* loaded from: classes.dex */
public final class A implements java.io.Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.logging.Logger f1428f = java.util.logging.Logger.getLogger(P1.g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final V1.p f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.g f1430b;

    /* renamed from: c, reason: collision with root package name */
    public int f1431c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1432d;

    /* renamed from: e, reason: collision with root package name */
    public final P1.C0057e f1433e;

    public A(V1.p sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1429a = sink;
        V1.g gVar = new V1.g();
        this.f1430b = gVar;
        this.f1431c = 16384;
        this.f1433e = new P1.C0057e(gVar);
    }

    public final synchronized void a(P1.E peerSettings) {
        try {
            kotlin.jvm.internal.i.e(peerSettings, "peerSettings");
            if (this.f1432d) {
                throw new java.io.IOException("closed");
            }
            int i2 = this.f1431c;
            int i3 = peerSettings.f1441a;
            if ((i3 & 32) != 0) {
                i2 = peerSettings.f1442b[5];
            }
            this.f1431c = i2;
            if (((i3 & 2) != 0 ? peerSettings.f1442b[1] : -1) != -1) {
                P1.C0057e c0057e = this.f1433e;
                int i4 = (i3 & 2) != 0 ? peerSettings.f1442b[1] : -1;
                c0057e.getClass();
                int min = java.lang.Math.min(i4, 16384);
                int i5 = c0057e.f1472e;
                if (i5 != min) {
                    if (min < i5) {
                        c0057e.f1470c = java.lang.Math.min(c0057e.f1470c, min);
                    }
                    c0057e.f1471d = true;
                    c0057e.f1472e = min;
                    int i6 = c0057e.f1476i;
                    if (min < i6) {
                        if (min == 0) {
                            P1.C0055c[] c0055cArr = c0057e.f1473f;
                            i1.AbstractC0189h.N(c0055cArr, 0, c0055cArr.length);
                            c0057e.f1474g = c0057e.f1473f.length - 1;
                            c0057e.f1475h = 0;
                            c0057e.f1476i = 0;
                        } else {
                            c0057e.a(i6 - min);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.f1429a.flush();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z2, int i2, V1.g gVar, int i3) {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        g(i2, i3, 0, z2 ? 1 : 0);
        if (i3 > 0) {
            kotlin.jvm.internal.i.b(gVar);
            this.f1429a.e(gVar, i3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1432d = true;
        this.f1429a.close();
    }

    public final synchronized void flush() {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        this.f1429a.flush();
    }

    public final void g(int i2, int i3, int i4, int i5) {
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.logging.Logger logger = f1428f;
        if (logger.isLoggable(level)) {
            logger.fine(P1.g.a(false, i2, i3, i4, i5));
        }
        if (i3 > this.f1431c) {
            throw new java.lang.IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1431c + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "reserved bit set: ").toString());
        }
        byte[] bArr = J1.b.f932a;
        V1.p pVar = this.f1429a;
        kotlin.jvm.internal.i.e(pVar, "<this>");
        pVar.b((i3 >>> 16) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b((i3 >>> 8) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i3 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i4 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i5 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.g(i2 & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i2, P1.EnumC0054b enumC0054b, byte[] bArr) {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        if (enumC0054b.f1451a == -1) {
            throw new java.lang.IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, bArr.length + 8, 7, 0);
        this.f1429a.g(i2);
        this.f1429a.g(enumC0054b.f1451a);
        if (bArr.length != 0) {
            V1.p pVar = this.f1429a;
            if (pVar.f1783c) {
                throw new java.lang.IllegalStateException("closed");
            }
            pVar.f1782b.s(bArr, 0, bArr.length);
            pVar.a();
        }
        this.f1429a.flush();
    }

    public final synchronized void k(boolean z2, int i2, java.util.ArrayList arrayList) {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        this.f1433e.d(arrayList);
        long j2 = this.f1430b.f1764b;
        long min = java.lang.Math.min(this.f1431c, j2);
        int i3 = j2 == min ? 4 : 0;
        if (z2) {
            i3 |= 1;
        }
        g(i2, (int) min, 1, i3);
        this.f1429a.e(this.f1430b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = java.lang.Math.min(this.f1431c, j3);
                j3 -= min2;
                g(i2, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f1429a.e(this.f1430b, min2);
            }
        }
    }

    public final synchronized void l(int i2, int i3, boolean z2) {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        g(0, 8, 6, z2 ? 1 : 0);
        this.f1429a.g(i2);
        this.f1429a.g(i3);
        this.f1429a.flush();
    }

    public final synchronized void m(int i2, P1.EnumC0054b enumC0054b) {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        if (enumC0054b.f1451a == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        g(i2, 4, 3, 0);
        this.f1429a.g(enumC0054b.f1451a);
        this.f1429a.flush();
    }

    public final synchronized void n(int i2, long j2) {
        if (this.f1432d) {
            throw new java.io.IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(java.lang.Long.valueOf(j2), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        g(i2, 4, 8, 0);
        this.f1429a.g((int) j2);
        this.f1429a.flush();
    }
}
