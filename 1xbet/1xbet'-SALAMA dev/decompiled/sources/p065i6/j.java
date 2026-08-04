package p065i6;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f14074a = new j();

    @Override // p065i6.i
    public final g get(h hVar) {
        h.e(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p065i6.i
    public final i minusKey(h hVar) {
        h.e(hVar, "key");
        return this;
    }

    @Override // p065i6.i
    public final i plus(i iVar) {
        h.e(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return obj;
    }
}
