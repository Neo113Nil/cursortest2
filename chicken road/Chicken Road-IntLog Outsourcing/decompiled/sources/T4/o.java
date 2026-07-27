package T4;

import f4.C0430g;
import g4.AbstractC0464i;
import g4.AbstractC0465j;
import java.util.Arrays;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class o implements Iterable, InterfaceC1481a {

    /* renamed from: b, reason: collision with root package name */
    public static final o f2913b = new o(new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2914a;

    public o(String[] namesAndValues) {
        kotlin.jvm.internal.i.e(namesAndValues, "namesAndValues");
        this.f2914a = namesAndValues;
    }

    public final String c(String str) {
        String[] namesAndValues = this.f2914a;
        kotlin.jvm.internal.i.e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int w3 = B0.f.w(length, 0, -2);
        if (w3 <= length) {
            while (!str.equalsIgnoreCase(namesAndValues[length])) {
                if (length != w3) {
                    length -= 2;
                }
            }
            return namesAndValues[length + 1];
        }
        return null;
    }

    public final String d(int i2) {
        String str = (String) AbstractC0464i.U(i2 * 2, this.f2914a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i2 + ']');
    }

    public final L3.j e() {
        L3.j jVar = new L3.j(3);
        AbstractC0465j.E0(jVar.f1503a, this.f2914a);
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (Arrays.equals(this.f2914a, ((o) obj).f2914a)) {
                return true;
            }
        }
        return false;
    }

    public final String f(int i2) {
        String str = (String) AbstractC0464i.U((i2 * 2) + 1, this.f2914a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i2 + ']');
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2914a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0430g[] c0430gArr = new C0430g[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0430gArr[i2] = new C0430g(d(i2), f(i2));
        }
        return new N4.g(c0430gArr);
    }

    public final int size() {
        return this.f2914a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String d6 = d(i2);
            String f3 = f(i2);
            sb.append(d6);
            sb.append(": ");
            if (U4.c.j(d6)) {
                f3 = "██";
            }
            sb.append(f3);
            sb.append("\n");
        }
        return sb.toString();
    }
}
