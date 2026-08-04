package W5;

import U5.AbstractC0442i;
import U5.C0443j;
import U5.InterfaceC0444k;
import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.AbstractC0879q;
import com.google.protobuf.C0877p;
import com.google.protobuf.C0884t;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0498e1 implements InterfaceC0485a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f7190A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f7192C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0487b f7193a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X5.t f7195c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p036e6.c f7199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d2 f7200y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7201z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7194b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0444k f7196d = C0443j.f6510b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0495d1 f7197e = new C0495d1(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteBuffer f7198f = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f7191B = -1;

    public C0498e1(AbstractC0487b abstractC0487b, p036e6.c cVar, d2 d2Var) {
        this.f7193a = abstractC0487b;
        this.f7199x = cVar;
        this.f7200y = d2Var;
    }

    public static int h(p016b6.a aVar, OutputStream outputStream) throws IOException {
        AbstractC0847a abstractC0847a = aVar.f10148a;
        if (abstractC0847a != null) {
            int iC = ((com.google.protobuf.C) abstractC0847a).c(null);
            AbstractC0847a abstractC0847a2 = aVar.f10148a;
            abstractC0847a2.getClass();
            int iC2 = ((com.google.protobuf.C) abstractC0847a2).c(null);
            Logger logger = AbstractC0879q.f12259d;
            if (iC2 > 4096) {
                iC2 = 4096;
            }
            C0877p c0877p = new C0877p(outputStream, iC2);
            abstractC0847a2.e(c0877p);
            if (c0877p.f12255h > 0) {
                c0877p.U0();
            }
            aVar.f10148a = null;
            return iC;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.f10150c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        C0884t c0884t = p016b6.c.f10155a;
        p113p3.f.k(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i7 = byteArrayInputStream.read(bArr);
            if (i7 == -1) {
                int i8 = (int) j;
                aVar.f10150c = null;
                return i8;
            }
            outputStream.write(bArr, 0, i7);
            j += (long) i7;
        }
    }

    @Override // W5.InterfaceC0485a0
    public final InterfaceC0485a0 a(InterfaceC0444k interfaceC0444k) {
        this.f7196d = interfaceC0444k;
        return this;
    }

    @Override // W5.InterfaceC0485a0
    public final void b(p016b6.a aVar) {
        if (this.f7201z) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f7190A++;
        int i7 = this.f7191B + 1;
        this.f7191B = i7;
        this.f7192C = 0L;
        d2 d2Var = this.f7200y;
        for (AbstractC0442i abstractC0442i : d2Var.f7182a) {
            abstractC0442i.i(i7);
        }
        boolean z4 = this.f7196d != C0443j.f6510b;
        try {
            int iAvailable = aVar.available();
            int i8 = (iAvailable == 0 || !z4) ? i(aVar, iAvailable) : f(aVar);
            if (iAvailable != -1 && i8 != iAvailable) {
                throw new U5.n0(U5.l0.f6543m.g(AbstractC0486a1.e(i8, iAvailable, "Message length inaccurate ", " != ")));
            }
            long j = i8;
            AbstractC0442i[] abstractC0442iArr = d2Var.f7182a;
            for (AbstractC0442i abstractC0442i2 : abstractC0442iArr) {
                abstractC0442i2.k(j);
            }
            long j3 = this.f7192C;
            for (AbstractC0442i abstractC0442i3 : abstractC0442iArr) {
                abstractC0442i3.l(j3);
            }
            int i9 = this.f7191B;
            long j7 = this.f7192C;
            for (AbstractC0442i abstractC0442i4 : d2Var.f7182a) {
                abstractC0442i4.j(i9, j7, j);
            }
        } catch (U5.n0 e7) {
            throw e7;
        } catch (IOException e8) {
            throw new U5.n0(U5.l0.f6543m.g("Failed to frame message").f(e8));
        } catch (RuntimeException e9) {
            throw new U5.n0(U5.l0.f6543m.g("Failed to frame message").f(e9));
        }
    }

    @Override // W5.InterfaceC0485a0
    public final void c(int i7) {
        p113p3.f.q("max size already set", this.f7194b == -1);
        this.f7194b = i7;
    }

    @Override // W5.InterfaceC0485a0
    public final void close() {
        if (this.f7201z) {
            return;
        }
        this.f7201z = true;
        X5.t tVar = this.f7195c;
        if (tVar != null && tVar.f7626c == 0) {
            this.f7195c = null;
        }
        d(true, true);
    }

    public final void d(boolean z4, boolean z7) {
        X5.t tVar = this.f7195c;
        this.f7195c = null;
        this.f7193a.v(tVar, z4, z7, this.f7190A);
        this.f7190A = 0;
    }

    public final void e(C0492c1 c0492c1, boolean z4) {
        ArrayList arrayList = c0492c1.f7153a;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((X5.t) it.next()).f7626c;
        }
        int i8 = this.f7194b;
        if (i8 >= 0 && i7 > i8) {
            U5.l0 l0Var = U5.l0.f6541k;
            Locale locale = Locale.US;
            throw new U5.n0(l0Var.g("message too large " + i7 + " > " + i8));
        }
        ByteBuffer byteBuffer = this.f7198f;
        byteBuffer.clear();
        byteBuffer.put(z4 ? (byte) 1 : (byte) 0).putInt(i7);
        this.f7199x.getClass();
        X5.t tVarK = p036e6.c.k(5);
        tVarK.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i7 == 0) {
            this.f7195c = tVarK;
            return;
        }
        int i9 = this.f7190A - 1;
        AbstractC0487b abstractC0487b = this.f7193a;
        abstractC0487b.v(tVarK, false, false, i9);
        this.f7190A = 1;
        for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
            abstractC0487b.v((X5.t) arrayList.get(i10), false, false, 0);
        }
        this.f7195c = (X5.t) arrayList.get(arrayList.size() - 1);
        this.f7192C = i7;
    }

    public final int f(p016b6.a aVar) throws IOException {
        C0492c1 c0492c1 = new C0492c1(this);
        OutputStream outputStreamG = this.f7196d.g(c0492c1);
        try {
            int iH = h(aVar, outputStreamG);
            outputStreamG.close();
            int i7 = this.f7194b;
            if (i7 < 0 || iH <= i7) {
                e(c0492c1, true);
                return iH;
            }
            U5.l0 l0Var = U5.l0.f6541k;
            Locale locale = Locale.US;
            throw new U5.n0(l0Var.g("message too large " + iH + " > " + i7));
        } catch (Throwable th) {
            outputStreamG.close();
            throw th;
        }
    }

    @Override // W5.InterfaceC0485a0
    public final void flush() {
        X5.t tVar = this.f7195c;
        if (tVar == null || tVar.f7626c <= 0) {
            return;
        }
        d(false, true);
    }

    public final void g(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            X5.t tVar = this.f7195c;
            if (tVar != null && tVar.f7625b == 0) {
                d(false, false);
            }
            if (this.f7195c == null) {
                this.f7199x.getClass();
                this.f7195c = p036e6.c.k(i8);
            }
            int iMin = Math.min(i8, this.f7195c.f7625b);
            this.f7195c.a(bArr, i7, iMin);
            i7 += iMin;
            i8 -= iMin;
        }
    }

    public final int i(p016b6.a aVar, int i7) throws IOException {
        if (i7 == -1) {
            C0492c1 c0492c1 = new C0492c1(this);
            int iH = h(aVar, c0492c1);
            e(c0492c1, false);
            return iH;
        }
        this.f7192C = i7;
        int i8 = this.f7194b;
        if (i8 >= 0 && i7 > i8) {
            U5.l0 l0Var = U5.l0.f6541k;
            Locale locale = Locale.US;
            throw new U5.n0(l0Var.g("message too large " + i7 + " > " + i8));
        }
        ByteBuffer byteBuffer = this.f7198f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i7);
        if (this.f7195c == null) {
            int iPosition = byteBuffer.position() + i7;
            this.f7199x.getClass();
            this.f7195c = p036e6.c.k(iPosition);
        }
        g(byteBuffer.array(), 0, byteBuffer.position());
        return h(aVar, this.f7197e);
    }

    @Override // W5.InterfaceC0485a0
    public final boolean isClosed() {
        return this.f7201z;
    }
}
