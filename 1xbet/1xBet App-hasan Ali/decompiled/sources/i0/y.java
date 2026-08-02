package i0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import h0.C1988b;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends H {

    /* renamed from: g, reason: collision with root package name */
    public final List f17301g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17302h;
    public final long i;

    public y(List list, long j5, long j6) {
        this.f17301g = list;
        this.f17302h = j5;
        this.i = j6;
    }

    @Override // i0.H
    public final Shader B(long j5) {
        int i;
        int[] iArr;
        int i5;
        float[] fArr;
        long j6 = this.f17302h;
        char c5 = ' ';
        int i6 = (int) (j6 >> 32);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j5 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i6);
        long j7 = 4294967295L;
        int i7 = (int) (j6 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.POSITIVE_INFINITY) {
            i7 = (int) (j5 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i7);
        long j8 = this.i;
        int i8 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i8) == Float.POSITIVE_INFINITY) {
            i8 = (int) (j5 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i8);
        int i9 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j5 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i9);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.f17301g;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int N5 = X3.n.N(list);
            int i10 = 1;
            i = 0;
            while (i10 < N5) {
                char c6 = c5;
                long j9 = j7;
                if (p.d(((p) list.get(i10)).f17295a) == 0.0f) {
                    i++;
                }
                i10++;
                c5 = c6;
                j7 = j9;
            }
        }
        char c7 = c5;
        long j10 = j7;
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> c7));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & j10));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> c7));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & j10));
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = F.u(((p) list.get(i11)).f17295a);
            }
        } else {
            iArr = new int[list.size() + i];
            int N6 = X3.n.N(list);
            int size2 = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size2; i13++) {
                long j11 = ((p) list.get(i13)).f17295a;
                if (p.d(j11) == 0.0f) {
                    if (i13 == 0) {
                        i5 = i12 + 1;
                        iArr[i12] = F.u(p.b(0.0f, ((p) list.get(1)).f17295a));
                    } else if (i13 == N6) {
                        i5 = i12 + 1;
                        iArr[i12] = F.u(p.b(0.0f, ((p) list.get(i13 - 1)).f17295a));
                    } else {
                        int i14 = i12 + 1;
                        iArr[i12] = F.u(p.b(0.0f, ((p) list.get(i13 - 1)).f17295a));
                        i12 += 2;
                        iArr[i14] = F.u(p.b(0.0f, ((p) list.get(i13 + 1)).f17295a));
                    }
                    i12 = i5;
                } else {
                    iArr[i12] = F.u(j11);
                    i12++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            fArr = null;
        } else {
            fArr = new float[list.size() + i];
            fArr[0] = 0.0f;
            int N7 = X3.n.N(list);
            int i15 = 1;
            for (int i16 = 1; i16 < N7; i16++) {
                long j12 = ((p) list.get(i16)).f17295a;
                float N8 = i16 / X3.n.N(list);
                int i17 = i15 + 1;
                fArr[i15] = N8;
                if (p.d(j12) == 0.0f) {
                    i15 += 2;
                    fArr[i17] = N8;
                } else {
                    i15 = i17;
                }
            }
            fArr[i15] = 1.0f;
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr2, fArr, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f17301g.equals(yVar.f17301g) && C1988b.b(this.f17302h, yVar.f17302h) && C1988b.b(this.i, yVar.i);
    }

    public final int hashCode() {
        return (C1988b.f(this.i) + ((C1988b.f(this.f17302h) + (this.f17301g.hashCode() * 961)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j5 = this.f17302h;
        String str2 = "";
        if (((((j5 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C1988b.j(j5)) + ", ";
        } else {
            str = "";
        }
        long j6 = this.i;
        if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C1988b.j(j6)) + ", ";
        }
        return "LinearGradient(colors=" + this.f17301g + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
