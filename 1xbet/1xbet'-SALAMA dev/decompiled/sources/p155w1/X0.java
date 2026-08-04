package p155w1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static X0 f17581i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S0 f17582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q0 f17583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f17584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17589h;

    public static synchronized X0 a() {
        try {
            if (f17581i == null) {
                X0 x1 = new X0();
                x1.f17585d = false;
                x1.f17586e = 0L;
                x1.f17587f = 0L;
                x1.f17588g = 0;
                x1.f17589h = false;
                x1.f17584c = new HashMap();
                f17581i = x1;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17581i;
    }
}
