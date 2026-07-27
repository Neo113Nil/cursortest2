package a5;

import g4.AbstractC0464i;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: a5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203e {

    /* renamed from: c, reason: collision with root package name */
    public final j5.q f3937c;

    /* renamed from: f, reason: collision with root package name */
    public int f3940f;

    /* renamed from: g, reason: collision with root package name */
    public int f3941g;

    /* renamed from: a, reason: collision with root package name */
    public int f3935a = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3936b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0202d[] f3938d = new C0202d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f3939e = 7;

    public C0203e(w wVar) {
        this.f3937c = j5.b.b(wVar);
    }

    public final int a(int i2) {
        int i3;
        int i6 = 0;
        if (i2 > 0) {
            int length = this.f3938d.length;
            while (true) {
                length--;
                i3 = this.f3939e;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0202d c0202d = this.f3938d[length];
                kotlin.jvm.internal.i.b(c0202d);
                int i7 = c0202d.f3934c;
                i2 -= i7;
                this.f3941g -= i7;
                this.f3940f--;
                i6++;
            }
            C0202d[] c0202dArr = this.f3938d;
            System.arraycopy(c0202dArr, i3 + 1, c0202dArr, i3 + 1 + i6, this.f3940f);
            this.f3939e += i6;
        }
        return i6;
    }

    public final j5.i b(int i2) {
        if (i2 >= 0) {
            C0202d[] c0202dArr = AbstractC0205g.f3951a;
            if (i2 <= c0202dArr.length - 1) {
                return c0202dArr[i2].f3932a;
            }
        }
        int length = this.f3939e + 1 + (i2 - AbstractC0205g.f3951a.length);
        if (length >= 0) {
            C0202d[] c0202dArr2 = this.f3938d;
            if (length < c0202dArr2.length) {
                C0202d c0202d = c0202dArr2[length];
                kotlin.jvm.internal.i.b(c0202d);
                return c0202d.f3932a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    public final void c(C0202d c0202d) {
        this.f3936b.add(c0202d);
        int i2 = this.f3935a;
        int i3 = c0202d.f3934c;
        if (i3 > i2) {
            C0202d[] c0202dArr = this.f3938d;
            AbstractC0464i.S(0, c0202dArr.length, c0202dArr);
            this.f3939e = this.f3938d.length - 1;
            this.f3940f = 0;
            this.f3941g = 0;
            return;
        }
        a((this.f3941g + i3) - i2);
        int i6 = this.f3940f + 1;
        C0202d[] c0202dArr2 = this.f3938d;
        if (i6 > c0202dArr2.length) {
            C0202d[] c0202dArr3 = new C0202d[c0202dArr2.length * 2];
            System.arraycopy(c0202dArr2, 0, c0202dArr3, c0202dArr2.length, c0202dArr2.length);
            this.f3939e = this.f3938d.length - 1;
            this.f3938d = c0202dArr3;
        }
        int i7 = this.f3939e;
        this.f3939e = i7 - 1;
        this.f3938d[i7] = c0202d;
        this.f3940f++;
        this.f3941g += i3;
    }

    public final j5.i d() {
        int i2;
        j5.q source = this.f3937c;
        byte c2 = source.c();
        byte[] bArr = U4.c.f3176a;
        int i3 = c2 & 255;
        int i6 = 0;
        boolean z = (c2 & 128) == 128;
        long e3 = e(i3, 127);
        if (!z) {
            return source.g(e3);
        }
        j5.f fVar = new j5.f();
        int[] iArr = D.f3909a;
        kotlin.jvm.internal.i.e(source, "source");
        G2.f fVar2 = D.f3911c;
        G2.f fVar3 = fVar2;
        int i7 = 0;
        for (long j2 = 0; j2 < e3; j2++) {
            byte c6 = source.c();
            byte[] bArr2 = U4.c.f3176a;
            i6 = (i6 << 8) | (c6 & 255);
            i7 += 8;
            while (i7 >= 8) {
                int i8 = (i6 >>> (i7 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                G2.f[] fVarArr = (G2.f[]) fVar3.f947c;
                kotlin.jvm.internal.i.b(fVarArr);
                fVar3 = fVarArr[i8];
                kotlin.jvm.internal.i.b(fVar3);
                if (((G2.f[]) fVar3.f947c) == null) {
                    fVar.J(fVar3.f945a);
                    i7 -= fVar3.f946b;
                    fVar3 = fVar2;
                } else {
                    i7 -= 8;
                }
            }
        }
        while (i7 > 0) {
            int i9 = (i6 << (8 - i7)) & KotlinVersion.MAX_COMPONENT_VALUE;
            G2.f[] fVarArr2 = (G2.f[]) fVar3.f947c;
            kotlin.jvm.internal.i.b(fVarArr2);
            G2.f fVar4 = fVarArr2[i9];
            kotlin.jvm.internal.i.b(fVar4);
            if (((G2.f[]) fVar4.f947c) != null || (i2 = fVar4.f946b) > i7) {
                break;
            }
            fVar.J(fVar4.f945a);
            i7 -= i2;
            fVar3 = fVar2;
        }
        return fVar.o(fVar.f10495b);
    }

    public final int e(int i2, int i3) {
        int i6 = i2 & i3;
        if (i6 < i3) {
            return i6;
        }
        int i7 = 0;
        while (true) {
            byte c2 = this.f3937c.c();
            byte[] bArr = U4.c.f3176a;
            int i8 = c2 & 255;
            if ((c2 & 128) == 0) {
                return i3 + (i8 << i7);
            }
            i3 += (c2 & Byte.MAX_VALUE) << i7;
            i7 += 7;
        }
    }
}
