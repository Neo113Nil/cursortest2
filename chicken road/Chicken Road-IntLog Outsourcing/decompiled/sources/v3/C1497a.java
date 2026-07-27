package v3;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1497a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f12095a;

    public C1497a(Throwable th) {
        super(th);
        this.f12095a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f12095a;
    }
}
