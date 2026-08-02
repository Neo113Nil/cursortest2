package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.h2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4287h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Sr f31134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31135b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31136c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31138e;

    public C4287h2(Sr title, long j11, String currency, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f31134a = title;
        this.f31135b = j11;
        this.f31136c = currency;
        this.f31137d = z11;
        this.f31138e = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4287h2)) {
            return false;
        }
        C4287h2 c4287h2 = (C4287h2) obj;
        return Intrinsics.d(this.f31134a, c4287h2.f31134a) && this.f31135b == c4287h2.f31135b && Intrinsics.d(this.f31136c, c4287h2.f31136c) && this.f31137d == c4287h2.f31137d && this.f31138e == c4287h2.f31138e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b02 = Lf.a.b0(Pk0.c.a(this.f31134a.hashCode() * 31, 31, this.f31135b), this.f31136c);
        boolean z11 = this.f31137d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (b02 + i11) * 31;
        boolean z12 = this.f31138e;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BnplGraphStep(title=");
        sb2.append(this.f31134a);
        sb2.append(", amount=");
        sb2.append(this.f31135b);
        sb2.append(", currency=");
        sb2.append(this.f31136c);
        sb2.append(", isBold=");
        sb2.append(this.f31137d);
        sb2.append(", isLast=");
        return Pk0.a.a(")", sb2, this.f31138e);
    }
}
