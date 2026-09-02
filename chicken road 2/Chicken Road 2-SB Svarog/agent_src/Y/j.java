package Y;

import f0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final j f410b = new j();

    @Override // Y.i
    public final g d(h hVar) {
        g0.h.e(hVar, "key");
        return null;
    }

    @Override // Y.i
    public final i e(h hVar) {
        g0.h.e(hVar, "key");
        return this;
    }

    @Override // Y.i
    public final i g(i iVar) {
        g0.h.e(iVar, "context");
        return iVar;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // Y.i
    public final Object c(Object obj, p pVar) {
        return obj;
    }
}
