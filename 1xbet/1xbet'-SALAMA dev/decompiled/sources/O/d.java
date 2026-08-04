package O;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4828c;

    public d() {
        super(12);
        this.f4828c = new Object();
    }

    @Override // O.c
    public final Object a() {
        Object objA;
        synchronized (this.f4828c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // O.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f4828c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
