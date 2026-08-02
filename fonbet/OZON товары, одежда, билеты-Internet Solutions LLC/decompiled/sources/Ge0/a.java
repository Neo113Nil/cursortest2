package Ge0;

/* loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final String f10110a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f10111b;

    public a(Throwable th2) {
        super("An error occurred while performing suggestions search", th2);
        this.f10110a = "An error occurred while performing suggestions search";
        this.f10111b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10111b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10110a;
    }
}
