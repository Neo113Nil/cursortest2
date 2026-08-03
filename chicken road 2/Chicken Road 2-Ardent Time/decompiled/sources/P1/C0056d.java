package P1;

/* renamed from: P1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056d {

    /* renamed from: c, reason: collision with root package name */
    public final V1.q f1463c;

    /* renamed from: f, reason: collision with root package name */
    public int f1466f;

    /* renamed from: g, reason: collision with root package name */
    public int f1467g;

    /* renamed from: a, reason: collision with root package name */
    public int f1461a = io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f1462b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public P1.C0055c[] f1464d = new P1.C0055c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f1465e = 7;

    public C0056d(P1.u uVar) {
        this.f1463c = new V1.q(uVar);
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f1464d.length;
            while (true) {
                length--;
                i3 = this.f1465e;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                P1.C0055c c0055c = this.f1464d[length];
                kotlin.jvm.internal.i.b(c0055c);
                int i5 = c0055c.f1460c;
                i2 -= i5;
                this.f1467g -= i5;
                this.f1466f--;
                i4++;
            }
            P1.C0055c[] c0055cArr = this.f1464d;
            java.lang.System.arraycopy(c0055cArr, i3 + 1, c0055cArr, i3 + 1 + i4, this.f1466f);
            this.f1465e += i4;
        }
        return i4;
    }

    public final V1.j b(int i2) {
        if (i2 >= 0) {
            P1.C0055c[] c0055cArr = P1.AbstractC0058f.f1477a;
            if (i2 <= c0055cArr.length - 1) {
                return c0055cArr[i2].f1458a;
            }
        }
        int length = this.f1465e + 1 + (i2 - P1.AbstractC0058f.f1477a.length);
        if (length >= 0) {
            P1.C0055c[] c0055cArr2 = this.f1464d;
            if (length < c0055cArr2.length) {
                P1.C0055c c0055c = c0055cArr2[length];
                kotlin.jvm.internal.i.b(c0055c);
                return c0055c.f1458a;
            }
        }
        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2 + 1), "Header index too large "));
    }

    public final void c(P1.C0055c c0055c) {
        this.f1462b.add(c0055c);
        int i2 = this.f1461a;
        int i3 = c0055c.f1460c;
        if (i3 > i2) {
            P1.C0055c[] c0055cArr = this.f1464d;
            i1.AbstractC0189h.N(c0055cArr, 0, c0055cArr.length);
            this.f1465e = this.f1464d.length - 1;
            this.f1466f = 0;
            this.f1467g = 0;
            return;
        }
        a((this.f1467g + i3) - i2);
        int i4 = this.f1466f + 1;
        P1.C0055c[] c0055cArr2 = this.f1464d;
        if (i4 > c0055cArr2.length) {
            P1.C0055c[] c0055cArr3 = new P1.C0055c[c0055cArr2.length * 2];
            java.lang.System.arraycopy(c0055cArr2, 0, c0055cArr3, c0055cArr2.length, c0055cArr2.length);
            this.f1465e = this.f1464d.length - 1;
            this.f1464d = c0055cArr3;
        }
        int i5 = this.f1465e;
        this.f1465e = i5 - 1;
        this.f1464d[i5] = c0055c;
        this.f1466f++;
        this.f1467g += i3;
    }

    public final V1.j d() {
        int i2;
        V1.q source = this.f1463c;
        byte g2 = source.g();
        byte[] bArr = J1.b.f932a;
        int i3 = g2 & 255;
        int i4 = 0;
        boolean z2 = (g2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return source.j(e2);
        }
        V1.g gVar = new V1.g();
        int[] iArr = P1.C.f1437a;
        kotlin.jvm.internal.i.e(source, "source");
        P1.B b2 = P1.C.f1439c;
        P1.B b3 = b2;
        long j2 = 0;
        int i5 = 0;
        while (j2 < e2) {
            j2++;
            byte g3 = source.g();
            byte[] bArr2 = J1.b.f932a;
            i4 = (i4 << 8) | (g3 & 255);
            i5 += 8;
            while (i5 >= 8) {
                int i6 = (i4 >>> (i5 - 8)) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
                P1.B[] bArr3 = (P1.B[]) b3.f1436c;
                kotlin.jvm.internal.i.b(bArr3);
                b3 = bArr3[i6];
                kotlin.jvm.internal.i.b(b3);
                if (((P1.B[]) b3.f1436c) == null) {
                    gVar.u(b3.f1434a);
                    i5 -= b3.f1435b;
                    b3 = b2;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            int i7 = (i4 << (8 - i5)) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
            P1.B[] bArr4 = (P1.B[]) b3.f1436c;
            kotlin.jvm.internal.i.b(bArr4);
            P1.B b4 = bArr4[i7];
            kotlin.jvm.internal.i.b(b4);
            if (((P1.B[]) b4.f1436c) != null || (i2 = b4.f1435b) > i5) {
                break;
            }
            gVar.u(b4.f1434a);
            i5 -= i2;
            b3 = b2;
        }
        return gVar.k(gVar.f1764b);
    }

    public final int e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte g2 = this.f1463c.g();
            byte[] bArr = J1.b.f932a;
            int i6 = g2 & 255;
            if ((g2 & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (g2 & Byte.MAX_VALUE) << i5;
            i5 += 7;
        }
    }
}
