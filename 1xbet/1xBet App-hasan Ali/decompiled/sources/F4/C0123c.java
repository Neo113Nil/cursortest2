package F4;

import L4.C0226i;
import L4.C0229l;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: F4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123c {

    /* renamed from: c, reason: collision with root package name */
    public final L4.C f1577c;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1580g;

    /* renamed from: a, reason: collision with root package name */
    public int f1575a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1576b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0122b[] f1578d = new C0122b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f1579e = 7;

    public C0123c(r rVar) {
        this.f1577c = N4.b.k(rVar);
    }

    public final int a(int i) {
        int i5;
        int i6 = 0;
        if (i > 0) {
            int length = this.f1578d.length;
            while (true) {
                length--;
                i5 = this.f1579e;
                if (length < i5 || i <= 0) {
                    break;
                }
                C0122b c0122b = this.f1578d[length];
                kotlin.jvm.internal.l.c(c0122b);
                int i7 = c0122b.f1574c;
                i -= i7;
                this.f1580g -= i7;
                this.f--;
                i6++;
            }
            C0122b[] c0122bArr = this.f1578d;
            System.arraycopy(c0122bArr, i5 + 1, c0122bArr, i5 + 1 + i6, this.f);
            this.f1579e += i6;
        }
        return i6;
    }

    public final C0229l b(int i) {
        if (i >= 0) {
            C0122b[] c0122bArr = e.f1588a;
            if (i <= c0122bArr.length - 1) {
                return c0122bArr[i].f1572a;
            }
        }
        int length = this.f1579e + 1 + (i - e.f1588a.length);
        if (length >= 0) {
            C0122b[] c0122bArr2 = this.f1578d;
            if (length < c0122bArr2.length) {
                C0122b c0122b = c0122bArr2[length];
                kotlin.jvm.internal.l.c(c0122b);
                return c0122b.f1572a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0122b c0122b) {
        this.f1576b.add(c0122b);
        int i = this.f1575a;
        int i5 = c0122b.f1574c;
        if (i5 > i) {
            X3.l.B0(r7, 0, this.f1578d.length);
            this.f1579e = this.f1578d.length - 1;
            this.f = 0;
            this.f1580g = 0;
            return;
        }
        a((this.f1580g + i5) - i);
        int i6 = this.f + 1;
        C0122b[] c0122bArr = this.f1578d;
        if (i6 > c0122bArr.length) {
            C0122b[] c0122bArr2 = new C0122b[c0122bArr.length * 2];
            System.arraycopy(c0122bArr, 0, c0122bArr2, c0122bArr.length, c0122bArr.length);
            this.f1579e = this.f1578d.length - 1;
            this.f1578d = c0122bArr2;
        }
        int i7 = this.f1579e;
        this.f1579e = i7 - 1;
        this.f1578d[i7] = c0122b;
        this.f++;
        this.f1580g += i5;
    }

    public final C0229l d() {
        int i;
        L4.C c5 = this.f1577c;
        byte f = c5.f();
        byte[] bArr = z4.b.f21979a;
        int i5 = f & 255;
        int i6 = 0;
        boolean z3 = (f & 128) == 128;
        long e3 = e(i5, 127);
        if (!z3) {
            return c5.h(e3);
        }
        C0226i c0226i = new C0226i();
        int[] iArr = z.f1684a;
        kotlin.jvm.internal.l.f("source", c5);
        y yVar = z.f1686c;
        y yVar2 = yVar;
        int i7 = 0;
        for (long j5 = 0; j5 < e3; j5++) {
            byte f5 = c5.f();
            byte[] bArr2 = z4.b.f21979a;
            i6 = (i6 << 8) | (f5 & 255);
            i7 += 8;
            while (i7 >= 8) {
                y[] yVarArr = (y[]) yVar2.f1683m;
                kotlin.jvm.internal.l.c(yVarArr);
                yVar2 = yVarArr[(i6 >>> (i7 - 8)) & 255];
                kotlin.jvm.internal.l.c(yVar2);
                if (((y[]) yVar2.f1683m) == null) {
                    c0226i.P(yVar2.f1681k);
                    i7 -= yVar2.f1682l;
                    yVar2 = yVar;
                } else {
                    i7 -= 8;
                }
            }
        }
        while (i7 > 0) {
            y[] yVarArr2 = (y[]) yVar2.f1683m;
            kotlin.jvm.internal.l.c(yVarArr2);
            y yVar3 = yVarArr2[(i6 << (8 - i7)) & 255];
            kotlin.jvm.internal.l.c(yVar3);
            if (((y[]) yVar3.f1683m) != null || (i = yVar3.f1682l) > i7) {
                break;
            }
            c0226i.P(yVar3.f1681k);
            i7 -= i;
            yVar2 = yVar;
        }
        return c0226i.v(c0226i.f3091l);
    }

    public final int e(int i, int i5) {
        int i6 = i & i5;
        if (i6 < i5) {
            return i6;
        }
        int i7 = 0;
        while (true) {
            byte f = this.f1577c.f();
            byte[] bArr = z4.b.f21979a;
            int i8 = f & 255;
            if ((f & 128) == 0) {
                return i5 + (i8 << i7);
            }
            i5 += (f & Byte.MAX_VALUE) << i7;
            i7 += 7;
        }
    }
}
