package b1;

import java.util.concurrent.CancellationException;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0500a f7183b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0500a f7184c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f7185a;

    static {
        if (AbstractC0507h.f7200n) {
            f7184c = null;
            f7183b = null;
        } else {
            f7184c = new C0500a(false, null);
            f7183b = new C0500a(true, null);
        }
    }

    public C0500a(boolean z3, CancellationException cancellationException) {
        this.f7185a = cancellationException;
    }
}
