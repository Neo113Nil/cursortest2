package F3;

import B0.d2;
import android.net.Uri;
import j3.AbstractC7252H;
import j3.C7259a;
import j3.C7275q;

/* loaded from: classes.dex */
public final class X extends AbstractC7252H {

    /* renamed from: n, reason: collision with root package name */
    private static final Object f8576n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final long f8577a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8578b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8579c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8580d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8581e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8582f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8583g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8584h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8585i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8586j;

    /* renamed from: k, reason: collision with root package name */
    private final d2 f8587k;

    /* renamed from: l, reason: collision with root package name */
    private final C7275q f8588l;

    /* renamed from: m, reason: collision with root package name */
    private final C7275q.e f8589m;

    static {
        C7275q.a aVar = new C7275q.a();
        aVar.d("SinglePeriodTimeline");
        aVar.i(Uri.EMPTY);
        aVar.a();
    }

    public X(long j11, boolean z11, boolean z12, C7275q c7275q) {
        this(-9223372036854775807L, -9223372036854775807L, j11, j11, 0L, 0L, z11, false, false, null, c7275q, z12 ? c7275q.f69185c : null);
    }

    @Override // j3.AbstractC7252H
    public final int getIndexOfPeriod(Object obj) {
        return f8576n.equals(obj) ? 0 : -1;
    }

    @Override // j3.AbstractC7252H
    public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
        G10.a.d(i11, 1);
        Object obj = z11 ? f8576n : null;
        long j11 = -this.f8582f;
        bVar.getClass();
        bVar.h(null, obj, 0, this.f8580d, j11, C7259a.f69046c, false);
        return bVar;
    }

    @Override // j3.AbstractC7252H
    public final int getPeriodCount() {
        return 1;
    }

    @Override // j3.AbstractC7252H
    public final Object getUidOfPeriod(int i11) {
        G10.a.d(i11, 1);
        return f8576n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // j3.AbstractC7252H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
        long j12;
        G10.a.d(i11, 1);
        long j13 = this.f8583g;
        boolean z11 = this.f8585i;
        if (z11 && !this.f8586j && j11 != 0) {
            long j14 = this.f8581e;
            if (j14 != -9223372036854775807L) {
                j13 += j11;
            }
            j12 = -9223372036854775807L;
            Object obj = AbstractC7252H.c.f68944q;
            cVar.b(this.f8588l, this.f8587k, this.f8577a, this.f8578b, this.f8579c, this.f8584h, z11, this.f8589m, j12, this.f8581e, this.f8582f);
            return cVar;
        }
        j12 = j13;
        Object obj2 = AbstractC7252H.c.f68944q;
        cVar.b(this.f8588l, this.f8587k, this.f8577a, this.f8578b, this.f8579c, this.f8584h, z11, this.f8589m, j12, this.f8581e, this.f8582f);
        return cVar;
    }

    @Override // j3.AbstractC7252H
    public final int getWindowCount() {
        return 1;
    }

    public X(long j11, long j12, long j13, long j14, long j15, long j16, boolean z11, boolean z12, boolean z13, d2 d2Var, C7275q c7275q, C7275q.e eVar) {
        this.f8577a = j11;
        this.f8578b = j12;
        this.f8579c = -9223372036854775807L;
        this.f8580d = j13;
        this.f8581e = j14;
        this.f8582f = j15;
        this.f8583g = j16;
        this.f8584h = z11;
        this.f8585i = z12;
        this.f8586j = z13;
        this.f8587k = d2Var;
        c7275q.getClass();
        this.f8588l = c7275q;
        this.f8589m = eVar;
    }
}
