package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Ex extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final int f8629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8632d;

    /* renamed from: e, reason: collision with root package name */
    public final Dx f8633e;
    public final Cx f;

    public Ex(int i, int i5, int i6, int i7, Dx dx, Cx cx) {
        this.f8629a = i;
        this.f8630b = i5;
        this.f8631c = i6;
        this.f8632d = i7;
        this.f8633e = dx;
        this.f = cx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f8633e != Dx.f8423o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ex)) {
            return false;
        }
        Ex ex = (Ex) obj;
        return ex.f8629a == this.f8629a && ex.f8630b == this.f8630b && ex.f8631c == this.f8631c && ex.f8632d == this.f8632d && ex.f8633e == this.f8633e && ex.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(Ex.class, Integer.valueOf(this.f8629a), Integer.valueOf(this.f8630b), Integer.valueOf(this.f8631c), Integer.valueOf(this.f8632d), this.f8633e, this.f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8633e);
        String valueOf2 = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(this.f8631c);
        sb.append("-byte IV, and ");
        sb.append(this.f8632d);
        sb.append("-byte tags, and ");
        sb.append(this.f8629a);
        sb.append("-byte AES key, and ");
        return L1.a.o(sb, this.f8630b, "-byte HMAC key)");
    }
}
