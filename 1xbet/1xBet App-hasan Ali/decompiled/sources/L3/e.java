package L3;

import L3.a;
import L3.b;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3037a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.C0000a f3038b;

    /* renamed from: c, reason: collision with root package name */
    public static final b.a f3039c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f3040d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f3037a = z3;
        if (z3) {
            f3038b = a.f3031b;
            f3039c = b.f3033b;
            f3040d = d.f3035b;
        } else {
            f3038b = null;
            f3039c = null;
            f3040d = null;
        }
    }
}
