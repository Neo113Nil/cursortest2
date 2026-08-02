package O;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f4828c;

    public d() {
        super(12);
        this.f4828c = new Object();
    }

    @Override // O.c
    public final Object a() {
        Object a2;
        synchronized (this.f4828c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // O.c
    public final boolean c(Object obj) {
        boolean c3;
        synchronized (this.f4828c) {
            c3 = super.c(obj);
        }
        return c3;
    }
}
