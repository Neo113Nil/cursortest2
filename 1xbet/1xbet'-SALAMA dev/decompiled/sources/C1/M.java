package C1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC0106l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0104j f1446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0104j f1447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0104j f1448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0104j f1449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1450i;
    public L j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f1451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f1452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f1453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1456p;

    @Override // C1.InterfaceC0106l
    public final ByteBuffer a() {
        L l7 = this.j;
        if (l7 != null) {
            int i7 = l7.f1433m;
            int i8 = l7.f1423b;
            int i9 = i7 * i8 * 2;
            if (i9 > 0) {
                if (this.f1451k.capacity() < i9) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
                    this.f1451k = byteBufferOrder;
                    this.f1452l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f1451k.clear();
                    this.f1452l.clear();
                }
                ShortBuffer shortBuffer = this.f1452l;
                int iMin = Math.min(shortBuffer.remaining() / i8, l7.f1433m);
                int i10 = iMin * i8;
                shortBuffer.put(l7.f1432l, 0, i10);
                int i11 = l7.f1433m - iMin;
                l7.f1433m = i11;
                short[] sArr = l7.f1432l;
                System.arraycopy(sArr, i10, sArr, 0, i11 * i8);
                this.f1455o += (long) i9;
                this.f1451k.limit(i9);
                this.f1453m = this.f1451k;
            }
        }
        ByteBuffer byteBuffer = this.f1453m;
        this.f1453m = InterfaceC0106l.f1502a;
        return byteBuffer;
    }

    @Override // C1.InterfaceC0106l
    public final C0104j b(C0104j c0104j) throws C0105k {
        if (c0104j.f1500c != 2) {
            throw new C0105k(c0104j);
        }
        int i7 = this.f1443b;
        if (i7 == -1) {
            i7 = c0104j.f1498a;
        }
        this.f1446e = c0104j;
        C0104j c0104j2 = new C0104j(i7, c0104j.f1499b, 2);
        this.f1447f = c0104j2;
        this.f1450i = true;
        return c0104j2;
    }

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            L l7 = this.j;
            l7.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f1454n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i7 = l7.f1423b;
            int i8 = iRemaining2 / i7;
            short[] sArrC = l7.c(l7.j, l7.f1431k, i8);
            l7.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, l7.f1431k * i7, ((i8 * i7) * 2) / 2);
            l7.f1431k += i8;
            l7.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // C1.InterfaceC0106l
    public final void d() {
        L l7 = this.j;
        if (l7 != null) {
            int i7 = l7.f1431k;
            float f7 = l7.f1424c;
            float f8 = l7.f1425d;
            int i8 = l7.f1433m + ((int) ((((i7 / (f7 / f8)) + l7.f1435o) / (l7.f1426e * f8)) + 0.5f));
            short[] sArr = l7.j;
            int i9 = l7.f1429h * 2;
            l7.j = l7.c(sArr, i7, i9 + i7);
            int i10 = 0;
            while (true) {
                int i11 = l7.f1423b;
                if (i10 >= i9 * i11) {
                    break;
                }
                l7.j[(i11 * i7) + i10] = 0;
                i10++;
            }
            l7.f1431k = i9 + l7.f1431k;
            l7.f();
            if (l7.f1433m > i8) {
                l7.f1433m = i8;
            }
            l7.f1431k = 0;
            l7.f1438r = 0;
            l7.f1435o = 0;
        }
        this.f1456p = true;
    }

    @Override // C1.InterfaceC0106l
    public final boolean e() {
        L l7;
        return this.f1456p && ((l7 = this.j) == null || (l7.f1433m * l7.f1423b) * 2 == 0);
    }

    @Override // C1.InterfaceC0106l
    public final void flush() {
        if (isActive()) {
            C0104j c0104j = this.f1446e;
            this.f1448g = c0104j;
            C0104j c0104j2 = this.f1447f;
            this.f1449h = c0104j2;
            if (this.f1450i) {
                this.j = new L(c0104j.f1498a, c0104j.f1499b, this.f1444c, this.f1445d, c0104j2.f1498a);
            } else {
                L l7 = this.j;
                if (l7 != null) {
                    l7.f1431k = 0;
                    l7.f1433m = 0;
                    l7.f1435o = 0;
                    l7.f1436p = 0;
                    l7.f1437q = 0;
                    l7.f1438r = 0;
                    l7.f1439s = 0;
                    l7.f1440t = 0;
                    l7.f1441u = 0;
                    l7.f1442v = 0;
                }
            }
        }
        this.f1453m = InterfaceC0106l.f1502a;
        this.f1454n = 0L;
        this.f1455o = 0L;
        this.f1456p = false;
    }

    @Override // C1.InterfaceC0106l
    public final boolean isActive() {
        return this.f1447f.f1498a != -1 && (Math.abs(this.f1444c - 1.0f) >= 1.0E-4f || Math.abs(this.f1445d - 1.0f) >= 1.0E-4f || this.f1447f.f1498a != this.f1446e.f1498a);
    }

    @Override // C1.InterfaceC0106l
    public final void reset() {
        this.f1444c = 1.0f;
        this.f1445d = 1.0f;
        C0104j c0104j = C0104j.f1497e;
        this.f1446e = c0104j;
        this.f1447f = c0104j;
        this.f1448g = c0104j;
        this.f1449h = c0104j;
        ByteBuffer byteBuffer = InterfaceC0106l.f1502a;
        this.f1451k = byteBuffer;
        this.f1452l = byteBuffer.asShortBuffer();
        this.f1453m = byteBuffer;
        this.f1443b = -1;
        this.f1450i = false;
        this.j = null;
        this.f1454n = 0L;
        this.f1455o = 0L;
        this.f1456p = false;
    }
}
