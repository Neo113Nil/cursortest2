package R2;

/* renamed from: R2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3911e<T> extends g0<T> {

    /* renamed from: b, reason: collision with root package name */
    private final T f24352b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24353c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3911e(int i11, int i12, Object obj) {
        super(i12);
        this.f24352b = obj;
        this.f24353c = i11;
    }

    public final void b() {
        T t2 = this.f24352b;
        if ((t2 != null ? t2.hashCode() : 0) != this.f24353c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final T c() {
        return this.f24352b;
    }
}
