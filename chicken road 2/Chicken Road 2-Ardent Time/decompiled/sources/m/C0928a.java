package m;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928a {

    /* renamed from: b, reason: collision with root package name */
    public static final m.C0928a f8019b;

    /* renamed from: c, reason: collision with root package name */
    public static final m.C0928a f8020c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CancellationException f8021a;

    static {
        if (m.g.f8032d) {
            f8020c = null;
            f8019b = null;
        } else {
            f8020c = new m.C0928a(false, null);
            f8019b = new m.C0928a(true, null);
        }
    }

    public C0928a(boolean z2, java.util.concurrent.CancellationException cancellationException) {
        this.f8021a = cancellationException;
    }
}
