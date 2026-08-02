package s;

import o1.C1492b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f16084a;

    /* renamed from: b, reason: collision with root package name */
    public j f16085b;

    /* renamed from: c, reason: collision with root package name */
    public k f16086c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16087d;

    public final void finalize() {
        k kVar;
        j jVar = this.f16085b;
        if (jVar != null) {
            i iVar = jVar.f16090b;
            if (!iVar.isDone()) {
                iVar.t(new C1492b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f16084a, 2));
            }
        }
        if (this.f16087d || (kVar = this.f16086c) == null) {
            return;
        }
        kVar.p(null);
    }
}
