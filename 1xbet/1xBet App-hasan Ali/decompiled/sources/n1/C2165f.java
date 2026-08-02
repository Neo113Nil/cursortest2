package n1;

import java.util.Objects;
import n.AbstractC2107A;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2165f {

    /* renamed from: a, reason: collision with root package name */
    public final C2164e f18431a;

    static {
        new C2165f(0, 0, "");
    }

    public C2165f(int i, int i5, String str) {
        this.f18431a = new C2164e(i, i5, str);
    }

    public static C2165f a(int i, int i5, boolean z3, int i6, int i7, int i8, int i9) {
        String sb;
        if (z3) {
            int i10 = i / 2;
            int i11 = i5 / 2;
            StringBuilder w5 = AbstractC2107A.w("M0,", i11, " A", i10, ",");
            w5.append(i11);
            w5.append(" 0 1,1 ");
            w5.append(i);
            w5.append(",");
            w5.append(i11);
            w5.append(" A");
            w5.append(i10);
            w5.append(",");
            w5.append(i11);
            w5.append(" 0 1,1 0,");
            w5.append(i11);
            w5.append(" Z");
            sb = w5.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i5 / 2);
            int min2 = Math.min(min, i6);
            int min3 = Math.min(min, i7);
            int min4 = Math.min(min, i8);
            int min5 = Math.min(min, i9);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i5 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i5);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i5);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i5 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new C2165f(i, i5, sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2165f) {
            return Objects.equals(this.f18431a, ((C2165f) obj).f18431a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f18431a);
    }

    public final String toString() {
        return this.f18431a.toString();
    }
}
