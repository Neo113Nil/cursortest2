package Y;

import O3.l;
import P.G0;
import P.Z;
import Z.m;

/* loaded from: classes.dex */
public final class b implements G0 {

    /* renamed from: k, reason: collision with root package name */
    public j f6099k;

    /* renamed from: l, reason: collision with root package name */
    public f f6100l;

    /* renamed from: m, reason: collision with root package name */
    public String f6101m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6102n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f6103o;

    /* renamed from: p, reason: collision with root package name */
    public e f6104p;

    /* renamed from: q, reason: collision with root package name */
    public final l f6105q = new l(7, this);

    public b(j jVar, f fVar, String str, Object obj, Object[] objArr) {
        this.f6099k = jVar;
        this.f6100l = fVar;
        this.f6101m = str;
        this.f6102n = obj;
        this.f6103o = objArr;
    }

    @Override // P.G0
    public final void a() {
        b();
    }

    public final void b() {
        String a5;
        f fVar = this.f6100l;
        if (this.f6104p != null) {
            throw new IllegalArgumentException(("entry(" + this.f6104p + ") is not null").toString());
        }
        if (fVar != null) {
            l lVar = this.f6105q;
            Object invoke = lVar.invoke();
            if (invoke == null || fVar.c(invoke)) {
                this.f6104p = fVar.e(this.f6101m, lVar);
                return;
            }
            if (invoke instanceof m) {
                m mVar = (m) invoke;
                if (mVar.a() == Z.f4431m || mVar.a() == Z.f4434p || mVar.a() == Z.f4432n) {
                    a5 = "MutableState containing " + mVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a5 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a5 = k.a(invoke);
            }
            throw new IllegalArgumentException(a5);
        }
    }

    @Override // P.G0
    public final void c() {
        e eVar = this.f6104p;
        if (eVar != null) {
            ((v3.e) eVar).Q();
        }
    }

    @Override // P.G0
    public final void e() {
        e eVar = this.f6104p;
        if (eVar != null) {
            ((v3.e) eVar).Q();
        }
    }
}
