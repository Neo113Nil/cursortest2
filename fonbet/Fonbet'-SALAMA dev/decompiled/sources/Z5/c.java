package Z5;

import C1.C0095a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final N6.i f7890b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7889a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public b[] f7893e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f7894f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f7895g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f7896h = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7891c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f7892d = 4096;

    public c(e eVar) {
        this.f7890b = new N6.i(eVar);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f7893e.length;
            while (true) {
                length--;
                i8 = this.f7894f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                int i10 = this.f7893e[length].f7888c;
                i7 -= i10;
                this.f7896h -= i10;
                this.f7895g--;
                i9++;
            }
            b[] bVarArr = this.f7893e;
            System.arraycopy(bVarArr, i8 + 1, bVarArr, i8 + 1 + i9, this.f7895g);
            this.f7894f += i9;
        }
        return i9;
    }

    public final N6.f b(int i7) {
        if (i7 >= 0) {
            b[] bVarArr = d.f7898b;
            if (i7 <= bVarArr.length - 1) {
                return bVarArr[i7].f7886a;
            }
        }
        int length = this.f7894f + 1 + (i7 - d.f7898b.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f7893e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f7886a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(b bVar) {
        this.f7889a.add(bVar);
        int i7 = this.f7892d;
        int i8 = bVar.f7888c;
        if (i8 > i7) {
            Arrays.fill(this.f7893e, (Object) null);
            this.f7894f = this.f7893e.length - 1;
            this.f7895g = 0;
            this.f7896h = 0;
            return;
        }
        a((this.f7896h + i8) - i7);
        int i9 = this.f7895g + 1;
        b[] bVarArr = this.f7893e;
        if (i9 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f7894f = this.f7893e.length - 1;
            this.f7893e = bVarArr2;
        }
        int i10 = this.f7894f;
        this.f7894f = i10 - 1;
        this.f7893e[i10] = bVar;
        this.f7895g++;
        this.f7896h += i8;
    }

    public final N6.f d() {
        int i7;
        N6.i iVar = this.f7890b;
        byte a2 = iVar.a();
        int i8 = a2 & 255;
        boolean z4 = (a2 & 128) == 128;
        int e7 = e(i8, 127);
        if (!z4) {
            return iVar.b(e7);
        }
        j jVar = j.f7921d;
        long j = e7;
        iVar.d(j);
        byte[] d7 = iVar.f4807b.d(j);
        jVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0095a c0095a = jVar.f7922a;
        C0095a c0095a2 = c0095a;
        int i9 = 0;
        int i10 = 0;
        for (byte b7 : d7) {
            i9 = (i9 << 8) | (b7 & 255);
            i10 += 8;
            while (i10 >= 8) {
                c0095a2 = ((C0095a[]) c0095a2.f1465c)[(i9 >>> (i10 - 8)) & 255];
                if (((C0095a[]) c0095a2.f1465c) == null) {
                    byteArrayOutputStream.write(c0095a2.f1463a);
                    i10 -= c0095a2.f1464b;
                    c0095a2 = c0095a;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            C0095a c0095a3 = ((C0095a[]) c0095a2.f1465c)[(i9 << (8 - i10)) & 255];
            if (((C0095a[]) c0095a3.f1465c) != null || (i7 = c0095a3.f1464b) > i10) {
                break;
            }
            byteArrayOutputStream.write(c0095a3.f1463a);
            i10 -= i7;
            c0095a2 = c0095a;
        }
        return N6.f.h(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte a2 = this.f7890b.a();
            int i11 = a2 & 255;
            if ((a2 & 128) == 0) {
                return i8 + (i11 << i10);
            }
            i8 += (a2 & Byte.MAX_VALUE) << i10;
            i10 += 7;
        }
    }
}
