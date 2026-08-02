package a4;

import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final i f6649k = new i();

    public final int hashCode() {
        return 0;
    }

    @Override // a4.h
    public final f l(g gVar) {
        l.f("key", gVar);
        return null;
    }

    @Override // a4.h
    public final h m(h hVar) {
        l.f("context", hVar);
        return hVar;
    }

    @Override // a4.h
    public final h r(g gVar) {
        l.f("key", gVar);
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return obj;
    }
}
