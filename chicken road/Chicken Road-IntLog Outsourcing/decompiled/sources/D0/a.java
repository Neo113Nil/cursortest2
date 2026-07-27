package D0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f403c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f404d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f405a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f406b;

    static {
        if (i.f424d) {
            f404d = null;
            f403c = null;
        } else {
            f404d = new a(false, null);
            f403c = new a(true, null);
        }
    }

    public a(boolean z, CancellationException cancellationException) {
        this.f405a = z;
        this.f406b = cancellationException;
    }
}
