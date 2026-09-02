package g;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1050b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1051c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f1052a;

    static {
        if (g.f1063d) {
            f1051c = null;
            f1050b = null;
        } else {
            f1051c = new a(false, null);
            f1050b = new a(true, null);
        }
    }

    public a(boolean z2, CancellationException cancellationException) {
        this.f1052a = cancellationException;
    }
}
