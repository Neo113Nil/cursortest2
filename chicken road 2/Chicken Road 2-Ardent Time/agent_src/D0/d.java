package D0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final D0.m f194a = new D0.m();

    public final void a(java.lang.Exception exc) {
        D0.m mVar = this.f194a;
        mVar.getClass();
        p0.AbstractC0966r.d(exc, "Exception must not be null");
        synchronized (mVar.f213a) {
            try {
                if (mVar.f215c) {
                    return;
                }
                mVar.f215c = true;
                mVar.f218f = exc;
                mVar.f214b.d(mVar);
            } finally {
            }
        }
    }
}
