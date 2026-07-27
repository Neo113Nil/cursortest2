package a5;

import b2.AbstractC0279e;
import g4.AbstractC0464i;
import g4.AbstractC0465j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import t4.InterfaceC1430a;
import y4.C1572a;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f4027d;

    /* renamed from: a, reason: collision with root package name */
    public final j5.q f4028a;

    /* renamed from: b, reason: collision with root package name */
    public final w f4029b;

    /* renamed from: c, reason: collision with root package name */
    public final C0203e f4030c;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(...)");
        f4027d = logger;
    }

    public x(j5.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f4028a = source;
        w wVar = new w(source);
        this.f4029b = wVar;
        this.f4030c = new C0203e(wVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x025b, code lost:
    
        throw new java.io.IOException(b2.AbstractC0279e.d(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z, s handler) {
        EnumC0200b enumC0200b;
        EnumC0200b enumC0200b2;
        Object[] array;
        int i2 = 1;
        kotlin.jvm.internal.i.e(handler, "handler");
        int i3 = 0;
        try {
            this.f4028a.A(9L);
            int l2 = U4.c.l(this.f4028a);
            if (l2 > 16384) {
                throw new IOException(AbstractC0279e.d(l2, "FRAME_SIZE_ERROR: "));
            }
            int c2 = this.f4028a.c() & 255;
            byte c6 = this.f4028a.c();
            int i6 = c6 & 255;
            int o2 = this.f4028a.o();
            int i7 = Integer.MAX_VALUE & o2;
            if (c2 != 8) {
                Logger logger = f4027d;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(true, i7, l2, c2, i6));
                }
            }
            if (z && c2 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(c2));
            }
            switch (c2) {
                case 0:
                    c(handler, l2, i6, i7);
                    return true;
                case 1:
                    o(handler, l2, i6, i7);
                    return true;
                case 2:
                    if (l2 != 5) {
                        throw new IOException(B0.o.g(l2, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    j5.q qVar = this.f4028a;
                    qVar.o();
                    qVar.c();
                    return true;
                case 3:
                    if (l2 != 4) {
                        throw new IOException(B0.o.g(l2, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int o5 = this.f4028a.o();
                    EnumC0200b.f3916b.getClass();
                    EnumC0200b[] values = EnumC0200b.values();
                    int length = values.length;
                    while (true) {
                        if (i3 < length) {
                            EnumC0200b enumC0200b3 = values[i3];
                            if (enumC0200b3.f3924a == o5) {
                                enumC0200b = enumC0200b3;
                            } else {
                                i3++;
                            }
                        } else {
                            enumC0200b = null;
                        }
                    }
                    if (enumC0200b == null) {
                        throw new IOException(AbstractC0279e.d(o5, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    t tVar = handler.f3986b;
                    tVar.getClass();
                    if (i7 == 0 || (o2 & 1) != 0) {
                        B c7 = tVar.c(i7);
                        if (c7 != null) {
                            synchronized (c7) {
                                if (c7.f() == null) {
                                    c7.f3901l = enumC0200b;
                                    c7.notifyAll();
                                }
                            }
                        }
                    } else {
                        W4.c.c(tVar.f3996i, tVar.f3990c + '[' + i7 + "] onReset", new m(tVar, i7, enumC0200b, i2));
                    }
                    return true;
                case 4:
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((c6 & 1) != 0) {
                        if (l2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (l2 % 6 != 0) {
                            throw new IOException(AbstractC0279e.d(l2, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        F f3 = new F();
                        C1572a q02 = K1.b.q0(K1.b.s0(0, l2), 6);
                        int i8 = q02.f12439a;
                        int i9 = q02.f12440b;
                        int i10 = q02.f12441c;
                        if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                            while (true) {
                                j5.q qVar2 = this.f4028a;
                                short p5 = qVar2.p();
                                byte[] bArr = U4.c.f3176a;
                                int i11 = p5 & 65535;
                                int o6 = qVar2.o();
                                if (i11 != 2) {
                                    if (i11 != 4) {
                                        if (i11 == 5 && (o6 < 16384 || o6 > 16777215)) {
                                        }
                                    } else if (o6 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                } else if (o6 != 0 && o6 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                f3.c(i11, o6);
                                if (i8 != i9) {
                                    i8 += i10;
                                }
                            }
                        }
                        t tVar2 = handler.f3986b;
                        W4.c.c(tVar2.f3995h, AbstractC0279e.h(new StringBuilder(), tVar2.f3990c, " applyAndAckSettings"), new r(handler, i2, f3));
                    }
                    return true;
                case 5:
                    p(handler, l2, i6, i7);
                    return true;
                case 6:
                    if (l2 != 8) {
                        throw new IOException(AbstractC0279e.d(l2, "TYPE_PING length != 8: "));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int o7 = this.f4028a.o();
                    final int o8 = this.f4028a.o();
                    if ((c6 & 1) != 0) {
                        t tVar3 = handler.f3986b;
                        synchronized (tVar3) {
                            try {
                                if (o7 == 1) {
                                    tVar3.f4000m++;
                                } else if (o7 == 2) {
                                    tVar3.f4002o++;
                                } else if (o7 == 3) {
                                    tVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        W4.c cVar = handler.f3986b.f3995h;
                        String h3 = AbstractC0279e.h(new StringBuilder(), handler.f3986b.f3990c, " ping");
                        final t tVar4 = handler.f3986b;
                        W4.c.c(cVar, h3, new InterfaceC1430a() { // from class: a5.q
                            @Override // t4.InterfaceC1430a
                            public final Object invoke() {
                                int i12 = o7;
                                int i13 = o8;
                                t tVar5 = t.this;
                                tVar5.getClass();
                                try {
                                    tVar5.f4011x.p(i12, i13, true);
                                } catch (IOException e3) {
                                    EnumC0200b enumC0200b4 = EnumC0200b.f3918d;
                                    tVar5.a(enumC0200b4, enumC0200b4, e3);
                                }
                                return f4.v.f5689a;
                            }
                        });
                    }
                    return true;
                case 7:
                    if (l2 < 8) {
                        throw new IOException(AbstractC0279e.d(l2, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int o9 = this.f4028a.o();
                    int o10 = this.f4028a.o();
                    int i12 = l2 - 8;
                    EnumC0200b.f3916b.getClass();
                    EnumC0200b[] values2 = EnumC0200b.values();
                    int length2 = values2.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            EnumC0200b enumC0200b4 = values2[i13];
                            if (enumC0200b4.f3924a == o10) {
                                enumC0200b2 = enumC0200b4;
                            } else {
                                i13++;
                            }
                        } else {
                            enumC0200b2 = null;
                        }
                    }
                    if (enumC0200b2 == null) {
                        throw new IOException(AbstractC0279e.d(o10, "TYPE_GOAWAY unexpected error code: "));
                    }
                    j5.i debugData = j5.i.f10496d;
                    if (i12 > 0) {
                        debugData = this.f4028a.g(i12);
                    }
                    kotlin.jvm.internal.i.e(debugData, "debugData");
                    debugData.a();
                    t tVar5 = handler.f3986b;
                    synchronized (tVar5) {
                        array = tVar5.f3989b.values().toArray(new B[0]);
                        tVar5.f3993f = true;
                    }
                    B[] bArr2 = (B[]) array;
                    int length3 = bArr2.length;
                    while (i3 < length3) {
                        B b6 = bArr2[i3];
                        if (b6.f3890a > o9 && b6.g()) {
                            EnumC0200b enumC0200b5 = EnumC0200b.f3921g;
                            synchronized (b6) {
                                if (b6.f() == null) {
                                    b6.f3901l = enumC0200b5;
                                    b6.notifyAll();
                                }
                            }
                            handler.f3986b.c(b6.f3890a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    try {
                        if (l2 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + l2);
                        }
                        long o11 = this.f4028a.o() & 2147483647L;
                        if (o11 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f4027d;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(o11, i7, l2, true));
                        }
                        if (i7 == 0) {
                            t tVar6 = handler.f3986b;
                            synchronized (tVar6) {
                                tVar6.f4009v += o11;
                                tVar6.notifyAll();
                            }
                        } else {
                            B b7 = handler.f3986b.b(i7);
                            if (b7 != null) {
                                synchronized (b7) {
                                    b7.f3894e += o11;
                                    if (o11 > 0) {
                                        b7.notifyAll();
                                    }
                                }
                            }
                        }
                        return true;
                    } catch (Exception e3) {
                        f4027d.fine(h.b(true, i7, l2, 8, i6));
                        throw e3;
                    }
                default:
                    this.f4028a.C(l2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(s handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        if (!a(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void c(s sVar, int i2, int i3, final int i6) {
        int i7;
        int i8;
        B b6;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i3 & 8) != 0) {
            byte c2 = this.f4028a.c();
            byte[] bArr = U4.c.f3176a;
            i8 = c2 & 255;
            i7 = i2;
        } else {
            i7 = i2;
            i8 = 0;
        }
        final int a6 = v.a(i7, i3, i8);
        j5.q source = this.f4028a;
        sVar.getClass();
        kotlin.jvm.internal.i.e(source, "source");
        sVar.f3986b.getClass();
        if (i6 == 0 || (i6 & 1) != 0) {
            B b7 = sVar.f3986b.b(i6);
            if (b7 == null) {
                sVar.f3986b.q(i6, EnumC0200b.f3918d);
                long j2 = a6;
                sVar.f3986b.o(j2);
                source.C(j2);
            } else {
                TimeZone timeZone = U4.e.f3179a;
                z zVar = b7.f3897h;
                long j6 = a6;
                zVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= 0) {
                        TimeZone timeZone2 = U4.e.f3179a;
                        zVar.f4040f.f3891b.o(j6);
                        zVar.f4040f.f3891b.f4004q.getClass();
                        break;
                    }
                    B b8 = zVar.f4040f;
                    synchronized (b8) {
                        try {
                            boolean z5 = zVar.f4036b;
                            b6 = b8;
                            try {
                                boolean z6 = zVar.f4038d.f10495b + j7 > zVar.f4035a;
                                if (z6) {
                                    source.C(j7);
                                    zVar.f4040f.e(EnumC0200b.f3920f);
                                    break;
                                }
                                if (z5) {
                                    source.C(j7);
                                    break;
                                }
                                long s2 = source.s(zVar.f4037c, j7);
                                if (s2 == -1) {
                                    throw new EOFException();
                                }
                                j7 -= s2;
                                B b9 = zVar.f4040f;
                                synchronized (b9) {
                                    try {
                                        if (zVar.f4039e) {
                                            j5.f fVar = zVar.f4037c;
                                            fVar.D(fVar.f10495b);
                                        } else {
                                            j5.f fVar2 = zVar.f4038d;
                                            boolean z7 = fVar2.f10495b == 0;
                                            fVar2.I(zVar.f4037c);
                                            if (z7) {
                                                b9.notifyAll();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            b6 = b8;
                        }
                    }
                }
                if (z) {
                    b7.i(T4.o.f2913b, true);
                }
            }
        } else {
            final t tVar = sVar.f3986b;
            tVar.getClass();
            final j5.f fVar3 = new j5.f();
            long j8 = a6;
            source.A(j8);
            source.s(fVar3, j8);
            W4.c.c(tVar.f3996i, tVar.f3990c + '[' + i6 + "] onData", new InterfaceC1430a(i6, fVar3, a6, z) { // from class: a5.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f3966b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j5.f f3967c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f3968d;

                @Override // t4.InterfaceC1430a
                public final Object invoke() {
                    t tVar2 = t.this;
                    int i9 = this.f3966b;
                    j5.f fVar4 = this.f3967c;
                    int i10 = this.f3968d;
                    try {
                        tVar2.f3998k.getClass();
                        fVar4.D(i10);
                        tVar2.f4011x.q(i9, EnumC0200b.f3922h);
                        synchronized (tVar2) {
                            tVar2.z.remove(Integer.valueOf(i9));
                        }
                    } catch (IOException unused) {
                    }
                    return f4.v.f5689a;
                }
            });
        }
        this.f4028a.C(i8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4028a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f3935a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g(int i2, int i3, int i6, int i7) {
        int e3;
        w wVar = this.f4029b;
        wVar.f4025e = i2;
        wVar.f4022b = i2;
        wVar.f4026f = i3;
        wVar.f4023c = i6;
        wVar.f4024d = i7;
        while (true) {
            C0203e c0203e = this.f4030c;
            j5.q qVar = c0203e.f3937c;
            boolean a6 = qVar.a();
            ArrayList arrayList = c0203e.f3936b;
            if (a6) {
                List S02 = AbstractC0465j.S0(arrayList);
                arrayList.clear();
                return S02;
            }
            byte c2 = qVar.c();
            byte[] bArr = U4.c.f3176a;
            int i8 = c2 & 255;
            if (i8 == 128) {
                throw new IOException("index == 0");
            }
            if ((c2 & 128) == 128) {
                e3 = c0203e.e(i8, 127);
                int i9 = e3 - 1;
                if (i9 >= 0) {
                    C0202d[] c0202dArr = AbstractC0205g.f3951a;
                    if (i9 <= c0202dArr.length - 1) {
                        arrayList.add(c0202dArr[i9]);
                    }
                }
                int length = c0203e.f3939e + 1 + (i9 - AbstractC0205g.f3951a.length);
                if (length < 0) {
                    break;
                }
                C0202d[] c0202dArr2 = c0203e.f3938d;
                if (length >= c0202dArr2.length) {
                    break;
                }
                C0202d c0202d = c0202dArr2[length];
                kotlin.jvm.internal.i.b(c0202d);
                arrayList.add(c0202d);
            } else if (i8 == 64) {
                C0202d[] c0202dArr3 = AbstractC0205g.f3951a;
                j5.i d6 = c0203e.d();
                AbstractC0205g.a(d6);
                c0203e.c(new C0202d(d6, c0203e.d()));
            } else if ((c2 & 64) == 64) {
                c0203e.c(new C0202d(c0203e.b(c0203e.e(i8, 63) - 1), c0203e.d()));
            } else if ((c2 & 32) == 32) {
                int e6 = c0203e.e(i8, 31);
                c0203e.f3935a = e6;
                if (e6 < 0 || e6 > 4096) {
                    break;
                }
                int i10 = c0203e.f3941g;
                if (e6 < i10) {
                    if (e6 == 0) {
                        C0202d[] c0202dArr4 = c0203e.f3938d;
                        AbstractC0464i.S(0, c0202dArr4.length, c0202dArr4);
                        c0203e.f3939e = c0203e.f3938d.length - 1;
                        c0203e.f3940f = 0;
                        c0203e.f3941g = 0;
                    } else {
                        c0203e.a(i10 - e6);
                    }
                }
            } else if (i8 == 16 || i8 == 0) {
                C0202d[] c0202dArr5 = AbstractC0205g.f3951a;
                j5.i d7 = c0203e.d();
                AbstractC0205g.a(d7);
                arrayList.add(new C0202d(d7, c0203e.d()));
            } else {
                arrayList.add(new C0202d(c0203e.b(c0203e.e(i8, 15) - 1), c0203e.d()));
            }
        }
        throw new IOException(AbstractC0279e.d(e3, "Header index too large "));
    }

    public final void o(s sVar, int i2, int i3, int i6) {
        int i7;
        int i8 = 0;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte c2 = this.f4028a.c();
            byte[] bArr = U4.c.f3176a;
            i7 = c2 & 255;
        } else {
            i7 = 0;
        }
        if ((i3 & 32) != 0) {
            j5.q qVar = this.f4028a;
            qVar.o();
            qVar.c();
            byte[] bArr2 = U4.c.f3176a;
            sVar.getClass();
            i2 -= 5;
        }
        List g6 = g(v.a(i2, i3, i7), i7, i3, i6);
        sVar.getClass();
        sVar.f3986b.getClass();
        if (i6 != 0 && (i6 & 1) == 0) {
            t tVar = sVar.f3986b;
            tVar.getClass();
            W4.c.c(tVar.f3996i, tVar.f3990c + '[' + i6 + "] onHeaders", new m(tVar, i6, g6, z));
            return;
        }
        t tVar2 = sVar.f3986b;
        synchronized (tVar2) {
            B b6 = tVar2.b(i6);
            if (b6 != null) {
                b6.i(U4.e.h(g6), z);
                return;
            }
            if (!tVar2.f3993f && i6 > tVar2.f3991d && i6 % 2 != tVar2.f3992e % 2) {
                B b7 = new B(i6, tVar2, false, z, U4.e.h(g6));
                tVar2.f3991d = i6;
                tVar2.f3989b.put(Integer.valueOf(i6), b7);
                W4.c.c(tVar2.f3994g.d(), tVar2.f3990c + '[' + i6 + "] onStream", new r(tVar2, i8, b7));
            }
        }
    }

    public final void p(s sVar, int i2, int i3, int i6) {
        int i7;
        int i8 = 0;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i3 & 8) != 0) {
            byte c2 = this.f4028a.c();
            byte[] bArr = U4.c.f3176a;
            i7 = c2 & 255;
        } else {
            i7 = 0;
        }
        int o2 = this.f4028a.o() & Integer.MAX_VALUE;
        List g6 = g(v.a(i2 - 4, i3, i7), i7, i3, i6);
        sVar.getClass();
        t tVar = sVar.f3986b;
        tVar.getClass();
        synchronized (tVar) {
            if (tVar.z.contains(Integer.valueOf(o2))) {
                tVar.q(o2, EnumC0200b.f3918d);
                return;
            }
            tVar.z.add(Integer.valueOf(o2));
            W4.c.c(tVar.f3996i, tVar.f3990c + '[' + o2 + "] onRequest", new m(tVar, o2, g6, i8));
        }
    }
}
