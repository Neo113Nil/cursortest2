package P1;

/* renamed from: P1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057e {

    /* renamed from: b, reason: collision with root package name */
    public final V1.g f1469b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1471d;

    /* renamed from: h, reason: collision with root package name */
    public int f1475h;

    /* renamed from: i, reason: collision with root package name */
    public int f1476i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1468a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f1470c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1472e = io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: f, reason: collision with root package name */
    public P1.C0055c[] f1473f = new P1.C0055c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f1474g = 7;

    public C0057e(V1.g gVar) {
        this.f1469b = gVar;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f1473f.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f1474g;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                P1.C0055c c0055c = this.f1473f[length];
                kotlin.jvm.internal.i.b(c0055c);
                i2 -= c0055c.f1460c;
                int i5 = this.f1476i;
                P1.C0055c c0055c2 = this.f1473f[length];
                kotlin.jvm.internal.i.b(c0055c2);
                this.f1476i = i5 - c0055c2.f1460c;
                this.f1475h--;
                i4++;
                length--;
            }
            P1.C0055c[] c0055cArr = this.f1473f;
            int i6 = i3 + 1;
            java.lang.System.arraycopy(c0055cArr, i6, c0055cArr, i6 + i4, this.f1475h);
            P1.C0055c[] c0055cArr2 = this.f1473f;
            int i7 = this.f1474g + 1;
            java.util.Arrays.fill(c0055cArr2, i7, i7 + i4, (java.lang.Object) null);
            this.f1474g += i4;
        }
    }

    public final void b(P1.C0055c c0055c) {
        int i2 = this.f1472e;
        int i3 = c0055c.f1460c;
        if (i3 > i2) {
            P1.C0055c[] c0055cArr = this.f1473f;
            i1.AbstractC0189h.N(c0055cArr, 0, c0055cArr.length);
            this.f1474g = this.f1473f.length - 1;
            this.f1475h = 0;
            this.f1476i = 0;
            return;
        }
        a((this.f1476i + i3) - i2);
        int i4 = this.f1475h + 1;
        P1.C0055c[] c0055cArr2 = this.f1473f;
        if (i4 > c0055cArr2.length) {
            P1.C0055c[] c0055cArr3 = new P1.C0055c[c0055cArr2.length * 2];
            java.lang.System.arraycopy(c0055cArr2, 0, c0055cArr3, c0055cArr2.length, c0055cArr2.length);
            this.f1474g = this.f1473f.length - 1;
            this.f1473f = c0055cArr3;
        }
        int i5 = this.f1474g;
        this.f1474g = i5 - 1;
        this.f1473f[i5] = c0055c;
        this.f1475h++;
        this.f1476i += i3;
    }

    public final void c(V1.j data) {
        kotlin.jvm.internal.i.e(data, "data");
        V1.g gVar = this.f1469b;
        int i2 = 0;
        if (this.f1468a) {
            int[] iArr = P1.C.f1437a;
            int a2 = data.a();
            int i3 = 0;
            long j2 = 0;
            while (i3 < a2) {
                int i4 = i3 + 1;
                byte d2 = data.d(i3);
                byte[] bArr = J1.b.f932a;
                j2 += P1.C.f1438b[d2 & 255];
                i3 = i4;
            }
            if (((int) ((j2 + 7) >> 3)) < data.a()) {
                V1.g gVar2 = new V1.g();
                int[] iArr2 = P1.C.f1437a;
                int a3 = data.a();
                long j3 = 0;
                int i5 = 0;
                while (i2 < a3) {
                    int i6 = i2 + 1;
                    byte d3 = data.d(i2);
                    byte[] bArr2 = J1.b.f932a;
                    int i7 = d3 & 255;
                    int i8 = P1.C.f1437a[i7];
                    byte b2 = P1.C.f1438b[i7];
                    j3 = (j3 << b2) | i8;
                    i5 += b2;
                    while (i5 >= 8) {
                        i5 -= 8;
                        gVar2.u((int) (j3 >> i5));
                    }
                    i2 = i6;
                }
                if (i5 > 0) {
                    gVar2.u((int) ((255 >>> i5) | (j3 << (8 - i5))));
                }
                V1.j k2 = gVar2.k(gVar2.f1764b);
                e(k2.a(), 127, 128);
                gVar.r(k2);
                return;
            }
        }
        e(data.a(), 127, 0);
        gVar.r(data);
    }

    public final void d(java.util.ArrayList arrayList) {
        int i2;
        int i3;
        if (this.f1471d) {
            int i4 = this.f1470c;
            if (i4 < this.f1472e) {
                e(i4, 31, 32);
            }
            this.f1471d = false;
            this.f1470c = Integer.MAX_VALUE;
            e(this.f1472e, 31, 32);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            P1.C0055c c0055c = (P1.C0055c) arrayList.get(i5);
            V1.j g2 = c0055c.f1458a.g();
            java.lang.Integer num = (java.lang.Integer) P1.AbstractC0058f.f1478b.get(g2);
            V1.j jVar = c0055c.f1459b;
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (2 <= i3 && i3 < 8) {
                    P1.C0055c[] c0055cArr = P1.AbstractC0058f.f1477a;
                    if (kotlin.jvm.internal.i.a(c0055cArr[intValue].f1459b, jVar)) {
                        i2 = i3;
                    } else if (kotlin.jvm.internal.i.a(c0055cArr[i3].f1459b, jVar)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i7 = this.f1474g + 1;
                int length = this.f1473f.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    int i8 = i7 + 1;
                    P1.C0055c c0055c2 = this.f1473f[i7];
                    kotlin.jvm.internal.i.b(c0055c2);
                    if (kotlin.jvm.internal.i.a(c0055c2.f1458a, g2)) {
                        P1.C0055c c0055c3 = this.f1473f[i7];
                        kotlin.jvm.internal.i.b(c0055c3);
                        if (kotlin.jvm.internal.i.a(c0055c3.f1459b, jVar)) {
                            i3 = P1.AbstractC0058f.f1477a.length + (i7 - this.f1474g);
                            break;
                        } else if (i2 == -1) {
                            i2 = P1.AbstractC0058f.f1477a.length + (i7 - this.f1474g);
                        }
                    }
                    i7 = i8;
                }
            }
            if (i3 != -1) {
                e(i3, 127, 128);
            } else if (i2 == -1) {
                this.f1469b.u(64);
                c(g2);
                c(jVar);
                b(c0055c);
            } else {
                V1.j prefix = P1.C0055c.f1452d;
                g2.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (!g2.f(prefix, prefix.a()) || kotlin.jvm.internal.i.a(P1.C0055c.f1457i, g2)) {
                    e(i2, 63, 64);
                    c(jVar);
                    b(c0055c);
                } else {
                    e(i2, 15, 0);
                    c(jVar);
                }
            }
            i5 = i6;
        }
    }

    public final void e(int i2, int i3, int i4) {
        V1.g gVar = this.f1469b;
        if (i2 < i3) {
            gVar.u(i2 | i4);
            return;
        }
        gVar.u(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            gVar.u(128 | (i5 & 127));
            i5 >>>= 7;
        }
        gVar.u(i5);
    }
}
