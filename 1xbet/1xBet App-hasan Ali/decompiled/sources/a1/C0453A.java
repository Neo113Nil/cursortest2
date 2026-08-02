package a1;

import P.D;

/* renamed from: a1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453A {

    /* renamed from: a, reason: collision with root package name */
    public final int f6370a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6371b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6372c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6373d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6374e;

    public C0453A(boolean z3, B b3, boolean z5) {
        D d5 = l.f6415a;
        int i = !z3 ? 262152 : 262144;
        i = b3 == B.f6376l ? i | 8192 : i;
        i = z5 ? i : i | 512;
        boolean z6 = b3 == B.f6375k;
        this.f6370a = i;
        this.f6371b = z6;
        this.f6372c = true;
        this.f6373d = true;
        this.f6374e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0453A)) {
            return false;
        }
        C0453A c0453a = (C0453A) obj;
        return this.f6370a == c0453a.f6370a && this.f6371b == c0453a.f6371b && this.f6372c == c0453a.f6372c && this.f6373d == c0453a.f6373d && this.f6374e == c0453a.f6374e;
    }

    public final int hashCode() {
        return (((((((((this.f6370a * 31) + (this.f6371b ? 1231 : 1237)) * 31) + (this.f6372c ? 1231 : 1237)) * 31) + (this.f6373d ? 1231 : 1237)) * 31) + (this.f6374e ? 1231 : 1237)) * 31) + 1237;
    }
}
