package g2;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import o2.p;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4981a = new i();

    @Override // g2.h
    public final h g(g key) {
        j.e(key, "key");
        return this;
    }

    @Override // g2.h
    public final h h(h context) {
        j.e(context, "context");
        return context;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // g2.h
    public final InterfaceC0322f k(g key) {
        j.e(key, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // g2.h
    public final Object i(Object obj, p pVar) {
        return obj;
    }
}
