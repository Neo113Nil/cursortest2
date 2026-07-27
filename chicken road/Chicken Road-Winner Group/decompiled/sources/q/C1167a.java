package q;

import java.util.concurrent.CancellationException;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1167a f10239b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1167a f10240c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f10241a;

    static {
        if (g.f10251d) {
            f10240c = null;
            f10239b = null;
        } else {
            f10240c = new C1167a(false, null);
            f10239b = new C1167a(true, null);
        }
    }

    public C1167a(boolean z3, CancellationException cancellationException) {
        this.f10241a = cancellationException;
    }
}
