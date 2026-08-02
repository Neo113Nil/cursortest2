package q2;

import java.util.concurrent.CancellationException;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2298a {

    /* renamed from: c, reason: collision with root package name */
    public static final C2298a f18857c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2298a f18858d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18859a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f18860b;

    static {
        if (AbstractC2305h.f18877n) {
            f18858d = null;
            f18857c = null;
        } else {
            f18858d = new C2298a(false, null);
            f18857c = new C2298a(true, null);
        }
    }

    public C2298a(boolean z3, CancellationException cancellationException) {
        this.f18859a = z3;
        this.f18860b = cancellationException;
    }
}
