package s;

import java.util.concurrent.CancellationException;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1583a f16060c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1583a f16061d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16062a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f16063b;

    static {
        if (g.f16077d) {
            f16061d = null;
            f16060c = null;
        } else {
            f16061d = new C1583a(false, null);
            f16060c = new C1583a(true, null);
        }
    }

    public C1583a(boolean z4, CancellationException cancellationException) {
        this.f16062a = z4;
        this.f16063b = cancellationException;
    }
}
