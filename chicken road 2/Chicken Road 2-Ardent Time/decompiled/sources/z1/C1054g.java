package z1;

/* renamed from: z1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054g extends z1.C1061n {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8568c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.C1054g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1054g(z1.C1053f c1053f, java.lang.Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Continuation " + c1053f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
