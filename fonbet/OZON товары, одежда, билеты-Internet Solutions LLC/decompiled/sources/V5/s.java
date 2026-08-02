package V5;

import java.util.HashMap;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f28289a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f28290b = new HashMap();

    s() {
    }

    final m<?> a(T5.f fVar, boolean z11) {
        return (m) (z11 ? this.f28290b : this.f28289a).get(fVar);
    }

    final void b(T5.f fVar, m<?> mVar) {
        (mVar.j() ? this.f28290b : this.f28289a).put(fVar, mVar);
    }

    final void c(T5.f fVar, m<?> mVar) {
        HashMap hashMap = mVar.j() ? this.f28290b : this.f28289a;
        if (mVar.equals(hashMap.get(fVar))) {
            hashMap.remove(fVar);
        }
    }
}
