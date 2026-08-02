package o1;

import java.util.concurrent.CancellationException;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1491a f15543c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1491a f15544d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15545a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f15546b;

    static {
        if (AbstractC1499i.f15563d) {
            f15544d = null;
            f15543c = null;
        } else {
            f15544d = new C1491a(false, null);
            f15543c = new C1491a(true, null);
        }
    }

    public C1491a(boolean z4, CancellationException cancellationException) {
        this.f15545a = z4;
        this.f15546b = cancellationException;
    }
}
