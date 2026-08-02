package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682v5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15959h;

    public C1682v5(C0965f5 c0965f5, C0919e4 c0919e4, int i) {
        super(c0965f5, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c0919e4, i, 61);
        this.f15959h = c0965f5.f13453r.f12450a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        long longValue = ((Long) this.f16395e.invoke(null, this.f16391a.f13438a, Boolean.valueOf(this.f15959h))).longValue();
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            c0919e4.e();
            C1367o4.I((C1367o4) c0919e4.f10141l, longValue);
        }
    }
}
