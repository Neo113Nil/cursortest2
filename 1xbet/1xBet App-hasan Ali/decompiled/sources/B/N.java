package B;

import com.google.android.gms.internal.ads.AbstractC1260lo;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C1290mH;
import com.google.android.gms.internal.ads.H1;
import com.google.android.gms.internal.ads.U;

/* loaded from: classes.dex */
public final class N implements H1 {

    /* renamed from: k, reason: collision with root package name */
    public long f653k;

    /* renamed from: l, reason: collision with root package name */
    public long f654l;

    /* renamed from: m, reason: collision with root package name */
    public Object f655m;

    /* renamed from: n, reason: collision with root package name */
    public Object f656n;

    public N(String str, byte[] bArr, long j5, long j6) {
        this.f655m = str;
        this.f656n = bArr;
        this.f653k = j5;
        this.f654l = j6;
    }

    public static final long a(N n5, long j5, long j6) {
        n5.getClass();
        if (j6 == 0) {
            return j5;
        }
        long j7 = 4;
        return (j5 / j7) + ((j6 / j7) * 3);
    }

    @Override // com.google.android.gms.internal.ads.H1
    public U b() {
        AbstractC1668us.a0(this.f653k != -1);
        return new com.google.android.gms.internal.ads.J(0, this.f653k, (com.google.android.gms.internal.ads.K) this.f655m);
    }

    @Override // com.google.android.gms.internal.ads.H1
    public void c(long j5) {
        long[] jArr = (long[]) ((C0709Wb) this.f656n).f12040l;
        this.f654l = jArr[AbstractC1260lo.j(jArr, j5, true)];
    }

    @Override // com.google.android.gms.internal.ads.H1
    public long g(com.google.android.gms.internal.ads.B b3) {
        long j5 = this.f654l;
        if (j5 < 0) {
            return -1L;
        }
        this.f654l = -1L;
        return -(j5 + 2);
    }

    public N(long j5) {
        AbstractC1668us.a0(((C1290mH) this.f655m) == null);
        this.f653k = j5;
        this.f654l = j5 + 65536;
    }
}
