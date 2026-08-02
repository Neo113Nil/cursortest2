package b1;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508i {

    /* renamed from: a, reason: collision with root package name */
    public Object f7207a;

    /* renamed from: b, reason: collision with root package name */
    public k f7208b;

    /* renamed from: c, reason: collision with root package name */
    public l f7209c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7210d;

    public final void finalize() {
        l lVar;
        k kVar = this.f7208b;
        if (kVar != null) {
            j jVar = kVar.f7213l;
            if (!jVar.isDone()) {
                jVar.i(new C0501b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f7207a, 1));
            }
        }
        if (this.f7210d || (lVar = this.f7209c) == null) {
            return;
        }
        lVar.j(null);
    }
}
