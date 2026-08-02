package w1;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: i, reason: collision with root package name */
    public static X0 f17575i;

    /* renamed from: a, reason: collision with root package name */
    public S0 f17576a;

    /* renamed from: b, reason: collision with root package name */
    public Q0 f17577b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f17578c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17579d;

    /* renamed from: e, reason: collision with root package name */
    public long f17580e;

    /* renamed from: f, reason: collision with root package name */
    public long f17581f;

    /* renamed from: g, reason: collision with root package name */
    public int f17582g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17583h;

    public static synchronized X0 a() {
        X0 x02;
        synchronized (X0.class) {
            try {
                if (f17575i == null) {
                    X0 x03 = new X0();
                    x03.f17579d = false;
                    x03.f17580e = 0L;
                    x03.f17581f = 0L;
                    x03.f17582g = 0;
                    x03.f17583h = false;
                    x03.f17578c = new HashMap();
                    f17575i = x03;
                }
                x02 = f17575i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x02;
    }
}
