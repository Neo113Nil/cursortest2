package o1;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final s1.n f6264b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6263a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public b[] f6267e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f6268f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f6269g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f6270h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f6265c = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: d, reason: collision with root package name */
    public int f6266d = Base64Utils.IO_BUFFER_SIZE;

    public c(s sVar) {
        Logger logger = s1.l.f6634a;
        this.f6264b = new s1.n(sVar);
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f6267e.length;
            while (true) {
                length--;
                i3 = this.f6268f;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                int i5 = this.f6267e[length].f6262c;
                i2 -= i5;
                this.f6270h -= i5;
                this.f6269g--;
                i4++;
            }
            b[] bVarArr = this.f6267e;
            System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i4, this.f6269g);
            this.f6268f += i4;
        }
        return i4;
    }

    public final s1.h b(int i2) {
        if (i2 >= 0) {
            b[] bVarArr = e.f6279a;
            if (i2 <= bVarArr.length - 1) {
                return bVarArr[i2].f6260a;
            }
        }
        int length = this.f6268f + 1 + (i2 - e.f6279a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f6267e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f6260a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    public final void c(b bVar) {
        this.f6263a.add(bVar);
        int i2 = this.f6266d;
        int i3 = bVar.f6262c;
        if (i3 > i2) {
            Arrays.fill(this.f6267e, (Object) null);
            this.f6268f = this.f6267e.length - 1;
            this.f6269g = 0;
            this.f6270h = 0;
            return;
        }
        a((this.f6270h + i3) - i2);
        int i4 = this.f6269g + 1;
        b[] bVarArr = this.f6267e;
        if (i4 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f6268f = this.f6267e.length - 1;
            this.f6267e = bVarArr2;
        }
        int i5 = this.f6268f;
        this.f6268f = i5 - 1;
        this.f6267e[i5] = bVar;
        this.f6269g++;
        this.f6270h += i3;
    }

    public final s1.h d() {
        int i2;
        s1.n nVar = this.f6264b;
        byte g2 = nVar.g();
        int i3 = g2 & 255;
        boolean z2 = (g2 & 128) == 128;
        int e2 = e(i3, 127);
        if (!z2) {
            return nVar.i(e2);
        }
        y yVar = y.f6380d;
        long j2 = e2;
        nVar.o(j2);
        byte[] j3 = nVar.f6638a.j(j2);
        yVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0.l lVar = yVar.f6381a;
        C0.l lVar2 = lVar;
        int i4 = 0;
        int i5 = 0;
        for (byte b2 : j3) {
            i4 = (i4 << 8) | (b2 & 255);
            i5 += 8;
            while (i5 >= 8) {
                lVar2 = ((C0.l[]) lVar2.f81c)[(i4 >>> (i5 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE];
                if (((C0.l[]) lVar2.f81c) == null) {
                    byteArrayOutputStream.write(lVar2.f79a);
                    i5 -= lVar2.f80b;
                    lVar2 = lVar;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            C0.l lVar3 = ((C0.l[]) lVar2.f81c)[(i4 << (8 - i5)) & KotlinVersion.MAX_COMPONENT_VALUE];
            if (((C0.l[]) lVar3.f81c) != null || (i2 = lVar3.f80b) > i5) {
                break;
            }
            byteArrayOutputStream.write(lVar3.f79a);
            i5 -= i2;
            lVar2 = lVar;
        }
        return s1.h.f(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte g2 = this.f6264b.g();
            int i6 = g2 & 255;
            if ((g2 & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (g2 & Byte.MAX_VALUE) << i5;
            i5 += 7;
        }
    }
}
