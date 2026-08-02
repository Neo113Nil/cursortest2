package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.yg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4789yg {

    /* renamed from: a, reason: collision with root package name */
    public final Sr f32571a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32572b;

    /* renamed from: c, reason: collision with root package name */
    public final Sr f32573c;

    public C4789yg(Sr amount, long j11) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f32571a = amount;
        this.f32572b = j11;
        this.f32573c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4789yg)) {
            return false;
        }
        C4789yg c4789yg = (C4789yg) obj;
        return this.f32571a.equals(c4789yg.f32571a) && this.f32572b == c4789yg.f32572b && Intrinsics.d(this.f32573c, c4789yg.f32573c);
    }

    public final int hashCode() {
        int a11 = Pk0.c.a(this.f32571a.hashCode() * 31, 31, this.f32572b);
        Sr sr = this.f32573c;
        return (a11 + (sr == null ? 0 : sr.hashCode())) * 31;
    }

    public final String toString() {
        return "PaymentAmountItem(amount=" + this.f32571a + ", longAmount=" + this.f32572b + ", oldAmount=" + this.f32573c + ", details=null)";
    }

    public C4789yg(Pq amount, long j11, Sr sr) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f32571a = amount;
        this.f32572b = j11;
        this.f32573c = sr;
    }
}
