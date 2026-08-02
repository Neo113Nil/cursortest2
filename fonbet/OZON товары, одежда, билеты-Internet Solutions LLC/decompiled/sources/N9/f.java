package N9;

import h9.q;
import h9.s;
import h9.t;
import java.util.ArrayList;
import o9.C8666h;

/* loaded from: classes9.dex */
public class f implements t {

    /* renamed from: a, reason: collision with root package name */
    private h9.k f18804a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f18805b = new ArrayList();

    public f(h9.k kVar) {
        this.f18804a = kVar;
    }

    @Override // h9.t
    public final void a(s sVar) {
        this.f18805b.add(sVar);
    }

    public final q b(h9.n nVar) {
        h9.c d11 = d(nVar);
        h9.k kVar = this.f18804a;
        this.f18805b.clear();
        try {
            if (kVar != null) {
                q d12 = kVar.d(d11);
                kVar.reset();
                return d12;
            }
            q b11 = kVar.b(d11);
            kVar.reset();
            return b11;
        } catch (Exception unused) {
            kVar.reset();
            return null;
        } catch (Throwable th2) {
            kVar.reset();
            throw th2;
        }
    }

    public final ArrayList c() {
        return new ArrayList(this.f18805b);
    }

    protected h9.c d(h9.n nVar) {
        return new h9.c(new C8666h(nVar));
    }
}
