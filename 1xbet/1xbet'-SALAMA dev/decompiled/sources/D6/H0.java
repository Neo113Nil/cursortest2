package D6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 implements p065i6.g, p065i6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H0 f1793a = new H0();

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // p065i6.i
    public final p065i6.g get(p065i6.h hVar) {
        return p003a.a.W(this, hVar);
    }

    @Override // p065i6.i
    public final p065i6.i minusKey(p065i6.h hVar) {
        return p003a.a.e0(this, hVar);
    }

    @Override // p065i6.i
    public final p065i6.i plus(p065i6.i iVar) {
        return p003a.a.m0(this, iVar);
    }

    @Override // p065i6.g
    public final p065i6.h getKey() {
        return this;
    }
}
