package p156w2;

import A1.InterfaceC0027k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17966e;

    public b(int i7, byte[] bArr, int i8, int i9) {
        this.f17962a = i7;
        this.f17963b = i8;
        this.f17964c = i9;
        this.f17965d = bArr;
    }

    public static int a(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17962a == bVar.f17962a && this.f17963b == bVar.f17963b && this.f17964c == bVar.f17964c && Arrays.equals(this.f17965d, bVar.f17965d);
    }

    public final int hashCode() {
        if (this.f17966e == 0) {
            this.f17966e = Arrays.hashCode(this.f17965d) + ((((((527 + this.f17962a) * 31) + this.f17963b) * 31) + this.f17964c) * 31);
        }
        return this.f17966e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f17962a);
        sb.append(", ");
        sb.append(this.f17963b);
        sb.append(", ");
        sb.append(this.f17964c);
        sb.append(", ");
        sb.append(this.f17965d != null);
        sb.append(")");
        return sb.toString();
    }
}
