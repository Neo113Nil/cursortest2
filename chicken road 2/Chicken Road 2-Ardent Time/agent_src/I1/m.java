package I1;

/* loaded from: classes.dex */
public final class m implements java.lang.Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f751a;

    public m(java.lang.String[] strArr) {
        this.f751a = strArr;
    }

    public final java.lang.String a(java.lang.String name) {
        kotlin.jvm.internal.i.e(name, "name");
        java.lang.String[] strArr = this.f751a;
        int length = strArr.length - 2;
        int r2 = a.AbstractC0059a.r(length, 0, -2);
        if (r2 <= length) {
            while (true) {
                int i2 = length - 2;
                if (name.equalsIgnoreCase(strArr[length])) {
                    return strArr[length + 1];
                }
                if (length == r2) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public final java.lang.String b(int i2) {
        return this.f751a[i2 * 2];
    }

    public final I1.l c() {
        I1.l lVar = new I1.l(0);
        i1.AbstractC0196o.L(lVar.f750a, this.f751a);
        return lVar;
    }

    public final java.lang.String d(int i2) {
        return this.f751a[(i2 * 2) + 1];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I1.m) {
            if (java.util.Arrays.equals(this.f751a, ((I1.m) obj).f751a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f751a);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        int size = size();
        h1.C0172d[] c0172dArr = new h1.C0172d[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0172dArr[i2] = new h1.C0172d(b(i2), d(i2));
        }
        return new i1.C0183b(c0172dArr);
    }

    public final int size() {
        return this.f751a.length / 2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            java.lang.String b2 = b(i2);
            java.lang.String d2 = d(i2);
            sb.append(b2);
            sb.append(": ");
            if (J1.b.q(b2)) {
                d2 = "██";
            }
            sb.append(d2);
            sb.append("\n");
            i2 = i3;
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
