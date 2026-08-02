package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458q5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final long f15094h;

    public C1458q5(C0965f5 c0965f5, C0919e4 c0919e4, long j5, int i) {
        super(c0965f5, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c0919e4, i, 25);
        this.f15094h = j5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        long longValue = ((Long) this.f16395e.invoke(null, null)).longValue();
        synchronized (this.f16394d) {
            try {
                C0919e4 c0919e4 = this.f16394d;
                c0919e4.e();
                C1367o4.x((C1367o4) c0919e4.f10141l, longValue);
                long j5 = this.f15094h;
                if (j5 != 0) {
                    C0919e4 c0919e42 = this.f16394d;
                    c0919e42.e();
                    C1367o4.Y((C1367o4) c0919e42.f10141l, longValue - j5);
                    C0919e4 c0919e43 = this.f16394d;
                    long j6 = this.f15094h;
                    c0919e43.e();
                    C1367o4.Z((C1367o4) c0919e43.f10141l, j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
