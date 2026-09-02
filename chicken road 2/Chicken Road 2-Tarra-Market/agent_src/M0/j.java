package M0;

import U0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f226a = new j();

    @Override // M0.i
    public final i g(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // M0.i
    public final g i(h key) {
        kotlin.jvm.internal.j.e(key, "key");
        return null;
    }

    @Override // M0.i
    public final i k(i context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // M0.i
    public final Object j(Object obj, p pVar) {
        return obj;
    }
}
