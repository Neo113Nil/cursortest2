package F4;

import L4.C0226i;
import L4.C0229l;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0226i f1581a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1583c;

    /* renamed from: g, reason: collision with root package name */
    public int f1586g;

    /* renamed from: h, reason: collision with root package name */
    public int f1587h;

    /* renamed from: b, reason: collision with root package name */
    public int f1582b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1584d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C0122b[] f1585e = new C0122b[8];
    public int f = 7;

    public d(C0226i c0226i) {
        this.f1581a = c0226i;
    }

    public final void a(int i) {
        int i5;
        if (i > 0) {
            int length = this.f1585e.length - 1;
            int i6 = 0;
            while (true) {
                i5 = this.f;
                if (length < i5 || i <= 0) {
                    break;
                }
                C0122b c0122b = this.f1585e[length];
                kotlin.jvm.internal.l.c(c0122b);
                i -= c0122b.f1574c;
                int i7 = this.f1587h;
                C0122b c0122b2 = this.f1585e[length];
                kotlin.jvm.internal.l.c(c0122b2);
                this.f1587h = i7 - c0122b2.f1574c;
                this.f1586g--;
                i6++;
                length--;
            }
            C0122b[] c0122bArr = this.f1585e;
            int i8 = i5 + 1;
            System.arraycopy(c0122bArr, i8, c0122bArr, i8 + i6, this.f1586g);
            C0122b[] c0122bArr2 = this.f1585e;
            int i9 = this.f + 1;
            Arrays.fill(c0122bArr2, i9, i9 + i6, (Object) null);
            this.f += i6;
        }
    }

    public final void b(C0122b c0122b) {
        int i = this.f1584d;
        int i5 = c0122b.f1574c;
        if (i5 > i) {
            C0122b[] c0122bArr = this.f1585e;
            X3.l.B0(c0122bArr, 0, c0122bArr.length);
            this.f = this.f1585e.length - 1;
            this.f1586g = 0;
            this.f1587h = 0;
            return;
        }
        a((this.f1587h + i5) - i);
        int i6 = this.f1586g + 1;
        C0122b[] c0122bArr2 = this.f1585e;
        if (i6 > c0122bArr2.length) {
            C0122b[] c0122bArr3 = new C0122b[c0122bArr2.length * 2];
            System.arraycopy(c0122bArr2, 0, c0122bArr3, c0122bArr2.length, c0122bArr2.length);
            this.f = this.f1585e.length - 1;
            this.f1585e = c0122bArr3;
        }
        int i7 = this.f;
        this.f = i7 - 1;
        this.f1585e[i7] = c0122b;
        this.f1586g++;
        this.f1587h += i5;
    }

    public final void c(C0229l c0229l) {
        kotlin.jvm.internal.l.f("data", c0229l);
        C0226i c0226i = this.f1581a;
        int[] iArr = z.f1684a;
        int c5 = c0229l.c();
        long j5 = 0;
        for (int i = 0; i < c5; i++) {
            byte h3 = c0229l.h(i);
            byte[] bArr = z4.b.f21979a;
            j5 += z.f1685b[h3 & 255];
        }
        if (((int) ((j5 + 7) >> 3)) >= c0229l.c()) {
            e(c0229l.c(), 127, 0);
            c0226i.M(c0229l);
            return;
        }
        C0226i c0226i2 = new C0226i();
        int[] iArr2 = z.f1684a;
        int c6 = c0229l.c();
        long j6 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < c6; i6++) {
            byte h4 = c0229l.h(i6);
            byte[] bArr2 = z4.b.f21979a;
            int i7 = h4 & 255;
            int i8 = z.f1684a[i7];
            byte b3 = z.f1685b[i7];
            j6 = (j6 << b3) | i8;
            i5 += b3;
            while (i5 >= 8) {
                i5 -= 8;
                c0226i2.P((int) (j6 >> i5));
            }
        }
        if (i5 > 0) {
            c0226i2.P((int) ((255 >>> i5) | (j6 << (8 - i5))));
        }
        C0229l v4 = c0226i2.v(c0226i2.f3091l);
        e(v4.c(), 127, 128);
        c0226i.M(v4);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i5;
        if (this.f1583c) {
            int i6 = this.f1582b;
            if (i6 < this.f1584d) {
                e(i6, 31, 32);
            }
            this.f1583c = false;
            this.f1582b = Integer.MAX_VALUE;
            e(this.f1584d, 31, 32);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0122b c0122b = (C0122b) arrayList.get(i7);
            C0229l o5 = c0122b.f1572a.o();
            Integer num = (Integer) e.f1589b.get(o5);
            C0229l c0229l = c0122b.f1573b;
            if (num != null) {
                int intValue = num.intValue();
                i5 = intValue + 1;
                if (2 <= i5 && i5 < 8) {
                    C0122b[] c0122bArr = e.f1588a;
                    if (kotlin.jvm.internal.l.a(c0122bArr[intValue].f1573b, c0229l)) {
                        i = i5;
                    } else if (kotlin.jvm.internal.l.a(c0122bArr[i5].f1573b, c0229l)) {
                        i5 = intValue + 2;
                        i = i5;
                    }
                }
                i = i5;
                i5 = -1;
            } else {
                i = -1;
                i5 = -1;
            }
            if (i5 == -1) {
                int i8 = this.f + 1;
                int length = this.f1585e.length;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    C0122b c0122b2 = this.f1585e[i8];
                    kotlin.jvm.internal.l.c(c0122b2);
                    if (kotlin.jvm.internal.l.a(c0122b2.f1572a, o5)) {
                        C0122b c0122b3 = this.f1585e[i8];
                        kotlin.jvm.internal.l.c(c0122b3);
                        if (kotlin.jvm.internal.l.a(c0122b3.f1573b, c0229l)) {
                            i5 = e.f1588a.length + (i8 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i8 - this.f) + e.f1588a.length;
                        }
                    }
                    i8++;
                }
            }
            if (i5 != -1) {
                e(i5, 127, 128);
            } else if (i == -1) {
                this.f1581a.P(64);
                c(o5);
                c(c0229l);
                b(c0122b);
            } else {
                C0229l c0229l2 = C0122b.f1568d;
                o5.getClass();
                kotlin.jvm.internal.l.f("prefix", c0229l2);
                if (!o5.l(0, c0229l2, c0229l2.c()) || kotlin.jvm.internal.l.a(C0122b.i, o5)) {
                    e(i, 63, 64);
                    c(c0229l);
                    b(c0122b);
                } else {
                    e(i, 15, 0);
                    c(c0229l);
                }
            }
        }
    }

    public final void e(int i, int i5, int i6) {
        C0226i c0226i = this.f1581a;
        if (i < i5) {
            c0226i.P(i | i6);
            return;
        }
        c0226i.P(i6 | i5);
        int i7 = i - i5;
        while (i7 >= 128) {
            c0226i.P(128 | (i7 & 127));
            i7 >>>= 7;
        }
        c0226i.P(i7);
    }
}
