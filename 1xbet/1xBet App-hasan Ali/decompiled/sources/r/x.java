package r;

import a.AbstractC0444a;
import java.util.Arrays;
import l4.C2062d;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19057a;

    /* renamed from: b, reason: collision with root package name */
    public int f19058b;

    public x(int i) {
        this.f19057a = i == 0 ? AbstractC2337o.f19028a : new long[i];
    }

    public final void a(long j5) {
        int i = this.f19058b + 1;
        long[] jArr = this.f19057a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f19057a = copyOf;
        }
        long[] jArr2 = this.f19057a;
        int i5 = this.f19058b;
        jArr2[i5] = j5;
        this.f19058b = i5 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            int i = xVar.f19058b;
            int i5 = this.f19058b;
            if (i == i5) {
                long[] jArr = this.f19057a;
                long[] jArr2 = xVar.f19057a;
                C2062d f02 = AbstractC0444a.f0(0, i5);
                int i6 = f02.f17851k;
                int i7 = f02.f17852l;
                if (i6 > i7) {
                    return true;
                }
                while (jArr[i6] == jArr2[i6]) {
                    if (i6 == i7) {
                        return true;
                    }
                    i6++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f19057a;
        int i = this.f19058b;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            long j5 = jArr[i6];
            i5 += ((int) (j5 ^ (j5 >>> 32))) * 31;
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f19057a;
        int i = this.f19058b;
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j5 = jArr[i5];
            if (i5 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j5);
            i5++;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
