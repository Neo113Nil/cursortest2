package o1;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final s1.e f6271a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6273c;

    /* renamed from: b, reason: collision with root package name */
    public int f6272b = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public b[] f6275e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f6276f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f6277g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f6278h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6274d = Base64Utils.IO_BUFFER_SIZE;

    public d(s1.e eVar) {
        this.f6271a = eVar;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f6275e.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f6276f;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                int i5 = this.f6275e[length].f6262c;
                i2 -= i5;
                this.f6278h -= i5;
                this.f6277g--;
                i4++;
                length--;
            }
            b[] bVarArr = this.f6275e;
            int i6 = i3 + 1;
            System.arraycopy(bVarArr, i6, bVarArr, i6 + i4, this.f6277g);
            b[] bVarArr2 = this.f6275e;
            int i7 = this.f6276f + 1;
            Arrays.fill(bVarArr2, i7, i7 + i4, (Object) null);
            this.f6276f += i4;
        }
    }

    public final void b(b bVar) {
        int i2 = this.f6274d;
        int i3 = bVar.f6262c;
        if (i3 > i2) {
            Arrays.fill(this.f6275e, (Object) null);
            this.f6276f = this.f6275e.length - 1;
            this.f6277g = 0;
            this.f6278h = 0;
            return;
        }
        a((this.f6278h + i3) - i2);
        int i4 = this.f6277g + 1;
        b[] bVarArr = this.f6275e;
        if (i4 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f6276f = this.f6275e.length - 1;
            this.f6275e = bVarArr2;
        }
        int i5 = this.f6276f;
        this.f6276f = i5 - 1;
        this.f6275e[i5] = bVar;
        this.f6277g++;
        this.f6278h += i3;
    }

    public final void c(s1.h hVar) {
        y.f6380d.getClass();
        long j2 = 0;
        long j3 = 0;
        for (int i2 = 0; i2 < hVar.i(); i2++) {
            j3 += y.f6379c[hVar.d(i2) & 255];
        }
        int i3 = (int) ((j3 + 7) >> 3);
        int i4 = hVar.i();
        s1.e eVar = this.f6271a;
        if (i3 >= i4) {
            d(hVar.i(), 127, 0);
            hVar.m(eVar);
            return;
        }
        s1.e eVar2 = new s1.e();
        y.f6380d.getClass();
        int i5 = 0;
        for (int i6 = 0; i6 < hVar.i(); i6++) {
            int d2 = hVar.d(i6) & 255;
            int i7 = y.f6378b[d2];
            byte b2 = y.f6379c[d2];
            j2 = (j2 << b2) | i7;
            i5 += b2;
            while (i5 >= 8) {
                i5 -= 8;
                eVar2.t((int) (j2 >> i5));
            }
        }
        if (i5 > 0) {
            eVar2.t((int) ((j2 << (8 - i5)) | (KotlinVersion.MAX_COMPONENT_VALUE >>> i5)));
        }
        byte[] f2 = eVar2.f();
        s1.h hVar2 = new s1.h(f2);
        d(f2.length, 127, 128);
        hVar2.m(eVar);
    }

    public final void d(int i2, int i3, int i4) {
        s1.e eVar = this.f6271a;
        if (i2 < i3) {
            eVar.t(i2 | i4);
            return;
        }
        eVar.t(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            eVar.t(128 | (i5 & 127));
            i5 >>>= 7;
        }
        eVar.t(i5);
    }
}
