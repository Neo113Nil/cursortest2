package w2;

import A1.InterfaceC0027k;
import java.util.Arrays;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767b implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public final int f17956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17958c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17959d;

    /* renamed from: e, reason: collision with root package name */
    public int f17960e;

    public C1767b(int i7, byte[] bArr, int i8, int i9) {
        this.f17956a = i7;
        this.f17957b = i8;
        this.f17958c = i9;
        this.f17959d = bArr;
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
        if (obj == null || C1767b.class != obj.getClass()) {
            return false;
        }
        C1767b c1767b = (C1767b) obj;
        return this.f17956a == c1767b.f17956a && this.f17957b == c1767b.f17957b && this.f17958c == c1767b.f17958c && Arrays.equals(this.f17959d, c1767b.f17959d);
    }

    public final int hashCode() {
        if (this.f17960e == 0) {
            this.f17960e = Arrays.hashCode(this.f17959d) + ((((((527 + this.f17956a) * 31) + this.f17957b) * 31) + this.f17958c) * 31);
        }
        return this.f17960e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f17956a);
        sb.append(", ");
        sb.append(this.f17957b);
        sb.append(", ");
        sb.append(this.f17958c);
        sb.append(", ");
        sb.append(this.f17959d != null);
        sb.append(")");
        return sb.toString();
    }
}
