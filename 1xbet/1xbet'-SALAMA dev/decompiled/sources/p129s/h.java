package p129s;

import p103o1.b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f16091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f16092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16093d;

    public final void finalize() {
        k kVar;
        j jVar = this.f16091b;
        if (jVar != null) {
            i iVar = jVar.f16096b;
            if (!iVar.isDone()) {
                iVar.t(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f16090a, 2));
            }
        }
        if (this.f16093d || (kVar = this.f16092c) == null) {
            return;
        }
        kVar.p(null);
    }
}
