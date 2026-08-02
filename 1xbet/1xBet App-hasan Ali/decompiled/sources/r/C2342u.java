package r;

import a.AbstractC0444a;
import java.util.Arrays;
import l4.C2062d;
import s.AbstractC2351a;

/* renamed from: r.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2342u {

    /* renamed from: a, reason: collision with root package name */
    public int[] f19050a;

    /* renamed from: b, reason: collision with root package name */
    public int f19051b;

    public C2342u(int i) {
        this.f19050a = i == 0 ? AbstractC2335m.f19017a : new int[i];
    }

    public final void a(int i) {
        b(this.f19051b + 1);
        int[] iArr = this.f19050a;
        int i5 = this.f19051b;
        iArr[i5] = i;
        this.f19051b = i5 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.f19050a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f19050a = copyOf;
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.f19051b) {
            return this.f19050a[i];
        }
        AbstractC2351a.d("Index must be between 0 and size");
        throw null;
    }

    public final void d(int i) {
        int i5;
        if (i < 0 || i >= (i5 = this.f19051b)) {
            AbstractC2351a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f19050a;
        int i6 = iArr[i];
        if (i != i5 - 1) {
            X3.l.s0(i, i + 1, i5, iArr, iArr);
        }
        this.f19051b--;
    }

    public final void e(int i, int i5) {
        if (i < 0 || i >= this.f19051b) {
            AbstractC2351a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f19050a;
        int i6 = iArr[i];
        iArr[i] = i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2342u) {
            C2342u c2342u = (C2342u) obj;
            int i = c2342u.f19051b;
            int i5 = this.f19051b;
            if (i == i5) {
                int[] iArr = this.f19050a;
                int[] iArr2 = c2342u.f19050a;
                C2062d f02 = AbstractC0444a.f0(0, i5);
                int i6 = f02.f17851k;
                int i7 = f02.f17852l;
                if (i6 > i7) {
                    return true;
                }
                while (iArr[i6] == iArr2[i6]) {
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
        int[] iArr = this.f19050a;
        int i = this.f19051b;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i5 += iArr[i6] * 31;
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f19050a;
        int i = this.f19051b;
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i6 = iArr[i5];
            if (i5 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i6);
            i5++;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public /* synthetic */ C2342u() {
        this(16);
    }
}
