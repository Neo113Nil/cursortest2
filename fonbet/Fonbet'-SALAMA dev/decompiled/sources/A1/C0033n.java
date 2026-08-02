package A1;

import v2.AbstractC1664a;

/* renamed from: A1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033n {

    /* renamed from: a, reason: collision with root package name */
    public final u2.r f498a;

    /* renamed from: b, reason: collision with root package name */
    public final long f499b;

    /* renamed from: c, reason: collision with root package name */
    public final long f500c;

    /* renamed from: d, reason: collision with root package name */
    public final long f501d;

    /* renamed from: e, reason: collision with root package name */
    public final long f502e;

    /* renamed from: f, reason: collision with root package name */
    public final int f503f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f504g;

    /* renamed from: h, reason: collision with root package name */
    public final long f505h;

    /* renamed from: i, reason: collision with root package name */
    public int f506i;
    public boolean j;

    public C0033n(u2.r rVar, int i7, int i8, int i9, int i10, int i11, boolean z4, int i12) {
        a(i9, 0, "bufferForPlaybackMs", "0");
        a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i7, i9, "minBufferMs", "bufferForPlaybackMs");
        a(i7, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i8, i7, "maxBufferMs", "minBufferMs");
        a(i12, 0, "backBufferDurationMs", "0");
        this.f498a = rVar;
        this.f499b = v2.t.E(i7);
        this.f500c = v2.t.E(i8);
        this.f501d = v2.t.E(i9);
        this.f502e = v2.t.E(i10);
        this.f503f = i11;
        this.f506i = i11 == -1 ? 13107200 : i11;
        this.f504g = z4;
        this.f505h = v2.t.E(i12);
    }

    public static void a(int i7, int i8, String str, String str2) {
        AbstractC1664a.e(str + " cannot be less than " + str2, i7 >= i8);
    }

    public final void b(boolean z4) {
        int i7 = this.f503f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        this.f506i = i7;
        this.j = false;
        if (z4) {
            u2.r rVar = this.f498a;
            synchronized (rVar) {
                if (rVar.f16816a) {
                    rVar.a(0);
                }
            }
        }
    }
}
